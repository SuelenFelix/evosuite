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

public class Driver_getCurrentRide_210093382018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20328;

    public Driver_getCurrentRide_210093382018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term20353 = new Boolean(false);
        ArrayList term20360 = new ArrayList();
        Object term20357 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        setField(term20357, term20357.getClass(), "location", "");
        setBooleanField(term20357, term20357.getClass(), "isDiscounted", true);
        setField(term20357, term20357.getClass(), "drivers", term20360);
        ArrayList term20355 = new ArrayList();
        ((ArrayList) term20355).add(term20357);
        ArrayList term20374 = new ArrayList();
        ((ArrayList) term20374).add((Object)null);
        ((ArrayList) term20374).add((Object)null);
        ((ArrayList) term20374).add((Object)null);
        ((ArrayList) term20374).add((Object)null);
        ((ArrayList) term20374).add((Object)null);
        ((ArrayList) term20374).add((Object)null);
        ((ArrayList) term20374).add((Object)null);
        ((ArrayList) term20374).add((Object)null);
        Boolean term20377 = new Boolean(false);
        ArrayList term20379 = new ArrayList();
        ((ArrayList) term20379).add((Object)null);
        ((ArrayList) term20379).add((Object)null);
        Object term20367 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        Object term20368 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        Object term20370 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger"));
        Object term20371 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Offer"));
        setField(term20368, term20368.getClass(), "location", null);
        setBooleanField(term20368, term20368.getClass(), "isDiscounted", false);
        setField(term20368, term20368.getClass(), "drivers", null);
        setField(term20367, term20367.getClass(), "source", term20368);
        setField(term20367, term20367.getClass(), "destination", term20368);
        setField(term20370, term20370.getClass(), "pastRides", null);
        setField(term20370, term20370.getClass(), "currentRide", null);
        setField(term20370, term20370.getClass(), "dateOfBirth", null);
        setField(term20370, term20370.getClass(), "username", null);
        setField(term20370, term20370.getClass(), "mobileNumber", null);
        setField(term20370, term20370.getClass(), "email", null);
        setField(term20370, term20370.getClass(), "password", null);
        setField(term20370, term20370.getClass(), "userStatus", null);
        setField(term20367, term20367.getClass(), "passenger", term20370);
        setDoubleField(term20371, term20371.getClass(), "price", 0.1187814206908886);
        setDoubleField(term20371, term20371.getClass(), "discountedPrice", 0.04662501176438627);
        setField(term20371, term20371.getClass(), "driver", null);
        setField(term20367, term20367.getClass(), "acceptedOffer", term20371);
        setField(term20367, term20367.getClass(), "offers", term20374);
        setField(term20367, term20367.getClass(), "isAccepted", term20377);
        setField(term20367, term20367.getClass(), "events", term20379);
        setIntField(term20367, term20367.getClass(), "numberOfPassengers", -365784998);
        Object term20383 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term20383, term20383.getClass(), "source", null);
        setField(term20383, term20383.getClass(), "destination", null);
        setField(term20383, term20383.getClass(), "passenger", null);
        setField(term20383, term20383.getClass(), "acceptedOffer", null);
        setField(term20383, term20383.getClass(), "offers", null);
        setField(term20383, term20383.getClass(), "isAccepted", null);
        setField(term20383, term20383.getClass(), "events", null);
        setIntField(term20383, term20383.getClass(), "numberOfPassengers", 0);
        Object term20385 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term20385, term20385.getClass(), "source", null);
        setField(term20385, term20385.getClass(), "destination", null);
        setField(term20385, term20385.getClass(), "passenger", null);
        setField(term20385, term20385.getClass(), "acceptedOffer", null);
        setField(term20385, term20385.getClass(), "offers", null);
        setField(term20385, term20385.getClass(), "isAccepted", null);
        setField(term20385, term20385.getClass(), "events", null);
        setIntField(term20385, term20385.getClass(), "numberOfPassengers", 0);
        Object term20387 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term20387, term20387.getClass(), "source", null);
        setField(term20387, term20387.getClass(), "destination", null);
        setField(term20387, term20387.getClass(), "passenger", null);
        setField(term20387, term20387.getClass(), "acceptedOffer", null);
        setField(term20387, term20387.getClass(), "offers", null);
        setField(term20387, term20387.getClass(), "isAccepted", null);
        setField(term20387, term20387.getClass(), "events", null);
        setIntField(term20387, term20387.getClass(), "numberOfPassengers", 0);
        Object term20389 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term20389, term20389.getClass(), "source", null);
        setField(term20389, term20389.getClass(), "destination", null);
        setField(term20389, term20389.getClass(), "passenger", null);
        setField(term20389, term20389.getClass(), "acceptedOffer", null);
        setField(term20389, term20389.getClass(), "offers", null);
        setField(term20389, term20389.getClass(), "isAccepted", null);
        setField(term20389, term20389.getClass(), "events", null);
        setIntField(term20389, term20389.getClass(), "numberOfPassengers", 0);
        Object term20391 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term20391, term20391.getClass(), "source", null);
        setField(term20391, term20391.getClass(), "destination", null);
        setField(term20391, term20391.getClass(), "passenger", null);
        setField(term20391, term20391.getClass(), "acceptedOffer", null);
        setField(term20391, term20391.getClass(), "offers", null);
        setField(term20391, term20391.getClass(), "isAccepted", null);
        setField(term20391, term20391.getClass(), "events", null);
        setIntField(term20391, term20391.getClass(), "numberOfPassengers", 0);
        Object term20393 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term20393, term20393.getClass(), "source", null);
        setField(term20393, term20393.getClass(), "destination", null);
        setField(term20393, term20393.getClass(), "passenger", null);
        setField(term20393, term20393.getClass(), "acceptedOffer", null);
        setField(term20393, term20393.getClass(), "offers", null);
        setField(term20393, term20393.getClass(), "isAccepted", null);
        setField(term20393, term20393.getClass(), "events", null);
        setIntField(term20393, term20393.getClass(), "numberOfPassengers", 0);
        ArrayList term20365 = new ArrayList();
        ((ArrayList) term20365).add(term20367);
        ((ArrayList) term20365).add(term20383);
        ((ArrayList) term20365).add(term20385);
        ((ArrayList) term20365).add(term20387);
        ((ArrayList) term20365).add(term20389);
        ((ArrayList) term20365).add(term20385);
        ((ArrayList) term20365).add(term20391);
        ((ArrayList) term20365).add(term20393);
        ((ArrayList) term20365).add(term20391);
        HashMap term20398 = new HashMap();
        Class<? extends Object> term20530 = Class.forName((String) "com.API.OnDriver.CustomerSubsystem.UserStatus");
        Field term20529 = ((Class) term20530).getDeclaredField((String) "suspended");
        ((Field) term20529).setAccessible(true);
        Object enum45 = ((Field) term20529).get((Object) null);
        term20328 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Driver"));
        Object term20397 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Rating"));
        Object term20405 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term20328, term20328.getClass(), "driverLicense", "dZVxzYEeZe");
        setField(term20328, term20328.getClass(), "nationalID", "TnCQRmzwPf");
        setField(term20328, term20328.getClass(), "isVerified", term20353);
        setField(term20328, term20328.getClass(), "favouriteAreas", term20355);
        setField(term20328, term20328.getClass(), "rides", term20365);
        setField(term20397, term20397.getClass(), "driverRatings", term20398);
        setIntField(term20397, term20397.getClass(), "ratingSum", -1893236300);
        setIntField(term20397, term20397.getClass(), "numberOfRatings", -1858909368);
        setField(term20328, term20328.getClass(), "rating", term20397);
        setField(term20405, term20405.getClass(), "source", null);
        setField(term20405, term20405.getClass(), "destination", null);
        setField(term20405, term20405.getClass(), "passenger", null);
        setField(term20405, term20405.getClass(), "acceptedOffer", null);
        setField(term20405, term20405.getClass(), "offers", null);
        setField(term20405, term20405.getClass(), "isAccepted", null);
        setField(term20405, term20405.getClass(), "events", null);
        setIntField(term20405, term20405.getClass(), "numberOfPassengers", 0);
        setField(term20328, term20328.getClass(), "currentRide", term20405);
        setIntField(term20328, term20328.getClass(), "numberOfPassengers", -280113263);
        setField(term20328, term20328.getClass(), "username", "DEugGJIaYt");
        setField(term20328, term20328.getClass(), "mobileNumber", "lzZIObOJmC");
        setField(term20328, term20328.getClass(), "email", "RFmGKwvSgz");
        setField(term20328, term20328.getClass(), "password", "EUEUhZglna");
        setField(term20328, term20328.getClass(), "userStatus", enum45);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.CustomerSubsystem.Driver");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCurrentRide", argTypes, term20328, args);
    }

};


