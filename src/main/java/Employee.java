/**
 * Class implementing an employee.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/9/">Lab 9 Description</a>
 */
public class Employee {
    /***/
    private String name;
    /***/
    private String manager;

    /**
     * Constructor for initialization.
     * @param n e
     * @param m e
     */
    public Employee(final String n, final String m) {
        this.name = name;
        this.manager = manager;
    }

    /**
     * Getter for name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name.
     * @param n e
     */
    public void setName(final String n) {
        this.name = name;
    }

    /**
     * Getter for manager.
     * @return manager
     */
    public String getManager() {
        return manager;
    }

    /**
     * Setter for manager.
     * @param m e
     */
    public void setManager(final String m) {
        this.manager = manager;
    }
}
