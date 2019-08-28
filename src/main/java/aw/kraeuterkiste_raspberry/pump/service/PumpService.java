package aw.kraeuterkiste_raspberry.pump.service;

import aw.kraeuterkiste_raspberry.config.GpioHandler;
import aw.kraeuterkiste_raspberry.pump.model.PumpDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PumpService {

    private GpioHandler gpioHandler;

    @Autowired
    public PumpService(GpioHandler gpioHandler) {
        this.gpioHandler = gpioHandler;
    }

    public PumpDto togglePump() {
        gpioHandler.togglePump();
        return new PumpDto(gpioHandler.isPumpOn());
    }

}
