package br.com.ic.bean;

import java.text.ParseException;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.ic.dao.CadDAO;
import br.com.ic.filter.Cad;
import br.com.ic.util.FacesUtil;

@ManagedBean
@ViewScoped
public class CadBean {

	private Cad filtro;

	public Cad getFiltro() {
		if (filtro == null) {
			filtro = new Cad();
		}
		return filtro;
	}

	public void setFiltro(Cad filtro) {
		this.filtro = filtro;
	}

	public void salvar() throws ParseException {

		try {

			CadDAO DAO = new CadDAO();
			DAO.salvar(filtro);

		} catch (RuntimeException ex) {
			FacesUtil.adicionarMsgErro("Erro ao obter filtros de combo: "
					+ ex.getMessage());
		}
	}
}
