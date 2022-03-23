package site.metacoding.serverproject2.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.RequiredArgsConstructor;
import site.metacoding.serverproject2.domain.BoardTbl;
import site.metacoding.serverproject2.domain.BoardTblRepository;

@RequiredArgsConstructor
@Service
public class BoardTblService {
    
    private final BoardTblRepository boardTblRepository;

    public List<BoardTbl> 글목록보기() {

        List<BoardTbl> lists = boardTblRepository.findAll();

        return lists;
    }

    public List<BoardTbl> 검색하기(@RequestParam String keyword){

        List<BoardTbl> lists = boardTblRepository.mSearch(keyword);

        return lists;
    }
}
