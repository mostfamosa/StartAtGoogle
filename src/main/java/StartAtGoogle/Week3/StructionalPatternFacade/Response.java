package StartAtGoogle.Week3.StructionalPatternFacade;

public class Response {
    private int statusCode;
    private String body;

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Response is :\n" +
                "statusCode=" + statusCode +
                "\nbody='" + body + '\'' +
                '}';
    }
}
