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

public class Driver_getCurrentRide_210093382019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47098;

    public Driver_getCurrentRide_210093382019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term47123 = new Boolean(true);
        ArrayList term47130 = new ArrayList();
        ((ArrayList) term47130).add((Object)null);
        ((ArrayList) term47130).add((Object)null);
        ((ArrayList) term47130).add((Object)null);
        ((ArrayList) term47130).add((Object)null);
        ((ArrayList) term47130).add((Object)null);
        ((ArrayList) term47130).add((Object)null);
        ((ArrayList) term47130).add((Object)null);
        ((ArrayList) term47130).add((Object)null);
        Object term47127 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        setField(term47127, term47127.getClass(), "location", "");
        setBooleanField(term47127, term47127.getClass(), "isDiscounted", false);
        setField(term47127, term47127.getClass(), "drivers", term47130);
        Object term47133 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        setField(term47133, term47133.getClass(), "location", null);
        setBooleanField(term47133, term47133.getClass(), "isDiscounted", false);
        setField(term47133, term47133.getClass(), "drivers", null);
        ArrayList term47138 = new ArrayList();
        ((ArrayList) term47138).add((Object)null);
        ((ArrayList) term47138).add((Object)null);
        ((ArrayList) term47138).add((Object)null);
        ((ArrayList) term47138).add((Object)null);
        Object term47135 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        setField(term47135, term47135.getClass(), "location", "");
        setBooleanField(term47135, term47135.getClass(), "isDiscounted", false);
        setField(term47135, term47135.getClass(), "drivers", term47138);
        Object term47141 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        setField(term47141, term47141.getClass(), "location", null);
        setBooleanField(term47141, term47141.getClass(), "isDiscounted", false);
        setField(term47141, term47141.getClass(), "drivers", null);
        Object term47143 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        setField(term47143, term47143.getClass(), "location", null);
        setBooleanField(term47143, term47143.getClass(), "isDiscounted", false);
        setField(term47143, term47143.getClass(), "drivers", null);
        ArrayList term47148 = new ArrayList();
        ((ArrayList) term47148).add((Object)null);
        ((ArrayList) term47148).add((Object)null);
        ((ArrayList) term47148).add((Object)null);
        Object term47145 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        setField(term47145, term47145.getClass(), "location", "");
        setBooleanField(term47145, term47145.getClass(), "isDiscounted", true);
        setField(term47145, term47145.getClass(), "drivers", term47148);
        ArrayList term47125 = new ArrayList();
        ((ArrayList) term47125).add(term47127);
        ((ArrayList) term47125).add(term47133);
        ((ArrayList) term47125).add(term47135);
        ((ArrayList) term47125).add(term47135);
        ((ArrayList) term47125).add(term47141);
        ((ArrayList) term47125).add(term47143);
        ((ArrayList) term47125).add(term47145);
        ((ArrayList) term47125).add(term47143);
        ArrayList term47160 = new ArrayList();
        ((ArrayList) term47160).add((Object)null);
        ((ArrayList) term47160).add((Object)null);
        ((ArrayList) term47160).add((Object)null);
        Boolean term47163 = new Boolean(false);
        ArrayList term47165 = new ArrayList();
        ((ArrayList) term47165).add((Object)null);
        ((ArrayList) term47165).add((Object)null);
        ((ArrayList) term47165).add((Object)null);
        Object term47155 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        Object term47156 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger"));
        Object term47157 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Offer"));
        setField(term47155, term47155.getClass(), "source", term47133);
        setField(term47155, term47155.getClass(), "destination", term47143);
        setField(term47156, term47156.getClass(), "pastRides", null);
        setField(term47156, term47156.getClass(), "currentRide", null);
        setField(term47156, term47156.getClass(), "dateOfBirth", null);
        setField(term47156, term47156.getClass(), "username", null);
        setField(term47156, term47156.getClass(), "mobileNumber", null);
        setField(term47156, term47156.getClass(), "email", null);
        setField(term47156, term47156.getClass(), "password", null);
        setField(term47156, term47156.getClass(), "userStatus", null);
        setField(term47155, term47155.getClass(), "passenger", term47156);
        setDoubleField(term47157, term47157.getClass(), "price", 0.0);
        setDoubleField(term47157, term47157.getClass(), "discountedPrice", 0.0);
        setField(term47157, term47157.getClass(), "driver", null);
        setField(term47155, term47155.getClass(), "acceptedOffer", term47157);
        setField(term47155, term47155.getClass(), "offers", term47160);
        setField(term47155, term47155.getClass(), "isAccepted", term47163);
        setField(term47155, term47155.getClass(), "events", term47165);
        setIntField(term47155, term47155.getClass(), "numberOfPassengers", 301438568);
        ArrayList term47173 = new ArrayList();
        ((ArrayList) term47173).add((Object)null);
        Boolean term47176 = new Boolean(false);
        ArrayList term47178 = new ArrayList();
        ((ArrayList) term47178).add((Object)null);
        ((ArrayList) term47178).add((Object)null);
        ((ArrayList) term47178).add((Object)null);
        ((ArrayList) term47178).add((Object)null);
        ((ArrayList) term47178).add((Object)null);
        ((ArrayList) term47178).add((Object)null);
        ((ArrayList) term47178).add((Object)null);
        ((ArrayList) term47178).add((Object)null);
        ((ArrayList) term47178).add((Object)null);
        Object term47169 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        Object term47170 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        Object term47172 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger"));
        setField(term47169, term47169.getClass(), "source", term47141);
        setField(term47170, term47170.getClass(), "location", null);
        setBooleanField(term47170, term47170.getClass(), "isDiscounted", false);
        setField(term47170, term47170.getClass(), "drivers", null);
        setField(term47169, term47169.getClass(), "destination", term47170);
        setField(term47172, term47172.getClass(), "pastRides", null);
        setField(term47172, term47172.getClass(), "currentRide", null);
        setField(term47172, term47172.getClass(), "dateOfBirth", null);
        setField(term47172, term47172.getClass(), "username", null);
        setField(term47172, term47172.getClass(), "mobileNumber", null);
        setField(term47172, term47172.getClass(), "email", null);
        setField(term47172, term47172.getClass(), "password", null);
        setField(term47172, term47172.getClass(), "userStatus", null);
        setField(term47169, term47169.getClass(), "passenger", term47172);
        setField(term47169, term47169.getClass(), "acceptedOffer", term47157);
        setField(term47169, term47169.getClass(), "offers", term47173);
        setField(term47169, term47169.getClass(), "isAccepted", term47176);
        setField(term47169, term47169.getClass(), "events", term47178);
        setIntField(term47169, term47169.getClass(), "numberOfPassengers", 315910438);
        ArrayList term47153 = new ArrayList();
        ((ArrayList) term47153).add(term47155);
        ((ArrayList) term47153).add(term47169);
        HashMap term47185 = new HashMap();
        Class<? extends Object> term47311 = Class.forName((String) "com.API.OnDriver.CustomerSubsystem.UserStatus");
        Field term47310 = ((Class) term47311).getDeclaredField((String) "admin");
        ((Field) term47310).setAccessible(true);
        Object enum108 = ((Field) term47310).get((Object) null);
        term47098 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Driver"));
        Object term47184 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Rating"));
        setField(term47098, term47098.getClass(), "driverLicense", "KMDtTdvTCJ");
        setField(term47098, term47098.getClass(), "nationalID", "EGFHrFOTWy");
        setField(term47098, term47098.getClass(), "isVerified", term47123);
        setField(term47098, term47098.getClass(), "favouriteAreas", term47125);
        setField(term47098, term47098.getClass(), "rides", term47153);
        setField(term47184, term47184.getClass(), "driverRatings", term47185);
        setIntField(term47184, term47184.getClass(), "ratingSum", -939132796);
        setIntField(term47184, term47184.getClass(), "numberOfRatings", 159279866);
        setField(term47098, term47098.getClass(), "rating", term47184);
        setField(term47098, term47098.getClass(), "currentRide", term47155);
        setIntField(term47098, term47098.getClass(), "numberOfPassengers", 138122227);
        setField(term47098, term47098.getClass(), "username", "HGacYAJJio");
        setField(term47098, term47098.getClass(), "mobileNumber", "iUabaxtEPQ");
        setField(term47098, term47098.getClass(), "email", "BeULrSYHKm");
        setField(term47098, term47098.getClass(), "password", "nseWRZaaYe");
        setField(term47098, term47098.getClass(), "userStatus", enum108);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.CustomerSubsystem.Driver");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCurrentRide", argTypes, term47098, args);
    }

};


