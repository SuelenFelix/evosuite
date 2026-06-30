package com.API.OnDriver.CustomerSubsystem;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static com.API.OnDriver.CustomerSubsystem.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.String;

public class Passenger_listPastRides_4613590307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12515;

    public Passenger_listPastRides_4613590307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term12527 = new ArrayList();
        ((ArrayList) term12527).add((Object)null);
        ((ArrayList) term12527).add((Object)null);
        Boolean term12530 = new Boolean(true);
        ArrayList term12532 = new ArrayList();
        ((ArrayList) term12532).add((Object)null);
        ((ArrayList) term12532).add((Object)null);
        ((ArrayList) term12532).add((Object)null);
        ((ArrayList) term12532).add((Object)null);
        ((ArrayList) term12532).add((Object)null);
        ((ArrayList) term12532).add((Object)null);
        ((ArrayList) term12532).add((Object)null);
        ((ArrayList) term12532).add((Object)null);
        ((ArrayList) term12532).add((Object)null);
        Object term12518 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        Object term12519 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        Object term12521 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        Object term12523 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger"));
        Object term12524 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Offer"));
        setField(term12519, term12519.getClass(), "location", null);
        setBooleanField(term12519, term12519.getClass(), "isDiscounted", false);
        setField(term12519, term12519.getClass(), "drivers", null);
        setField(term12518, term12518.getClass(), "source", term12519);
        setField(term12521, term12521.getClass(), "location", null);
        setBooleanField(term12521, term12521.getClass(), "isDiscounted", false);
        setField(term12521, term12521.getClass(), "drivers", null);
        setField(term12518, term12518.getClass(), "destination", term12521);
        setField(term12523, term12523.getClass(), "pastRides", null);
        setField(term12523, term12523.getClass(), "currentRide", null);
        setField(term12523, term12523.getClass(), "dateOfBirth", null);
        setField(term12523, term12523.getClass(), "username", null);
        setField(term12523, term12523.getClass(), "mobileNumber", null);
        setField(term12523, term12523.getClass(), "email", null);
        setField(term12523, term12523.getClass(), "password", null);
        setField(term12523, term12523.getClass(), "userStatus", null);
        setField(term12518, term12518.getClass(), "passenger", term12523);
        setDoubleField(term12524, term12524.getClass(), "price", 0.5725602309856443);
        setDoubleField(term12524, term12524.getClass(), "discountedPrice", 0.5310967137636303);
        setField(term12524, term12524.getClass(), "driver", null);
        setField(term12518, term12518.getClass(), "acceptedOffer", term12524);
        setField(term12518, term12518.getClass(), "offers", term12527);
        setField(term12518, term12518.getClass(), "isAccepted", term12530);
        setField(term12518, term12518.getClass(), "events", term12532);
        setIntField(term12518, term12518.getClass(), "numberOfPassengers", -380787857);
        Object term12536 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term12536, term12536.getClass(), "source", null);
        setField(term12536, term12536.getClass(), "destination", null);
        setField(term12536, term12536.getClass(), "passenger", null);
        setField(term12536, term12536.getClass(), "acceptedOffer", null);
        setField(term12536, term12536.getClass(), "offers", null);
        setField(term12536, term12536.getClass(), "isAccepted", null);
        setField(term12536, term12536.getClass(), "events", null);
        setIntField(term12536, term12536.getClass(), "numberOfPassengers", 0);
        Object term12538 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term12538, term12538.getClass(), "source", null);
        setField(term12538, term12538.getClass(), "destination", null);
        setField(term12538, term12538.getClass(), "passenger", null);
        setField(term12538, term12538.getClass(), "acceptedOffer", null);
        setField(term12538, term12538.getClass(), "offers", null);
        setField(term12538, term12538.getClass(), "isAccepted", null);
        setField(term12538, term12538.getClass(), "events", null);
        setIntField(term12538, term12538.getClass(), "numberOfPassengers", 0);
        Object term12540 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term12540, term12540.getClass(), "source", null);
        setField(term12540, term12540.getClass(), "destination", null);
        setField(term12540, term12540.getClass(), "passenger", null);
        setField(term12540, term12540.getClass(), "acceptedOffer", null);
        setField(term12540, term12540.getClass(), "offers", null);
        setField(term12540, term12540.getClass(), "isAccepted", null);
        setField(term12540, term12540.getClass(), "events", null);
        setIntField(term12540, term12540.getClass(), "numberOfPassengers", 0);
        Object term12542 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term12542, term12542.getClass(), "source", null);
        setField(term12542, term12542.getClass(), "destination", null);
        setField(term12542, term12542.getClass(), "passenger", null);
        setField(term12542, term12542.getClass(), "acceptedOffer", null);
        setField(term12542, term12542.getClass(), "offers", null);
        setField(term12542, term12542.getClass(), "isAccepted", null);
        setField(term12542, term12542.getClass(), "events", null);
        setIntField(term12542, term12542.getClass(), "numberOfPassengers", 0);
        Object term12544 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term12544, term12544.getClass(), "source", null);
        setField(term12544, term12544.getClass(), "destination", null);
        setField(term12544, term12544.getClass(), "passenger", null);
        setField(term12544, term12544.getClass(), "acceptedOffer", null);
        setField(term12544, term12544.getClass(), "offers", null);
        setField(term12544, term12544.getClass(), "isAccepted", null);
        setField(term12544, term12544.getClass(), "events", null);
        setIntField(term12544, term12544.getClass(), "numberOfPassengers", 0);
        Object term12546 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term12546, term12546.getClass(), "source", null);
        setField(term12546, term12546.getClass(), "destination", null);
        setField(term12546, term12546.getClass(), "passenger", null);
        setField(term12546, term12546.getClass(), "acceptedOffer", null);
        setField(term12546, term12546.getClass(), "offers", null);
        setField(term12546, term12546.getClass(), "isAccepted", null);
        setField(term12546, term12546.getClass(), "events", null);
        setIntField(term12546, term12546.getClass(), "numberOfPassengers", 0);
        ArrayList term12516 = new ArrayList();
        ((ArrayList) term12516).add(term12518);
        ((ArrayList) term12516).add(term12536);
        ((ArrayList) term12516).add(term12538);
        ((ArrayList) term12516).add(term12540);
        ((ArrayList) term12516).add(term12542);
        ((ArrayList) term12516).add(term12544);
        ((ArrayList) term12516).add(term12546);
        ((ArrayList) term12516).add(term12542);
        Class<? extends Object> term12674 = Class.forName((String) "com.API.OnDriver.CustomerSubsystem.UserStatus");
        Field term12673 = ((Class) term12674).getDeclaredField((String) "activated");
        ((Field) term12673).setAccessible(true);
        Object enum26 = ((Field) term12673).get((Object) null);
        term12515 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger"));
        setField(term12515, term12515.getClass(), "pastRides", term12516);
        setField(term12515, term12515.getClass(), "currentRide", term12538);
        setField(term12515, term12515.getClass(), "dateOfBirth", "UlxGFzEifL");
        setField(term12515, term12515.getClass(), "username", "HilHTbDKDF");
        setField(term12515, term12515.getClass(), "mobileNumber", "IaEqlVwmNS");
        setField(term12515, term12515.getClass(), "email", "ljNOgdPWrL");
        setField(term12515, term12515.getClass(), "password", "oBlIZiyRMS");
        setField(term12515, term12515.getClass(), "userStatus", enum26);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "listPastRides", argTypes, term12515, args);
    }

};


