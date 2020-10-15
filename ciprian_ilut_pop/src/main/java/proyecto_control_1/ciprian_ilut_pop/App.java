package proyecto_control_1.ciprian_ilut_pop;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        GitHub github = GitHub.connectAnonymously();

        GHRepository repo = github.getRepository( "GRISE-UPM/PROF-2020-EX1" );

        System.out.println( IOUtils.toString(repo.getReadme().read(), StandardCharsets.UTF_8) );
    }
}
