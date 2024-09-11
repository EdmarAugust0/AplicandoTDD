package br.com.edmar.service;

import br.com.edmar.dao.IContratoDao;

public class ContratoService implements IContratoService {
	
	private IContratoDao contratoDao;

	public ContratoService(IContratoDao dao) {
		this.contratoDao = dao;
	}

	@Override
	public String salvar() {
		contratoDao.salvar();
		return "Sucesso";
	}

	@Override
	public String buscar() {
		contratoDao.buscar();
		return "Achou";
	}

	@Override
	public String excluir() {
		contratoDao.excluir();
		return "Sumiu";
	}

	@Override
	public String atualizar() {
		contratoDao.atualizar();
		return "Att";
	}

}
