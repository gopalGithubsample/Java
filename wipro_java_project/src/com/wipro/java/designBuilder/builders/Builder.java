package com.wipro.java.designBuilder.builders;

import com.wipro.java.designBuilder.cars.CarType;
import com.wipro.java.designBuilder.components.Engine;
import com.wipro.java.designBuilder.components.GPSNavigator;
import com.wipro.java.designBuilder.components.Transmission;
import com.wipro.java.designBuilder.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}