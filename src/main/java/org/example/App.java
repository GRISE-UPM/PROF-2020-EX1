package org.example;

import java.nio.charset.StandardCharsets;

import org.apache.commons.io.IOUtils;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GHRepository;
import java.io.IOException;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
            GitHub github = GitHub.connectAnonymously();
            GHRepository repo = github.getRepository( "GRISE-UPM/PROF-2020-EX1" );
            System.out.println( IOUtils.toString(repo.getReadme().read(), StandardCharsets.UTF_8) );
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
