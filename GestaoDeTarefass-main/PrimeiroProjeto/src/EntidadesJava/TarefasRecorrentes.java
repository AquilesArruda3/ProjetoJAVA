package EntidadesJava;

import java.util.Scanner;
public class TarefasRecorrentes extends GestaoDeTarefas {
private String [] Periodo = {"Semanal" ,"Quinzenal",  "Mensal" , "Anual"};

Scanner scanner = new Scanner(System.in);

    public TarefasRecorrentes(String nome) {
        super(nome);
    }

    public String[] getPeriodo() {
        return Periodo;
    }

    public void setPeriodo(String[] periodo) {
        Periodo = periodo;
    }

    public void FrequenciaTarefas(){
        //Pergunta ao usuario qual a frequencia a ser utilizada :
        String periodo;
        System.out.println("Selecione um periodo para executar essa tarefa : \n 1-Semanal \n 2-Quinzenal \n 3-Mensal \n 4-Anual");
        periodo = scanner.nextLine();
        System.out.println("Periodo agendado com sucesso");

    }
    
    public void ServicoDeNotificacoes(){
        System.out.println("Sua tarefa recorrente foi agendada com sucesso");
    }
    public void RepositorioDeTarefas(){}


    
    


}
