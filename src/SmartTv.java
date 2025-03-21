public class SmartTv {
    boolean ligada=false;
    int canal=2;
    int volume=25;

    public void aumentarVolume(){
	volume++;	
	System.out.println("Aumentando Volume para: " + volume);
	}
    
    public void diminuirVolume(){
	volume--;	
	System.out.println("Diminuindo Volume para: " + volume);
	}
	
    public void ligar(){
	ligada= true;
    }
	
    public void desligar(){
       ligada= false;
    }
    public void mudarCanal(int novoCanal){
		canal = novoCanal;
	}
	
}
