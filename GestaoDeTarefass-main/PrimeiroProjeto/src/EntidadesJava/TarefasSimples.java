package EntidadesJava;


public class TarefasSimples extends GestaoDeTarefas{




    
    public TarefasSimples(String nome) {
        super(nome);
        
    }

    public void ServicoDeNotificacoes(){
        System.out.println("Sua tarefa simples foi agendada com sucesso");
    }
    public void GestaoDeTarefas(){}
}
