package com.makeLog.makeLog;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
@RequiredArgsConstructor
@Slf4j
public class LogInitializer {
    private static final Random random = new Random();

    @Scheduled(fixedRate = 5000)
    public void makeLog() {
        LogMessage[] logMessages = LogMessage.values();
        LogMessage logMessage = logMessages[random.nextInt(logMessages.length)];

        if (logMessage.getType().equals("info")) {
            printInfo(logMessage.getMessage());
        } else if (logMessage.getType().equals("error")) {
            printError(logMessage.getMessage());
        } else if (logMessage.getType().equals("warn")) {
            printWarn(logMessage.getMessage());
        }
    }

    private void printInfo(String logMessage) {
        log.info(logMessage);
    }

    private void printError(String logMessage) {
        log.error(logMessage);
    }

    private void printWarn(String logMessage) {
        log.warn(logMessage);
    }
}
