package site.metacoding.serverproject2.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.RequiredArgsConstructor;
import site.metacoding.serverproject2.service.BoardTblService;

@RequiredArgsConstructor
@Controller
public class BoardTblController {
    private final BoardTblService boardTblService;
    
    @GetMapping("/")
    public String list(@RequestParam(defaultValue = "") String keyword, Model model) {

        model.addAttribute("lists", boardTblService.글목록보기());
        model.addAttribute("lists", boardTblService.검색하기(keyword));

        return "post/list";
    }
}
