#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.__artifactId__.aplicacao.servicos;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.jboss.seam.transaction.Transactional;

import ${package}.TIPO_DOMINIO.dominio.modelo.Pessoa;
import ${package}.TIPO_DOMINIO.dominio.repositorio.RepositorioPessoa;
import ${package}.__artifactId__.util.RepositorioUtil;


@Named
public class PessoaAS implements Serializable {

	private static final long serialVersionUID = -6220520258682680149L;
	
	// Os injects de repositorioUtil deveria ser feito apenas no AS
	@Inject RepositorioUtil repositorioUtil;
		
	public List<Pessoa> listar() {
		RepositorioPessoa repoPessoa = repositorioUtil
				.construirFabricaRepositorios()
				.construirRepositorioPessoa();
		
		return repoPessoa.listar();
	}

	
	@Transactional
	public void criaConta(String nome) throws Exception {
		try {
			RepositorioPessoa repoPessoa = repositorioUtil
												.construirFabricaRepositorios()
												.construirRepositorioPessoa();
			
			Pessoa a = new Pessoa();
			a.setName(nome);

			repoPessoa.adicionar(a);
			
		} catch (Exception e) {
			throw new Exception (e);
		}
	}
	
}
