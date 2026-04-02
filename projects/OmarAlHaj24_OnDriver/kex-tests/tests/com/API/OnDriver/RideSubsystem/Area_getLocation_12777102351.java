package com.API.OnDriver.RideSubsystem;

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
import static com.API.OnDriver.RideSubsystem.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.String;

public class Area_getLocation_12777102351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15428;

    public Area_getLocation_12777102351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term15447 = new Boolean(false);
        ArrayList term15449 = new ArrayList();
        ((ArrayList) term15449).add((Object)null);
        ((ArrayList) term15449).add((Object)null);
        ArrayList term15452 = new ArrayList();
        ((ArrayList) term15452).add((Object)null);
        ((ArrayList) term15452).add((Object)null);
        ((ArrayList) term15452).add((Object)null);
        ((ArrayList) term15452).add((Object)null);
        ((ArrayList) term15452).add((Object)null);
        ((ArrayList) term15452).add((Object)null);
        ((ArrayList) term15452).add((Object)null);
        ((ArrayList) term15452).add((Object)null);
        Class<? extends Object> term15526 = Class.forName((String) "com.API.OnDriver.CustomerSubsystem.UserStatus");
        Field term15525 = ((Class) term15526).getDeclaredField((String) "activated");
        ((Field) term15525).setAccessible(true);
        Object enum34 = ((Field) term15525).get((Object) null);
        Object term15444 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Driver"));
        Object term15455 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Rating"));
        Object term15458 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term15444, term15444.getClass(), "driverLicense", "");
        setField(term15444, term15444.getClass(), "nationalID", "");
        setField(term15444, term15444.getClass(), "isVerified", term15447);
        setField(term15444, term15444.getClass(), "favouriteAreas", term15449);
        setField(term15444, term15444.getClass(), "rides", term15452);
        setField(term15455, term15455.getClass(), "driverRatings", null);
        setIntField(term15455, term15455.getClass(), "ratingSum", 1895143076);
        setIntField(term15455, term15455.getClass(), "numberOfRatings", 1981860404);
        setField(term15444, term15444.getClass(), "rating", term15455);
        setField(term15458, term15458.getClass(), "source", null);
        setField(term15458, term15458.getClass(), "destination", null);
        setField(term15458, term15458.getClass(), "passenger", null);
        setField(term15458, term15458.getClass(), "acceptedOffer", null);
        setField(term15458, term15458.getClass(), "offers", null);
        setField(term15458, term15458.getClass(), "isAccepted", null);
        setField(term15458, term15458.getClass(), "events", null);
        setIntField(term15458, term15458.getClass(), "numberOfPassengers", 0);
        setField(term15444, term15444.getClass(), "currentRide", term15458);
        setIntField(term15444, term15444.getClass(), "numberOfPassengers", 732174235);
        setField(term15444, term15444.getClass(), "username", "");
        setField(term15444, term15444.getClass(), "mobileNumber", "");
        setField(term15444, term15444.getClass(), "email", "");
        setField(term15444, term15444.getClass(), "password", "");
        setField(term15444, term15444.getClass(), "userStatus", enum34);
        Boolean term15470 = new Boolean(true);
        ArrayList term15472 = new ArrayList();
        ((ArrayList) term15472).add((Object)null);
        ArrayList term15475 = new ArrayList();
        ((ArrayList) term15475).add((Object)null);
        ((ArrayList) term15475).add((Object)null);
        ((ArrayList) term15475).add((Object)null);
        ((ArrayList) term15475).add((Object)null);
        Class<? extends Object> term15785 = Class.forName((String) "com.API.OnDriver.CustomerSubsystem.UserStatus");
        Field term15784 = ((Class) term15785).getDeclaredField((String) "admin");
        ((Field) term15784).setAccessible(true);
        Object enum35 = ((Field) term15784).get((Object) null);
        Object term15467 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Driver"));
        Object term15478 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Rating"));
        Object term15481 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term15467, term15467.getClass(), "driverLicense", "");
        setField(term15467, term15467.getClass(), "nationalID", "");
        setField(term15467, term15467.getClass(), "isVerified", term15470);
        setField(term15467, term15467.getClass(), "favouriteAreas", term15472);
        setField(term15467, term15467.getClass(), "rides", term15475);
        setField(term15478, term15478.getClass(), "driverRatings", null);
        setIntField(term15478, term15478.getClass(), "ratingSum", 794352120);
        setIntField(term15478, term15478.getClass(), "numberOfRatings", 340719678);
        setField(term15467, term15467.getClass(), "rating", term15478);
        setField(term15481, term15481.getClass(), "source", null);
        setField(term15481, term15481.getClass(), "destination", null);
        setField(term15481, term15481.getClass(), "passenger", null);
        setField(term15481, term15481.getClass(), "acceptedOffer", null);
        setField(term15481, term15481.getClass(), "offers", null);
        setField(term15481, term15481.getClass(), "isAccepted", null);
        setField(term15481, term15481.getClass(), "events", null);
        setIntField(term15481, term15481.getClass(), "numberOfPassengers", 0);
        setField(term15467, term15467.getClass(), "currentRide", term15481);
        setIntField(term15467, term15467.getClass(), "numberOfPassengers", 299791142);
        setField(term15467, term15467.getClass(), "username", "");
        setField(term15467, term15467.getClass(), "mobileNumber", "");
        setField(term15467, term15467.getClass(), "email", "");
        setField(term15467, term15467.getClass(), "password", "");
        setField(term15467, term15467.getClass(), "userStatus", enum35);
        Boolean term15493 = new Boolean(false);
        ArrayList term15495 = new ArrayList();
        ((ArrayList) term15495).add((Object)null);
        ((ArrayList) term15495).add((Object)null);
        ArrayList term15498 = new ArrayList();
        ((ArrayList) term15498).add((Object)null);
        ((ArrayList) term15498).add((Object)null);
        ((ArrayList) term15498).add((Object)null);
        ((ArrayList) term15498).add((Object)null);
        ((ArrayList) term15498).add((Object)null);
        ((ArrayList) term15498).add((Object)null);
        Class<? extends Object> term16032 = Class.forName((String) "com.API.OnDriver.CustomerSubsystem.UserStatus");
        Field term16031 = ((Class) term16032).getDeclaredField((String) "activated");
        ((Field) term16031).setAccessible(true);
        Object enum36 = ((Field) term16031).get((Object) null);
        Object term15490 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Driver"));
        Object term15501 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Rating"));
        Object term15504 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term15490, term15490.getClass(), "driverLicense", "");
        setField(term15490, term15490.getClass(), "nationalID", "");
        setField(term15490, term15490.getClass(), "isVerified", term15493);
        setField(term15490, term15490.getClass(), "favouriteAreas", term15495);
        setField(term15490, term15490.getClass(), "rides", term15498);
        setField(term15501, term15501.getClass(), "driverRatings", null);
        setIntField(term15501, term15501.getClass(), "ratingSum", 0);
        setIntField(term15501, term15501.getClass(), "numberOfRatings", 0);
        setField(term15490, term15490.getClass(), "rating", term15501);
        setField(term15504, term15504.getClass(), "source", null);
        setField(term15504, term15504.getClass(), "destination", null);
        setField(term15504, term15504.getClass(), "passenger", null);
        setField(term15504, term15504.getClass(), "acceptedOffer", null);
        setField(term15504, term15504.getClass(), "offers", null);
        setField(term15504, term15504.getClass(), "isAccepted", null);
        setField(term15504, term15504.getClass(), "events", null);
        setIntField(term15504, term15504.getClass(), "numberOfPassengers", 0);
        setField(term15490, term15490.getClass(), "currentRide", term15504);
        setIntField(term15490, term15490.getClass(), "numberOfPassengers", 2634669);
        setField(term15490, term15490.getClass(), "username", "");
        setField(term15490, term15490.getClass(), "mobileNumber", "");
        setField(term15490, term15490.getClass(), "email", "");
        setField(term15490, term15490.getClass(), "password", "");
        setField(term15490, term15490.getClass(), "userStatus", enum36);
        ArrayList term15442 = new ArrayList();
        ((ArrayList) term15442).add(term15444);
        ((ArrayList) term15442).add(term15467);
        ((ArrayList) term15442).add(term15490);
        term15428 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        setField(term15428, term15428.getClass(), "location", "JqbKrmVEMy");
        setBooleanField(term15428, term15428.getClass(), "isDiscounted", true);
        setField(term15428, term15428.getClass(), "drivers", term15442);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.RideSubsystem.Area");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLocation", argTypes, term15428, args);
    }

};


