package objetos;

public class Caneta1 {
	String modelo;
    String cor;
    Float ponta;
    int carga;
    boolean tampada;
    
    void status () {
    	System.out.println("modelo: " + this.modelo);
        System.out.println("uma caneta " + this.cor);
        System.out.println("ponta " + this.ponta);
    	System.out.println("carga: " + this.carga);
    	System.out.println("esta tampada? " + this.tampada);
    }
    void rabiscar() {
    	if (this.tampada == true) {
    		System.out.println("ERRO! não posso rabiscar");
    	}else {
    		System.out.println("Estou rabiscando!");
    	}
    }
    
    void tampar(){
    	this.tampada = true;
    }
    
    void destampar() {
    	this.tampada = false;
    }

}

