package com.hotel.controller;

import com.hotel.model.Reserve;
import com.hotel.service.ReserveService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping("/reserve")
public class ReserveController {

    private ReserveService reserveService;

    public ReserveController(ReserveService reserveService) {
        this.reserveService = reserveService;
    }

    @CrossOrigin
    @GetMapping("/{clientId}")
    public List<Reserve> getReserves(@PathVariable int clientId) {
        return reserveService.getReserve(clientId);
    }

    @CrossOrigin
    @PostMapping()
    public Reserve addReserve(@Valid @NotNull @RequestBody Reserve reserve) {
        return reserveService.check(reserve);
    }
}
