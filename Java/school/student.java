package school;

public class student extends person {
    private String tutorClass;
    private String ncnNumber;

    public student (String forename, String surname, String occupation,
        String phoneNo, String address, String house, String tutor, String number) {

        super (forename, surname, occupation, phoneNo, address, house);

        this.tutorClass = tutor;
        this.ncnNumber = number;
    }

    public String getTutorClass() {
        return tutorClass;
    }

    public String getNcnNumber() {
        return ncnNumber;
    }
}
