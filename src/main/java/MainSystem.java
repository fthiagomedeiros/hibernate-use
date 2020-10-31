import org.apache.log4j.BasicConfigurator;
import org.hibernate.cfg.Configuration;
import org.jboss.logging.Logger;

public class MainSystem {

    static final Logger log = Logger.getLogger(MainSystem.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();
        Configuration configuration = new Configuration();
        log.warn("Welcome to Event Calendar v2 2005.");
    }

}