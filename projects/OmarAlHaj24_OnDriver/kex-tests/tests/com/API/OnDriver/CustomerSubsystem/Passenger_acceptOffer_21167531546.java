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
import java.lang.Integer;

public class Passenger_acceptOffer_21167531546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12100;
     Object term12204;

    public Passenger_acceptOffer_21167531546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term12112 = new ArrayList();
        ((ArrayList) term12112).add((Object)null);
        ((ArrayList) term12112).add((Object)null);
        Boolean term12115 = new Boolean(true);
        ArrayList term12117 = new ArrayList();
        ((ArrayList) term12117).add((Object)null);
        ((ArrayList) term12117).add((Object)null);
        ((ArrayList) term12117).add((Object)null);
        ((ArrayList) term12117).add((Object)null);
        Object term12103 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        Object term12104 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        Object term12106 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        Object term12108 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger"));
        Object term12109 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Offer"));
        setField(term12104, term12104.getClass(), "location", null);
        setBooleanField(term12104, term12104.getClass(), "isDiscounted", true);
        setField(term12104, term12104.getClass(), "drivers", null);
        setField(term12103, term12103.getClass(), "source", term12104);
        setField(term12106, term12106.getClass(), "location", null);
        setBooleanField(term12106, term12106.getClass(), "isDiscounted", false);
        setField(term12106, term12106.getClass(), "drivers", null);
        setField(term12103, term12103.getClass(), "destination", term12106);
        setField(term12108, term12108.getClass(), "pastRides", null);
        setField(term12108, term12108.getClass(), "currentRide", null);
        setField(term12108, term12108.getClass(), "dateOfBirth", null);
        setField(term12108, term12108.getClass(), "username", null);
        setField(term12108, term12108.getClass(), "mobileNumber", null);
        setField(term12108, term12108.getClass(), "email", null);
        setField(term12108, term12108.getClass(), "password", null);
        setField(term12108, term12108.getClass(), "userStatus", null);
        setField(term12103, term12103.getClass(), "passenger", term12108);
        setDoubleField(term12109, term12109.getClass(), "price", 0.29172553321356776);
        setDoubleField(term12109, term12109.getClass(), "discountedPrice", 0.9276995636844321);
        setField(term12109, term12109.getClass(), "driver", null);
        setField(term12103, term12103.getClass(), "acceptedOffer", term12109);
        setField(term12103, term12103.getClass(), "offers", term12112);
        setField(term12103, term12103.getClass(), "isAccepted", term12115);
        setField(term12103, term12103.getClass(), "events", term12117);
        setIntField(term12103, term12103.getClass(), "numberOfPassengers", 291864719);
        Object term12121 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term12121, term12121.getClass(), "source", null);
        setField(term12121, term12121.getClass(), "destination", null);
        setField(term12121, term12121.getClass(), "passenger", null);
        setField(term12121, term12121.getClass(), "acceptedOffer", null);
        setField(term12121, term12121.getClass(), "offers", null);
        setField(term12121, term12121.getClass(), "isAccepted", null);
        setField(term12121, term12121.getClass(), "events", null);
        setIntField(term12121, term12121.getClass(), "numberOfPassengers", 0);
        Object term12123 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term12123, term12123.getClass(), "source", null);
        setField(term12123, term12123.getClass(), "destination", null);
        setField(term12123, term12123.getClass(), "passenger", null);
        setField(term12123, term12123.getClass(), "acceptedOffer", null);
        setField(term12123, term12123.getClass(), "offers", null);
        setField(term12123, term12123.getClass(), "isAccepted", null);
        setField(term12123, term12123.getClass(), "events", null);
        setIntField(term12123, term12123.getClass(), "numberOfPassengers", 0);
        Object term12125 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term12125, term12125.getClass(), "source", null);
        setField(term12125, term12125.getClass(), "destination", null);
        setField(term12125, term12125.getClass(), "passenger", null);
        setField(term12125, term12125.getClass(), "acceptedOffer", null);
        setField(term12125, term12125.getClass(), "offers", null);
        setField(term12125, term12125.getClass(), "isAccepted", null);
        setField(term12125, term12125.getClass(), "events", null);
        setIntField(term12125, term12125.getClass(), "numberOfPassengers", 0);
        Object term12127 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term12127, term12127.getClass(), "source", null);
        setField(term12127, term12127.getClass(), "destination", null);
        setField(term12127, term12127.getClass(), "passenger", null);
        setField(term12127, term12127.getClass(), "acceptedOffer", null);
        setField(term12127, term12127.getClass(), "offers", null);
        setField(term12127, term12127.getClass(), "isAccepted", null);
        setField(term12127, term12127.getClass(), "events", null);
        setIntField(term12127, term12127.getClass(), "numberOfPassengers", 0);
        ArrayList term12101 = new ArrayList();
        ((ArrayList) term12101).add(term12103);
        ((ArrayList) term12101).add(term12121);
        ((ArrayList) term12101).add(term12123);
        ((ArrayList) term12101).add(term12121);
        ((ArrayList) term12101).add(term12125);
        ((ArrayList) term12101).add(term12123);
        ((ArrayList) term12101).add(term12127);
        ((ArrayList) term12101).add(term12125);
        Class<? extends Object> term12257 = Class.forName((String) "com.API.OnDriver.CustomerSubsystem.UserStatus");
        Field term12256 = ((Class) term12257).getDeclaredField((String) "activated");
        ((Field) term12256).setAccessible(true);
        Object enum25 = ((Field) term12256).get((Object) null);
        term12100 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger"));
        setField(term12100, term12100.getClass(), "pastRides", term12101);
        setField(term12100, term12100.getClass(), "currentRide", term12127);
        setField(term12100, term12100.getClass(), "dateOfBirth", "HUtbHklGel");
        setField(term12100, term12100.getClass(), "username", "QbfKDAwhSB");
        setField(term12100, term12100.getClass(), "mobileNumber", "ckTRHEIcCK");
        setField(term12100, term12100.getClass(), "email", "NYSBqIpNlD");
        setField(term12100, term12100.getClass(), "password", "OWglDUWQYb");
        setField(term12100, term12100.getClass(), "userStatus", enum25);
        term12204 = new Integer(-1549607466);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term12204;
        callMethod(klass, "acceptOffer", argTypes, term12100, args);
    }

};


