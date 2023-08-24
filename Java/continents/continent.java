package continents;

import java.util.ArrayList;

/**
 * continent
 */
public class continent {

    private String name;
    private ArrayList<country> countries = new ArrayList<country>();

    public continent (String Name) {
        this.name = Name;
    }

    public void addCountry(country c) {
        countries.add(c);
    }

    public void populationTotal() {
        int total = 0;

        for (int i = 0; i < countries.size(); i++) {
            total = total + countries.get(i).getPopulation();
        }

        System.out.println(total);
    }


    
}