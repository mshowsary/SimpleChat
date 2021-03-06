package chatProject.model.user;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

/**
 * This class models the account of a user.
 * A user has only a username.
 * There is no need for an ID.
 */
public class UserAccount {

    /**
     * The ID of a user (not needed).
     */
    private final int id;
    /**
     * The name of a user.
     */
    private String username;

    /**
     * génération d'un numéro aléatoire
     */
    public final int bootNum= ThreadLocalRandom.current().nextInt();;


    public UserAccount(int id, String username) {
        this.id = id;
        this.username = username;
    }

    /**
     * Gets the ID of a user (not needed).
     * @return the user unique ID
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the username of a user.
     * @return the username
     */
    /**public String getUsername() {
        return "test";
    } */

    public String getUsername() {
        if(this.username.equals("")){
            this.username="test"+bootNum;
        }
        return username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserAccount that = (UserAccount) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(username);
    }

    @Override
    public String toString() {
        return username;
    }
}
