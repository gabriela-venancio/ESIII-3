package Controller;

import java.util.concurrent.ThreadLocalRandom;

import Modal.Automovel;

public class AutomovelController {
	
	Automovel carro = new Automovel();

	public void InicioMovimentacao(Automovel carro){
		System.out.println("o carro começou a se movimentar");
	
			System.out.println("a marca do Carro é: "+carro.getMarca());
			System.out.println("o modelo é: "+carro.getModelo());
			System.out.println("cor: "+carro.getCor());
			System.out.println("ano: "+carro.getAno());
			System.out.println("Velocidade maxima: "+carro.getVelocidade());
			System.out.println("quantidade de portas: "+carro.getQuantPortas());
			
		
	}
	public void movimentacaoVeiculo(){
		double min_val = 1;
        double max_val = 30;
        ThreadLocalRandom tlr = ThreadLocalRandom.current();
        double segundos = tlr.nextDouble(min_val, max_val + 1);
       System.out.println("para atingir 100 km o carro vai demorar "+ 100/segundos);
       
       int deslocamento = tlr.nextInt(50, 650 + 1);
        
	System.out.println("o deslocamento sera de: "+deslocamento);
	
    int passageiros = tlr.nextInt(1,4 + 1);
	System.out.println("o automovel tem "+passageiros+" passageiros");
	
}
	
	
}
