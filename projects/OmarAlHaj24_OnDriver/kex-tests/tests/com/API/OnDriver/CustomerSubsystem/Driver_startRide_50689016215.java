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

public class Driver_startRide_50689016215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45394;

    public Driver_startRide_50689016215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term45419 = new Boolean(true);
        ArrayList term45426 = new ArrayList();
        Object term45423 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        setField(term45423, term45423.getClass(), "location", "");
        setBooleanField(term45423, term45423.getClass(), "isDiscounted", true);
        setField(term45423, term45423.getClass(), "drivers", term45426);
        ArrayList term45421 = new ArrayList();
        ((ArrayList) term45421).add(term45423);
        ArrayList term45442 = new ArrayList();
        ((ArrayList) term45442).add((Object)null);
        Boolean term45445 = new Boolean(true);
        ArrayList term45447 = new ArrayList();
        ((ArrayList) term45447).add((Object)null);
        ((ArrayList) term45447).add((Object)null);
        ((ArrayList) term45447).add((Object)null);
        Object term45433 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        Object term45434 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        Object term45436 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        Object term45438 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger"));
        Object term45439 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Offer"));
        setField(term45434, term45434.getClass(), "location", null);
        setBooleanField(term45434, term45434.getClass(), "isDiscounted", true);
        setField(term45434, term45434.getClass(), "drivers", null);
        setField(term45433, term45433.getClass(), "source", term45434);
        setField(term45436, term45436.getClass(), "location", null);
        setBooleanField(term45436, term45436.getClass(), "isDiscounted", false);
        setField(term45436, term45436.getClass(), "drivers", null);
        setField(term45433, term45433.getClass(), "destination", term45436);
        setField(term45438, term45438.getClass(), "pastRides", null);
        setField(term45438, term45438.getClass(), "currentRide", null);
        setField(term45438, term45438.getClass(), "dateOfBirth", null);
        setField(term45438, term45438.getClass(), "username", null);
        setField(term45438, term45438.getClass(), "mobileNumber", null);
        setField(term45438, term45438.getClass(), "email", null);
        setField(term45438, term45438.getClass(), "password", null);
        setField(term45438, term45438.getClass(), "userStatus", null);
        setField(term45433, term45433.getClass(), "passenger", term45438);
        setDoubleField(term45439, term45439.getClass(), "price", 0.8582456540284578);
        setDoubleField(term45439, term45439.getClass(), "discountedPrice", 0.061434557058998585);
        setField(term45439, term45439.getClass(), "driver", null);
        setField(term45433, term45433.getClass(), "acceptedOffer", term45439);
        setField(term45433, term45433.getClass(), "offers", term45442);
        setField(term45433, term45433.getClass(), "isAccepted", term45445);
        setField(term45433, term45433.getClass(), "events", term45447);
        setIntField(term45433, term45433.getClass(), "numberOfPassengers", 329424176);
        Object term45451 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term45451, term45451.getClass(), "source", null);
        setField(term45451, term45451.getClass(), "destination", null);
        setField(term45451, term45451.getClass(), "passenger", null);
        setField(term45451, term45451.getClass(), "acceptedOffer", null);
        setField(term45451, term45451.getClass(), "offers", null);
        setField(term45451, term45451.getClass(), "isAccepted", null);
        setField(term45451, term45451.getClass(), "events", null);
        setIntField(term45451, term45451.getClass(), "numberOfPassengers", 0);
        Object term45453 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term45453, term45453.getClass(), "source", null);
        setField(term45453, term45453.getClass(), "destination", null);
        setField(term45453, term45453.getClass(), "passenger", null);
        setField(term45453, term45453.getClass(), "acceptedOffer", null);
        setField(term45453, term45453.getClass(), "offers", null);
        setField(term45453, term45453.getClass(), "isAccepted", null);
        setField(term45453, term45453.getClass(), "events", null);
        setIntField(term45453, term45453.getClass(), "numberOfPassengers", 0);
        Object term45455 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term45455, term45455.getClass(), "source", null);
        setField(term45455, term45455.getClass(), "destination", null);
        setField(term45455, term45455.getClass(), "passenger", null);
        setField(term45455, term45455.getClass(), "acceptedOffer", null);
        setField(term45455, term45455.getClass(), "offers", null);
        setField(term45455, term45455.getClass(), "isAccepted", null);
        setField(term45455, term45455.getClass(), "events", null);
        setIntField(term45455, term45455.getClass(), "numberOfPassengers", 0);
        Object term45457 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term45457, term45457.getClass(), "source", null);
        setField(term45457, term45457.getClass(), "destination", null);
        setField(term45457, term45457.getClass(), "passenger", null);
        setField(term45457, term45457.getClass(), "acceptedOffer", null);
        setField(term45457, term45457.getClass(), "offers", null);
        setField(term45457, term45457.getClass(), "isAccepted", null);
        setField(term45457, term45457.getClass(), "events", null);
        setIntField(term45457, term45457.getClass(), "numberOfPassengers", 0);
        Object term45459 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term45459, term45459.getClass(), "source", null);
        setField(term45459, term45459.getClass(), "destination", null);
        setField(term45459, term45459.getClass(), "passenger", null);
        setField(term45459, term45459.getClass(), "acceptedOffer", null);
        setField(term45459, term45459.getClass(), "offers", null);
        setField(term45459, term45459.getClass(), "isAccepted", null);
        setField(term45459, term45459.getClass(), "events", null);
        setIntField(term45459, term45459.getClass(), "numberOfPassengers", 0);
        ArrayList term45431 = new ArrayList();
        ((ArrayList) term45431).add(term45433);
        ((ArrayList) term45431).add(term45451);
        ((ArrayList) term45431).add(term45453);
        ((ArrayList) term45431).add(term45451);
        ((ArrayList) term45431).add(term45455);
        ((ArrayList) term45431).add(term45451);
        ((ArrayList) term45431).add(term45453);
        ((ArrayList) term45431).add(term45457);
        ((ArrayList) term45431).add(term45459);
        HashMap term45464 = new HashMap();
        Class<? extends Object> term45592 = Class.forName((String) "com.API.OnDriver.CustomerSubsystem.UserStatus");
        Field term45591 = ((Class) term45592).getDeclaredField((String) "admin");
        ((Field) term45591).setAccessible(true);
        Object enum105 = ((Field) term45591).get((Object) null);
        term45394 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Driver"));
        Object term45463 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Rating"));
        Object term45471 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term45394, term45394.getClass(), "driverLicense", "PyaMftIAzC");
        setField(term45394, term45394.getClass(), "nationalID", "QiSmNdQUzl");
        setField(term45394, term45394.getClass(), "isVerified", term45419);
        setField(term45394, term45394.getClass(), "favouriteAreas", term45421);
        setField(term45394, term45394.getClass(), "rides", term45431);
        setField(term45463, term45463.getClass(), "driverRatings", term45464);
        setIntField(term45463, term45463.getClass(), "ratingSum", -1897199214);
        setIntField(term45463, term45463.getClass(), "numberOfRatings", -1016478729);
        setField(term45394, term45394.getClass(), "rating", term45463);
        setField(term45471, term45471.getClass(), "source", null);
        setField(term45471, term45471.getClass(), "destination", null);
        setField(term45471, term45471.getClass(), "passenger", null);
        setField(term45471, term45471.getClass(), "acceptedOffer", null);
        setField(term45471, term45471.getClass(), "offers", null);
        setField(term45471, term45471.getClass(), "isAccepted", null);
        setField(term45471, term45471.getClass(), "events", null);
        setIntField(term45471, term45471.getClass(), "numberOfPassengers", 0);
        setField(term45394, term45394.getClass(), "currentRide", term45471);
        setIntField(term45394, term45394.getClass(), "numberOfPassengers", -206889003);
        setField(term45394, term45394.getClass(), "username", "UjtHbgdpKi");
        setField(term45394, term45394.getClass(), "mobileNumber", "QZUqVBZaTe");
        setField(term45394, term45394.getClass(), "email", "ulsJyRLpjn");
        setField(term45394, term45394.getClass(), "password", "mPvRCwfDas");
        setField(term45394, term45394.getClass(), "userStatus", enum105);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.CustomerSubsystem.Driver");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "startRide", argTypes, term45394, args);
    }

};


