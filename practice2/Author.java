package practice2.f;

public class Author {
    private String email;
    private String name;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;   // важно!
        this.gender = gender;
    }

    public Author() {}

    public Author(String email) { this.email = email; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public char getGender() { return gender; }
    public void setGender(char gender) { this.gender = gender; }

    @Override
    public String toString() {
        return "Author{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}

