// public class ProjactTest {
//     public static void main(String[] args) {
//         Project p = new Project();
//         p.newName = ("same same");
//         p.newDescription = ("but still different");
//         String name = p.getName();
//         String description = p.getDescription();
//         System.out.println("Name:" + name, "Description:" + description); 
//     }
// }


public class ProjectTest{
    public static void main(String[] args) {
        Project p = new Project();
        p.newName("foo");
        p.newDescription("bar");
        String name = p.getName();
        String description = p.getDescription();
        System.out.println("Name: " + name + " Description: " + description);
        Project q = new Project("Hello", "World");
        name = q.getName();
        description = q.getDescription();
        System.out.println("Name: " + name + " Description: " + description);
        // Project r = new Project("Third");
        // name = r.getName();
        // description = r.getDescription();
        // System.out.println("Name: " + name + " Description: " + description);
    }
}