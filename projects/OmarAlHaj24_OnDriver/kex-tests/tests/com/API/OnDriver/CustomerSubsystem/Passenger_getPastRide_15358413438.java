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

public class Passenger_getPastRide_15358413438 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6004;
     Object term6127;

    public Passenger_getPastRide_15358413438() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6014 = new ArrayList();
        ((ArrayList) term6014).add((Object)null);
        ((ArrayList) term6014).add((Object)null);
        ((ArrayList) term6014).add((Object)null);
        ((ArrayList) term6014).add((Object)null);
        ((ArrayList) term6014).add((Object)null);
        ((ArrayList) term6014).add((Object)null);
        ((ArrayList) term6014).add((Object)null);
        Boolean term6017 = new Boolean(false);
        ArrayList term6019 = new ArrayList();
        ((ArrayList) term6019).add((Object)null);
        ((ArrayList) term6019).add((Object)null);
        ((ArrayList) term6019).add((Object)null);
        Object term6007 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        Object term6008 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        Object term6010 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger"));
        Object term6011 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Offer"));
        setField(term6008, term6008.getClass(), "location", null);
        setBooleanField(term6008, term6008.getClass(), "isDiscounted", false);
        setField(term6008, term6008.getClass(), "drivers", null);
        setField(term6007, term6007.getClass(), "source", term6008);
        setField(term6007, term6007.getClass(), "destination", term6008);
        setField(term6010, term6010.getClass(), "pastRides", null);
        setField(term6010, term6010.getClass(), "currentRide", null);
        setField(term6010, term6010.getClass(), "dateOfBirth", null);
        setField(term6010, term6010.getClass(), "username", null);
        setField(term6010, term6010.getClass(), "mobileNumber", null);
        setField(term6010, term6010.getClass(), "email", null);
        setField(term6010, term6010.getClass(), "password", null);
        setField(term6010, term6010.getClass(), "userStatus", null);
        setField(term6007, term6007.getClass(), "passenger", term6010);
        setDoubleField(term6011, term6011.getClass(), "price", 0.0);
        setDoubleField(term6011, term6011.getClass(), "discountedPrice", 0.0);
        setField(term6011, term6011.getClass(), "driver", null);
        setField(term6007, term6007.getClass(), "acceptedOffer", term6011);
        setField(term6007, term6007.getClass(), "offers", term6014);
        setField(term6007, term6007.getClass(), "isAccepted", term6017);
        setField(term6007, term6007.getClass(), "events", term6019);
        setIntField(term6007, term6007.getClass(), "numberOfPassengers", -1476644457);
        ArrayList term6032 = new ArrayList();
        ((ArrayList) term6032).add((Object)null);
        ((ArrayList) term6032).add((Object)null);
        ((ArrayList) term6032).add((Object)null);
        ((ArrayList) term6032).add((Object)null);
        Boolean term6035 = new Boolean(true);
        ArrayList term6037 = new ArrayList();
        ((ArrayList) term6037).add((Object)null);
        ((ArrayList) term6037).add((Object)null);
        Object term6023 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        Object term6024 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        Object term6026 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        Object term6028 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger"));
        Object term6029 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Offer"));
        setField(term6024, term6024.getClass(), "location", null);
        setBooleanField(term6024, term6024.getClass(), "isDiscounted", false);
        setField(term6024, term6024.getClass(), "drivers", null);
        setField(term6023, term6023.getClass(), "source", term6024);
        setField(term6026, term6026.getClass(), "location", null);
        setBooleanField(term6026, term6026.getClass(), "isDiscounted", true);
        setField(term6026, term6026.getClass(), "drivers", null);
        setField(term6023, term6023.getClass(), "destination", term6026);
        setField(term6028, term6028.getClass(), "pastRides", null);
        setField(term6028, term6028.getClass(), "currentRide", null);
        setField(term6028, term6028.getClass(), "dateOfBirth", null);
        setField(term6028, term6028.getClass(), "username", null);
        setField(term6028, term6028.getClass(), "mobileNumber", null);
        setField(term6028, term6028.getClass(), "email", null);
        setField(term6028, term6028.getClass(), "password", null);
        setField(term6028, term6028.getClass(), "userStatus", null);
        setField(term6023, term6023.getClass(), "passenger", term6028);
        setDoubleField(term6029, term6029.getClass(), "price", 0.0);
        setDoubleField(term6029, term6029.getClass(), "discountedPrice", 0.0);
        setField(term6029, term6029.getClass(), "driver", null);
        setField(term6023, term6023.getClass(), "acceptedOffer", term6029);
        setField(term6023, term6023.getClass(), "offers", term6032);
        setField(term6023, term6023.getClass(), "isAccepted", term6035);
        setField(term6023, term6023.getClass(), "events", term6037);
        setIntField(term6023, term6023.getClass(), "numberOfPassengers", 806595993);
        ArrayList term6047 = new ArrayList();
        ((ArrayList) term6047).add((Object)null);
        ((ArrayList) term6047).add((Object)null);
        ((ArrayList) term6047).add((Object)null);
        ((ArrayList) term6047).add((Object)null);
        Boolean term6050 = new Boolean(false);
        ArrayList term6052 = new ArrayList();
        ((ArrayList) term6052).add((Object)null);
        Object term6041 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        Object term6042 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        Object term6044 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        Object term6046 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger"));
        setField(term6042, term6042.getClass(), "location", null);
        setBooleanField(term6042, term6042.getClass(), "isDiscounted", true);
        setField(term6042, term6042.getClass(), "drivers", null);
        setField(term6041, term6041.getClass(), "source", term6042);
        setField(term6044, term6044.getClass(), "location", null);
        setBooleanField(term6044, term6044.getClass(), "isDiscounted", true);
        setField(term6044, term6044.getClass(), "drivers", null);
        setField(term6041, term6041.getClass(), "destination", term6044);
        setField(term6046, term6046.getClass(), "pastRides", null);
        setField(term6046, term6046.getClass(), "currentRide", null);
        setField(term6046, term6046.getClass(), "dateOfBirth", null);
        setField(term6046, term6046.getClass(), "username", null);
        setField(term6046, term6046.getClass(), "mobileNumber", null);
        setField(term6046, term6046.getClass(), "email", null);
        setField(term6046, term6046.getClass(), "password", null);
        setField(term6046, term6046.getClass(), "userStatus", null);
        setField(term6041, term6041.getClass(), "passenger", term6046);
        setField(term6041, term6041.getClass(), "acceptedOffer", term6011);
        setField(term6041, term6041.getClass(), "offers", term6047);
        setField(term6041, term6041.getClass(), "isAccepted", term6050);
        setField(term6041, term6041.getClass(), "events", term6052);
        setIntField(term6041, term6041.getClass(), "numberOfPassengers", 548228925);
        ArrayList term6005 = new ArrayList();
        ((ArrayList) term6005).add(term6007);
        ((ArrayList) term6005).add(term6023);
        ((ArrayList) term6005).add(term6041);
        ((ArrayList) term6005).add(term6023);
        Class<? extends Object> term6180 = Class.forName((String) "com.API.OnDriver.CustomerSubsystem.UserStatus");
        Field term6179 = ((Class) term6180).getDeclaredField((String) "admin");
        ((Field) term6179).setAccessible(true);
        Object enum12 = ((Field) term6179).get((Object) null);
        term6004 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger"));
        setField(term6004, term6004.getClass(), "pastRides", term6005);
        setField(term6004, term6004.getClass(), "currentRide", term6023);
        setField(term6004, term6004.getClass(), "dateOfBirth", "fRujHWvXjJ");
        setField(term6004, term6004.getClass(), "username", "EAIAAStlTz");
        setField(term6004, term6004.getClass(), "mobileNumber", "yIWXcOQTgy");
        setField(term6004, term6004.getClass(), "email", "xAWekqanqc");
        setField(term6004, term6004.getClass(), "password", "GSOWFHMlbF");
        setField(term6004, term6004.getClass(), "userStatus", enum12);
        term6127 = new Integer(1270666529);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term6127;
        callMethod(klass, "getPastRide", argTypes, term6004, args);
    }

};


