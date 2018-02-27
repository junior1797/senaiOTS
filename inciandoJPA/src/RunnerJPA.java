import senai.comjpa.dao.ClienteDAO;
import senai.comjpa.dao.DAOFactory;
import senai.comjpa.pojo.Cidade;
import senai.comjpa.pojo.Cliente;
import senai.comjpa.pojo.Estado;

public class RunnerJPA {
	public static void main(String[] args) {
		Estado sc = new Estado();
		sc.setNome("Santa Catarina");
		sc.setUF("SC");
		
		Cidade joi = new Cidade();
		joi.setEstado(sc);
		joi.setNome("Joinville");
		
		Cliente cli = new Cliente();
		cli.setCidade(joi);
		cli.setNome("Edison");
		
		ClienteDAO clienteDAO = (ClienteDAO) DAOFactory.getInstanceOf(ClienteDAO.class);
		clienteDAO.incluir(cli);
		System.out.println("Cliente cadastrado com id= "+cli.getId()+"\n"
						   +"Cidade cadastrada com id= "+joi.getId()+"\n"
						   +"Estado cadastrado com id= "+sc.getId());
	}
}
