package hello;

import hello.dataStructure.linkedList.LinkedLlist;
import hello.dataStructure.linkedList.Node;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    private final LinkedLlist lisst = new LinkedLlist();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }
//    @RequestMapping
    @PutMapping("/data")
    public Node putData(@RequestParam(value="data") String data){
        return lisst.putData(Integer.parseInt(data));
    }

    @GetMapping("/data")
    public ArrayList<Integer> getData(){
        return lisst.returnData();
    }
}