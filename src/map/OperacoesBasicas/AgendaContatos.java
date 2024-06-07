package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;
    
    public AgendaContatos(){
        this.agendaContatoMap = new HashMap<String, Integer>();
    }

    public void adicionarContatos(String nome, Integer telefone ){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()){
            numeroPorNome =  agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }


    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContatos("Camila", 123456);
        agendaContatos.adicionarContatos("Camila", 456412);
        agendaContatos.adicionarContatos("Camila Cavalcante", 111324);
        agendaContatos.adicionarContatos("Camila DIO", 456213);
        agendaContatos.adicionarContatos("Maria Silva", 1234568723);
        agendaContatos.adicionarContatos("Camila", 1542111);


        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Maria Silva");

        agendaContatos.exibirContatos();

        System.out.println("O número é : " + agendaContatos.pesquisarPorNome("Camila DIO"));
    }
}
