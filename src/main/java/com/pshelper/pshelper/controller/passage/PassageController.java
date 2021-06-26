package com.pshelper.pshelper.controller.passage;


import com.pshelper.pshelper.dto.request.PassageRequestDto;
import com.pshelper.pshelper.dto.response.BaseResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1/passage")
public class PassageController {


    @GetMapping("/")
    public ResponseEntity<BaseResponseDto> getTest() {

        PassageRequestDto passageRequestDto = PassageRequestDto.builder().text("hello").build();
        return new ResponseEntity<>(new BaseResponseDto(HttpStatus.OK.value(), "데이터 조회 성공", passageRequestDto), HttpStatus.OK);

    }


}
