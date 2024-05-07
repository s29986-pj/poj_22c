public class TeachingMaterial extends SchoolResource {
    private String subject;
    public boolean isInUse;

    public TeachingMaterial(String resourceName, String description, String subject, boolean isInUse) {
        super(resourceName, description);
        this.subject = subject;
        this.isInUse = isInUse;
    }

    public void checkout() {
        if (!isInUse) {
            isInUse = true;
            System.out.println(resourceName + " for " + subject + " has been checked out.");
        }
    }

    public void checkin() {
        if (isInUse) {
            isInUse = false;
            System.out.println(resourceName + " for " + subject + " has been checked in.");
        }
    }

    @Override
    protected void allocateResource() {
        System.out.println("Allocating teaching materials to a new class.");
    }
}
