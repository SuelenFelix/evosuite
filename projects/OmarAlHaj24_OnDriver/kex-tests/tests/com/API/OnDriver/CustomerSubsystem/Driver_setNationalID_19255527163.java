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

public class Driver_setNationalID_19255527163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12982;

    public Driver_setNationalID_19255527163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term13007 = new Boolean(true);
        ArrayList term13014 = new ArrayList();
        ((ArrayList) term13014).add((Object)null);
        ((ArrayList) term13014).add((Object)null);
        ((ArrayList) term13014).add((Object)null);
        ((ArrayList) term13014).add((Object)null);
        ((ArrayList) term13014).add((Object)null);
        ((ArrayList) term13014).add((Object)null);
        ((ArrayList) term13014).add((Object)null);
        Object term13011 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        setField(term13011, term13011.getClass(), "location", "");
        setBooleanField(term13011, term13011.getClass(), "isDiscounted", false);
        setField(term13011, term13011.getClass(), "drivers", term13014);
        ArrayList term13009 = new ArrayList();
        ((ArrayList) term13009).add(term13011);
        Object term13021 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term13021, term13021.getClass(), "source", null);
        setField(term13021, term13021.getClass(), "destination", null);
        setField(term13021, term13021.getClass(), "passenger", null);
        setField(term13021, term13021.getClass(), "acceptedOffer", null);
        setField(term13021, term13021.getClass(), "offers", null);
        setField(term13021, term13021.getClass(), "isAccepted", null);
        setField(term13021, term13021.getClass(), "events", null);
        setIntField(term13021, term13021.getClass(), "numberOfPassengers", 0);
        ArrayList term13032 = new ArrayList();
        ((ArrayList) term13032).add((Object)null);
        ((ArrayList) term13032).add((Object)null);
        ((ArrayList) term13032).add((Object)null);
        ((ArrayList) term13032).add((Object)null);
        ((ArrayList) term13032).add((Object)null);
        ((ArrayList) term13032).add((Object)null);
        ((ArrayList) term13032).add((Object)null);
        ((ArrayList) term13032).add((Object)null);
        Boolean term13035 = new Boolean(true);
        ArrayList term13037 = new ArrayList();
        ((ArrayList) term13037).add((Object)null);
        ((ArrayList) term13037).add((Object)null);
        ((ArrayList) term13037).add((Object)null);
        ((ArrayList) term13037).add((Object)null);
        Object term13023 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        Object term13024 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        Object term13026 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        Object term13028 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger"));
        Object term13029 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Offer"));
        setField(term13024, term13024.getClass(), "location", null);
        setBooleanField(term13024, term13024.getClass(), "isDiscounted", true);
        setField(term13024, term13024.getClass(), "drivers", null);
        setField(term13023, term13023.getClass(), "source", term13024);
        setField(term13026, term13026.getClass(), "location", null);
        setBooleanField(term13026, term13026.getClass(), "isDiscounted", false);
        setField(term13026, term13026.getClass(), "drivers", null);
        setField(term13023, term13023.getClass(), "destination", term13026);
        setField(term13028, term13028.getClass(), "pastRides", null);
        setField(term13028, term13028.getClass(), "currentRide", null);
        setField(term13028, term13028.getClass(), "dateOfBirth", null);
        setField(term13028, term13028.getClass(), "username", null);
        setField(term13028, term13028.getClass(), "mobileNumber", null);
        setField(term13028, term13028.getClass(), "email", null);
        setField(term13028, term13028.getClass(), "password", null);
        setField(term13028, term13028.getClass(), "userStatus", null);
        setField(term13023, term13023.getClass(), "passenger", term13028);
        setDoubleField(term13029, term13029.getClass(), "price", 0.9022041121474429);
        setDoubleField(term13029, term13029.getClass(), "discountedPrice", 0.6512870939318848);
        setField(term13029, term13029.getClass(), "driver", null);
        setField(term13023, term13023.getClass(), "acceptedOffer", term13029);
        setField(term13023, term13023.getClass(), "offers", term13032);
        setField(term13023, term13023.getClass(), "isAccepted", term13035);
        setField(term13023, term13023.getClass(), "events", term13037);
        setIntField(term13023, term13023.getClass(), "numberOfPassengers", 1094107751);
        Object term13041 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term13041, term13041.getClass(), "source", null);
        setField(term13041, term13041.getClass(), "destination", null);
        setField(term13041, term13041.getClass(), "passenger", null);
        setField(term13041, term13041.getClass(), "acceptedOffer", null);
        setField(term13041, term13041.getClass(), "offers", null);
        setField(term13041, term13041.getClass(), "isAccepted", null);
        setField(term13041, term13041.getClass(), "events", null);
        setIntField(term13041, term13041.getClass(), "numberOfPassengers", 0);
        Object term13043 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term13043, term13043.getClass(), "source", null);
        setField(term13043, term13043.getClass(), "destination", null);
        setField(term13043, term13043.getClass(), "passenger", null);
        setField(term13043, term13043.getClass(), "acceptedOffer", null);
        setField(term13043, term13043.getClass(), "offers", null);
        setField(term13043, term13043.getClass(), "isAccepted", null);
        setField(term13043, term13043.getClass(), "events", null);
        setIntField(term13043, term13043.getClass(), "numberOfPassengers", 0);
        Object term13045 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term13045, term13045.getClass(), "source", null);
        setField(term13045, term13045.getClass(), "destination", null);
        setField(term13045, term13045.getClass(), "passenger", null);
        setField(term13045, term13045.getClass(), "acceptedOffer", null);
        setField(term13045, term13045.getClass(), "offers", null);
        setField(term13045, term13045.getClass(), "isAccepted", null);
        setField(term13045, term13045.getClass(), "events", null);
        setIntField(term13045, term13045.getClass(), "numberOfPassengers", 0);
        Object term13047 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term13047, term13047.getClass(), "source", null);
        setField(term13047, term13047.getClass(), "destination", null);
        setField(term13047, term13047.getClass(), "passenger", null);
        setField(term13047, term13047.getClass(), "acceptedOffer", null);
        setField(term13047, term13047.getClass(), "offers", null);
        setField(term13047, term13047.getClass(), "isAccepted", null);
        setField(term13047, term13047.getClass(), "events", null);
        setIntField(term13047, term13047.getClass(), "numberOfPassengers", 0);
        Object term13049 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term13049, term13049.getClass(), "source", null);
        setField(term13049, term13049.getClass(), "destination", null);
        setField(term13049, term13049.getClass(), "passenger", null);
        setField(term13049, term13049.getClass(), "acceptedOffer", null);
        setField(term13049, term13049.getClass(), "offers", null);
        setField(term13049, term13049.getClass(), "isAccepted", null);
        setField(term13049, term13049.getClass(), "events", null);
        setIntField(term13049, term13049.getClass(), "numberOfPassengers", 0);
        ArrayList term13019 = new ArrayList();
        ((ArrayList) term13019).add(term13021);
        ((ArrayList) term13019).add(term13021);
        ((ArrayList) term13019).add(term13023);
        ((ArrayList) term13019).add(term13041);
        ((ArrayList) term13019).add(term13043);
        ((ArrayList) term13019).add(term13045);
        ((ArrayList) term13019).add(term13047);
        ((ArrayList) term13019).add(term13021);
        ((ArrayList) term13019).add(term13049);
        HashMap term13054 = new HashMap();
        Class<? extends Object> term13192 = Class.forName((String) "com.API.OnDriver.CustomerSubsystem.UserStatus");
        Field term13191 = ((Class) term13192).getDeclaredField((String) "admin");
        ((Field) term13191).setAccessible(true);
        Object enum30 = ((Field) term13191).get((Object) null);
        term12982 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Driver"));
        Object term13053 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Rating"));
        setField(term12982, term12982.getClass(), "driverLicense", "CLsbWobdgS");
        setField(term12982, term12982.getClass(), "nationalID", "TbYrjEyFPc");
        setField(term12982, term12982.getClass(), "isVerified", term13007);
        setField(term12982, term12982.getClass(), "favouriteAreas", term13009);
        setField(term12982, term12982.getClass(), "rides", term13019);
        setField(term13053, term13053.getClass(), "driverRatings", term13054);
        setIntField(term13053, term13053.getClass(), "ratingSum", -1667482829);
        setIntField(term13053, term13053.getClass(), "numberOfRatings", 1116576792);
        setField(term12982, term12982.getClass(), "rating", term13053);
        setField(term12982, term12982.getClass(), "currentRide", term13047);
        setIntField(term12982, term12982.getClass(), "numberOfPassengers", -942194446);
        setField(term12982, term12982.getClass(), "username", "tTVbtBVAfo");
        setField(term12982, term12982.getClass(), "mobileNumber", "cjaaJUnNCR");
        setField(term12982, term12982.getClass(), "email", "ETbxNuJLii");
        setField(term12982, term12982.getClass(), "password", "YJhnPtWtJR");
        setField(term12982, term12982.getClass(), "userStatus", enum30);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.CustomerSubsystem.Driver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xzGnrvbExX";
        callMethod(klass, "setNationalID", argTypes, term12982, args);
    }

};


