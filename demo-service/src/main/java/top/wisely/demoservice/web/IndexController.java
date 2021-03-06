package top.wisely.demoservice.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class IndexController {
    @Value("${author.name}")
    String authorName;

    @GetMapping("/")
    public String index(){
        return authorName;
    }
}
