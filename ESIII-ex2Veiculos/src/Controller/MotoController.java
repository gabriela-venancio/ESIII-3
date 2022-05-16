package Controller;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import Modal.Moto;

public class MotoController {

	Moto moto = new Moto();
	Random random = new Random();
	public void inicioMovimentacao(Moto moto){
		System.out.println("a moto começou a se movimentar");
	
		System.out.println("Marca: "+moto.getMarca());
		System.out.println("cor: "+moto.getCor());
		System.out.println("modelo: "+moto.getModelo());
		System.out.println("Placa: "+moto.getPlaca());
		System.out.println("Velocidade Maxima: "+moto.getVelocidade());
		
		}
		public void movimentacaoVeiculo(){
			int min_val = 20;
	        int max_val = 100;
	        ThreadLocalRandom tlr = ThreadLocalRandom.current();
	        int deslocamentoAleatorio = tlr.nextInt(min_val, max_val + 1);
	       
		System.out.println("o deslocamento sera de: "+deslocamentoAleatorio);
		int frete = tlr.nextInt(10, 80 + 1);
		System.out.println("o frete sera de "+frete);
		
	}
}
