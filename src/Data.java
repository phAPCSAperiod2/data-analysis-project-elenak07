/**
 * Represents one row from your dataset.
 *
 * TODO:
 *  - Rename the class to match your dataset (e.g., Pokemon, StateData, CountryStat)
 *  - Add at least 3 private attributes based on your CSV columns
 *  - Write a constructor that initializes all attributes
 *  - Add getter methods for the attributes you need in your analysis
 *  - Override toString() to display the object's data
 *  - Add Javadoc comments for the class and all methods
 */
public class Data {

    // TODO: Add at least 3 private attributes
    // Example:
    // private String name;
    // private int population;
    // private double value;
    private String country;
    private int emissions;
    private int population;

    // TODO: Create a constructor that takes all attributes as parameters
    public Data(String country, int emissions, int population) {
        this.country = country;
        this.emissions = emissions;
        this.population = population;
        

    }
    // TODO: Add getters for attributes you need
    public String getCountry() {
        return country;
    }

    public int getEmissions() {
        return emissions;
    }

    public int getPopulation() {
        return population;
    }

    // TODO: Add other data analysis methods

    // TODO: Override toString() to return a readable representation of your object
    @Override
    public String toString() {
        return "Data: country='" + country + "', emissions=" + emissions + ", population=" + population + "}";
    }

    // TODO: Add other data analysis methods


    }

