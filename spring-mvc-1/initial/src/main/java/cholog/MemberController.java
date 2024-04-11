package cholog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MemberController { // MemberController은 컨트롤러, 아래 world(), json()은 메서드
    // 동적으로 페이지 처리 위해서 템플릿 엔진 활용 -> resource/templates/hello.html
    @GetMapping("/hello")
    public String world(@RequestParam(name="name") String name, Model model) {  // 쿼리 스트링(?name=brown)으로 전달된 name 값을 @RequestParam 을 활용해 컨트롤러 메서드의 파리미터로 주입받기
        // 컨트롤러 메서드 내에서 뷰로 값 전달을 위해 Model 객체 활용
        model.addAttribute("name", name);   // Model 객체는 컨트롤러 메서드의 파라미터로 주입 받을 수 있고, addAttribute 메서드를 통해 값을 전달
        return null;
    }

    @GetMapping("/json")
    @ResponseBody // 컨트롤러 메서드의 리턴타입을 그대로 body에 담아 응답을 하기 위해서는 @responseBody 활용
    public Person json() {
        return new Person("brown", 20);
    }
}
