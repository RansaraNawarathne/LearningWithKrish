package ChainOfResponsibility;

import java.util.logging.Level;
import java.util.logging.Logger;

public class COFLoggerExample {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(COFLoggerExample.class.getName());
        logger.setLevel(Level.WARNING);

        logger.log(Level.INFO, "This is Info");
        logger.log(Level.FINE, "This is Fine");
        logger.log(Level.WARNING, "This is Warning");
        logger.log(Level.SEVERE, "This is Severe");
    }
}
