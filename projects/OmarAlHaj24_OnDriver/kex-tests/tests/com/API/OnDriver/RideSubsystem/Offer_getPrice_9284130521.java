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

public class Offer_getPrice_9284130521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term563;

    public Offer_getPrice_9284130521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term591 = new Boolean(false);
        Object term595 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        setField(term595, term595.getClass(), "location", null);
        setBooleanField(term595, term595.getClass(), "isDiscounted", false);
        setField(term595, term595.getClass(), "drivers", null);
        Object term597 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        setField(term597, term597.getClass(), "location", null);
        setBooleanField(term597, term597.getClass(), "isDiscounted", false);
        setField(term597, term597.getClass(), "drivers", null);
        Object term599 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        setField(term599, term599.getClass(), "location", null);
        setBooleanField(term599, term599.getClass(), "isDiscounted", true);
        setField(term599, term599.getClass(), "drivers", null);
        Object term601 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        setField(term601, term601.getClass(), "location", null);
        setBooleanField(term601, term601.getClass(), "isDiscounted", true);
        setField(term601, term601.getClass(), "drivers", null);
        Object term603 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        setField(term603, term603.getClass(), "location", null);
        setBooleanField(term603, term603.getClass(), "isDiscounted", false);
        setField(term603, term603.getClass(), "drivers", null);
        ArrayList term593 = new ArrayList();
        ((ArrayList) term593).add(term595);
        ((ArrayList) term593).add(term597);
        ((ArrayList) term593).add(term599);
        ((ArrayList) term593).add(term601);
        ((ArrayList) term593).add(term603);
        ((ArrayList) term593).add(term595);
        Object term609 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term609, term609.getClass(), "source", null);
        setField(term609, term609.getClass(), "destination", null);
        setField(term609, term609.getClass(), "passenger", null);
        setField(term609, term609.getClass(), "acceptedOffer", null);
        setField(term609, term609.getClass(), "offers", null);
        setField(term609, term609.getClass(), "isAccepted", null);
        setField(term609, term609.getClass(), "events", null);
        setIntField(term609, term609.getClass(), "numberOfPassengers", 0);
        Object term611 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term611, term611.getClass(), "source", null);
        setField(term611, term611.getClass(), "destination", null);
        setField(term611, term611.getClass(), "passenger", null);
        setField(term611, term611.getClass(), "acceptedOffer", null);
        setField(term611, term611.getClass(), "offers", null);
        setField(term611, term611.getClass(), "isAccepted", null);
        setField(term611, term611.getClass(), "events", null);
        setIntField(term611, term611.getClass(), "numberOfPassengers", 0);
        Object term613 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term613, term613.getClass(), "source", null);
        setField(term613, term613.getClass(), "destination", null);
        setField(term613, term613.getClass(), "passenger", null);
        setField(term613, term613.getClass(), "acceptedOffer", null);
        setField(term613, term613.getClass(), "offers", null);
        setField(term613, term613.getClass(), "isAccepted", null);
        setField(term613, term613.getClass(), "events", null);
        setIntField(term613, term613.getClass(), "numberOfPassengers", 0);
        Object term615 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term615, term615.getClass(), "source", null);
        setField(term615, term615.getClass(), "destination", null);
        setField(term615, term615.getClass(), "passenger", null);
        setField(term615, term615.getClass(), "acceptedOffer", null);
        setField(term615, term615.getClass(), "offers", null);
        setField(term615, term615.getClass(), "isAccepted", null);
        setField(term615, term615.getClass(), "events", null);
        setIntField(term615, term615.getClass(), "numberOfPassengers", 0);
        Object term617 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term617, term617.getClass(), "source", null);
        setField(term617, term617.getClass(), "destination", null);
        setField(term617, term617.getClass(), "passenger", null);
        setField(term617, term617.getClass(), "acceptedOffer", null);
        setField(term617, term617.getClass(), "offers", null);
        setField(term617, term617.getClass(), "isAccepted", null);
        setField(term617, term617.getClass(), "events", null);
        setIntField(term617, term617.getClass(), "numberOfPassengers", 0);
        ArrayList term607 = new ArrayList();
        ((ArrayList) term607).add(term609);
        ((ArrayList) term607).add(term611);
        ((ArrayList) term607).add(term611);
        ((ArrayList) term607).add(term613);
        ((ArrayList) term607).add(term615);
        ((ArrayList) term607).add(term617);
        HashMap term622 = new HashMap();
        Class<? extends Object> term754 = Class.forName((String) "com.API.OnDriver.CustomerSubsystem.UserStatus");
        Field term753 = ((Class) term754).getDeclaredField((String) "activated");
        ((Field) term753).setAccessible(true);
        Object enum1 = ((Field) term753).get((Object) null);
        term563 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Offer"));
        Object term566 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Driver"));
        Object term621 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Rating"));
        Object term629 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setDoubleField(term563, term563.getClass(), "price", 0.3455959125047594);
        setDoubleField(term563, term563.getClass(), "discountedPrice", 0.5523635872663106);
        setField(term566, term566.getClass(), "driverLicense", "nGKItKLYNC");
        setField(term566, term566.getClass(), "nationalID", "UiUYnPrcCi");
        setField(term566, term566.getClass(), "isVerified", term591);
        setField(term566, term566.getClass(), "favouriteAreas", term593);
        setField(term566, term566.getClass(), "rides", term607);
        setField(term621, term621.getClass(), "driverRatings", term622);
        setIntField(term621, term621.getClass(), "ratingSum", 1962444399);
        setIntField(term621, term621.getClass(), "numberOfRatings", 767834723);
        setField(term566, term566.getClass(), "rating", term621);
        setField(term629, term629.getClass(), "source", null);
        setField(term629, term629.getClass(), "destination", null);
        setField(term629, term629.getClass(), "passenger", null);
        setField(term629, term629.getClass(), "acceptedOffer", null);
        setField(term629, term629.getClass(), "offers", null);
        setField(term629, term629.getClass(), "isAccepted", null);
        setField(term629, term629.getClass(), "events", null);
        setIntField(term629, term629.getClass(), "numberOfPassengers", 0);
        setField(term566, term566.getClass(), "currentRide", term629);
        setIntField(term566, term566.getClass(), "numberOfPassengers", -602026508);
        setField(term566, term566.getClass(), "username", "eVpkWxjuki");
        setField(term566, term566.getClass(), "mobileNumber", "SJiQaLvSKv");
        setField(term566, term566.getClass(), "email", "OEXDRUKcFl");
        setField(term566, term566.getClass(), "password", "RYdKCNNMBR");
        setField(term566, term566.getClass(), "userStatus", enum1);
        setField(term563, term563.getClass(), "driver", term566);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.RideSubsystem.Offer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPrice", argTypes, term563, args);
    }

};


