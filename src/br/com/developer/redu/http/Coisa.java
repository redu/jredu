package br.com.developer.redu.http;
import java.io.IOException;

import org.scribe.model.OAuthRequest;
import org.scribe.model.Response;
import org.scribe.model.Token;
import org.scribe.model.Verb;
import org.scribe.model.Verifier;
import org.scribe.oauth.OAuthService;
//keZiAfespsRXlZNS1DKe
public class Coisa {

    private static final String CONSUMER_KEY = "P2AeHTJCV9Wy31Xq8IBIvOpYT1lhbluqvFh8RPdB";
    private static final String CONSUMER_SECRET_KEY = "SInt2l80rnhz8YkP3zt5ThvKmeb4Srt12EezDIVe";

    private static final String RESOURCE = "http://www.redu.com.br/api/me.json";

    public static void main(String[] args) throws IOException {
        OAuthService service = new ServiceBuilderTemp().provider(ReduOauth2.class)
                .apiKey(CONSUMER_KEY).apiSecret(CONSUMER_SECRET_KEY).callback("").build();


        String authUrl = service.getAuthorizationUrl(null);
        Verifier verifier = new Verifier("keZiAfespsRXlZNS1DKe");

        Token accessToken = service.getAccessToken(null, verifier);


        OAuthRequest request = new OAuthRequest(Verb.GET, RESOURCE);
        request.addQuerystringParameter("","");
        service.signRequest(accessToken, request);

        System.out.println("Sending request");
        Response response = request.send();

        System.out.println("\nResponse: \n");
        System.out.println("Code: " + response.getCode());
        System.out.println("Response: " + response.getBody());

    }
}