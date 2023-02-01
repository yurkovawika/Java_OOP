package Work_5.phoneBook;

public class Email  {
    private String _email;

    public Email(String email)  throws BadEmailException {
        if (isValid(email)) {
            this._email = email;
        } else {
            throw new BadEmailException("bad email");
        }        
    }

    private static boolean isValid(String email) {
        if (email.contains("@")) {
            return true;
        }
        return false;
    }

    public String get_email() {
        return this._email;
    }

    public void set_email(String _email) {
        this._email = _email;
    }

    @Override
    public String toString() {
        return this.get_email();
    }
}
