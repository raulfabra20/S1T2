package n1.models;

public  class EmptySaleException extends Exception {
    protected String message;

    public EmptySaleException(String message) {
        super(message);

    }
    public String getMessage(){
        return message;
    }


}
