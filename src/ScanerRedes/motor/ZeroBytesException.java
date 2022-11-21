package ScanerRedes.motor;



public class ZeroBytesException extends Exception{
    public ZeroBytesException(String message){
        super("Exception: "+ message);
    }
}
