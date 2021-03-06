#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.base.infra.persistencia;

public class RepositorioException extends Exception{

	private static final long serialVersionUID = 7224635304886787181L;
	
	private String message;
	
	RepositorioException(String message){
		this.message = message;
	}
	
	public String getMessage(){
		return this.message;
	}
}
