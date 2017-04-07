package br.com.ic.dao;

import java.text.ParseException;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.ic.filter.Cad;
import br.com.ic.util.HibernateUtil;
import br.com.ic.domain.Cadastro;

public class CadDAO {

	public void salvar(Cad filtro) throws ParseException {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction transacao = null;

		try {

			transacao = sessao.beginTransaction();

			Cadastro principal = new Cadastro();
			principal.setCpf(filtro.getCpf());
			principal.setNome(filtro.getNome());
			principal.setDtnascimento(filtro.getDtnascimento());
			principal.setContato(filtro.getContato());
			principal.setEmail(filtro.getEmail());
			principal.setMatricula(filtro.getMatricula());
			principal.setSexo(filtro.getSexo());
			principal.setVinculo(filtro.getVinculo());

			sessao.save(principal);

			transacao.commit();

		} catch (RuntimeException ex) {

			if (transacao != null) {
				transacao.rollback();
			}
			throw ex;
		} finally {
			sessao.close();
		}

	}

}
