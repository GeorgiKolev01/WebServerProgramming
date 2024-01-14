package com.example.demo.service;

import com.example.demo.model.CreateHolidayDTO;
import com.example.demo.model.ResponseHolidayDTO;
import com.example.demo.model.UpdateHolidayDTO;

import java.util.List;

public interface HolidayService {
    ResponseHolidayDTO createHoliday(CreateHolidayDTO createHolidayDTO);
    Boolean deleteHoliday(Long holidayId);
    List<ResponseHolidayDTO> getHolidays();
    ResponseHolidayDTO getHolidayById(Long holidayId);
    ResponseHolidayDTO updateHoliday(UpdateHolidayDTO updateHolidayDTO);
}
