package exercise;

// BEGIN
public class NegativeRadiusException extends Exception {
    public static final NegativeRadiusException NEGATIVE_RADIUS_EXCEPTION
            = new NegativeRadiusException("Не удалось посчитать площадь");
    private String errorText;

    public NegativeRadiusException(String errorText) {
        this.errorText = errorText;

    }

    public String getErrorText() {
        return errorText;
    }
}
// END
