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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.String;

public class Area_isDiscounted_6499464012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16290;

    public Area_isDiscounted_6499464012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term16309 = new Boolean(true);
        ArrayList term16311 = new ArrayList();
        ((ArrayList) term16311).add((Object)null);
        ((ArrayList) term16311).add((Object)null);
        ArrayList term16314 = new ArrayList();
        ((ArrayList) term16314).add((Object)null);
        ((ArrayList) term16314).add((Object)null);
        Class<? extends Object> term16363 = Class.forName((String) "com.API.OnDriver.CustomerSubsystem.UserStatus");
        Field term16362 = ((Class) term16363).getDeclaredField((String) "activated");
        ((Field) term16362).setAccessible(true);
        Object enum37 = ((Field) term16362).get((Object) null);
        Object term16306 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Driver"));
        Object term16317 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Rating"));
        Object term16320 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term16306, term16306.getClass(), "driverLicense", "");
        setField(term16306, term16306.getClass(), "nationalID", "");
        setField(term16306, term16306.getClass(), "isVerified", term16309);
        setField(term16306, term16306.getClass(), "favouriteAreas", term16311);
        setField(term16306, term16306.getClass(), "rides", term16314);
        setField(term16317, term16317.getClass(), "driverRatings", null);
        setIntField(term16317, term16317.getClass(), "ratingSum", 674879025);
        setIntField(term16317, term16317.getClass(), "numberOfRatings", -1538936030);
        setField(term16306, term16306.getClass(), "rating", term16317);
        setField(term16320, term16320.getClass(), "source", null);
        setField(term16320, term16320.getClass(), "destination", null);
        setField(term16320, term16320.getClass(), "passenger", null);
        setField(term16320, term16320.getClass(), "acceptedOffer", null);
        setField(term16320, term16320.getClass(), "offers", null);
        setField(term16320, term16320.getClass(), "isAccepted", null);
        setField(term16320, term16320.getClass(), "events", null);
        setIntField(term16320, term16320.getClass(), "numberOfPassengers", 0);
        setField(term16306, term16306.getClass(), "currentRide", term16320);
        setIntField(term16306, term16306.getClass(), "numberOfPassengers", -752870423);
        setField(term16306, term16306.getClass(), "username", "");
        setField(term16306, term16306.getClass(), "mobileNumber", "");
        setField(term16306, term16306.getClass(), "email", "");
        setField(term16306, term16306.getClass(), "password", "");
        setField(term16306, term16306.getClass(), "userStatus", enum37);
        Boolean term16332 = new Boolean(false);
        ArrayList term16334 = new ArrayList();
        ((ArrayList) term16334).add((Object)null);
        ((ArrayList) term16334).add((Object)null);
        ((ArrayList) term16334).add((Object)null);
        ((ArrayList) term16334).add((Object)null);
        ((ArrayList) term16334).add((Object)null);
        ((ArrayList) term16334).add((Object)null);
        ArrayList term16337 = new ArrayList();
        ((ArrayList) term16337).add((Object)null);
        Object term16329 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Driver"));
        Object term16340 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Rating"));
        Object term16343 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term16329, term16329.getClass(), "driverLicense", "");
        setField(term16329, term16329.getClass(), "nationalID", "");
        setField(term16329, term16329.getClass(), "isVerified", term16332);
        setField(term16329, term16329.getClass(), "favouriteAreas", term16334);
        setField(term16329, term16329.getClass(), "rides", term16337);
        setField(term16340, term16340.getClass(), "driverRatings", null);
        setIntField(term16340, term16340.getClass(), "ratingSum", 0);
        setIntField(term16340, term16340.getClass(), "numberOfRatings", 0);
        setField(term16329, term16329.getClass(), "rating", term16340);
        setField(term16343, term16343.getClass(), "source", null);
        setField(term16343, term16343.getClass(), "destination", null);
        setField(term16343, term16343.getClass(), "passenger", null);
        setField(term16343, term16343.getClass(), "acceptedOffer", null);
        setField(term16343, term16343.getClass(), "offers", null);
        setField(term16343, term16343.getClass(), "isAccepted", null);
        setField(term16343, term16343.getClass(), "events", null);
        setIntField(term16343, term16343.getClass(), "numberOfPassengers", 0);
        setField(term16329, term16329.getClass(), "currentRide", term16343);
        setIntField(term16329, term16329.getClass(), "numberOfPassengers", -1341439819);
        setField(term16329, term16329.getClass(), "username", "");
        setField(term16329, term16329.getClass(), "mobileNumber", "");
        setField(term16329, term16329.getClass(), "email", "");
        setField(term16329, term16329.getClass(), "password", "");
        setField(term16329, term16329.getClass(), "userStatus", enum37);
        ArrayList term16304 = new ArrayList();
        ((ArrayList) term16304).add(term16306);
        ((ArrayList) term16304).add(term16329);
        term16290 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        setField(term16290, term16290.getClass(), "location", "wiDfuaXnrP");
        setBooleanField(term16290, term16290.getClass(), "isDiscounted", false);
        setField(term16290, term16290.getClass(), "drivers", term16304);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.RideSubsystem.Area");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isDiscounted", argTypes, term16290, args);
    }

};


