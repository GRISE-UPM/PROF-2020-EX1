package com.javatpoint;

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
    public static void main( String[] args ) throws IOException
    {
        //System.out.println( "Hello World!" );
    	GitHub github = GitHub.connectAnonymously();

    	GHRepository repo = github.getRepository( "GRISE-UPM/PROF-2020-EX1" );

    	System.out.println( IOUtils.toString(repo.getReadme().read(), StandardCharsets.UTF_8) );
    }
}
