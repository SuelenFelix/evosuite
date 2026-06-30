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

public class Driver_setNationalID_19255527165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39626;

    public Driver_setNationalID_19255527165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term39651 = new Boolean(true);
        ArrayList term39658 = new ArrayList();
        ((ArrayList) term39658).add((Object)null);
        ((ArrayList) term39658).add((Object)null);
        ((ArrayList) term39658).add((Object)null);
        ((ArrayList) term39658).add((Object)null);
        Object term39655 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        setField(term39655, term39655.getClass(), "location", "");
        setBooleanField(term39655, term39655.getClass(), "isDiscounted", true);
        setField(term39655, term39655.getClass(), "drivers", term39658);
        Object term39661 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        setField(term39661, term39661.getClass(), "location", null);
        setBooleanField(term39661, term39661.getClass(), "isDiscounted", false);
        setField(term39661, term39661.getClass(), "drivers", null);
        Object term39663 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        setField(term39663, term39663.getClass(), "location", null);
        setBooleanField(term39663, term39663.getClass(), "isDiscounted", false);
        setField(term39663, term39663.getClass(), "drivers", null);
        Object term39665 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        setField(term39665, term39665.getClass(), "location", null);
        setBooleanField(term39665, term39665.getClass(), "isDiscounted", false);
        setField(term39665, term39665.getClass(), "drivers", null);
        ArrayList term39670 = new ArrayList();
        ((ArrayList) term39670).add((Object)null);
        ((ArrayList) term39670).add((Object)null);
        ((ArrayList) term39670).add((Object)null);
        Object term39667 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        setField(term39667, term39667.getClass(), "location", "");
        setBooleanField(term39667, term39667.getClass(), "isDiscounted", false);
        setField(term39667, term39667.getClass(), "drivers", term39670);
        ArrayList term39653 = new ArrayList();
        ((ArrayList) term39653).add(term39655);
        ((ArrayList) term39653).add(term39661);
        ((ArrayList) term39653).add(term39663);
        ((ArrayList) term39653).add(term39665);
        ((ArrayList) term39653).add(term39667);
        Object term39677 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term39677, term39677.getClass(), "source", null);
        setField(term39677, term39677.getClass(), "destination", null);
        setField(term39677, term39677.getClass(), "passenger", null);
        setField(term39677, term39677.getClass(), "acceptedOffer", null);
        setField(term39677, term39677.getClass(), "offers", null);
        setField(term39677, term39677.getClass(), "isAccepted", null);
        setField(term39677, term39677.getClass(), "events", null);
        setIntField(term39677, term39677.getClass(), "numberOfPassengers", 0);
        Object term39679 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term39679, term39679.getClass(), "source", null);
        setField(term39679, term39679.getClass(), "destination", null);
        setField(term39679, term39679.getClass(), "passenger", null);
        setField(term39679, term39679.getClass(), "acceptedOffer", null);
        setField(term39679, term39679.getClass(), "offers", null);
        setField(term39679, term39679.getClass(), "isAccepted", null);
        setField(term39679, term39679.getClass(), "events", null);
        setIntField(term39679, term39679.getClass(), "numberOfPassengers", 0);
        ArrayList term39675 = new ArrayList();
        ((ArrayList) term39675).add(term39677);
        ((ArrayList) term39675).add(term39679);
        HashMap term39684 = new HashMap();
        Class<? extends Object> term39828 = Class.forName((String) "com.API.OnDriver.CustomerSubsystem.UserStatus");
        Field term39827 = ((Class) term39828).getDeclaredField((String) "suspended");
        ((Field) term39827).setAccessible(true);
        Object enum93 = ((Field) term39827).get((Object) null);
        term39626 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Driver"));
        Object term39683 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Rating"));
        Object term39691 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term39626, term39626.getClass(), "driverLicense", "PvrMbFoCJF");
        setField(term39626, term39626.getClass(), "nationalID", "UJOrVYoraU");
        setField(term39626, term39626.getClass(), "isVerified", term39651);
        setField(term39626, term39626.getClass(), "favouriteAreas", term39653);
        setField(term39626, term39626.getClass(), "rides", term39675);
        setField(term39683, term39683.getClass(), "driverRatings", term39684);
        setIntField(term39683, term39683.getClass(), "ratingSum", -1631415805);
        setIntField(term39683, term39683.getClass(), "numberOfRatings", 1073400519);
        setField(term39626, term39626.getClass(), "rating", term39683);
        setField(term39691, term39691.getClass(), "source", null);
        setField(term39691, term39691.getClass(), "destination", null);
        setField(term39691, term39691.getClass(), "passenger", null);
        setField(term39691, term39691.getClass(), "acceptedOffer", null);
        setField(term39691, term39691.getClass(), "offers", null);
        setField(term39691, term39691.getClass(), "isAccepted", null);
        setField(term39691, term39691.getClass(), "events", null);
        setIntField(term39691, term39691.getClass(), "numberOfPassengers", 0);
        setField(term39626, term39626.getClass(), "currentRide", term39691);
        setIntField(term39626, term39626.getClass(), "numberOfPassengers", -2025555268);
        setField(term39626, term39626.getClass(), "username", "heAByNySVP");
        setField(term39626, term39626.getClass(), "mobileNumber", "gPuVkQobYQ");
        setField(term39626, term39626.getClass(), "email", "sAHDMENVSp");
        setField(term39626, term39626.getClass(), "password", "oLoxfeWIGH");
        setField(term39626, term39626.getClass(), "userStatus", enum93);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.CustomerSubsystem.Driver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vdErTHSsJu";
        callMethod(klass, "setNationalID", argTypes, term39626, args);
    }

};


