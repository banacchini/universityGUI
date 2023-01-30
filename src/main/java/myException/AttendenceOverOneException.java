package myException;

public  class AttendenceOverOneException extends Exception{
    public AttendenceOverOneException(String errorMessage){
        super(errorMessage);
    }

}
