package at.campus02.iwi;

public class GangExistiertNichtException extends Exception {
    public GangExistiertNichtException() {
    }

    public GangExistiertNichtException(String message) {
        super(message);
    }
}
