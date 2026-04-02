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

public class Passenger_isFirstRide_14724693707 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5611;

    public Passenger_isFirstRide_14724693707() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5623 = new ArrayList();
        ((ArrayList) term5623).add((Object)null);
        ((ArrayList) term5623).add((Object)null);
        ((ArrayList) term5623).add((Object)null);
        ((ArrayList) term5623).add((Object)null);
        Boolean term5626 = new Boolean(false);
        ArrayList term5628 = new ArrayList();
        ((ArrayList) term5628).add((Object)null);
        ((ArrayList) term5628).add((Object)null);
        ((ArrayList) term5628).add((Object)null);
        ((ArrayList) term5628).add((Object)null);
        ((ArrayList) term5628).add((Object)null);
        ((ArrayList) term5628).add((Object)null);
        Object term5614 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        Object term5615 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        Object term5617 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        Object term5619 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger"));
        Object term5620 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Offer"));
        setField(term5615, term5615.getClass(), "location", null);
        setBooleanField(term5615, term5615.getClass(), "isDiscounted", false);
        setField(term5615, term5615.getClass(), "drivers", null);
        setField(term5614, term5614.getClass(), "source", term5615);
        setField(term5617, term5617.getClass(), "location", null);
        setBooleanField(term5617, term5617.getClass(), "isDiscounted", true);
        setField(term5617, term5617.getClass(), "drivers", null);
        setField(term5614, term5614.getClass(), "destination", term5617);
        setField(term5619, term5619.getClass(), "pastRides", null);
        setField(term5619, term5619.getClass(), "currentRide", null);
        setField(term5619, term5619.getClass(), "dateOfBirth", null);
        setField(term5619, term5619.getClass(), "username", null);
        setField(term5619, term5619.getClass(), "mobileNumber", null);
        setField(term5619, term5619.getClass(), "email", null);
        setField(term5619, term5619.getClass(), "password", null);
        setField(term5619, term5619.getClass(), "userStatus", null);
        setField(term5614, term5614.getClass(), "passenger", term5619);
        setDoubleField(term5620, term5620.getClass(), "price", 0.7154795600170818);
        setDoubleField(term5620, term5620.getClass(), "discountedPrice", 0.6355029654528058);
        setField(term5620, term5620.getClass(), "driver", null);
        setField(term5614, term5614.getClass(), "acceptedOffer", term5620);
        setField(term5614, term5614.getClass(), "offers", term5623);
        setField(term5614, term5614.getClass(), "isAccepted", term5626);
        setField(term5614, term5614.getClass(), "events", term5628);
        setIntField(term5614, term5614.getClass(), "numberOfPassengers", -165587447);
        Object term5632 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term5632, term5632.getClass(), "source", null);
        setField(term5632, term5632.getClass(), "destination", null);
        setField(term5632, term5632.getClass(), "passenger", null);
        setField(term5632, term5632.getClass(), "acceptedOffer", null);
        setField(term5632, term5632.getClass(), "offers", null);
        setField(term5632, term5632.getClass(), "isAccepted", null);
        setField(term5632, term5632.getClass(), "events", null);
        setIntField(term5632, term5632.getClass(), "numberOfPassengers", 0);
        ArrayList term5612 = new ArrayList();
        ((ArrayList) term5612).add(term5614);
        ((ArrayList) term5612).add(term5632);
        Class<? extends Object> term5758 = Class.forName((String) "com.API.OnDriver.CustomerSubsystem.UserStatus");
        Field term5757 = ((Class) term5758).getDeclaredField((String) "admin");
        ((Field) term5757).setAccessible(true);
        Object enum11 = ((Field) term5757).get((Object) null);
        term5611 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger"));
        Object term5636 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term5611, term5611.getClass(), "pastRides", term5612);
        setField(term5636, term5636.getClass(), "source", null);
        setField(term5636, term5636.getClass(), "destination", null);
        setField(term5636, term5636.getClass(), "passenger", null);
        setField(term5636, term5636.getClass(), "acceptedOffer", null);
        setField(term5636, term5636.getClass(), "offers", null);
        setField(term5636, term5636.getClass(), "isAccepted", null);
        setField(term5636, term5636.getClass(), "events", null);
        setIntField(term5636, term5636.getClass(), "numberOfPassengers", 0);
        setField(term5611, term5611.getClass(), "currentRide", term5636);
        setField(term5611, term5611.getClass(), "dateOfBirth", "wgRGBNrTGP");
        setField(term5611, term5611.getClass(), "username", "FIdNVptZpW");
        setField(term5611, term5611.getClass(), "mobileNumber", "rQjxAhisjm");
        setField(term5611, term5611.getClass(), "email", "ZDhASPHjDG");
        setField(term5611, term5611.getClass(), "password", "HNVOAXYNEZ");
        setField(term5611, term5611.getClass(), "userStatus", enum11);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isFirstRide", argTypes, term5611, args);
    }

};


