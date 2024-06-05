package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa(){
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> listaOrdenadoIdade = new ArrayList<>(pessoaList);
        Collections.sort(listaOrdenadoIdade);
        return listaOrdenadoIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> listaPessoasAltura = new ArrayList<>(pessoaList);
        Collections.sort(listaPessoasAltura, new ComparatorPorAltura());
        return listaPessoasAltura;
    }

    public static void main(String[] args){
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Nome 1", 20, 1.56);
        ordenacaoPessoa.adicionarPessoa("Nome 2", 30, 1.80);
        ordenacaoPessoa.adicionarPessoa("Nome 3", 25, 1.70);
        ordenacaoPessoa.adicionarPessoa("Nome 4", 17, 1.56);

        System.out.println("Ordena por idade:");
        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println("Ordena por altura: ");
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}