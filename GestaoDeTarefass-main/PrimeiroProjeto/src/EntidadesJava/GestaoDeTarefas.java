package EntidadesJava;
//Nessa classe eu configuro as opcoes desejadas para meu usuario escolher criar suas tarefas : 


import Interfaces.RepositorioDeTarefas;
import Interfaces.ServicoDeNotificacoes;
import java.util.Scanner;




public class GestaoDeTarefas implements ServicoDeNotificacoes, RepositorioDeTarefas {
private String Nome;
private String [] DiaDaSemana = {"Domingo","Segunda-Feira","Terça-Feira","Quarta-Feira","Quinta-Feira","Sexta-Feira","Sábado"};
private String DataHora;

Scanner scanner = new Scanner(System.in);
//Construtores
public GestaoDeTarefas(String nome) {
    Nome = nome;
    
}


public String getNome() {
    return Nome;
}


public void setNome(String nome) {
    Nome = nome;
}


public String[] getDiaDaSemana() {
    return DiaDaSemana;
}


public void setDiaDaSemana(String[] diaDaSemana) {
    DiaDaSemana = diaDaSemana;
}


public String getDataHora() {
    return DataHora;
}


public void setDataHora(String dataHora) {
    DataHora = dataHora;
}

public void Menu(){
    System.out.println("Digite o nome da sua tarefa : \n");
    //Mensagem perguntando pra ele o nome da tarefa : 
    String NomeTarefa;
    NomeTarefa = scanner.nextLine();
    //Mensagem perguntando o dia para marcar a sua tarefa : 
    System.out.println("Selecione o dia para sua tarefa :\n 1-Domingo \n 2-Segunda-feira \n 3-Terça-Feira \n 4-Quarta-Feira \n 5-Quinta-Feira \n 6-Sexta-Feira \n 7-Sábado");
    String registro;
    //Laço de repetição para meu usuario escolher uma das opções desejadas : 
    while(true){
    registro = scanner.nextLine();
    if(registro.equals("1") || registro.equals("2") || registro.equals("3")
    || registro.equals("4") || registro.equals("5") || registro.equals("6")
    || registro.equals("7"))
    break;
    //Caso digite nenhuma das opçoes mencionadas : 
    else{
        System.out.println("Erro, numero inválido");
    }
    //Verificação do dia selecionado :
    }
    if(registro.equals("1")){
        System.out.println(DiaDaSemana[0]);
        //Dia selecionado : Domingo
    } else if (registro.equals("2")){
        System.out.println(DiaDaSemana[1]);
        //Dia selecionado : Segunda
    }
    else if (registro.equals("3")){
        System.out.println(DiaDaSemana[2]);
        //Dia selecionado : Terça
    }
    else if (registro.equals("4")){
        System.out.println(DiaDaSemana[3]);
        //Dia selecionado : Quarta
    }
    else if (registro.equals("5")){
        System.out.println(DiaDaSemana[4]);
        //Dia selecionado : Quinta
    }
    else if (registro.equals("6")){
        System.out.println(DiaDaSemana[5]);
        //Dia selecionado : Sexta
    }
    else if (registro.equals("7")){
        System.out.println(DiaDaSemana[6]);
        //Dia selecionado : Sábado
    }

    //Perguntando data e hora pra fazer isso
System.out.println("Selecione a data e hora para executar a tarefa : " + NomeTarefa);
String Data;
Data = scanner.nextLine(); 
System.out.println("Hora : ");
String Hora;
Hora = scanner.nextLine();
DataHora = Data + "\n" + Hora;



//Imprimindo todas as informações que ele escolheu.

System.out.println("Dados da tarefa");
System.out.println("Nome da tarefa : " + NomeTarefa);
System.out.println("Dia da tarefa : " + registro);
System.out.println("Data e Horário da tarefa : " + DataHora);
}

public void AdicionarTarefa(){
    String Adicionar;
    while(true){
     System.out.println("Digite 1 para criar nova atividade ou 0 para encerrar");

     Adicionar = scanner.nextLine();
     
     if(Adicionar.equals("1")){
        Menu();
        break;
     } else{
        System.out.println("Progama encerrado");
     }
    }
}    






public void RepositorioDeTarefas(){}
public void ServicoDeNotificacoes(){}

}





