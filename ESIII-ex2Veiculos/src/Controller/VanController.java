package Controller;

import java.util.concurrent.ThreadLocalRandom;

import Modal.Van;

public class VanController {

	
	Van van = new Van ();

	
	public void inicioMovimentacao(Van van) {
		
		System.out.println("a van começou a se locomover");
		
		System.out.println("marca "+van.getMarca());
		System.out.println("cor "+van.getCor());
		System.out.println("modelo "+van.getModelo());
		System.out.println("placa "+van.getPlaca());
		System.out.println("velocidade "+van.getVelocidade());
		
	}public void movimentacaoVeiculo(){
		int min_val = 3;
        int max_val = 12;
        ThreadLocalRandom tlr = ThreadLocalRandom.current();
        int passageiros = tlr.nextInt(min_val, max_val + 1);
       
	System.out.println("a quantidade de passageiros e de :"+passageiros);
    int paradas = tlr.nextInt(min_val, max_val + 1);
	System.out.println("a van tera  :"+paradas+" paradas");

	
	
}
}
