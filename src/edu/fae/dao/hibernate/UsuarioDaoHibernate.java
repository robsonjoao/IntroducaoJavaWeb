package edu.fae.dao.hibernate;

import java.util.List;

import org.hibernate.Session;

import edu.fae.dao.UsuarioDao;
import edu.fae.model.Usuario;

/**
 * Implementação do UsuarioDao em Hibernate
 * @author Robson J. P.
 * @since 1.0
 */
@SuppressWarnings("unchecked")
public class UsuarioDaoHibernate implements UsuarioDao {
	
	public List<Usuario> findAll() {
		return getSession().createQuery("from Usuario").list();
	}


	
	private Session getSession() {
		return HibernateUtil.getSession();
	}	
	
}
