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

public class Passenger_acceptOffer_21167531545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4747;
     Object term4847;

    public Passenger_acceptOffer_21167531545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4759 = new ArrayList();
        ((ArrayList) term4759).add((Object)null);
        ((ArrayList) term4759).add((Object)null);
        ((ArrayList) term4759).add((Object)null);
        ((ArrayList) term4759).add((Object)null);
        ((ArrayList) term4759).add((Object)null);
        Boolean term4762 = new Boolean(true);
        ArrayList term4764 = new ArrayList();
        ((ArrayList) term4764).add((Object)null);
        ((ArrayList) term4764).add((Object)null);
        ((ArrayList) term4764).add((Object)null);
        ((ArrayList) term4764).add((Object)null);
        Object term4750 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        Object term4751 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        Object term4753 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        Object term4755 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger"));
        Object term4756 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Offer"));
        setField(term4751, term4751.getClass(), "location", null);
        setBooleanField(term4751, term4751.getClass(), "isDiscounted", false);
        setField(term4751, term4751.getClass(), "drivers", null);
        setField(term4750, term4750.getClass(), "source", term4751);
        setField(term4753, term4753.getClass(), "location", null);
        setBooleanField(term4753, term4753.getClass(), "isDiscounted", false);
        setField(term4753, term4753.getClass(), "drivers", null);
        setField(term4750, term4750.getClass(), "destination", term4753);
        setField(term4755, term4755.getClass(), "pastRides", null);
        setField(term4755, term4755.getClass(), "currentRide", null);
        setField(term4755, term4755.getClass(), "dateOfBirth", null);
        setField(term4755, term4755.getClass(), "username", null);
        setField(term4755, term4755.getClass(), "mobileNumber", null);
        setField(term4755, term4755.getClass(), "email", null);
        setField(term4755, term4755.getClass(), "password", null);
        setField(term4755, term4755.getClass(), "userStatus", null);
        setField(term4750, term4750.getClass(), "passenger", term4755);
        setDoubleField(term4756, term4756.getClass(), "price", 0.7919370314903882);
        setDoubleField(term4756, term4756.getClass(), "discountedPrice", 0.2109867221632754);
        setField(term4756, term4756.getClass(), "driver", null);
        setField(term4750, term4750.getClass(), "acceptedOffer", term4756);
        setField(term4750, term4750.getClass(), "offers", term4759);
        setField(term4750, term4750.getClass(), "isAccepted", term4762);
        setField(term4750, term4750.getClass(), "events", term4764);
        setIntField(term4750, term4750.getClass(), "numberOfPassengers", 1041916673);
        Object term4768 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term4768, term4768.getClass(), "source", null);
        setField(term4768, term4768.getClass(), "destination", null);
        setField(term4768, term4768.getClass(), "passenger", null);
        setField(term4768, term4768.getClass(), "acceptedOffer", null);
        setField(term4768, term4768.getClass(), "offers", null);
        setField(term4768, term4768.getClass(), "isAccepted", null);
        setField(term4768, term4768.getClass(), "events", null);
        setIntField(term4768, term4768.getClass(), "numberOfPassengers", 0);
        Object term4770 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term4770, term4770.getClass(), "source", null);
        setField(term4770, term4770.getClass(), "destination", null);
        setField(term4770, term4770.getClass(), "passenger", null);
        setField(term4770, term4770.getClass(), "acceptedOffer", null);
        setField(term4770, term4770.getClass(), "offers", null);
        setField(term4770, term4770.getClass(), "isAccepted", null);
        setField(term4770, term4770.getClass(), "events", null);
        setIntField(term4770, term4770.getClass(), "numberOfPassengers", 0);
        Object term4772 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term4772, term4772.getClass(), "source", null);
        setField(term4772, term4772.getClass(), "destination", null);
        setField(term4772, term4772.getClass(), "passenger", null);
        setField(term4772, term4772.getClass(), "acceptedOffer", null);
        setField(term4772, term4772.getClass(), "offers", null);
        setField(term4772, term4772.getClass(), "isAccepted", null);
        setField(term4772, term4772.getClass(), "events", null);
        setIntField(term4772, term4772.getClass(), "numberOfPassengers", 0);
        ArrayList term4748 = new ArrayList();
        ((ArrayList) term4748).add(term4750);
        ((ArrayList) term4748).add(term4768);
        ((ArrayList) term4748).add(term4768);
        ((ArrayList) term4748).add(term4770);
        ((ArrayList) term4748).add(term4772);
        Class<? extends Object> term4900 = Class.forName((String) "com.API.OnDriver.CustomerSubsystem.UserStatus");
        Field term4899 = ((Class) term4900).getDeclaredField((String) "admin");
        ((Field) term4899).setAccessible(true);
        Object enum9 = ((Field) term4899).get((Object) null);
        term4747 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger"));
        Object term4776 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term4747, term4747.getClass(), "pastRides", term4748);
        setField(term4776, term4776.getClass(), "source", null);
        setField(term4776, term4776.getClass(), "destination", null);
        setField(term4776, term4776.getClass(), "passenger", null);
        setField(term4776, term4776.getClass(), "acceptedOffer", null);
        setField(term4776, term4776.getClass(), "offers", null);
        setField(term4776, term4776.getClass(), "isAccepted", null);
        setField(term4776, term4776.getClass(), "events", null);
        setIntField(term4776, term4776.getClass(), "numberOfPassengers", 0);
        setField(term4747, term4747.getClass(), "currentRide", term4776);
        setField(term4747, term4747.getClass(), "dateOfBirth", "ktbqerIaKW");
        setField(term4747, term4747.getClass(), "username", "VoghngXfsK");
        setField(term4747, term4747.getClass(), "mobileNumber", "GbahCBMvct");
        setField(term4747, term4747.getClass(), "email", "iiHBhsNFgk");
        setField(term4747, term4747.getClass(), "password", "HknsTajwxJ");
        setField(term4747, term4747.getClass(), "userStatus", enum9);
        term4847 = new Integer(-601863069);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4847;
        callMethod(klass, "acceptOffer", argTypes, term4747, args);
    }

};


