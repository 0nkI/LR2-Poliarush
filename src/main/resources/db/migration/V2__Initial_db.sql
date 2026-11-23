CREATE TABLE race_cars (
                           id           bigserial PRIMARY KEY,
                           car_number   varchar(20)  NOT NULL,
                           model        varchar(100) NOT NULL,
                           racing_class varchar(50)  NOT NULL,
                           team_name    varchar(100) NOT NULL
);

CREATE TABLE tire_sets (
                           id             bigserial PRIMARY KEY,
                           set_code       varchar(50) NOT NULL,
                           compound       varchar(50) NOT NULL,
                           manufacturer   varchar(50) NOT NULL,
                           laps_completed integer     DEFAULT 0,
                           status         varchar(30) NOT NULL,
                           car_id         bigint
);

CREATE TABLE tire_telemetry (
                                id             bigserial PRIMARY KEY,
                                tire_set_id    bigint       NOT NULL,
                                wheel_position varchar(10)  NOT NULL,
                                pressure_bar   numeric(4,2) NOT NULL,
                                temp_inner_c   numeric(5,2) NOT NULL,
                                temp_middle_c  numeric(5,2) NOT NULL,
                                temp_outer_c   numeric(5,2) NOT NULL,
                                tread_depth_mm numeric(4,2) NOT NULL,
                                recorded_at    timestamp    NOT NULL
);

CREATE TABLE track_conditions (
                                  id           bigserial PRIMARY KEY,
                                  track_name   varchar(100) NOT NULL,
                                  weather      varchar(30)  NOT NULL,
                                  air_temp_c   numeric(5,2) NOT NULL,
                                  track_temp_c numeric(5,2) NOT NULL,
                                  updated_at   timestamp    NOT NULL
);

ALTER TABLE tire_sets
    ADD CONSTRAINT fk_tire_sets_car_id
        FOREIGN KEY (car_id) REFERENCES race_cars(id);

ALTER TABLE tire_telemetry
    ADD CONSTRAINT fk_tire_telemetry_set_id
        FOREIGN KEY (tire_set_id) REFERENCES tire_sets(id);