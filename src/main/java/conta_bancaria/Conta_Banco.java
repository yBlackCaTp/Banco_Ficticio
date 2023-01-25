package conta_bancaria;

public class Conta_Banco {
    
    public int numConta;
    protected String tipoConta;
    private String dono;
    private float saldo;
    private boolean status; 

    
    public void estadoAtual(){
        System.out.println("___________________________________");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipoConta());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());

    }
    
    public void abrirConta(String t){
        this.setTipoConta(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
        }
        else if (t == "CP"){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Conta Não pode ser fechada, se encontra positiva.");        
        }
        else if (this.getSaldo() < 0) {
            System.out.println("Conta não pode ser fechada, está negativa.");
        }
        else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
            
        }
        
    }   
    public void depositar(float v){
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado com sucesso: " + getDono());
        }
        else{
          System.out.print("Erro no deposito, conta fechada");
        }
    
    }
    
    public void sacar(float v){
        if (this.getStatus()) {
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
            }
        }
    }
    
    public void pagarMensalidade(){
        int v = 0; 
        if (this.getTipoConta() == "CC") {
            v = 12;
        } else if (this.getTipoConta() == "CP"){
                v = 20; 
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade descontada" + this.getDono());
            
        } else {
            System.out.println("Impossivel pagar conta bloqueada");
        }
        
    
    }
    
   
    
    //public Conta_Banco(int numConta, String tipoConta, String dono, float saldo, boolean status) {
      //  this.numConta = numConta;
        //this.tipoConta = tipoConta;
        //this.dono = dono;
        //this.saldo = saldo;
        //this.status = status;

    public Conta_Banco() {
        this.saldo=0;
        this.status=false;
        
    }
    

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getDono() {
        return dono;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getStatus() {
        return status;
    }
    
    
    
}


