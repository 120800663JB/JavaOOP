package continents;

public class taskOne {
    public static void main(String[] args) {
        country germany = new country("Germany",81471834, 1377846);
        country france = new country("France", 65312249, 211208);
        germany.displayInfo();
        System.out.println(germany.popDensity());
        System.out.println(germany.isLarger(france));
        country [] fistCountries = {germany, france};
        continent europe = new continent("Europe",fistCountries);
        country scotland = new country("Scotland", 5500000, 30981);
        europe.addCountry(scotland);
        europe.populationTotal();
    }
}
