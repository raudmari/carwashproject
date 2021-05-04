package com.example.valiit.carwashproject.DTO;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class HistoryRowMapper implements RowMapper<History> {
    @Override
    public History mapRow(ResultSet resultSet, int i) throws SQLException{
        History response = new History();

        response.setUsername(resultSet.getString("username"));
        response.setServiceType(resultSet.getString("service_type_id"));
        response.setWashStation(resultSet.getString("wash_station_id"));
        response.setDate(resultSet.getObject("date", LocalDateTime.class));

        return response;

    }
}
