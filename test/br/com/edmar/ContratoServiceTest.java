package br.com.edmar;

import org.junit.Assert;
import org.junit.Test;

import br.com.edmar.dao.ContratoDao;
import br.com.edmar.dao.IContratoDao;
import br.com.edmar.dao.mocks.ContratoDaoMock;
import br.com.edmar.service.ContratoService;
import br.com.edmar.service.IContratoService;

public class ContratoServiceTest {
	
	@Test
	public void salvarTest() {
		IContratoDao dao = new ContratoDaoMock();
		IContratoService service = new ContratoService(dao);
		String retorno = service.salvar();
		Assert.assertEquals("Sucesso", retorno);
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void esperadoErroNoSalvarComBancoDeDadosTest() {
		IContratoDao dao = new ContratoDao();
		IContratoService service = new ContratoService(dao);
		String retorno = service.salvar();
		Assert.assertEquals("Sucesso", retorno);
	}
	
	@Test
	public void buscarTest() {
		IContratoDao dao = new ContratoDaoMock();
		IContratoService service = new ContratoService(dao);
		String retorno = service.buscar();
		Assert.assertEquals("Achou", retorno);
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void esperadoErroNoBuscarComBancoDeDadosTest() {
		IContratoDao dao = new ContratoDao();
		IContratoService service = new ContratoService(dao);
		String retorno = service.buscar();
		Assert.assertEquals("Achou", retorno);
	}
	
	@Test
	public void excluirTest() {
		IContratoDao dao = new ContratoDaoMock();
		IContratoService service = new ContratoService(dao);
		String retorno = service.excluir();
		Assert.assertEquals("Sumiu", retorno);
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void esperadoErroNoExcluirComBancoDeDadosTest() {
		IContratoDao dao = new ContratoDao();
		IContratoService service = new ContratoService(dao);
		String retorno = service.excluir();
		Assert.assertEquals("Sumiu", retorno);
	}
	
	@Test
	public void atualizarTest() {
		IContratoDao dao = new ContratoDaoMock();
		IContratoService service = new ContratoService(dao);
		String retorno = service.atualizar();
		Assert.assertEquals("Att", retorno);
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void esperadoErroNoAtualizarComBancoDeDadosTest() {
		IContratoDao dao = new ContratoDao();
		IContratoService service = new ContratoService(dao);
		String retorno = service.atualizar();
		Assert.assertEquals("Att", retorno);
	}
}
