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
import java.lang.String;
import java.lang.Boolean;
import java.lang.Integer;

public class Passenger_getPastRide_15358413439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13349;
     Object term13553;

    public Passenger_getPastRide_15358413439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term13350 = new ArrayList();
        ArrayList term13369 = new ArrayList();
        ((ArrayList) term13369).add((Object)null);
        ((ArrayList) term13369).add((Object)null);
        ((ArrayList) term13369).add((Object)null);
        ((ArrayList) term13369).add((Object)null);
        ((ArrayList) term13369).add((Object)null);
        ArrayList term13387 = new ArrayList();
        ((ArrayList) term13387).add((Object)null);
        ((ArrayList) term13387).add((Object)null);
        ((ArrayList) term13387).add((Object)null);
        ((ArrayList) term13387).add((Object)null);
        ((ArrayList) term13387).add((Object)null);
        ((ArrayList) term13387).add((Object)null);
        ((ArrayList) term13387).add((Object)null);
        ((ArrayList) term13387).add((Object)null);
        ((ArrayList) term13387).add((Object)null);
        ArrayList term13392 = new ArrayList();
        ((ArrayList) term13392).add((Object)null);
        ((ArrayList) term13392).add((Object)null);
        Class<? extends Object> term13626 = Class.forName((String) "com.API.OnDriver.CustomerSubsystem.UserStatus");
        Field term13625 = ((Class) term13626).getDeclaredField((String) "suspended");
        ((Field) term13625).setAccessible(true);
        Object enum28 = ((Field) term13625).get((Object) null);
        Object term13468 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Offer"));
        setDoubleField(term13468, term13468.getClass(), "price", 0.6382060245198228);
        setDoubleField(term13468, term13468.getClass(), "discountedPrice", 0.1849998667663698);
        setField(term13468, term13468.getClass(), "driver", null);
        Object term13471 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Offer"));
        setDoubleField(term13471, term13471.getClass(), "price", 0.9765248027281291);
        setDoubleField(term13471, term13471.getClass(), "discountedPrice", 0.9184034277897645);
        setField(term13471, term13471.getClass(), "driver", null);
        ArrayList term13466 = new ArrayList();
        ((ArrayList) term13466).add(term13468);
        ((ArrayList) term13466).add(term13471);
        Boolean term13476 = new Boolean(true);
        Object term13480 = newInstance(Class.forName("com.API.OnDriver.EventSubsystem.Event"));
        setField(term13480, term13480.getClass(), "name", null);
        setField(term13480, term13480.getClass(), "attributes", null);
        ArrayList term13478 = new ArrayList();
        ((ArrayList) term13478).add(term13480);
        Class<? extends Object> term13935 = Class.forName((String) "com.API.OnDriver.CustomerSubsystem.UserStatus");
        Field term13934 = ((Class) term13935).getDeclaredField((String) "admin");
        ((Field) term13934).setAccessible(true);
        Object enum29 = ((Field) term13934).get((Object) null);
        term13349 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger"));
        Object term13354 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        Object term13355 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        Object term13373 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        Object term13391 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger"));
        Object term13396 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        Object term13461 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Offer"));
        Object term13464 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Driver"));
        setField(term13349, term13349.getClass(), "pastRides", term13350);
        setField(term13355, term13355.getClass(), "location", "VygCEWaefB");
        setBooleanField(term13355, term13355.getClass(), "isDiscounted", false);
        setField(term13355, term13355.getClass(), "drivers", term13369);
        setField(term13354, term13354.getClass(), "source", term13355);
        setField(term13373, term13373.getClass(), "location", "anSZCikKpS");
        setBooleanField(term13373, term13373.getClass(), "isDiscounted", true);
        setField(term13373, term13373.getClass(), "drivers", term13387);
        setField(term13354, term13354.getClass(), "destination", term13373);
        setField(term13391, term13391.getClass(), "pastRides", term13392);
        setField(term13396, term13396.getClass(), "source", null);
        setField(term13396, term13396.getClass(), "destination", null);
        setField(term13396, term13396.getClass(), "passenger", null);
        setField(term13396, term13396.getClass(), "acceptedOffer", null);
        setField(term13396, term13396.getClass(), "offers", null);
        setField(term13396, term13396.getClass(), "isAccepted", null);
        setField(term13396, term13396.getClass(), "events", null);
        setIntField(term13396, term13396.getClass(), "numberOfPassengers", 0);
        setField(term13391, term13391.getClass(), "currentRide", term13396);
        setField(term13391, term13391.getClass(), "dateOfBirth", "EDkfjuDpNv");
        setField(term13391, term13391.getClass(), "username", "LNHkTUfuHX");
        setField(term13391, term13391.getClass(), "mobileNumber", "SVWcOAHiTp");
        setField(term13391, term13391.getClass(), "email", "oShLCaneoQ");
        setField(term13391, term13391.getClass(), "password", "nwKkzNpzyC");
        setField(term13391, term13391.getClass(), "userStatus", enum28);
        setField(term13354, term13354.getClass(), "passenger", term13391);
        setDoubleField(term13461, term13461.getClass(), "price", 0.2962868255626906);
        setDoubleField(term13461, term13461.getClass(), "discountedPrice", 0.25474180574060834);
        setField(term13464, term13464.getClass(), "driverLicense", null);
        setField(term13464, term13464.getClass(), "nationalID", null);
        setField(term13464, term13464.getClass(), "isVerified", null);
        setField(term13464, term13464.getClass(), "favouriteAreas", null);
        setField(term13464, term13464.getClass(), "rides", null);
        setField(term13464, term13464.getClass(), "rating", null);
        setField(term13464, term13464.getClass(), "currentRide", null);
        setIntField(term13464, term13464.getClass(), "numberOfPassengers", 0);
        setField(term13464, term13464.getClass(), "username", null);
        setField(term13464, term13464.getClass(), "mobileNumber", null);
        setField(term13464, term13464.getClass(), "email", null);
        setField(term13464, term13464.getClass(), "password", null);
        setField(term13464, term13464.getClass(), "userStatus", null);
        setField(term13461, term13461.getClass(), "driver", term13464);
        setField(term13354, term13354.getClass(), "acceptedOffer", term13461);
        setField(term13354, term13354.getClass(), "offers", term13466);
        setField(term13354, term13354.getClass(), "isAccepted", term13476);
        setField(term13354, term13354.getClass(), "events", term13478);
        setIntField(term13354, term13354.getClass(), "numberOfPassengers", 1713573821);
        setField(term13349, term13349.getClass(), "currentRide", term13354);
        setField(term13349, term13349.getClass(), "dateOfBirth", "CwrsdYnHpH");
        setField(term13349, term13349.getClass(), "username", "jifjXNXluS");
        setField(term13349, term13349.getClass(), "mobileNumber", "uDayZDXPOP");
        setField(term13349, term13349.getClass(), "email", "kbjWxMAIhY");
        setField(term13349, term13349.getClass(), "password", "GmtlSgqKcI");
        setField(term13349, term13349.getClass(), "userStatus", enum29);
        term13553 = new Integer(1956590498);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term13553;
        callMethod(klass, "getPastRide", argTypes, term13349, args);
    }

};


