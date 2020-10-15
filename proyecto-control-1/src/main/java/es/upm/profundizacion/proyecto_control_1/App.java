package es.upm.profundizacion.proyecto_control_1;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.IOUtils;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	GitHub github;
		try {
			github = GitHub.connectAnonymously();
			
			GHRepository repo = github.getRepository( "GRISE-UPM/PROF-2020-EX1" );

	    	System.out.println( IOUtils.toString(repo.getReadme().read(), StandardCharsets.UTF_8) );
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}
