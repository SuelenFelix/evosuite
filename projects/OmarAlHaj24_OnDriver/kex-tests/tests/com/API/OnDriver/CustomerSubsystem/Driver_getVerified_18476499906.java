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

public class Driver_getVerified_18476499906 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14513;

    public Driver_getVerified_18476499906() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term14538 = new Boolean(true);
        ArrayList term14545 = new ArrayList();
        ((ArrayList) term14545).add((Object)null);
        ((ArrayList) term14545).add((Object)null);
        Object term14542 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        setField(term14542, term14542.getClass(), "location", "");
        setBooleanField(term14542, term14542.getClass(), "isDiscounted", false);
        setField(term14542, term14542.getClass(), "drivers", term14545);
        ArrayList term14551 = new ArrayList();
        ((ArrayList) term14551).add((Object)null);
        ((ArrayList) term14551).add((Object)null);
        Object term14548 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        setField(term14548, term14548.getClass(), "location", "");
        setBooleanField(term14548, term14548.getClass(), "isDiscounted", false);
        setField(term14548, term14548.getClass(), "drivers", term14551);
        ArrayList term14540 = new ArrayList();
        ((ArrayList) term14540).add(term14542);
        ((ArrayList) term14540).add(term14548);
        ArrayList term14567 = new ArrayList();
        ((ArrayList) term14567).add((Object)null);
        ((ArrayList) term14567).add((Object)null);
        Boolean term14570 = new Boolean(false);
        ArrayList term14572 = new ArrayList();
        ((ArrayList) term14572).add((Object)null);
        ((ArrayList) term14572).add((Object)null);
        ((ArrayList) term14572).add((Object)null);
        ((ArrayList) term14572).add((Object)null);
        ((ArrayList) term14572).add((Object)null);
        Object term14558 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        Object term14559 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        Object term14561 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        Object term14563 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger"));
        Object term14564 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Offer"));
        setField(term14559, term14559.getClass(), "location", null);
        setBooleanField(term14559, term14559.getClass(), "isDiscounted", true);
        setField(term14559, term14559.getClass(), "drivers", null);
        setField(term14558, term14558.getClass(), "source", term14559);
        setField(term14561, term14561.getClass(), "location", null);
        setBooleanField(term14561, term14561.getClass(), "isDiscounted", true);
        setField(term14561, term14561.getClass(), "drivers", null);
        setField(term14558, term14558.getClass(), "destination", term14561);
        setField(term14563, term14563.getClass(), "pastRides", null);
        setField(term14563, term14563.getClass(), "currentRide", null);
        setField(term14563, term14563.getClass(), "dateOfBirth", null);
        setField(term14563, term14563.getClass(), "username", null);
        setField(term14563, term14563.getClass(), "mobileNumber", null);
        setField(term14563, term14563.getClass(), "email", null);
        setField(term14563, term14563.getClass(), "password", null);
        setField(term14563, term14563.getClass(), "userStatus", null);
        setField(term14558, term14558.getClass(), "passenger", term14563);
        setDoubleField(term14564, term14564.getClass(), "price", 0.0);
        setDoubleField(term14564, term14564.getClass(), "discountedPrice", 0.0);
        setField(term14564, term14564.getClass(), "driver", null);
        setField(term14558, term14558.getClass(), "acceptedOffer", term14564);
        setField(term14558, term14558.getClass(), "offers", term14567);
        setField(term14558, term14558.getClass(), "isAccepted", term14570);
        setField(term14558, term14558.getClass(), "events", term14572);
        setIntField(term14558, term14558.getClass(), "numberOfPassengers", -1748391876);
        ArrayList term14582 = new ArrayList();
        ((ArrayList) term14582).add((Object)null);
        ((ArrayList) term14582).add((Object)null);
        ((ArrayList) term14582).add((Object)null);
        ((ArrayList) term14582).add((Object)null);
        Boolean term14585 = new Boolean(false);
        ArrayList term14587 = new ArrayList();
        ((ArrayList) term14587).add((Object)null);
        ((ArrayList) term14587).add((Object)null);
        ((ArrayList) term14587).add((Object)null);
        ((ArrayList) term14587).add((Object)null);
        ((ArrayList) term14587).add((Object)null);
        ((ArrayList) term14587).add((Object)null);
        ((ArrayList) term14587).add((Object)null);
        Object term14576 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        Object term14577 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        Object term14579 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        Object term14581 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger"));
        setField(term14577, term14577.getClass(), "location", null);
        setBooleanField(term14577, term14577.getClass(), "isDiscounted", true);
        setField(term14577, term14577.getClass(), "drivers", null);
        setField(term14576, term14576.getClass(), "source", term14577);
        setField(term14579, term14579.getClass(), "location", null);
        setBooleanField(term14579, term14579.getClass(), "isDiscounted", false);
        setField(term14579, term14579.getClass(), "drivers", null);
        setField(term14576, term14576.getClass(), "destination", term14579);
        setField(term14581, term14581.getClass(), "pastRides", null);
        setField(term14581, term14581.getClass(), "currentRide", null);
        setField(term14581, term14581.getClass(), "dateOfBirth", null);
        setField(term14581, term14581.getClass(), "username", null);
        setField(term14581, term14581.getClass(), "mobileNumber", null);
        setField(term14581, term14581.getClass(), "email", null);
        setField(term14581, term14581.getClass(), "password", null);
        setField(term14581, term14581.getClass(), "userStatus", null);
        setField(term14576, term14576.getClass(), "passenger", term14581);
        setField(term14576, term14576.getClass(), "acceptedOffer", term14564);
        setField(term14576, term14576.getClass(), "offers", term14582);
        setField(term14576, term14576.getClass(), "isAccepted", term14585);
        setField(term14576, term14576.getClass(), "events", term14587);
        setIntField(term14576, term14576.getClass(), "numberOfPassengers", -1941343035);
        ArrayList term14596 = new ArrayList();
        ((ArrayList) term14596).add((Object)null);
        Boolean term14599 = new Boolean(false);
        ArrayList term14601 = new ArrayList();
        ((ArrayList) term14601).add((Object)null);
        ((ArrayList) term14601).add((Object)null);
        ((ArrayList) term14601).add((Object)null);
        Object term14591 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        Object term14592 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger"));
        Object term14593 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Offer"));
        setField(term14591, term14591.getClass(), "source", term14577);
        setField(term14591, term14591.getClass(), "destination", term14559);
        setField(term14592, term14592.getClass(), "pastRides", null);
        setField(term14592, term14592.getClass(), "currentRide", null);
        setField(term14592, term14592.getClass(), "dateOfBirth", null);
        setField(term14592, term14592.getClass(), "username", null);
        setField(term14592, term14592.getClass(), "mobileNumber", null);
        setField(term14592, term14592.getClass(), "email", null);
        setField(term14592, term14592.getClass(), "password", null);
        setField(term14592, term14592.getClass(), "userStatus", null);
        setField(term14591, term14591.getClass(), "passenger", term14592);
        setDoubleField(term14593, term14593.getClass(), "price", 0.0);
        setDoubleField(term14593, term14593.getClass(), "discountedPrice", 0.0);
        setField(term14593, term14593.getClass(), "driver", null);
        setField(term14591, term14591.getClass(), "acceptedOffer", term14593);
        setField(term14591, term14591.getClass(), "offers", term14596);
        setField(term14591, term14591.getClass(), "isAccepted", term14599);
        setField(term14591, term14591.getClass(), "events", term14601);
        setIntField(term14591, term14591.getClass(), "numberOfPassengers", 765766290);
        ArrayList term14556 = new ArrayList();
        ((ArrayList) term14556).add(term14558);
        ((ArrayList) term14556).add(term14558);
        ((ArrayList) term14556).add(term14576);
        ((ArrayList) term14556).add(term14591);
        ((ArrayList) term14556).add(term14576);
        HashMap term14608 = new HashMap();
        Class<? extends Object> term14734 = Class.forName((String) "com.API.OnDriver.CustomerSubsystem.UserStatus");
        Field term14733 = ((Class) term14734).getDeclaredField((String) "admin");
        ((Field) term14733).setAccessible(true);
        Object enum33 = ((Field) term14733).get((Object) null);
        term14513 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Driver"));
        Object term14607 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Rating"));
        setField(term14513, term14513.getClass(), "driverLicense", "ZWRAbOuktl");
        setField(term14513, term14513.getClass(), "nationalID", "iqFRvFmVID");
        setField(term14513, term14513.getClass(), "isVerified", term14538);
        setField(term14513, term14513.getClass(), "favouriteAreas", term14540);
        setField(term14513, term14513.getClass(), "rides", term14556);
        setField(term14607, term14607.getClass(), "driverRatings", term14608);
        setIntField(term14607, term14607.getClass(), "ratingSum", -941356098);
        setIntField(term14607, term14607.getClass(), "numberOfRatings", -201517446);
        setField(term14513, term14513.getClass(), "rating", term14607);
        setField(term14513, term14513.getClass(), "currentRide", term14591);
        setIntField(term14513, term14513.getClass(), "numberOfPassengers", -97742366);
        setField(term14513, term14513.getClass(), "username", "IyOhWYyaDV");
        setField(term14513, term14513.getClass(), "mobileNumber", "omWrkCSFzy");
        setField(term14513, term14513.getClass(), "email", "VFYvUTgYFB");
        setField(term14513, term14513.getClass(), "password", "BrWqhEIUUj");
        setField(term14513, term14513.getClass(), "userStatus", enum33);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.CustomerSubsystem.Driver");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVerified", argTypes, term14513, args);
    }

};


