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

public class Driver_viewRating_172562910111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16900;

    public Driver_viewRating_172562910111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term16925 = new Boolean(true);
        ArrayList term16932 = new ArrayList();
        ((ArrayList) term16932).add((Object)null);
        ((ArrayList) term16932).add((Object)null);
        Object term16929 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        setField(term16929, term16929.getClass(), "location", "");
        setBooleanField(term16929, term16929.getClass(), "isDiscounted", true);
        setField(term16929, term16929.getClass(), "drivers", term16932);
        Object term16935 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        setField(term16935, term16935.getClass(), "location", null);
        setBooleanField(term16935, term16935.getClass(), "isDiscounted", false);
        setField(term16935, term16935.getClass(), "drivers", null);
        Object term16937 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        setField(term16937, term16937.getClass(), "location", null);
        setBooleanField(term16937, term16937.getClass(), "isDiscounted", false);
        setField(term16937, term16937.getClass(), "drivers", null);
        ArrayList term16927 = new ArrayList();
        ((ArrayList) term16927).add(term16929);
        ((ArrayList) term16927).add(term16935);
        ((ArrayList) term16927).add(term16937);
        Object term16943 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term16943, term16943.getClass(), "source", null);
        setField(term16943, term16943.getClass(), "destination", null);
        setField(term16943, term16943.getClass(), "passenger", null);
        setField(term16943, term16943.getClass(), "acceptedOffer", null);
        setField(term16943, term16943.getClass(), "offers", null);
        setField(term16943, term16943.getClass(), "isAccepted", null);
        setField(term16943, term16943.getClass(), "events", null);
        setIntField(term16943, term16943.getClass(), "numberOfPassengers", 0);
        Object term16945 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term16945, term16945.getClass(), "source", null);
        setField(term16945, term16945.getClass(), "destination", null);
        setField(term16945, term16945.getClass(), "passenger", null);
        setField(term16945, term16945.getClass(), "acceptedOffer", null);
        setField(term16945, term16945.getClass(), "offers", null);
        setField(term16945, term16945.getClass(), "isAccepted", null);
        setField(term16945, term16945.getClass(), "events", null);
        setIntField(term16945, term16945.getClass(), "numberOfPassengers", 0);
        Object term16947 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term16947, term16947.getClass(), "source", null);
        setField(term16947, term16947.getClass(), "destination", null);
        setField(term16947, term16947.getClass(), "passenger", null);
        setField(term16947, term16947.getClass(), "acceptedOffer", null);
        setField(term16947, term16947.getClass(), "offers", null);
        setField(term16947, term16947.getClass(), "isAccepted", null);
        setField(term16947, term16947.getClass(), "events", null);
        setIntField(term16947, term16947.getClass(), "numberOfPassengers", 0);
        Object term16949 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term16949, term16949.getClass(), "source", null);
        setField(term16949, term16949.getClass(), "destination", null);
        setField(term16949, term16949.getClass(), "passenger", null);
        setField(term16949, term16949.getClass(), "acceptedOffer", null);
        setField(term16949, term16949.getClass(), "offers", null);
        setField(term16949, term16949.getClass(), "isAccepted", null);
        setField(term16949, term16949.getClass(), "events", null);
        setIntField(term16949, term16949.getClass(), "numberOfPassengers", 0);
        ArrayList term16941 = new ArrayList();
        ((ArrayList) term16941).add(term16943);
        ((ArrayList) term16941).add(term16945);
        ((ArrayList) term16941).add(term16947);
        ((ArrayList) term16941).add(term16945);
        ((ArrayList) term16941).add(term16949);
        ((ArrayList) term16941).add(term16945);
        HashMap term16954 = new HashMap();
        Class<? extends Object> term17084 = Class.forName((String) "com.API.OnDriver.CustomerSubsystem.UserStatus");
        Field term17083 = ((Class) term17084).getDeclaredField((String) "suspended");
        ((Field) term17083).setAccessible(true);
        Object enum38 = ((Field) term17083).get((Object) null);
        term16900 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Driver"));
        Object term16953 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Rating"));
        setField(term16900, term16900.getClass(), "driverLicense", "uYnmxkwLfB");
        setField(term16900, term16900.getClass(), "nationalID", "RVZTQxYOUO");
        setField(term16900, term16900.getClass(), "isVerified", term16925);
        setField(term16900, term16900.getClass(), "favouriteAreas", term16927);
        setField(term16900, term16900.getClass(), "rides", term16941);
        setField(term16953, term16953.getClass(), "driverRatings", term16954);
        setIntField(term16953, term16953.getClass(), "ratingSum", -1999787419);
        setIntField(term16953, term16953.getClass(), "numberOfRatings", -1224443634);
        setField(term16900, term16900.getClass(), "rating", term16953);
        setField(term16900, term16900.getClass(), "currentRide", term16947);
        setIntField(term16900, term16900.getClass(), "numberOfPassengers", 1048451946);
        setField(term16900, term16900.getClass(), "username", "KJkWSFFnmR");
        setField(term16900, term16900.getClass(), "mobileNumber", "FBYRIDZvmW");
        setField(term16900, term16900.getClass(), "email", "IyjLfrDZrV");
        setField(term16900, term16900.getClass(), "password", "BRMTHqqoRg");
        setField(term16900, term16900.getClass(), "userStatus", enum38);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.CustomerSubsystem.Driver");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "viewRating", argTypes, term16900, args);
    }

};


