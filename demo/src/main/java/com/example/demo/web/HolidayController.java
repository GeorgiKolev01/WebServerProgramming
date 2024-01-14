package com.example.demo.web;
import com.example.demo.model.CreateHolidayDTO;
import com.example.demo.model.ResponseHolidayDTO;
import com.example.demo.model.UpdateHolidayDTO;
import com.example.demo.service.HolidayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/holidays")
public class HolidayController {

        private final HolidayService holidayService;

        @Autowired
        public HolidayController(HolidayService holidayService) {
                this.holidayService = holidayService;
        }



        @PostMapping
        public ResponseHolidayDTO createHoliday(@RequestBody CreateHolidayDTO createHolidayDTO) {
                try {
                        // Call the service method to create a holiday
                        ResponseHolidayDTO createdHoliday = holidayService.createHoliday(createHolidayDTO);

                        // If the holiday is successfully created, return a ResponseEntity with the created holiday and HTTP status 201 (Created)
                        return new ResponseEntity<>(createdHoliday, HttpStatus.CREATED).getBody();
                } catch (Exception e) {
                        throw new RuntimeException(e);
                }
        }

        @DeleteMapping("/{holidayId}")
        public Boolean deleteHoliday(@PathVariable Long holidayId) {
                boolean isDeleted = holidayService.deleteHoliday(holidayId);
                if (isDeleted) {
                        // Return 204 No Content if the holiday was successfully deleted
                        return ResponseEntity.noContent().build().hasBody();
                } else {
                        // Return 404 Not Found if the holiday with the given ID was not found
                        return ResponseEntity.notFound().build().hasBody();
                }
        }

        @GetMapping
        public List<ResponseHolidayDTO> getHolidays() {
                List<ResponseHolidayDTO> holidays = holidayService.getHolidays();

                if (!holidays.isEmpty()) {
                        // Return 200 OK with the list of holidays if they exist
                        return ResponseEntity.ok(holidays).getBody();
                } else {
                        // Return 204 No Content if there are no holidays
                        return (List<ResponseHolidayDTO>) ResponseEntity.noContent().build();
                }
        }

        @GetMapping("/{holidayId}")
        public ResponseEntity<Object> getHolidayById(@PathVariable Long holidayId) {
                ResponseHolidayDTO holiday = holidayService.getHolidayById(holidayId);

                if (holiday != null) {
                        // Return 200 OK with the holiday if it exists
                        return ResponseEntity.ok(holiday);
                } else {
                        // Return 404 Not Found if the holiday with the given ID does not exist
                        return ResponseEntity.notFound().build();
                }
        }

        @PutMapping
        public ResponseEntity<Object> updateHoliday(@RequestBody UpdateHolidayDTO updateHolidayDTO) {
                ResponseHolidayDTO updatedHoliday = holidayService.updateHoliday(updateHolidayDTO);

                if (updatedHoliday != null) {
                        // Return 200 OK with the updated holiday
                        return ResponseEntity.ok(updatedHoliday);
                } else {
                        // Return 404 Not Found if the holiday to be updated does not exist
                        return ResponseEntity.notFound().build();
                }
        }
}
