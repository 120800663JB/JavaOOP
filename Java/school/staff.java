package school;

public class staff extends person {
    private String subject;
    private String title;

    public staff (String forename, String surname, String occupation,
        String phoneNo, String address, String house, String subject, String title) {

        super (forename, surname, occupation, phoneNo, address, house);

        this.subject = subject;
        this.title = title;
        
    }

    public String getSubject() {
        return subject;
    }

    public String getTitle() {
        return title;
    }

}
