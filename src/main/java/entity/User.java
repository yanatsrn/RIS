package entity;
import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "user_id")
    private int userId;

    @Column
    private String login;

    @Column
    private String password;

    @Column
    private Role role;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    private Person person;

    public User() {
    }

    public User(String login, String password, Role role, Person person) {
        this.login = login;
        this.password = password;
        this.role = role;
        this.person = person;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                ", person=" + person +
                '}';
    }
}
