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
import java.lang.Boolean;
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;
import java.lang.String;

public class Driver_startRide_50689016214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18661;

    public Driver_startRide_50689016214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term18686 = new Boolean(true);
        ArrayList term18688 = new ArrayList();
        ArrayList term18703 = new ArrayList();
        ((ArrayList) term18703).add((Object)null);
        ((ArrayList) term18703).add((Object)null);
        ((ArrayList) term18703).add((Object)null);
        ((ArrayList) term18703).add((Object)null);
        ((ArrayList) term18703).add((Object)null);
        ((ArrayList) term18703).add((Object)null);
        ((ArrayList) term18703).add((Object)null);
        ((ArrayList) term18703).add((Object)null);
        ((ArrayList) term18703).add((Object)null);
        Boolean term18706 = new Boolean(false);
        ArrayList term18708 = new ArrayList();
        ((ArrayList) term18708).add((Object)null);
        ((ArrayList) term18708).add((Object)null);
        ((ArrayList) term18708).add((Object)null);
        ((ArrayList) term18708).add((Object)null);
        ((ArrayList) term18708).add((Object)null);
        ((ArrayList) term18708).add((Object)null);
        ((ArrayList) term18708).add((Object)null);
        Object term18694 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        Object term18695 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        Object term18697 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        Object term18699 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger"));
        Object term18700 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Offer"));
        setField(term18695, term18695.getClass(), "location", null);
        setBooleanField(term18695, term18695.getClass(), "isDiscounted", false);
        setField(term18695, term18695.getClass(), "drivers", null);
        setField(term18694, term18694.getClass(), "source", term18695);
        setField(term18697, term18697.getClass(), "location", null);
        setBooleanField(term18697, term18697.getClass(), "isDiscounted", false);
        setField(term18697, term18697.getClass(), "drivers", null);
        setField(term18694, term18694.getClass(), "destination", term18697);
        setField(term18699, term18699.getClass(), "pastRides", null);
        setField(term18699, term18699.getClass(), "currentRide", null);
        setField(term18699, term18699.getClass(), "dateOfBirth", null);
        setField(term18699, term18699.getClass(), "username", null);
        setField(term18699, term18699.getClass(), "mobileNumber", null);
        setField(term18699, term18699.getClass(), "email", null);
        setField(term18699, term18699.getClass(), "password", null);
        setField(term18699, term18699.getClass(), "userStatus", null);
        setField(term18694, term18694.getClass(), "passenger", term18699);
        setDoubleField(term18700, term18700.getClass(), "price", 0.7046974927834232);
        setDoubleField(term18700, term18700.getClass(), "discountedPrice", 0.6896952303224777);
        setField(term18700, term18700.getClass(), "driver", null);
        setField(term18694, term18694.getClass(), "acceptedOffer", term18700);
        setField(term18694, term18694.getClass(), "offers", term18703);
        setField(term18694, term18694.getClass(), "isAccepted", term18706);
        setField(term18694, term18694.getClass(), "events", term18708);
        setIntField(term18694, term18694.getClass(), "numberOfPassengers", -995785731);
        Object term18712 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term18712, term18712.getClass(), "source", null);
        setField(term18712, term18712.getClass(), "destination", null);
        setField(term18712, term18712.getClass(), "passenger", null);
        setField(term18712, term18712.getClass(), "acceptedOffer", null);
        setField(term18712, term18712.getClass(), "offers", null);
        setField(term18712, term18712.getClass(), "isAccepted", null);
        setField(term18712, term18712.getClass(), "events", null);
        setIntField(term18712, term18712.getClass(), "numberOfPassengers", 0);
        ArrayList term18692 = new ArrayList();
        ((ArrayList) term18692).add(term18694);
        ((ArrayList) term18692).add(term18694);
        ((ArrayList) term18692).add(term18712);
        HashMap term18717 = new HashMap();
        Class<? extends Object> term18849 = Class.forName((String) "com.API.OnDriver.CustomerSubsystem.UserStatus");
        Field term18848 = ((Class) term18849).getDeclaredField((String) "activated");
        ((Field) term18848).setAccessible(true);
        Object enum42 = ((Field) term18848).get((Object) null);
        term18661 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Driver"));
        Object term18716 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Rating"));
        Object term18724 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term18661, term18661.getClass(), "driverLicense", "LQTIjJLkXH");
        setField(term18661, term18661.getClass(), "nationalID", "RvkBwedFKx");
        setField(term18661, term18661.getClass(), "isVerified", term18686);
        setField(term18661, term18661.getClass(), "favouriteAreas", term18688);
        setField(term18661, term18661.getClass(), "rides", term18692);
        setField(term18716, term18716.getClass(), "driverRatings", term18717);
        setIntField(term18716, term18716.getClass(), "ratingSum", 1349815364);
        setIntField(term18716, term18716.getClass(), "numberOfRatings", 2128383340);
        setField(term18661, term18661.getClass(), "rating", term18716);
        setField(term18724, term18724.getClass(), "source", null);
        setField(term18724, term18724.getClass(), "destination", null);
        setField(term18724, term18724.getClass(), "passenger", null);
        setField(term18724, term18724.getClass(), "acceptedOffer", null);
        setField(term18724, term18724.getClass(), "offers", null);
        setField(term18724, term18724.getClass(), "isAccepted", null);
        setField(term18724, term18724.getClass(), "events", null);
        setIntField(term18724, term18724.getClass(), "numberOfPassengers", 0);
        setField(term18661, term18661.getClass(), "currentRide", term18724);
        setIntField(term18661, term18661.getClass(), "numberOfPassengers", 1238598518);
        setField(term18661, term18661.getClass(), "username", "mQsaqUltLU");
        setField(term18661, term18661.getClass(), "mobileNumber", "jwENwZiGlR");
        setField(term18661, term18661.getClass(), "email", "rfFHGPcfpz");
        setField(term18661, term18661.getClass(), "password", "fViQeyMrrL");
        setField(term18661, term18661.getClass(), "userStatus", enum42);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.CustomerSubsystem.Driver");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "startRide", argTypes, term18661, args);
    }

};


