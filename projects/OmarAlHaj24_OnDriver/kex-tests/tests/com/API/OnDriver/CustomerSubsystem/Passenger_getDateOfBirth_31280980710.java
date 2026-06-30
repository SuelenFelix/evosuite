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

public class Passenger_getDateOfBirth_31280980710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14181;

    public Passenger_getDateOfBirth_31280980710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term14193 = new ArrayList();
        ((ArrayList) term14193).add((Object)null);
        ((ArrayList) term14193).add((Object)null);
        ((ArrayList) term14193).add((Object)null);
        ((ArrayList) term14193).add((Object)null);
        ((ArrayList) term14193).add((Object)null);
        ((ArrayList) term14193).add((Object)null);
        ((ArrayList) term14193).add((Object)null);
        ((ArrayList) term14193).add((Object)null);
        ((ArrayList) term14193).add((Object)null);
        Boolean term14196 = new Boolean(false);
        ArrayList term14198 = new ArrayList();
        ((ArrayList) term14198).add((Object)null);
        Object term14184 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        Object term14185 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        Object term14187 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        Object term14189 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger"));
        Object term14190 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Offer"));
        setField(term14185, term14185.getClass(), "location", null);
        setBooleanField(term14185, term14185.getClass(), "isDiscounted", true);
        setField(term14185, term14185.getClass(), "drivers", null);
        setField(term14184, term14184.getClass(), "source", term14185);
        setField(term14187, term14187.getClass(), "location", null);
        setBooleanField(term14187, term14187.getClass(), "isDiscounted", false);
        setField(term14187, term14187.getClass(), "drivers", null);
        setField(term14184, term14184.getClass(), "destination", term14187);
        setField(term14189, term14189.getClass(), "pastRides", null);
        setField(term14189, term14189.getClass(), "currentRide", null);
        setField(term14189, term14189.getClass(), "dateOfBirth", null);
        setField(term14189, term14189.getClass(), "username", null);
        setField(term14189, term14189.getClass(), "mobileNumber", null);
        setField(term14189, term14189.getClass(), "email", null);
        setField(term14189, term14189.getClass(), "password", null);
        setField(term14189, term14189.getClass(), "userStatus", null);
        setField(term14184, term14184.getClass(), "passenger", term14189);
        setDoubleField(term14190, term14190.getClass(), "price", 0.2843894095932772);
        setDoubleField(term14190, term14190.getClass(), "discountedPrice", 0.2382345237223229);
        setField(term14190, term14190.getClass(), "driver", null);
        setField(term14184, term14184.getClass(), "acceptedOffer", term14190);
        setField(term14184, term14184.getClass(), "offers", term14193);
        setField(term14184, term14184.getClass(), "isAccepted", term14196);
        setField(term14184, term14184.getClass(), "events", term14198);
        setIntField(term14184, term14184.getClass(), "numberOfPassengers", 1136208236);
        Object term14202 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term14202, term14202.getClass(), "source", null);
        setField(term14202, term14202.getClass(), "destination", null);
        setField(term14202, term14202.getClass(), "passenger", null);
        setField(term14202, term14202.getClass(), "acceptedOffer", null);
        setField(term14202, term14202.getClass(), "offers", null);
        setField(term14202, term14202.getClass(), "isAccepted", null);
        setField(term14202, term14202.getClass(), "events", null);
        setIntField(term14202, term14202.getClass(), "numberOfPassengers", 0);
        Object term14204 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term14204, term14204.getClass(), "source", null);
        setField(term14204, term14204.getClass(), "destination", null);
        setField(term14204, term14204.getClass(), "passenger", null);
        setField(term14204, term14204.getClass(), "acceptedOffer", null);
        setField(term14204, term14204.getClass(), "offers", null);
        setField(term14204, term14204.getClass(), "isAccepted", null);
        setField(term14204, term14204.getClass(), "events", null);
        setIntField(term14204, term14204.getClass(), "numberOfPassengers", 0);
        ArrayList term14182 = new ArrayList();
        ((ArrayList) term14182).add(term14184);
        ((ArrayList) term14182).add(term14202);
        ((ArrayList) term14182).add(term14204);
        Class<? extends Object> term14334 = Class.forName((String) "com.API.OnDriver.CustomerSubsystem.UserStatus");
        Field term14333 = ((Class) term14334).getDeclaredField((String) "suspended");
        ((Field) term14333).setAccessible(true);
        Object enum30 = ((Field) term14333).get((Object) null);
        term14181 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger"));
        Object term14208 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term14181, term14181.getClass(), "pastRides", term14182);
        setField(term14208, term14208.getClass(), "source", null);
        setField(term14208, term14208.getClass(), "destination", null);
        setField(term14208, term14208.getClass(), "passenger", null);
        setField(term14208, term14208.getClass(), "acceptedOffer", null);
        setField(term14208, term14208.getClass(), "offers", null);
        setField(term14208, term14208.getClass(), "isAccepted", null);
        setField(term14208, term14208.getClass(), "events", null);
        setIntField(term14208, term14208.getClass(), "numberOfPassengers", 0);
        setField(term14181, term14181.getClass(), "currentRide", term14208);
        setField(term14181, term14181.getClass(), "dateOfBirth", "spOehuHwSl");
        setField(term14181, term14181.getClass(), "username", "cyobgydTWP");
        setField(term14181, term14181.getClass(), "mobileNumber", "moHYQFfLnp");
        setField(term14181, term14181.getClass(), "email", "BrPqlvIbEQ");
        setField(term14181, term14181.getClass(), "password", "JDTrhGRsDT");
        setField(term14181, term14181.getClass(), "userStatus", enum30);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDateOfBirth", argTypes, term14181, args);
    }

};


