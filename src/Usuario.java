public class Usuario { 
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

	System.out.println("TV ligada :" + smartTv.ligada);
	System.out.println("Canal Atual :" + smartTv.canal);
	System.out.println("Voliume atual: " + smartTv.volume);

	smartTv.ligar();
	System.out.println("Novo status -> Tv ligada ? :" + smartTv.ligada); 
	smartTv.diminuirVolume();
	smartTv.diminuirVolume();
	smartTv.aumentarVolume();
	System.out.println("Volume atual: " + smartTv.volume);   
	smartTv.desligar();
	    
    }
}
