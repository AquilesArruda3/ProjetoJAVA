package EntidadesJava;
/*Na minha classe MenuInicial eu vou construir uma logica que vai levar meu usuario para um dos dois tipos de
tarefas, aqui eu vou fazer o metodo pra chamar o menu e dentro dele vou conseguir instanciar as tarefas simples
ou recorrentes que o user vai pedir pra fazer. 
*/

import java.util.Scanner;

public class MenuInicial {


   
public void ChamarMenu(){
Scanner scanner = new Scanner(System.in);    
System.out.println("Bem vindo , Aquiles. Selecione uma das opções para começar : \n 1-Tarefas Recorrentes\n 2-Tarefas Simples");
String registro;
registro = scanner.nextLine();

if(registro.equals("1")) {
   //Instancio o objeto em tarefas simples e chamo no metodo todas as funcoes que vou ter nele.
   TarefasRecorrentes tarefaRecorrente = new TarefasRecorrentes("Tarefa Recorrente");
   //Metodo para exibir o menu completo e o usuario editar suas tarefas
tarefaRecorrente.Menu();
tarefaRecorrente.FrequenciaTarefas();

tarefaRecorrente.ServicoDeNotificacoes();
//Perguntar se ele gostaria de adicionar outra tarefa : 
tarefaRecorrente.AdicionarTarefa();

}
else if(registro.equals("2")){

//Instancio o objeto em tarefas recorrentes e chamo no metodo todas as funcoes que vou ter nele.
TarefasSimples tarefaSimples = new TarefasSimples("Tarefa simples");
   //Metodo para exibir o menu completo e o usuario editar suas tarefas
tarefaSimples.Menu();

tarefaSimples.ServicoDeNotificacoes();  

//Perguntar se ele gostaria de adicionar outra tarefa : 
tarefaSimples.AdicionarTarefa();

}
else{
    System.out.println("Erro número invalido");
}

scanner.close();

}
}
