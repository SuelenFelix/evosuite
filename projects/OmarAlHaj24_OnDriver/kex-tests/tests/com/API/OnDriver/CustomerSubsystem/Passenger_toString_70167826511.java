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

public class Passenger_toString_70167826511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14592;

    public Passenger_toString_70167826511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term14604 = new ArrayList();
        ((ArrayList) term14604).add((Object)null);
        ((ArrayList) term14604).add((Object)null);
        Boolean term14607 = new Boolean(false);
        ArrayList term14609 = new ArrayList();
        Object term14595 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        Object term14596 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        Object term14598 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        Object term14600 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger"));
        Object term14601 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Offer"));
        setField(term14596, term14596.getClass(), "location", null);
        setBooleanField(term14596, term14596.getClass(), "isDiscounted", false);
        setField(term14596, term14596.getClass(), "drivers", null);
        setField(term14595, term14595.getClass(), "source", term14596);
        setField(term14598, term14598.getClass(), "location", null);
        setBooleanField(term14598, term14598.getClass(), "isDiscounted", true);
        setField(term14598, term14598.getClass(), "drivers", null);
        setField(term14595, term14595.getClass(), "destination", term14598);
        setField(term14600, term14600.getClass(), "pastRides", null);
        setField(term14600, term14600.getClass(), "currentRide", null);
        setField(term14600, term14600.getClass(), "dateOfBirth", null);
        setField(term14600, term14600.getClass(), "username", null);
        setField(term14600, term14600.getClass(), "mobileNumber", null);
        setField(term14600, term14600.getClass(), "email", null);
        setField(term14600, term14600.getClass(), "password", null);
        setField(term14600, term14600.getClass(), "userStatus", null);
        setField(term14595, term14595.getClass(), "passenger", term14600);
        setDoubleField(term14601, term14601.getClass(), "price", 0.5715204226647931);
        setDoubleField(term14601, term14601.getClass(), "discountedPrice", 0.6420798930164424);
        setField(term14601, term14601.getClass(), "driver", null);
        setField(term14595, term14595.getClass(), "acceptedOffer", term14601);
        setField(term14595, term14595.getClass(), "offers", term14604);
        setField(term14595, term14595.getClass(), "isAccepted", term14607);
        setField(term14595, term14595.getClass(), "events", term14609);
        setIntField(term14595, term14595.getClass(), "numberOfPassengers", -138239905);
        Object term14613 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term14613, term14613.getClass(), "source", null);
        setField(term14613, term14613.getClass(), "destination", null);
        setField(term14613, term14613.getClass(), "passenger", null);
        setField(term14613, term14613.getClass(), "acceptedOffer", null);
        setField(term14613, term14613.getClass(), "offers", null);
        setField(term14613, term14613.getClass(), "isAccepted", null);
        setField(term14613, term14613.getClass(), "events", null);
        setIntField(term14613, term14613.getClass(), "numberOfPassengers", 0);
        Object term14615 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term14615, term14615.getClass(), "source", null);
        setField(term14615, term14615.getClass(), "destination", null);
        setField(term14615, term14615.getClass(), "passenger", null);
        setField(term14615, term14615.getClass(), "acceptedOffer", null);
        setField(term14615, term14615.getClass(), "offers", null);
        setField(term14615, term14615.getClass(), "isAccepted", null);
        setField(term14615, term14615.getClass(), "events", null);
        setIntField(term14615, term14615.getClass(), "numberOfPassengers", 0);
        Object term14617 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term14617, term14617.getClass(), "source", null);
        setField(term14617, term14617.getClass(), "destination", null);
        setField(term14617, term14617.getClass(), "passenger", null);
        setField(term14617, term14617.getClass(), "acceptedOffer", null);
        setField(term14617, term14617.getClass(), "offers", null);
        setField(term14617, term14617.getClass(), "isAccepted", null);
        setField(term14617, term14617.getClass(), "events", null);
        setIntField(term14617, term14617.getClass(), "numberOfPassengers", 0);
        Object term14619 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term14619, term14619.getClass(), "source", null);
        setField(term14619, term14619.getClass(), "destination", null);
        setField(term14619, term14619.getClass(), "passenger", null);
        setField(term14619, term14619.getClass(), "acceptedOffer", null);
        setField(term14619, term14619.getClass(), "offers", null);
        setField(term14619, term14619.getClass(), "isAccepted", null);
        setField(term14619, term14619.getClass(), "events", null);
        setIntField(term14619, term14619.getClass(), "numberOfPassengers", 0);
        ArrayList term14593 = new ArrayList();
        ((ArrayList) term14593).add(term14595);
        ((ArrayList) term14593).add(term14613);
        ((ArrayList) term14593).add(term14615);
        ((ArrayList) term14593).add(term14617);
        ((ArrayList) term14593).add(term14615);
        ((ArrayList) term14593).add(term14619);
        ((ArrayList) term14593).add(term14615);
        ((ArrayList) term14593).add(term14617);
        Class<? extends Object> term14749 = Class.forName((String) "com.API.OnDriver.CustomerSubsystem.UserStatus");
        Field term14748 = ((Class) term14749).getDeclaredField((String) "activated");
        ((Field) term14748).setAccessible(true);
        Object enum31 = ((Field) term14748).get((Object) null);
        term14592 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger"));
        Object term14623 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term14592, term14592.getClass(), "pastRides", term14593);
        setField(term14623, term14623.getClass(), "source", null);
        setField(term14623, term14623.getClass(), "destination", null);
        setField(term14623, term14623.getClass(), "passenger", null);
        setField(term14623, term14623.getClass(), "acceptedOffer", null);
        setField(term14623, term14623.getClass(), "offers", null);
        setField(term14623, term14623.getClass(), "isAccepted", null);
        setField(term14623, term14623.getClass(), "events", null);
        setIntField(term14623, term14623.getClass(), "numberOfPassengers", 0);
        setField(term14592, term14592.getClass(), "currentRide", term14623);
        setField(term14592, term14592.getClass(), "dateOfBirth", "pkQawlBtEF");
        setField(term14592, term14592.getClass(), "username", "rdKTcvHHnV");
        setField(term14592, term14592.getClass(), "mobileNumber", "ELfUfLbXZf");
        setField(term14592, term14592.getClass(), "email", "SAglaHkagn");
        setField(term14592, term14592.getClass(), "password", "eZGxUfdoFn");
        setField(term14592, term14592.getClass(), "userStatus", enum31);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term14592, args);
    }

};


