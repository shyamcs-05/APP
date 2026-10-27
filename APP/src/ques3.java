interface BasicSecurity {
    void login();
    void logout();
}
interface AdvancedSecurity extends BasicSecurity {
    void fingerprintAuthentication();
    void faceRecognition();
}
class BankingApplication implements AdvancedSecurity {
    public void login() {
        System.out.println("User logged in successfully.");
    }
    public void logout() {
        System.out.println("User logged out successfully.");
    }
    public void fingerprintAuthentication() {
        System.out.println("Fingerprint authentication successful.");
    }
    public void faceRecognition() {
        System.out.println("Face recognition authentication successful.");
    }
}
public class ques3 {
    public static void main(String[] args) {
        BankingApplication app = new BankingApplication();
        app.login();
        app.logout();
        app.fingerprintAuthentication();
        app.faceRecognition();
    }
}