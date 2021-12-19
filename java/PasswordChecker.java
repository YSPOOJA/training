class PasswordChecker {
    public static final int password_Length=8;
    public static boolean ValidPassword (String password) {
    if (password.length()< password_Length && password.length() <0 && password == null && password.equals(""))
    return false;

    int charcout =0;
    int numcount =0;
    int specialCharcount= 0;
    for (int i=0; i< password.length(); i++) {
        char ch= password.charAt(i);
        if (numeric (ch))
        numcount++;
        else if (letter(ch))
        charcout++;
        else if (specialChar(ch)) {
            specialCharcount++;
        } else 
        return false;
    }
    return (charcout>=2 && numcount >=2);
}
public static boolean letter(char ch) {
    ch= Character.toUpperCase(ch);
    return (ch>='A'&& ch='Z');
}
public static boolean numeric (char ch) {
    return (ch>='0' && ch<='9');
}  
public static boolean specialChar(char ch) {
    return (ch=='@' || ch=='_' || ch=='-' || ch=='*' || ch=='&');
}
class PasswordException extends Exception {
    public PasswordException(String errmessage){
        super(errmessage);
    }
}
class CheckPassword {
    public CheckPassword(String password) throws PasswordException {
        PasswordChecker pc=new PasswordChecker();
        if (pc.ValidPassword(password)) {
            System.out.println("passward is void");
        } else {
            throw new PasswordException("invalid password");
        }
    }
}
public class App {
    public static void main(String[] args) {
        try {
            CheckPassword checkPassword=new CheckPassword(args[0]);
        } catch (PasswordException e ) {
            System.out.println(e);
        }
    }
}