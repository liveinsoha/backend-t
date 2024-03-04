package soha.backendt;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.sql.results.graph.basic.CoercingResultAssembler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
@Slf4j
public class Controller {

    private final MemberService memberService;
/*    private final ProductRepository productRepository;

    @GetMapping("/products")
    public ResponseEntity<?> products() {
        List<Product> products = productRepository.findAll();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }*/

    @PostMapping("/member")
    public ResponseEntity<String> memberCreate(@RequestBody MemberCreateRequest request){
        memberService.createMember(request);
        return ResponseEntity.status(HttpStatus.CREATED).body("가입 됨");
    }



    @GetMapping("/member/{id}")
    public ResponseEntity<MemberResponseDto> merberDetails(@PathVariable Long id){
        Member member = memberService.getMember(id);
        return ResponseEntity.ok(new MemberResponseDto(member));
    }

    @GetMapping("/hello1")
    public ResponseEntity<String> hello1() {
        log.info("GET : /api/hello1");
        return new ResponseEntity<>("Hello from hello1", HttpStatus.OK);
    }

    @GetMapping("/hello2")
    public ResponseEntity<String> hello2() {
        log.info("GET : /api/hello2");
        return new ResponseEntity<>("Hello from hello2", HttpStatus.OK);
    }

    @GetMapping("/hello3")
    public ResponseEntity<String> hello3() {
        log.info("GET : /api/hello3");
        return new ResponseEntity<>("Hello from hello3", HttpStatus.OK);
    }
    @GetMapping("/hello4")
    public ResponseEntity<String> hello4() {
        log.info("GET : /api/hello4");
        return new ResponseEntity<>("Hello from hello4", HttpStatus.OK);
    }
}
