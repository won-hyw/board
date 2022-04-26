package com.mirim.biz.board.impl;

import com.mirim.biz.board.BoardService;
import com.mirim.biz.board.BoardVO;
import com.mirim.biz.common.Log4jAdvice;
import com.mirim.biz.common.LogAdvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("boardService")
public class boardServiceImpl implements BoardService {
    @Autowired
    private BoardDAO boardDAO;

    @Override
    public void insertBoard(BoardVO vo) {
        /*if(vo.getSeq() == 0) {
            throw new IllegalArgumentException("0번 글은 등록할 수 없습니다.");
        }*/
        boardDAO.insertBoard(vo);
    }

    @Override
    public void updateBoard(BoardVO vo) {
        boardDAO.updateBoard(vo);
    }

    @Override
    public void deleteBoard(BoardVO vo) {
        boardDAO.deleteBoard(vo);
    }

    @Override
    public BoardVO getBoard(BoardVO vo) {
        return boardDAO.getBoard(vo);
    }

    @Override
    public List<BoardVO> getBoardList(BoardVO vo) {
        return boardDAO.getBoardList(vo);
    }
}
