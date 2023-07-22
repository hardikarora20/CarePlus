package careplusapp.utility;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.request.GetRequest;

public class OTPSender implements Sender {

    @Override
    public boolean send(String number, String data)throws Exception {
        
            Unirest.setTimeouts(0, 0);
            String key = "64914626-ce08-11ed-81b6-0200cd936042";
            String url = "https://2factor.in/API/V1/"+key+"/SMS/"+number+"/"+data+"/OTP1";
            System.out.println("OTP is:"+data);
            GetRequest gr=Unirest.get(url);
            HttpResponse<String>response=gr.asString();
            String result=response.getBody();
            return result.contains("Success");
        }
    }
    