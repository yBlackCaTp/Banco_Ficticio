package conta_bancaria;

public class Conta_Bancaria {

    public static void main(String[] args) {
         Conta_Banco p1 = new Conta_Banco();
         p1.setNumConta(1111);
         p1.setDono("Paulo");
         p1.abrirConta("CC");
        
    
         
         Conta_Banco p2 = new Conta_Banco();
         p2.setNumConta(2222);
         p2.setDono("Emanuele");
         p2.abrirConta("CP");
            
         p1.depositar(300);
         p2.depositar(800);
         
         p1.sacar(350);
         p1.fecharConta();
         
         p2.sacar(950);
         p2.fecharConta();
         
         
         p1.estadoAtual();
         p2.estadoAtual();
        
    }
    
}
