package com.pshelper.pshelper.controller.passage;


import com.pshelper.pshelper.dto.request.passage.PassageRequestDto;
import com.pshelper.pshelper.dto.response.BaseResponseDto;
import com.pshelper.pshelper.dto.response.ErrorResponseDto;
import com.pshelper.pshelper.service.passage.PassageService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;




/*
 * 알고리즘 문제 하나를 Passage라 정의.
 * 알고리즘 문제에 대한 Controller.
 */
@AllArgsConstructor
@RestController
@RequestMapping(value = "api/v1/passage")
public class PassageController {



    private final PassageService passageService;


    @GetMapping("/")
    public ResponseEntity<BaseResponseDto> getTest() {
        PassageRequestDto passageRequestDto = PassageRequestDto.builder().content("hello").build();
        return new ResponseEntity<>(new BaseResponseDto(HttpStatus.OK.value(), "데이터 조회 성공", passageRequestDto), HttpStatus.OK);

    }


    @ApiOperation(value = "PassageRequestDto", notes = "하이라이팅 기능", response = PassageRequestDto.class)
    @ApiResponses({
            @ApiResponse(code = 200, message = "하이라이팅 기능 완료"),
            @ApiResponse(code = 500, message = "서버 에러", response = ErrorResponseDto.class),
    })
    @PostMapping("/highlight")
    public ResponseEntity<BaseResponseDto> getHighlighted(@RequestBody PassageRequestDto passageRequestDto) {

        // TODO : 하이라이팅 로직 실행하고, Return 해주자.
        return new ResponseEntity<>(new BaseResponseDto(HttpStatus.OK.value(), "데이터 조회 성공", passageService.getHighlightedPassage(passageRequestDto)), HttpStatus.OK);
    }


}
