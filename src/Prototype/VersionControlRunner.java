package Prototype;

public class VersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project(1,"SuperProject","Source1");;

        ProjectFactory projectFactory = new ProjectFactory(master);
        System.out.println(master);
        Project masterClone = projectFactory.cloneProject();
        System.out.println(masterClone);

    }
}
