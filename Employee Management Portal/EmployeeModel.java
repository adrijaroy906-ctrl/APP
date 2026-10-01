public class EmployeeModel {
    String username = "admin";
    String password = "admin123";

    String id;
    String name;
    String department;

    boolean login(String user, String pass) {
        return username.equals(user) && password.equals(pass);
    }

    boolean changePassword(String oldPass, String newPass, String confirm) {
        if (!password.equals(oldPass))
            return false;

        if (!newPass.equals(confirm))
            return false;

        password = newPass;
        return true;
    }
}
