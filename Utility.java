
package DTS_Assignment;

/**
 *
 * @author Andreas E.S
 */
public class Utility {

    static String username[] = {"imms","Gamundani",""}; //lecture usernames are entered here
    static String password[] = {"imms","Attlee"}; //lectures passwords are entered here

    public static boolean validate(String name, String pwd) {
        boolean found = false;
        int position = -1;

        for (int i = 0; i < username.length; i++) {
            if (name.equalsIgnoreCase(username[i])) {
                position = i;
                break;
            }
        }
        if (position != -1) {
            if (pwd.equalsIgnoreCase(password[position])) {
                found = true;
            }
        }
        return found;
    }
}
