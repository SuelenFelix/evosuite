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

public class Passenger_isFirstRide_14724693708 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12932;

    public Passenger_isFirstRide_14724693708() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term12944 = new ArrayList();
        ((ArrayList) term12944).add((Object)null);
        ((ArrayList) term12944).add((Object)null);
        ((ArrayList) term12944).add((Object)null);
        ((ArrayList) term12944).add((Object)null);
        ((ArrayList) term12944).add((Object)null);
        Boolean term12947 = new Boolean(false);
        ArrayList term12949 = new ArrayList();
        ((ArrayList) term12949).add((Object)null);
        ((ArrayList) term12949).add((Object)null);
        ((ArrayList) term12949).add((Object)null);
        ((ArrayList) term12949).add((Object)null);
        ((ArrayList) term12949).add((Object)null);
        Object term12935 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        Object term12936 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        Object term12938 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        Object term12940 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger"));
        Object term12941 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Offer"));
        setField(term12936, term12936.getClass(), "location", null);
        setBooleanField(term12936, term12936.getClass(), "isDiscounted", false);
        setField(term12936, term12936.getClass(), "drivers", null);
        setField(term12935, term12935.getClass(), "source", term12936);
        setField(term12938, term12938.getClass(), "location", null);
        setBooleanField(term12938, term12938.getClass(), "isDiscounted", true);
        setField(term12938, term12938.getClass(), "drivers", null);
        setField(term12935, term12935.getClass(), "destination", term12938);
        setField(term12940, term12940.getClass(), "pastRides", null);
        setField(term12940, term12940.getClass(), "currentRide", null);
        setField(term12940, term12940.getClass(), "dateOfBirth", null);
        setField(term12940, term12940.getClass(), "username", null);
        setField(term12940, term12940.getClass(), "mobileNumber", null);
        setField(term12940, term12940.getClass(), "email", null);
        setField(term12940, term12940.getClass(), "password", null);
        setField(term12940, term12940.getClass(), "userStatus", null);
        setField(term12935, term12935.getClass(), "passenger", term12940);
        setDoubleField(term12941, term12941.getClass(), "price", 0.8490790645379176);
        setDoubleField(term12941, term12941.getClass(), "discountedPrice", 0.23129126164078717);
        setField(term12941, term12941.getClass(), "driver", null);
        setField(term12935, term12935.getClass(), "acceptedOffer", term12941);
        setField(term12935, term12935.getClass(), "offers", term12944);
        setField(term12935, term12935.getClass(), "isAccepted", term12947);
        setField(term12935, term12935.getClass(), "events", term12949);
        setIntField(term12935, term12935.getClass(), "numberOfPassengers", 330043745);
        Object term12953 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term12953, term12953.getClass(), "source", null);
        setField(term12953, term12953.getClass(), "destination", null);
        setField(term12953, term12953.getClass(), "passenger", null);
        setField(term12953, term12953.getClass(), "acceptedOffer", null);
        setField(term12953, term12953.getClass(), "offers", null);
        setField(term12953, term12953.getClass(), "isAccepted", null);
        setField(term12953, term12953.getClass(), "events", null);
        setIntField(term12953, term12953.getClass(), "numberOfPassengers", 0);
        Object term12955 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term12955, term12955.getClass(), "source", null);
        setField(term12955, term12955.getClass(), "destination", null);
        setField(term12955, term12955.getClass(), "passenger", null);
        setField(term12955, term12955.getClass(), "acceptedOffer", null);
        setField(term12955, term12955.getClass(), "offers", null);
        setField(term12955, term12955.getClass(), "isAccepted", null);
        setField(term12955, term12955.getClass(), "events", null);
        setIntField(term12955, term12955.getClass(), "numberOfPassengers", 0);
        Object term12957 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term12957, term12957.getClass(), "source", null);
        setField(term12957, term12957.getClass(), "destination", null);
        setField(term12957, term12957.getClass(), "passenger", null);
        setField(term12957, term12957.getClass(), "acceptedOffer", null);
        setField(term12957, term12957.getClass(), "offers", null);
        setField(term12957, term12957.getClass(), "isAccepted", null);
        setField(term12957, term12957.getClass(), "events", null);
        setIntField(term12957, term12957.getClass(), "numberOfPassengers", 0);
        Object term12959 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term12959, term12959.getClass(), "source", null);
        setField(term12959, term12959.getClass(), "destination", null);
        setField(term12959, term12959.getClass(), "passenger", null);
        setField(term12959, term12959.getClass(), "acceptedOffer", null);
        setField(term12959, term12959.getClass(), "offers", null);
        setField(term12959, term12959.getClass(), "isAccepted", null);
        setField(term12959, term12959.getClass(), "events", null);
        setIntField(term12959, term12959.getClass(), "numberOfPassengers", 0);
        Object term12961 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term12961, term12961.getClass(), "source", null);
        setField(term12961, term12961.getClass(), "destination", null);
        setField(term12961, term12961.getClass(), "passenger", null);
        setField(term12961, term12961.getClass(), "acceptedOffer", null);
        setField(term12961, term12961.getClass(), "offers", null);
        setField(term12961, term12961.getClass(), "isAccepted", null);
        setField(term12961, term12961.getClass(), "events", null);
        setIntField(term12961, term12961.getClass(), "numberOfPassengers", 0);
        Object term12963 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term12963, term12963.getClass(), "source", null);
        setField(term12963, term12963.getClass(), "destination", null);
        setField(term12963, term12963.getClass(), "passenger", null);
        setField(term12963, term12963.getClass(), "acceptedOffer", null);
        setField(term12963, term12963.getClass(), "offers", null);
        setField(term12963, term12963.getClass(), "isAccepted", null);
        setField(term12963, term12963.getClass(), "events", null);
        setIntField(term12963, term12963.getClass(), "numberOfPassengers", 0);
        ArrayList term12933 = new ArrayList();
        ((ArrayList) term12933).add(term12935);
        ((ArrayList) term12933).add(term12953);
        ((ArrayList) term12933).add(term12955);
        ((ArrayList) term12933).add(term12957);
        ((ArrayList) term12933).add(term12959);
        ((ArrayList) term12933).add(term12961);
        ((ArrayList) term12933).add(term12935);
        ((ArrayList) term12933).add(term12957);
        ((ArrayList) term12933).add(term12963);
        Class<? extends Object> term13091 = Class.forName((String) "com.API.OnDriver.CustomerSubsystem.UserStatus");
        Field term13090 = ((Class) term13091).getDeclaredField((String) "suspended");
        ((Field) term13090).setAccessible(true);
        Object enum27 = ((Field) term13090).get((Object) null);
        term12932 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger"));
        setField(term12932, term12932.getClass(), "pastRides", term12933);
        setField(term12932, term12932.getClass(), "currentRide", term12963);
        setField(term12932, term12932.getClass(), "dateOfBirth", "HdWLwfVsAM");
        setField(term12932, term12932.getClass(), "username", "SxeKEdHXSl");
        setField(term12932, term12932.getClass(), "mobileNumber", "BCAlJpNjIX");
        setField(term12932, term12932.getClass(), "email", "PKClfBAwUr");
        setField(term12932, term12932.getClass(), "password", "JqbKrmVEMy");
        setField(term12932, term12932.getClass(), "userStatus", enum27);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isFirstRide", argTypes, term12932, args);
    }

};


