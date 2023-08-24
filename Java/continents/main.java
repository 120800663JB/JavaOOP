package continents;

/**
 * main
 */
public class main {
    public static void main(String[] args) {
        
        continent africa = new continent("Africa");

        country scotland = new country("Scotland", 3, 40);

        africa.addCountry(scotland);




    }
    
}