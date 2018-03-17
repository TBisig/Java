public class Project {
    private String name;
    private String description;

    public Project(){
    }

    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void newName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void newDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    } 


}