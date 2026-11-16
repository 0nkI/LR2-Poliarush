package com.example.poliarush.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TrackCondition {
    private Long id;
    private String trackName;      // Название трассы (например, "Nürburgring Nordschleife")
    private String weather;        // Погода: DRY, DAMP, WET
    private double airTempC;       // Температура воздуха (°C)
    private double trackTempC;     // Температура асфальта (°C)
    private LocalDateTime updatedAt;
}
