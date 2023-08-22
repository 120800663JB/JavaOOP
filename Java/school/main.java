package school;

public class main {
    public static void main(String[] args) {
        student newPerson = new student("Loon", "Troon", "Student", "0743135464", "Loons House", "Bavelaw", "6b1", "123");
    
        System.out.println(newPerson.getForename());
    
        staff newStaff = new staff("Daniel", "Thompson", "Staff", "0467538476984", "Daniels house", "Malleny", "Physics", "Sir");

        System.out.println(newStaff.getForename());
    }
}
