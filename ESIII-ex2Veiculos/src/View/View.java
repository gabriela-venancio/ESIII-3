package View;

import Controller.AutomovelController;
import Controller.CaminhaoController;
import Controller.MotoController;
import Controller.VanController;
import Modal.Automovel;
import Modal.Caminhao;
import Modal.Moto;
import Modal.Van;

public class View {
	
	public static void main(String[] args) {
		Caminhao c = new Caminhao();
	CaminhaoController controller = new CaminhaoController();
	
	c.setCor("vermelho");
	c.setEixos(5);
	c.setMarca("D20");
	c.setModelo("34567M");
	c.setPlaca("F23F23GR3");
	c.setVelocidade(90);
	
	controller.InicioMovimentacao(c);
	
	Moto moto= new Moto ();
	MotoController con = new MotoController();
	
	moto.setCor("rosa");
	moto.setFrete(0);
	moto.setMarca("cavasaki");
	moto.setModelo("grande");
	moto.setPercurso(20);
	moto.setPlaca("GR4GR553D");
	moto.setVelocidade(150);
	
	con.movimentacaoVeiculo();
	
	Automovel auto = new Automovel ();
	AutomovelController autoc = new AutomovelController();
	autoc.movimentacaoVeiculo();
	auto.setAno(1990);
	auto.setCor("rosa");
	auto.setMarca("peugot");
	auto.setModelo("veloster");
	auto.setPlaca("FRf453G");
	auto.setQuantPortas(4);
	auto.setVelocidade(300);
	
	Van van = new Van();
	VanController vanc = new VanController();
	vanc.movimentacaoVeiculo();
	van.setCor("azul");
	van.setMarca("fiurino");
	van.setModelo("wolks");
	van.setVelocidade(200);
	van.setPlaca("24FG45HG");
	
	
	
	
	Caminhao caminhao = new Caminhao();
	CaminhaoController cam= new CaminhaoController();
	cam.movimentacaoVeiculo();
	caminhao.setCor("branco");
	caminhao.setEixos(3);
	caminhao.setMarca("d2");
	caminhao.setModelo("6789");
	caminhao.setPlaca("etr35G454");
	caminhao.setVelocidade(7890);
	}
	
	
		

}
