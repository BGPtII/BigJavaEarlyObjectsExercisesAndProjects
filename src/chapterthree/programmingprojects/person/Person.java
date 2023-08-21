package chapterthree.programmingprojects.person;

public class Person {
    private String firstName;
    private String friends;

    public Person(String firstName) {
        this.firstName = firstName;
        friends = "";
    }

    public void befriend(Person p) {
        if (friends.toLowerCase().contains(p.getFirstName().toLowerCase())) {
            System.out.println(p.getFirstName() + " already in friend list, unable to add.");
        }
        else {
            friends += p.getFirstName() + " ";
        }
    }

    public void unfriend(Person p) {
        friends = friends.replace(p.getFirstName() + " ", "");
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFriendNames() {
        return friends;
    }

    public int getFriendCount() {
        int count = 0;
        for (int i = 0; i < friends.length(); i++) {
            if (friends.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }
}
