package Work_5.phoneBook;

public class PhoneNumber {
    private String _phoneNumber;

    public PhoneNumber(String phoneNumber) throws NumberFormatException {
        if (isValid(phoneNumber)) {
            this._phoneNumber = phoneNumber;
        } else {
            throw new NumberFormatException("Bad number");
        }
    }

    public String get_phoneNumber() {
        return this._phoneNumber;
    }

    private static boolean isValid(String phoneNumber) {
        try {
            Integer.parseInt(phoneNumber);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

    @Override
    public String toString() {
        return this.get_phoneNumber();
    }

    public int compareTo(PhoneNumber phoneNumber) {
        return this._phoneNumber.compareTo(String.valueOf(phoneNumber));
    }
}
