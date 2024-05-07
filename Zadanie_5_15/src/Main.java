public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Mark Chen", "School Administrator", 10000, "Administration");
        Equipment chair = new Equipment("Chair", "Comfy chair", "Room 306", false);
        Equipment table = new Equipment("Table", "Big round table", "Room 104", true);
        TeachingMaterial Book = new TeachingMaterial("Biology Book", "Anatomy", "Biology", false);


        // Sprawdza Employee i jego metody
        System.out.println(employee.getResourceDetails());
        employee.work();
        employee.allocateResource();
        System.out.println("\n");


        //Sprawdza Equipment i jego metody
        System.out.println(chair.getResourceDetails());
        chair.relocate("Room 202");
        chair.repair();
        chair.allocateResource();
        System.out.println("\n");


        //Sprawdza ponownie metodę repair w klasie Equipment
        System.out.println(table.getResourceDetails());
        table.repair();
        System.out.println("\n");


        //Sprawdza TeachingMaterial i jego metedy
        System.out.println(Book.getResourceDetails());
        Book.checkout();
        Book.checkin();
        Book.allocateResource();
    }
}
