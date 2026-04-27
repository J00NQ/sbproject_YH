package com.jojoldu.book.springboot.web.practice.dto;

import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

// [Day01] test(practice): HealthController 응답 검증
public class HealthResponseDtoTest {
    @Test
    public void healthDtoIsCreatedCorrectly() {
        String status = "OK";
        LocalDateTime timestamp = LocalDateTime.now();

        // HealthResponseDto 생성
        HealthResponseDto dto = new HealthResponseDto(status, timestamp);

        // status와 timestamp가 올바르게 설정되었는지 확인
        assertEquals(status, dto.getStatus());
        assertEquals(timestamp, dto.getTimestamp());
    }
}
