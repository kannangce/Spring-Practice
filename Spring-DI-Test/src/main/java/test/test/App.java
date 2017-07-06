package test.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import test.models.CD;
import test.models.MediaPlayer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext aContext = new ClassPathXmlApplicationContext("testSpringConf.xml");
        MediaPlayer<CD> aPLayer = (MediaPlayer<CD>) aContext.getBean("aCDPlayer");
        aPLayer.play();
    }
}
