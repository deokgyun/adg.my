package my.adg.study.presentation;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/auction")
public class AuctionController {

    @GetMapping("/hello")
    public ResponseEntity<String> hello(){
        return ResponseEntity.ok("Hello, World!");
    }
}
