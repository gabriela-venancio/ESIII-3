package Controller;

import java.util.concurrent.ThreadLocalRandom;

import Modal.Caminhao;
import Modal.Veiculos;

public class CaminhaoController {

		Caminhao caminhao = new Caminhao();
		
		public void InicioMovimentacao(Caminhao caminhao){
			System.out.println("o veiculo começou a se movimentar");
			
			System.out.println("o Caminhão é do modelo: "+caminhao.getModelo());
			System.out.println("marca: "+caminhao.getMarca());
			System.out.println("Placa: "+caminhao.getModelo());
			System.out.println("Cor: "+caminhao.getCor());
			System.out.println("Chega a velocidade maxima de: "+caminhao.getVelocidade());
			System.out.println("Possui "+caminhao.getEixos()+" eixos!");
			
			}
			public void movimentacaoVeiculo(){
				int min_val = 1000;
		        int max_val = 3000;
		        ThreadLocalRandom tlr = ThreadLocalRandom.current();
		        int carga = tlr.nextInt(min_val, max_val + 1);
		       
			System.out.println("a carga do caminhao sera de: "+carga);
			int frete = tlr.nextInt(10, 80 + 1);
			System.out.println("o frete sera de "+frete);
			
			int deslocamento = tlr.nextInt(500, 3000 + 1);

			System.out.println("o deslocamento sera de: "+deslocamento);
			int fretes = tlr.nextInt(2000, 5000 + 1);
			System.out.println("o frete sera de "+fretes);
			
			
		
			
		}
		
		
		
		
}
