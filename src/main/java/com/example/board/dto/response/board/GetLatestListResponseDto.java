package com.example.board.dto.response.board;

import java.util.List;

import com.example.board.dto.response.ResponseCode;
import com.example.board.dto.response.ResponseDto;
import com.example.board.dto.response.ResponseMessage;
import com.example.board.dto.response.board.item.BoardListItem;

import lombok.Getter;

@Getter
public class GetLatestListResponseDto extends ResponseDto {
    private List<BoardListItem> latestList;

    public GetLatestListResponseDto(List<BoardListItem> latestList) {
        super(ResponseCode.SUCCESS, ResponseMessage.SUCCESS);
        this.latestList = latestList;
    }
}
