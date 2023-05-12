
public class Main {

   public static void main(String[] args) {
        Funcionario funcionario1 = new Professor ("Biologia","Julia",24,2000);   
        Funcionario funcionario2 = new Administrativo("Biologia","Maria",33,4000);  

        System.out.println(funcionario1.exibirDetalhes());
        System.out.println(funcionario2.exibirDetalhes());
    }
}
