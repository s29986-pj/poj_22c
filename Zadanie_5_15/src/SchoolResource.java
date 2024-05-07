public abstract class SchoolResource {
    private int resourceID;
    protected String resourceName;
    public String description;
    public static int totalResources = 0;

    public SchoolResource(String resourceName, String description) {
        this.resourceID = ++totalResources;
        this.resourceName = resourceName;
        this.description = description;
    }

    public String getResourceDetails() {
        return "ID: " + resourceID + ", Name: " + resourceName + ", Description: " + description;
    }

    protected abstract void allocateResource();
}
