import java.util.List;
import java.util.ArrayList;

public class Banco {

    private String nome;

    private List <Conta> contasList;

    public String getNome() {
        return nome;
    }

    public List <Conta> getContasList() {
        return contasList;
        
    }

    public void setContasList(List <Conta> contasList) {
        this.contasList = contasList;
        
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

   public Banco (){
    this.setContasList(new ArrayList<>());
   }

   public void adicionarContaCorrente(Cliente cliente){
    getContasList().add(new ContaCorrente(null));
   }

   public void exibirLista(){
    System.out.println(getContasList());
   }

@Override
public String toString() {
    return "Banco [contasList=" + getContasList() + "]";
}

}
