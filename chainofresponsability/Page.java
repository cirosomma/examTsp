public class Page {
  /**
    Come il nome suggerisce, tale pattern crea una catena di oggetti
    receiver per una richiesta. Permette di disaccoppiare il sender
    e il receiver di una richiesta in base al tipo di richiesta. E' di
    tipo strutturale. Ogni receiver contiene riferimenti ad altri
    receiver. Se un receiver non può gestire la richiesta può passare
    la stessa a prossimo receiver e cosi via.
  */
  private static AbstractLogger getChainOfLoggers() {
    AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
    AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
    AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

    errorLogger.setNextLogger(fileLogger);
    fileLogger.setNextLogger(consoleLogger);
    return errorLogger;
  }
  public static void main(String... args) {
    AbstractLogger loggerChain = getChainOfLoggers();

    loggerChain.logMessage(AbstractLogger.INFO,
                          "This is an information");

    loggerChain.logMessage(AbstractLogger.DEBUG,
                          "This is an debug level information");
    loggerChain.logMessage(AbstractLogger.ERROR,
                          "This is an error information");
  }
}
