package edu.fae.controllers;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import edu.fae.dao.DaoFactory;
import edu.fae.dao.UsuarioDao;
import edu.fae.model.Usuario;

@ViewScoped
@ManagedBean(name="usuarioController")
public class UsuarioController {

	private UsuarioDao usuarioDao = DaoFactory.getUsuarioDao();
	
	public List<Usuario> getUsuarios() {
		return usuarioDao.findAll();
	}
}
