package concrete.model;

public class Candidate {
    int id;
    String name;

    public Candidate(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
