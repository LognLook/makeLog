package com.makeLog.makeLog;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum LogMessage {
    LOGIN_INFO("로그인 진입 시도", "info"),
    LOGIN_ERROR("해당하는 사용자가 존재하지 않습니다", "error"),
    INPUT_ERROR("잘못된 입력값을 입력하였습니다", "error"),
    CHALLENGE_ERROR("이미 종료된 챌린지 입니다", "error"),
    TIME_ERROR("시작일과 종료일이 올바르지 않습니다", "error"),
    TOKEN_INFO("refreshToken 발급", "info"),
    TOKEN_ERROR("유효하지 않은 token입니다", "error"),
    ID_WARN("warning입니다", "warn")
    ;
    private final String message;
    private final String type;
}
