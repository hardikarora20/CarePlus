package careplusapp.utility;

public interface Sender {
    public boolean send(String number, String data) throws Exception;
}
