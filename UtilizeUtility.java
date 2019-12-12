
package DTS_Assignment;

/**
 *
 * @author Mr Imms
 */
public class UtilizeUtility {
      static String username[] = {"218062958", "218006225","218117833","218041705"}; //Add students numbers 
    static String password[] = {"imms","Andrew_14256","Tjiua","Milka"}; //Student number's added, password must be entered here

    public static boolean validating(String name, String pwd) {
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
