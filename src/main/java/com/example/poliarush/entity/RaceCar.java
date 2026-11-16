package com.example.poliarush.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RaceCar {
    private Long id;
    private String carNumber;      // Стартовый номер (например, "63")
    private String model;          // Модель авто (например, "BMW M4 GT4" или "Porsche 992 GT3 Cup")
    private String racingClass;    // Класс в гонке (например, "SP10", "Cup2")
    private String teamName;       // Команда (например, "Adrenalin Motorsport")
}