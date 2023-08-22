package school;

public class person {
    private String forename;
    private String surname;
    private String occupation;
    private String phoneNo;
    private String address;
    private String house;

    public person (
        String forename, String surname, String occupation,
        String phoneNo, String address, String house) {

        this.forename = forename;
        this.surname = surname;
        this.occupation = occupation;
        this.phoneNo = phoneNo;
        this.address = address;
        this.house = house;
    }

    public String getForename() {
        return forename;
    }

    public String getSurname() {
        return surname;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getAddress() {
        return address;
    }

    public String getHouse() {
        return house;
    }

}
