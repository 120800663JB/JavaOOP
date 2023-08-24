package continents;

/**
 * country
 */
public class country {

    private String name;
    private int population;
    private int areaSqMile;

    public country (String Name, int pop, int area) {

        this.name = Name;
        this.population = pop;
        this.areaSqMile = area;

    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public int getArea() {
        return areaSqMile;
    }

    public void displayInfo() {
        System.out.println(name + population + areaSqMile); 
    }

    public int popDensity() {
        return population / areaSqMile;
    }

    public boolean isLarger(country c) {
        return (c.getArea() > this.areaSqMile);
    }

    
}