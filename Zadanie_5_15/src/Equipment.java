public class Equipment extends SchoolResource {
    protected String location;
    public boolean isFunctional;

    public Equipment(String resourceName, String description, String location, boolean isFunctional) {
        super(resourceName, description);
        this.location = location;
        this.isFunctional = isFunctional;
    }

    public void relocate(String newLocation) {
        this.location = newLocation;
        System.out.println(resourceName + " has been moved to " + location);
    }

    public void repair() {
        if (!isFunctional) {
            isFunctional = true;
            System.out.println(resourceName + " has been repaired and is now functional.");
        }
    }

    @Override
    protected void allocateResource() {
        System.out.println("Allocating equipment to a new room.");
    }
}
