package com.example.poliarush.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TireTelemetry {
    private Long id;
    private Long tireSetId;        // Ссылка на комплект шин
    private String wheelPosition;  // Позиция колеса: FL, FR, RL, RR
    private double pressureBar;    // Текущее давление в барах (например, 2.05)
    private double tempInnerC;     // Температура внутренней дорожки (°C)
    private double tempMiddleC;    // Температура центральной дорожки (°C)
    private double tempOuterC;     // Температура внешней дорожки (°C)
    private double treadDepthMm;   // Остаток протектора (мм)
    private LocalDateTime recordedAt; // Время замера
}