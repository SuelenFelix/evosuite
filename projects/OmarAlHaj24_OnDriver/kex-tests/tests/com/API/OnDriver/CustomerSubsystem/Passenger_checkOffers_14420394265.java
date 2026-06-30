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

public class Passenger_checkOffers_14420394265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11693;

    public Passenger_checkOffers_14420394265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term11703 = new ArrayList();
        ((ArrayList) term11703).add((Object)null);
        ((ArrayList) term11703).add((Object)null);
        ((ArrayList) term11703).add((Object)null);
        ((ArrayList) term11703).add((Object)null);
        ((ArrayList) term11703).add((Object)null);
        ((ArrayList) term11703).add((Object)null);
        Boolean term11706 = new Boolean(false);
        ArrayList term11708 = new ArrayList();
        ((ArrayList) term11708).add((Object)null);
        ((ArrayList) term11708).add((Object)null);
        ((ArrayList) term11708).add((Object)null);
        ((ArrayList) term11708).add((Object)null);
        ((ArrayList) term11708).add((Object)null);
        ((ArrayList) term11708).add((Object)null);
        Object term11696 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        Object term11697 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        Object term11699 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger"));
        Object term11700 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Offer"));
        setField(term11697, term11697.getClass(), "location", null);
        setBooleanField(term11697, term11697.getClass(), "isDiscounted", false);
        setField(term11697, term11697.getClass(), "drivers", null);
        setField(term11696, term11696.getClass(), "source", term11697);
        setField(term11696, term11696.getClass(), "destination", term11697);
        setField(term11699, term11699.getClass(), "pastRides", null);
        setField(term11699, term11699.getClass(), "currentRide", null);
        setField(term11699, term11699.getClass(), "dateOfBirth", null);
        setField(term11699, term11699.getClass(), "username", null);
        setField(term11699, term11699.getClass(), "mobileNumber", null);
        setField(term11699, term11699.getClass(), "email", null);
        setField(term11699, term11699.getClass(), "password", null);
        setField(term11699, term11699.getClass(), "userStatus", null);
        setField(term11696, term11696.getClass(), "passenger", term11699);
        setDoubleField(term11700, term11700.getClass(), "price", 0.9341364461850963);
        setDoubleField(term11700, term11700.getClass(), "discountedPrice", 0.9022041121474429);
        setField(term11700, term11700.getClass(), "driver", null);
        setField(term11696, term11696.getClass(), "acceptedOffer", term11700);
        setField(term11696, term11696.getClass(), "offers", term11703);
        setField(term11696, term11696.getClass(), "isAccepted", term11706);
        setField(term11696, term11696.getClass(), "events", term11708);
        setIntField(term11696, term11696.getClass(), "numberOfPassengers", 4900410);
        Object term11712 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term11712, term11712.getClass(), "source", null);
        setField(term11712, term11712.getClass(), "destination", null);
        setField(term11712, term11712.getClass(), "passenger", null);
        setField(term11712, term11712.getClass(), "acceptedOffer", null);
        setField(term11712, term11712.getClass(), "offers", null);
        setField(term11712, term11712.getClass(), "isAccepted", null);
        setField(term11712, term11712.getClass(), "events", null);
        setIntField(term11712, term11712.getClass(), "numberOfPassengers", 0);
        ArrayList term11694 = new ArrayList();
        ((ArrayList) term11694).add(term11696);
        ((ArrayList) term11694).add(term11712);
        Class<? extends Object> term11842 = Class.forName((String) "com.API.OnDriver.CustomerSubsystem.UserStatus");
        Field term11841 = ((Class) term11842).getDeclaredField((String) "suspended");
        ((Field) term11841).setAccessible(true);
        Object enum24 = ((Field) term11841).get((Object) null);
        term11693 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger"));
        Object term11716 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term11693, term11693.getClass(), "pastRides", term11694);
        setField(term11716, term11716.getClass(), "source", null);
        setField(term11716, term11716.getClass(), "destination", null);
        setField(term11716, term11716.getClass(), "passenger", null);
        setField(term11716, term11716.getClass(), "acceptedOffer", null);
        setField(term11716, term11716.getClass(), "offers", null);
        setField(term11716, term11716.getClass(), "isAccepted", null);
        setField(term11716, term11716.getClass(), "events", null);
        setIntField(term11716, term11716.getClass(), "numberOfPassengers", 0);
        setField(term11693, term11693.getClass(), "currentRide", term11716);
        setField(term11693, term11693.getClass(), "dateOfBirth", "BRrftvRvmF");
        setField(term11693, term11693.getClass(), "username", "fvoyRbZTsm");
        setField(term11693, term11693.getClass(), "mobileNumber", "iOCnOQXWTl");
        setField(term11693, term11693.getClass(), "email", "ARnOWpgtAg");
        setField(term11693, term11693.getClass(), "password", "MRrYxZoJBW");
        setField(term11693, term11693.getClass(), "userStatus", enum24);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "checkOffers", argTypes, term11693, args);
    }

};


