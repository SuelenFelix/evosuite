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

public class IdentityManager_registerAsPassenger_224000881 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term286;

    public IdentityManager_registerAsPassenger_224000881() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term298 = new ArrayList();
        ((ArrayList) term298).add((Object)null);
        ((ArrayList) term298).add((Object)null);
        ((ArrayList) term298).add((Object)null);
        ((ArrayList) term298).add((Object)null);
        ((ArrayList) term298).add((Object)null);
        Boolean term301 = new Boolean(false);
        ArrayList term303 = new ArrayList();
        ((ArrayList) term303).add((Object)null);
        ((ArrayList) term303).add((Object)null);
        ((ArrayList) term303).add((Object)null);
        Object term289 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        Object term290 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        Object term292 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        Object term294 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger"));
        Object term295 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Offer"));
        setField(term290, term290.getClass(), "location", null);
        setBooleanField(term290, term290.getClass(), "isDiscounted", false);
        setField(term290, term290.getClass(), "drivers", null);
        setField(term289, term289.getClass(), "source", term290);
        setField(term292, term292.getClass(), "location", null);
        setBooleanField(term292, term292.getClass(), "isDiscounted", false);
        setField(term292, term292.getClass(), "drivers", null);
        setField(term289, term289.getClass(), "destination", term292);
        setField(term294, term294.getClass(), "pastRides", null);
        setField(term294, term294.getClass(), "currentRide", null);
        setField(term294, term294.getClass(), "dateOfBirth", null);
        setField(term294, term294.getClass(), "username", null);
        setField(term294, term294.getClass(), "mobileNumber", null);
        setField(term294, term294.getClass(), "email", null);
        setField(term294, term294.getClass(), "password", null);
        setField(term294, term294.getClass(), "userStatus", null);
        setField(term289, term289.getClass(), "passenger", term294);
        setDoubleField(term295, term295.getClass(), "price", 0.13238746331190498);
        setDoubleField(term295, term295.getClass(), "discountedPrice", 0.3455959125047594);
        setField(term295, term295.getClass(), "driver", null);
        setField(term289, term289.getClass(), "acceptedOffer", term295);
        setField(term289, term289.getClass(), "offers", term298);
        setField(term289, term289.getClass(), "isAccepted", term301);
        setField(term289, term289.getClass(), "events", term303);
        setIntField(term289, term289.getClass(), "numberOfPassengers", -2068769794);
        Object term307 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term307, term307.getClass(), "source", null);
        setField(term307, term307.getClass(), "destination", null);
        setField(term307, term307.getClass(), "passenger", null);
        setField(term307, term307.getClass(), "acceptedOffer", null);
        setField(term307, term307.getClass(), "offers", null);
        setField(term307, term307.getClass(), "isAccepted", null);
        setField(term307, term307.getClass(), "events", null);
        setIntField(term307, term307.getClass(), "numberOfPassengers", 0);
        Object term309 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term309, term309.getClass(), "source", null);
        setField(term309, term309.getClass(), "destination", null);
        setField(term309, term309.getClass(), "passenger", null);
        setField(term309, term309.getClass(), "acceptedOffer", null);
        setField(term309, term309.getClass(), "offers", null);
        setField(term309, term309.getClass(), "isAccepted", null);
        setField(term309, term309.getClass(), "events", null);
        setIntField(term309, term309.getClass(), "numberOfPassengers", 0);
        Object term311 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term311, term311.getClass(), "source", null);
        setField(term311, term311.getClass(), "destination", null);
        setField(term311, term311.getClass(), "passenger", null);
        setField(term311, term311.getClass(), "acceptedOffer", null);
        setField(term311, term311.getClass(), "offers", null);
        setField(term311, term311.getClass(), "isAccepted", null);
        setField(term311, term311.getClass(), "events", null);
        setIntField(term311, term311.getClass(), "numberOfPassengers", 0);
        Object term313 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term313, term313.getClass(), "source", null);
        setField(term313, term313.getClass(), "destination", null);
        setField(term313, term313.getClass(), "passenger", null);
        setField(term313, term313.getClass(), "acceptedOffer", null);
        setField(term313, term313.getClass(), "offers", null);
        setField(term313, term313.getClass(), "isAccepted", null);
        setField(term313, term313.getClass(), "events", null);
        setIntField(term313, term313.getClass(), "numberOfPassengers", 0);
        ArrayList term287 = new ArrayList();
        ((ArrayList) term287).add(term289);
        ((ArrayList) term287).add(term307);
        ((ArrayList) term287).add(term309);
        ((ArrayList) term287).add(term311);
        ((ArrayList) term287).add(term313);
        Class<? extends Object> term478 = Class.forName((String) "com.API.OnDriver.CustomerSubsystem.UserStatus");
        Field term477 = ((Class) term478).getDeclaredField((String) "suspended");
        ((Field) term477).setAccessible(true);
        Object enum0 = ((Field) term477).get((Object) null);
        term286 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger"));
        Object term317 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term286, term286.getClass(), "pastRides", term287);
        setField(term317, term317.getClass(), "source", null);
        setField(term317, term317.getClass(), "destination", null);
        setField(term317, term317.getClass(), "passenger", null);
        setField(term317, term317.getClass(), "acceptedOffer", null);
        setField(term317, term317.getClass(), "offers", null);
        setField(term317, term317.getClass(), "isAccepted", null);
        setField(term317, term317.getClass(), "events", null);
        setIntField(term317, term317.getClass(), "numberOfPassengers", 0);
        setField(term286, term286.getClass(), "currentRide", term317);
        setField(term286, term286.getClass(), "dateOfBirth", "oVgzLbrsFr");
        setField(term286, term286.getClass(), "username", "vQVyKLdtaz");
        setField(term286, term286.getClass(), "mobileNumber", "OWKQODBLzb");
        setField(term286, term286.getClass(), "email", "wGmYcqUkgE");
        setField(term286, term286.getClass(), "password", "idgaQsnJpQ");
        setField(term286, term286.getClass(), "userStatus", enum0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.CustomerSubsystem.IdentityManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger");
        Object[] args = new Object[1];
        args[0] = term286;
        callMethod(klass, "registerAsPassenger", argTypes, null, args);
    }

};


