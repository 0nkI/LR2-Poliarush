package com.example.poliarush.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TireSet {
    private Long id;
    private String setCode;        // Маркировка комплекта (например, "SET-04-SLICK")
    private String compound;       // Тип смеси (Slick Soft, Slick Medium, Wet)
    private String manufacturer;   // Производитель (Michelin, Pirelli, Hankook)
    private int lapsCompleted;     // Количество пройденных кругов
    private String status;         // Статус: IN_WARMER (в грелках), ON_CAR (на авто), USED (использован)
    private Long carId;            // Связь с автомобилем (RaceCar)
}