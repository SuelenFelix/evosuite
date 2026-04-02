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

public class Driver_toString_109029293324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50278;

    public Driver_toString_109029293324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term50303 = new Boolean(false);
        ArrayList term50310 = new ArrayList();
        ((ArrayList) term50310).add((Object)null);
        ((ArrayList) term50310).add((Object)null);
        ((ArrayList) term50310).add((Object)null);
        ((ArrayList) term50310).add((Object)null);
        ((ArrayList) term50310).add((Object)null);
        ((ArrayList) term50310).add((Object)null);
        Object term50307 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        setField(term50307, term50307.getClass(), "location", "");
        setBooleanField(term50307, term50307.getClass(), "isDiscounted", false);
        setField(term50307, term50307.getClass(), "drivers", term50310);
        Object term50313 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        setField(term50313, term50313.getClass(), "location", null);
        setBooleanField(term50313, term50313.getClass(), "isDiscounted", false);
        setField(term50313, term50313.getClass(), "drivers", null);
        ArrayList term50318 = new ArrayList();
        ((ArrayList) term50318).add((Object)null);
        ((ArrayList) term50318).add((Object)null);
        Object term50315 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        setField(term50315, term50315.getClass(), "location", "");
        setBooleanField(term50315, term50315.getClass(), "isDiscounted", true);
        setField(term50315, term50315.getClass(), "drivers", term50318);
        ArrayList term50305 = new ArrayList();
        ((ArrayList) term50305).add(term50307);
        ((ArrayList) term50305).add(term50313);
        ((ArrayList) term50305).add(term50315);
        Object term50325 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term50325, term50325.getClass(), "source", null);
        setField(term50325, term50325.getClass(), "destination", null);
        setField(term50325, term50325.getClass(), "passenger", null);
        setField(term50325, term50325.getClass(), "acceptedOffer", null);
        setField(term50325, term50325.getClass(), "offers", null);
        setField(term50325, term50325.getClass(), "isAccepted", null);
        setField(term50325, term50325.getClass(), "events", null);
        setIntField(term50325, term50325.getClass(), "numberOfPassengers", 0);
        Object term50327 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term50327, term50327.getClass(), "source", null);
        setField(term50327, term50327.getClass(), "destination", null);
        setField(term50327, term50327.getClass(), "passenger", null);
        setField(term50327, term50327.getClass(), "acceptedOffer", null);
        setField(term50327, term50327.getClass(), "offers", null);
        setField(term50327, term50327.getClass(), "isAccepted", null);
        setField(term50327, term50327.getClass(), "events", null);
        setIntField(term50327, term50327.getClass(), "numberOfPassengers", 0);
        Object term50329 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term50329, term50329.getClass(), "source", null);
        setField(term50329, term50329.getClass(), "destination", null);
        setField(term50329, term50329.getClass(), "passenger", null);
        setField(term50329, term50329.getClass(), "acceptedOffer", null);
        setField(term50329, term50329.getClass(), "offers", null);
        setField(term50329, term50329.getClass(), "isAccepted", null);
        setField(term50329, term50329.getClass(), "events", null);
        setIntField(term50329, term50329.getClass(), "numberOfPassengers", 0);
        Object term50331 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term50331, term50331.getClass(), "source", null);
        setField(term50331, term50331.getClass(), "destination", null);
        setField(term50331, term50331.getClass(), "passenger", null);
        setField(term50331, term50331.getClass(), "acceptedOffer", null);
        setField(term50331, term50331.getClass(), "offers", null);
        setField(term50331, term50331.getClass(), "isAccepted", null);
        setField(term50331, term50331.getClass(), "events", null);
        setIntField(term50331, term50331.getClass(), "numberOfPassengers", 0);
        Object term50333 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term50333, term50333.getClass(), "source", null);
        setField(term50333, term50333.getClass(), "destination", null);
        setField(term50333, term50333.getClass(), "passenger", null);
        setField(term50333, term50333.getClass(), "acceptedOffer", null);
        setField(term50333, term50333.getClass(), "offers", null);
        setField(term50333, term50333.getClass(), "isAccepted", null);
        setField(term50333, term50333.getClass(), "events", null);
        setIntField(term50333, term50333.getClass(), "numberOfPassengers", 0);
        ArrayList term50323 = new ArrayList();
        ((ArrayList) term50323).add(term50325);
        ((ArrayList) term50323).add(term50327);
        ((ArrayList) term50323).add(term50329);
        ((ArrayList) term50323).add(term50325);
        ((ArrayList) term50323).add(term50331);
        ((ArrayList) term50323).add(term50333);
        HashMap term50338 = new HashMap();
        Class<? extends Object> term50468 = Class.forName((String) "com.API.OnDriver.CustomerSubsystem.UserStatus");
        Field term50467 = ((Class) term50468).getDeclaredField((String) "suspended");
        ((Field) term50467).setAccessible(true);
        Object enum116 = ((Field) term50467).get((Object) null);
        term50278 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Driver"));
        Object term50337 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Rating"));
        setField(term50278, term50278.getClass(), "driverLicense", "VKpNTpPbui");
        setField(term50278, term50278.getClass(), "nationalID", "TuzuoEoycc");
        setField(term50278, term50278.getClass(), "isVerified", term50303);
        setField(term50278, term50278.getClass(), "favouriteAreas", term50305);
        setField(term50278, term50278.getClass(), "rides", term50323);
        setField(term50337, term50337.getClass(), "driverRatings", term50338);
        setIntField(term50337, term50337.getClass(), "ratingSum", -31125530);
        setIntField(term50337, term50337.getClass(), "numberOfRatings", 1909773180);
        setField(term50278, term50278.getClass(), "rating", term50337);
        setField(term50278, term50278.getClass(), "currentRide", term50331);
        setIntField(term50278, term50278.getClass(), "numberOfPassengers", -970417907);
        setField(term50278, term50278.getClass(), "username", "qRwTBVZctS");
        setField(term50278, term50278.getClass(), "mobileNumber", "BRBDbdsahC");
        setField(term50278, term50278.getClass(), "email", "TQAFOeWgvq");
        setField(term50278, term50278.getClass(), "password", "AtYIxbvLDg");
        setField(term50278, term50278.getClass(), "userStatus", enum116);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.CustomerSubsystem.Driver");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term50278, args);
    }

};


