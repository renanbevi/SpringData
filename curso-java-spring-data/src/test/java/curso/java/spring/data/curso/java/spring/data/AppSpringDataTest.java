package curso.java.spring.data.curso.java.spring.data;

import javax.swing.JOptionPane;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.core.env.JOptCommandLinePropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:META-INF/spring-config.xml"})
/* classpath uma variavel para localizar caminho em que o config.xml está com as configurações*/

public class AppSpringDataTest {
	
	@Test
	public void testInsert() { /* Testando apenas se o banco PostgreSQL está inciando com sucesso*/
		
		JOptionPane.showMessageDialog(null, "Spring data iniciado com sucesso"); 
	}
	
	

}
