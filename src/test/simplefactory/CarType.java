package test.simplefactory;

/**
 * CarType.java will hold the types of car and will provide car types to all other classes
 */
public enum CarType
{
    SEDAN("Sedan"), SUV("Suv");

    private final String type;

    private CarType(String type)
    {
        this.type = type;
    }

    /**
     * @return the type
     */
    public String getType()
    {
        return type;
    }

}
