import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

class RequestCounter {

    int count = 0;
    static RequestCounter instance = new RequestCounter();

    private RequestCounter() {
    }

    void incrementCount() {
        this.count++;
    }

    int getCount() {
        return this.count;
    }

    public static RequestCounter getInstance() {
        return instance;
    }
}


class RequestController {

    handleRequest() {
        RequestCounter rCounter = RequestCounter.getInstance();
        rCounter.incrementCount();
    }

    @GetMapping
    getCount() {
        RequestCounter rCounter = RequestCounter.getInstance();
        return rCounter.getCount();
    }

    p s v main(S args[]) {
        RequestController rc = new RequestController() ;
        rc.handleRequest();
        rc.handleRequest();
        rc.handleRequest();
        rc.handleRequest();
        rc.handleRequest();
        rc.handleRequest();

        s.out.p(rc.getCount);
    }
}
