package edu.fae.util;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

/**
 * Filtro que desabilita o cache das requisi��es
 * 
 * @author Robson J. P.
 * @since 1.0
 */
public class NoCacheFilter implements Filter {


	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		
		//Adiciona na resposta do usu�rio o header para n�o armazenar em cache
		((HttpServletResponse) response).addHeader("Cache-Control", "no-store, no-cache, must-revalidate");
		
		chain.doFilter(request, response);
		
	}

	public void init(FilterConfig arg0) throws ServletException {
	}
	
	public void destroy() {
	}

	
}
