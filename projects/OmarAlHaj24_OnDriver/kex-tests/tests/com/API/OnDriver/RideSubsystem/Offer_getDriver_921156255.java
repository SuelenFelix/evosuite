package com.API.OnDriver.RideSubsystem;

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
import static com.API.OnDriver.RideSubsystem.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Boolean;
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.String;

public class Offer_getDriver_921156255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2390;

    public Offer_getDriver_921156255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term2418 = new Boolean(true);
        Object term2422 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        setField(term2422, term2422.getClass(), "location", null);
        setBooleanField(term2422, term2422.getClass(), "isDiscounted", true);
        setField(term2422, term2422.getClass(), "drivers", null);
        Object term2424 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        setField(term2424, term2424.getClass(), "location", null);
        setBooleanField(term2424, term2424.getClass(), "isDiscounted", false);
        setField(term2424, term2424.getClass(), "drivers", null);
        ArrayList term2420 = new ArrayList();
        ((ArrayList) term2420).add(term2422);
        ((ArrayList) term2420).add(term2424);
        Object term2430 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term2430, term2430.getClass(), "source", null);
        setField(term2430, term2430.getClass(), "destination", null);
        setField(term2430, term2430.getClass(), "passenger", null);
        setField(term2430, term2430.getClass(), "acceptedOffer", null);
        setField(term2430, term2430.getClass(), "offers", null);
        setField(term2430, term2430.getClass(), "isAccepted", null);
        setField(term2430, term2430.getClass(), "events", null);
        setIntField(term2430, term2430.getClass(), "numberOfPassengers", 0);
        Object term2432 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term2432, term2432.getClass(), "source", null);
        setField(term2432, term2432.getClass(), "destination", null);
        setField(term2432, term2432.getClass(), "passenger", null);
        setField(term2432, term2432.getClass(), "acceptedOffer", null);
        setField(term2432, term2432.getClass(), "offers", null);
        setField(term2432, term2432.getClass(), "isAccepted", null);
        setField(term2432, term2432.getClass(), "events", null);
        setIntField(term2432, term2432.getClass(), "numberOfPassengers", 0);
        Object term2434 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term2434, term2434.getClass(), "source", null);
        setField(term2434, term2434.getClass(), "destination", null);
        setField(term2434, term2434.getClass(), "passenger", null);
        setField(term2434, term2434.getClass(), "acceptedOffer", null);
        setField(term2434, term2434.getClass(), "offers", null);
        setField(term2434, term2434.getClass(), "isAccepted", null);
        setField(term2434, term2434.getClass(), "events", null);
        setIntField(term2434, term2434.getClass(), "numberOfPassengers", 0);
        Object term2436 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term2436, term2436.getClass(), "source", null);
        setField(term2436, term2436.getClass(), "destination", null);
        setField(term2436, term2436.getClass(), "passenger", null);
        setField(term2436, term2436.getClass(), "acceptedOffer", null);
        setField(term2436, term2436.getClass(), "offers", null);
        setField(term2436, term2436.getClass(), "isAccepted", null);
        setField(term2436, term2436.getClass(), "events", null);
        setIntField(term2436, term2436.getClass(), "numberOfPassengers", 0);
        ArrayList term2428 = new ArrayList();
        ((ArrayList) term2428).add(term2430);
        ((ArrayList) term2428).add(term2432);
        ((ArrayList) term2428).add(term2434);
        ((ArrayList) term2428).add(term2434);
        ((ArrayList) term2428).add(term2436);
        HashMap term2441 = new HashMap();
        Class<? extends Object> term2573 = Class.forName((String) "com.API.OnDriver.CustomerSubsystem.UserStatus");
        Field term2572 = ((Class) term2573).getDeclaredField((String) "suspended");
        ((Field) term2572).setAccessible(true);
        Object enum5 = ((Field) term2572).get((Object) null);
        term2390 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Offer"));
        Object term2393 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Driver"));
        Object term2440 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Rating"));
        Object term2448 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setDoubleField(term2390, term2390.getClass(), "price", 0.3202192021706908);
        setDoubleField(term2390, term2390.getClass(), "discountedPrice", 0.22651340641904605);
        setField(term2393, term2393.getClass(), "driverLicense", "TweMFhxNdj");
        setField(term2393, term2393.getClass(), "nationalID", "NBrvVzvQHe");
        setField(term2393, term2393.getClass(), "isVerified", term2418);
        setField(term2393, term2393.getClass(), "favouriteAreas", term2420);
        setField(term2393, term2393.getClass(), "rides", term2428);
        setField(term2440, term2440.getClass(), "driverRatings", term2441);
        setIntField(term2440, term2440.getClass(), "ratingSum", 1072005683);
        setIntField(term2440, term2440.getClass(), "numberOfRatings", 1861318859);
        setField(term2393, term2393.getClass(), "rating", term2440);
        setField(term2448, term2448.getClass(), "source", null);
        setField(term2448, term2448.getClass(), "destination", null);
        setField(term2448, term2448.getClass(), "passenger", null);
        setField(term2448, term2448.getClass(), "acceptedOffer", null);
        setField(term2448, term2448.getClass(), "offers", null);
        setField(term2448, term2448.getClass(), "isAccepted", null);
        setField(term2448, term2448.getClass(), "events", null);
        setIntField(term2448, term2448.getClass(), "numberOfPassengers", 0);
        setField(term2393, term2393.getClass(), "currentRide", term2448);
        setIntField(term2393, term2393.getClass(), "numberOfPassengers", 1474524152);
        setField(term2393, term2393.getClass(), "username", "fzeqPnzpnt");
        setField(term2393, term2393.getClass(), "mobileNumber", "RxbhrFBjkO");
        setField(term2393, term2393.getClass(), "email", "aanyiAOJCl");
        setField(term2393, term2393.getClass(), "password", "VDokbsCuqq");
        setField(term2393, term2393.getClass(), "userStatus", enum5);
        setField(term2390, term2390.getClass(), "driver", term2393);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.RideSubsystem.Offer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDriver", argTypes, term2390, args);
    }

};


