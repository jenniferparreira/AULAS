package objetos;

public class teste1 {
	public static void main(String[] args) {
		Caneta1 c1 =  new Caneta1();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();
        c1.rabiscar();
        c1.status();
        
        Caneta1 c2 = new Caneta1();
        c2.modelo = "bic";
        c2.cor = "Preta";
        c2.destampar();
        c2.status();
        c2.rabiscar();
	}

}
