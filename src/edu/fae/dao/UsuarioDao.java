package edu.fae.dao;

import java.util.List;

import edu.fae.model.Usuario;

/**
 * Defini��o de Dao de Usu�rio
 * 
 * @author Robson J. P.
 * @since 1.0
 */
public interface UsuarioDao {
	
	/**
	 * Busca todos os us�rios
	 * 
	 * @return
	 */
	public List<Usuario> findAll();
	

}
