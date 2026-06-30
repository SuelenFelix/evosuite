package com.API.OnDriver.EventSubsystem;

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
import static com.API.OnDriver.EventSubsystem.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.String;

public class AcceptOfferEvent_init_10445857390 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3418;

    public AcceptOfferEvent_init_10445857390() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3430 = new ArrayList();
        ((ArrayList) term3430).add((Object)null);
        ((ArrayList) term3430).add((Object)null);
        ((ArrayList) term3430).add((Object)null);
        ((ArrayList) term3430).add((Object)null);
        ((ArrayList) term3430).add((Object)null);
        ((ArrayList) term3430).add((Object)null);
        ((ArrayList) term3430).add((Object)null);
        Boolean term3433 = new Boolean(true);
        ArrayList term3435 = new ArrayList();
        ((ArrayList) term3435).add((Object)null);
        ((ArrayList) term3435).add((Object)null);
        ((ArrayList) term3435).add((Object)null);
        ((ArrayList) term3435).add((Object)null);
        ((ArrayList) term3435).add((Object)null);
        ((ArrayList) term3435).add((Object)null);
        Object term3421 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        Object term3422 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        Object term3424 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        Object term3426 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger"));
        Object term3427 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Offer"));
        setField(term3422, term3422.getClass(), "location", null);
        setBooleanField(term3422, term3422.getClass(), "isDiscounted", false);
        setField(term3422, term3422.getClass(), "drivers", null);
        setField(term3421, term3421.getClass(), "source", term3422);
        setField(term3424, term3424.getClass(), "location", null);
        setBooleanField(term3424, term3424.getClass(), "isDiscounted", false);
        setField(term3424, term3424.getClass(), "drivers", null);
        setField(term3421, term3421.getClass(), "destination", term3424);
        setField(term3426, term3426.getClass(), "pastRides", null);
        setField(term3426, term3426.getClass(), "currentRide", null);
        setField(term3426, term3426.getClass(), "dateOfBirth", null);
        setField(term3426, term3426.getClass(), "username", null);
        setField(term3426, term3426.getClass(), "mobileNumber", null);
        setField(term3426, term3426.getClass(), "email", null);
        setField(term3426, term3426.getClass(), "password", null);
        setField(term3426, term3426.getClass(), "userStatus", null);
        setField(term3421, term3421.getClass(), "passenger", term3426);
        setDoubleField(term3427, term3427.getClass(), "price", 0.43692187681405226);
        setDoubleField(term3427, term3427.getClass(), "discountedPrice", 0.7633268466829064);
        setField(term3427, term3427.getClass(), "driver", null);
        setField(term3421, term3421.getClass(), "acceptedOffer", term3427);
        setField(term3421, term3421.getClass(), "offers", term3430);
        setField(term3421, term3421.getClass(), "isAccepted", term3433);
        setField(term3421, term3421.getClass(), "events", term3435);
        setIntField(term3421, term3421.getClass(), "numberOfPassengers", 1830648570);
        Object term3439 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term3439, term3439.getClass(), "source", null);
        setField(term3439, term3439.getClass(), "destination", null);
        setField(term3439, term3439.getClass(), "passenger", null);
        setField(term3439, term3439.getClass(), "acceptedOffer", null);
        setField(term3439, term3439.getClass(), "offers", null);
        setField(term3439, term3439.getClass(), "isAccepted", null);
        setField(term3439, term3439.getClass(), "events", null);
        setIntField(term3439, term3439.getClass(), "numberOfPassengers", 0);
        Object term3441 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term3441, term3441.getClass(), "source", null);
        setField(term3441, term3441.getClass(), "destination", null);
        setField(term3441, term3441.getClass(), "passenger", null);
        setField(term3441, term3441.getClass(), "acceptedOffer", null);
        setField(term3441, term3441.getClass(), "offers", null);
        setField(term3441, term3441.getClass(), "isAccepted", null);
        setField(term3441, term3441.getClass(), "events", null);
        setIntField(term3441, term3441.getClass(), "numberOfPassengers", 0);
        Object term3443 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term3443, term3443.getClass(), "source", null);
        setField(term3443, term3443.getClass(), "destination", null);
        setField(term3443, term3443.getClass(), "passenger", null);
        setField(term3443, term3443.getClass(), "acceptedOffer", null);
        setField(term3443, term3443.getClass(), "offers", null);
        setField(term3443, term3443.getClass(), "isAccepted", null);
        setField(term3443, term3443.getClass(), "events", null);
        setIntField(term3443, term3443.getClass(), "numberOfPassengers", 0);
        Object term3445 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term3445, term3445.getClass(), "source", null);
        setField(term3445, term3445.getClass(), "destination", null);
        setField(term3445, term3445.getClass(), "passenger", null);
        setField(term3445, term3445.getClass(), "acceptedOffer", null);
        setField(term3445, term3445.getClass(), "offers", null);
        setField(term3445, term3445.getClass(), "isAccepted", null);
        setField(term3445, term3445.getClass(), "events", null);
        setIntField(term3445, term3445.getClass(), "numberOfPassengers", 0);
        ArrayList term3419 = new ArrayList();
        ((ArrayList) term3419).add(term3421);
        ((ArrayList) term3419).add(term3439);
        ((ArrayList) term3419).add(term3441);
        ((ArrayList) term3419).add(term3443);
        ((ArrayList) term3419).add(term3439);
        ((ArrayList) term3419).add(term3445);
        ((ArrayList) term3419).add(term3443);
        Class<? extends Object> term3575 = Class.forName((String) "com.API.OnDriver.CustomerSubsystem.UserStatus");
        Field term3574 = ((Class) term3575).getDeclaredField((String) "activated");
        ((Field) term3574).setAccessible(true);
        Object enum7 = ((Field) term3574).get((Object) null);
        term3418 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger"));
        Object term3449 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term3418, term3418.getClass(), "pastRides", term3419);
        setField(term3449, term3449.getClass(), "source", null);
        setField(term3449, term3449.getClass(), "destination", null);
        setField(term3449, term3449.getClass(), "passenger", null);
        setField(term3449, term3449.getClass(), "acceptedOffer", null);
        setField(term3449, term3449.getClass(), "offers", null);
        setField(term3449, term3449.getClass(), "isAccepted", null);
        setField(term3449, term3449.getClass(), "events", null);
        setIntField(term3449, term3449.getClass(), "numberOfPassengers", 0);
        setField(term3418, term3418.getClass(), "currentRide", term3449);
        setField(term3418, term3418.getClass(), "dateOfBirth", "jiUSjqwSIQ");
        setField(term3418, term3418.getClass(), "username", "MgLCedQfoj");
        setField(term3418, term3418.getClass(), "mobileNumber", "zgKiINdgNu");
        setField(term3418, term3418.getClass(), "email", "zLMTXDQHYH");
        setField(term3418, term3418.getClass(), "password", "PqywFWJlpE");
        setField(term3418, term3418.getClass(), "userStatus", enum7);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.EventSubsystem.AcceptOfferEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger");
        Object[] args = new Object[1];
        args[0] = term3418;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


