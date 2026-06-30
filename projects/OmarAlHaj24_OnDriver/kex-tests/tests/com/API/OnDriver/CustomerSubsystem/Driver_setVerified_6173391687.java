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

public class Driver_setVerified_6173391687 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40616;
     Object term40737;

    public Driver_setVerified_6173391687() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term40641 = new Boolean(false);
        ArrayList term40643 = new ArrayList();
        ArrayList term40658 = new ArrayList();
        ((ArrayList) term40658).add((Object)null);
        ((ArrayList) term40658).add((Object)null);
        ((ArrayList) term40658).add((Object)null);
        ((ArrayList) term40658).add((Object)null);
        ((ArrayList) term40658).add((Object)null);
        Boolean term40661 = new Boolean(false);
        ArrayList term40663 = new ArrayList();
        ((ArrayList) term40663).add((Object)null);
        ((ArrayList) term40663).add((Object)null);
        ((ArrayList) term40663).add((Object)null);
        Object term40649 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        Object term40650 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        Object term40652 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        Object term40654 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger"));
        Object term40655 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Offer"));
        setField(term40650, term40650.getClass(), "location", null);
        setBooleanField(term40650, term40650.getClass(), "isDiscounted", true);
        setField(term40650, term40650.getClass(), "drivers", null);
        setField(term40649, term40649.getClass(), "source", term40650);
        setField(term40652, term40652.getClass(), "location", null);
        setBooleanField(term40652, term40652.getClass(), "isDiscounted", false);
        setField(term40652, term40652.getClass(), "drivers", null);
        setField(term40649, term40649.getClass(), "destination", term40652);
        setField(term40654, term40654.getClass(), "pastRides", null);
        setField(term40654, term40654.getClass(), "currentRide", null);
        setField(term40654, term40654.getClass(), "dateOfBirth", null);
        setField(term40654, term40654.getClass(), "username", null);
        setField(term40654, term40654.getClass(), "mobileNumber", null);
        setField(term40654, term40654.getClass(), "email", null);
        setField(term40654, term40654.getClass(), "password", null);
        setField(term40654, term40654.getClass(), "userStatus", null);
        setField(term40649, term40649.getClass(), "passenger", term40654);
        setDoubleField(term40655, term40655.getClass(), "price", 0.21754273979933092);
        setDoubleField(term40655, term40655.getClass(), "discountedPrice", 0.7799781775636547);
        setField(term40655, term40655.getClass(), "driver", null);
        setField(term40649, term40649.getClass(), "acceptedOffer", term40655);
        setField(term40649, term40649.getClass(), "offers", term40658);
        setField(term40649, term40649.getClass(), "isAccepted", term40661);
        setField(term40649, term40649.getClass(), "events", term40663);
        setIntField(term40649, term40649.getClass(), "numberOfPassengers", 1909966089);
        ArrayList term40647 = new ArrayList();
        ((ArrayList) term40647).add(term40649);
        HashMap term40670 = new HashMap();
        Class<? extends Object> term40800 = Class.forName((String) "com.API.OnDriver.CustomerSubsystem.UserStatus");
        Field term40799 = ((Class) term40800).getDeclaredField((String) "admin");
        ((Field) term40799).setAccessible(true);
        Object enum95 = ((Field) term40799).get((Object) null);
        term40616 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Driver"));
        Object term40669 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Rating"));
        Object term40677 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term40616, term40616.getClass(), "driverLicense", "vwQAcJEANy");
        setField(term40616, term40616.getClass(), "nationalID", "bakvKrXWXm");
        setField(term40616, term40616.getClass(), "isVerified", term40641);
        setField(term40616, term40616.getClass(), "favouriteAreas", term40643);
        setField(term40616, term40616.getClass(), "rides", term40647);
        setField(term40669, term40669.getClass(), "driverRatings", term40670);
        setIntField(term40669, term40669.getClass(), "ratingSum", 1827255916);
        setIntField(term40669, term40669.getClass(), "numberOfRatings", 2039815750);
        setField(term40616, term40616.getClass(), "rating", term40669);
        setField(term40677, term40677.getClass(), "source", null);
        setField(term40677, term40677.getClass(), "destination", null);
        setField(term40677, term40677.getClass(), "passenger", null);
        setField(term40677, term40677.getClass(), "acceptedOffer", null);
        setField(term40677, term40677.getClass(), "offers", null);
        setField(term40677, term40677.getClass(), "isAccepted", null);
        setField(term40677, term40677.getClass(), "events", null);
        setIntField(term40677, term40677.getClass(), "numberOfPassengers", 0);
        setField(term40616, term40616.getClass(), "currentRide", term40677);
        setIntField(term40616, term40616.getClass(), "numberOfPassengers", 2079590265);
        setField(term40616, term40616.getClass(), "username", "mvWHHiGYmD");
        setField(term40616, term40616.getClass(), "mobileNumber", "eZUuWCoERR");
        setField(term40616, term40616.getClass(), "email", "AMeLarREbk");
        setField(term40616, term40616.getClass(), "password", "LQHAihGqFG");
        setField(term40616, term40616.getClass(), "userStatus", enum95);
        term40737 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.CustomerSubsystem.Driver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term40737;
        callMethod(klass, "setVerified", argTypes, term40616, args);
    }

};


