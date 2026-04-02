package com.API.OnDriver.DataSubsystem;

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
import static com.API.OnDriver.DataSubsystem.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.String;

public class ListManager_addToPassenger_17602775405 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108;
     Object term129;

    public ListManager_addToPassenger_17602775405() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term109 = new ArrayList();
        ArrayList term113 = new ArrayList();
        ArrayList term117 = new ArrayList();
        ArrayList term121 = new ArrayList();
        ArrayList term125 = new ArrayList();
        term108 = newInstance(Class.forName("com.API.OnDriver.DataSubsystem.ListManager"));
        setField(term108, term108.getClass(), "listOfPassengers", term109);
        setField(term108, term108.getClass(), "listOfDrivers", term113);
        setField(term108, term108.getClass(), "listOfAreas", term117);
        setField(term108, term108.getClass(), "listOfAdmin", term121);
        setField(term108, term108.getClass(), "listOfRides", term125);
        ArrayList term141 = new ArrayList();
        ((ArrayList) term141).add((Object)null);
        ((ArrayList) term141).add((Object)null);
        ((ArrayList) term141).add((Object)null);
        ((ArrayList) term141).add((Object)null);
        ((ArrayList) term141).add((Object)null);
        Boolean term144 = new Boolean(false);
        ArrayList term146 = new ArrayList();
        ((ArrayList) term146).add((Object)null);
        ((ArrayList) term146).add((Object)null);
        ((ArrayList) term146).add((Object)null);
        Object term132 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        Object term133 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        Object term135 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        Object term137 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger"));
        Object term138 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Offer"));
        setField(term133, term133.getClass(), "location", null);
        setBooleanField(term133, term133.getClass(), "isDiscounted", false);
        setField(term133, term133.getClass(), "drivers", null);
        setField(term132, term132.getClass(), "source", term133);
        setField(term135, term135.getClass(), "location", null);
        setBooleanField(term135, term135.getClass(), "isDiscounted", false);
        setField(term135, term135.getClass(), "drivers", null);
        setField(term132, term132.getClass(), "destination", term135);
        setField(term137, term137.getClass(), "pastRides", null);
        setField(term137, term137.getClass(), "currentRide", null);
        setField(term137, term137.getClass(), "dateOfBirth", null);
        setField(term137, term137.getClass(), "username", null);
        setField(term137, term137.getClass(), "mobileNumber", null);
        setField(term137, term137.getClass(), "email", null);
        setField(term137, term137.getClass(), "password", null);
        setField(term137, term137.getClass(), "userStatus", null);
        setField(term132, term132.getClass(), "passenger", term137);
        setDoubleField(term138, term138.getClass(), "price", 0.13238746331190498);
        setDoubleField(term138, term138.getClass(), "discountedPrice", 0.3455959125047594);
        setField(term138, term138.getClass(), "driver", null);
        setField(term132, term132.getClass(), "acceptedOffer", term138);
        setField(term132, term132.getClass(), "offers", term141);
        setField(term132, term132.getClass(), "isAccepted", term144);
        setField(term132, term132.getClass(), "events", term146);
        setIntField(term132, term132.getClass(), "numberOfPassengers", 1622346318);
        Object term150 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term150, term150.getClass(), "source", null);
        setField(term150, term150.getClass(), "destination", null);
        setField(term150, term150.getClass(), "passenger", null);
        setField(term150, term150.getClass(), "acceptedOffer", null);
        setField(term150, term150.getClass(), "offers", null);
        setField(term150, term150.getClass(), "isAccepted", null);
        setField(term150, term150.getClass(), "events", null);
        setIntField(term150, term150.getClass(), "numberOfPassengers", 0);
        Object term152 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term152, term152.getClass(), "source", null);
        setField(term152, term152.getClass(), "destination", null);
        setField(term152, term152.getClass(), "passenger", null);
        setField(term152, term152.getClass(), "acceptedOffer", null);
        setField(term152, term152.getClass(), "offers", null);
        setField(term152, term152.getClass(), "isAccepted", null);
        setField(term152, term152.getClass(), "events", null);
        setIntField(term152, term152.getClass(), "numberOfPassengers", 0);
        Object term154 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term154, term154.getClass(), "source", null);
        setField(term154, term154.getClass(), "destination", null);
        setField(term154, term154.getClass(), "passenger", null);
        setField(term154, term154.getClass(), "acceptedOffer", null);
        setField(term154, term154.getClass(), "offers", null);
        setField(term154, term154.getClass(), "isAccepted", null);
        setField(term154, term154.getClass(), "events", null);
        setIntField(term154, term154.getClass(), "numberOfPassengers", 0);
        Object term156 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term156, term156.getClass(), "source", null);
        setField(term156, term156.getClass(), "destination", null);
        setField(term156, term156.getClass(), "passenger", null);
        setField(term156, term156.getClass(), "acceptedOffer", null);
        setField(term156, term156.getClass(), "offers", null);
        setField(term156, term156.getClass(), "isAccepted", null);
        setField(term156, term156.getClass(), "events", null);
        setIntField(term156, term156.getClass(), "numberOfPassengers", 0);
        ArrayList term130 = new ArrayList();
        ((ArrayList) term130).add(term132);
        ((ArrayList) term130).add(term150);
        ((ArrayList) term130).add(term152);
        ((ArrayList) term130).add(term154);
        ((ArrayList) term130).add(term156);
        Class<? extends Object> term321 = Class.forName((String) "com.API.OnDriver.CustomerSubsystem.UserStatus");
        Field term320 = ((Class) term321).getDeclaredField((String) "suspended");
        ((Field) term320).setAccessible(true);
        Object enum0 = ((Field) term320).get((Object) null);
        term129 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger"));
        Object term160 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term129, term129.getClass(), "pastRides", term130);
        setField(term160, term160.getClass(), "source", null);
        setField(term160, term160.getClass(), "destination", null);
        setField(term160, term160.getClass(), "passenger", null);
        setField(term160, term160.getClass(), "acceptedOffer", null);
        setField(term160, term160.getClass(), "offers", null);
        setField(term160, term160.getClass(), "isAccepted", null);
        setField(term160, term160.getClass(), "events", null);
        setIntField(term160, term160.getClass(), "numberOfPassengers", 0);
        setField(term129, term129.getClass(), "currentRide", term160);
        setField(term129, term129.getClass(), "dateOfBirth", "IgRJUzaCwW");
        setField(term129, term129.getClass(), "username", "JUmudUmaaV");
        setField(term129, term129.getClass(), "mobileNumber", "KoyGrUJeJW");
        setField(term129, term129.getClass(), "email", "HqBOwkVqjD");
        setField(term129, term129.getClass(), "password", "MAcUBcBckh");
        setField(term129, term129.getClass(), "userStatus", enum0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.DataSubsystem.ListManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger");
        Object[] args = new Object[1];
        args[0] = term129;
        callMethod(klass, "addToPassenger", argTypes, term108, args);
    }

};


