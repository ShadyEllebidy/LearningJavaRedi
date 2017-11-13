package src;
import java.util.logging.Level;
import java.util.logging.Logger;
public class LoggingExamples {
    private static final Logger logger = Logger.getLogger(LoggingExamples.class.getName());
    Helloworld helloworld = new Helloworld();

    public static void doIt(){
        try{

            int x = 2/0;
        }catch (Exception e){
            logger.log(Level.SEVERE, "Error doing something", e);
        }
    }
}
