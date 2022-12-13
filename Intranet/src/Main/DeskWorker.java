package Main;
/**
 */
public class DeskWorker extends Employee {
    /**
     */
    private State workingState;

    /**
     * @return 
     */
    public boolean supportWorker() {
        return false;
    }

    /**
     */
    public void sendReport() {
    }

    /**
     * @return 
     */
    public boolean reviewCase() {
        return false;
    }
}

