package StartAtGoogle.Week3.StructionalPatternFacade;


import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.classic.methods.*;
import org.apache.hc.client5.http.entity.UrlEncodedFormEntity;
import org.apache.hc.client5.http.entity.mime.Header;
import org.apache.hc.client5.http.entity.mime.StringBody;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.*;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.io.entity.StringEntity;
import org.apache.hc.core5.http.message.BasicHeader;
import org.apache.hc.core5.http.message.BasicNameValuePair;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HttpFacade {

    public Response getReq(String url) throws IOException {

        Response result = new Response();
        HttpGet get = new HttpGet(url);
        get.addHeader("header for GET","Get");


        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {

            try (CloseableHttpResponse response = httpClient.execute(get)) {
                result.setBody(EntityUtils.toString(response.getEntity()));
                result.setStatusCode(response.getCode());
            } catch (ParseException | IOException e) {
                throw new RuntimeException(e);
            }
            return result;
        }
    }

    public Response postReq(String url, String body) throws IOException {

        Response result = new Response();
        HttpPost post = new HttpPost(url);

        post.setEntity(new StringEntity(body));

        try (CloseableHttpClient httpClient = HttpClients.createDefault();
             CloseableHttpResponse response = httpClient.execute(post)) {

            result.setBody(EntityUtils.toString(response.getEntity()));
            result.setStatusCode(response.getCode());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    public Response putReq(String url, String body) {

        Response result = new Response();
        HttpPut put = new HttpPut(url);

        put.setEntity(new StringEntity(body));

        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            CloseableHttpResponse response = httpClient.execute(put);
            result.setBody(EntityUtils.toString(response.getEntity()));
            result.setStatusCode(response.getCode());
        } catch (ParseException | IOException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    public Response deleteReq(String url) throws IOException {

        Response result = new Response();
        HttpDelete delete = new HttpDelete(url);
        CloseableHttpClient httpClient = HttpClients.createDefault();

        delete.addHeader("header for delete","Delete");

        try (CloseableHttpResponse response = httpClient.execute(delete)) {
            result.setStatusCode(response.getCode());
            result.setBody(response.getReasonPhrase());
        }
        return result;
    }

    public Response patchReq(String url, Object body) {

        Response result = new Response();
        HttpPatch patch = new HttpPatch(url);

        patch.setEntity(new StringEntity(body.toString()));

        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {

            CloseableHttpResponse response = httpClient.execute(patch);

            result.setBody(EntityUtils.toString(response.getEntity()));
            result.setStatusCode(response.getCode());

        } catch (ParseException | IOException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

}
