#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.__artifactId__.infra.persistencia;



/**
 * Classe produtora de SessionFactory Hibernate.
 * A partir de entao pode-se delegar ao Seam o controle transacional
 * @author user
 *
 */
public class ProdutorRepositorioSeamHibernate {


//	@RequestScoped  
//    @Produces  
//    @EsquemaCAD
//    @ExtensionManaged  
//    public SessionFactory createSessionFactory() { 
//		// Carrega o arquivo de configuracao hibernate, situado em src
//	    final Configuration config = 
//	    		new Configuration().configure("hibernate.cfg.xml");  
//        
//	    // Cria um builder de ServiceRegistry, baseado nas configuracoes
//	    ServiceRegistryBuilder serviceRegistryBuilder = 
//        		new ServiceRegistryBuilder().applySettings(config.getProperties());
//        
//	    // Cria o ServiceRegistry que servira como base para o SessionFactory
//	    ServiceRegistry serviceRegistry = 
//	    		serviceRegistryBuilder.buildServiceRegistry();
//        
//	    // Cria a factory
//	    SessionFactory sessionFactory = 
//	    		config.buildSessionFactory(serviceRegistry);
//	    
//	    return sessionFactory;
//	}
}