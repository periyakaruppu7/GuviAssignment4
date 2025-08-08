package GuviAssignment4;

public class VoterPro {
    private int voterId;
    private String name;
    private int age;

    public VoterPro(int voterId, String name, int age) throws IllegalArgumentException {
        if (age < 18) {
            throw new IllegalArgumentException("Invalid age for voter");
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    public int getVoterId() {
        return voterId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        try {
            VoterPro voter1 = new VoterPro(1, "Prakash", 20);
            System.out.println("Voter ID: " + voter1.getVoterId());
            System.out.println("Name: " + voter1.getName());
            System.out.println("Age: " + voter1.getAge());

            // This will throw an exception
            VoterPro voter2 = new VoterPro(2, "Divya", 16);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}