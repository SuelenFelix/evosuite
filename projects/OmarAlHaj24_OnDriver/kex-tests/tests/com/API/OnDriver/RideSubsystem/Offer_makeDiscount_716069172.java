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
import java.lang.Object;
import java.lang.Boolean;
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.String;
import java.lang.Integer;

public class Offer_makeDiscount_716069172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1012;
     Object term1134;

    public Offer_makeDiscount_716069172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term1040 = new Boolean(false);
        ArrayList term1042 = new ArrayList();
        Boolean term1049 = new Boolean(true);
        Object term1048 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term1048, term1048.getClass(), "source", null);
        setField(term1048, term1048.getClass(), "destination", null);
        setField(term1048, term1048.getClass(), "passenger", null);
        setField(term1048, term1048.getClass(), "acceptedOffer", null);
        setField(term1048, term1048.getClass(), "offers", null);
        setField(term1048, term1048.getClass(), "isAccepted", term1049);
        setField(term1048, term1048.getClass(), "events", null);
        setIntField(term1048, term1048.getClass(), "numberOfPassengers", -2095575670);
        Object term1052 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term1052, term1052.getClass(), "source", null);
        setField(term1052, term1052.getClass(), "destination", null);
        setField(term1052, term1052.getClass(), "passenger", null);
        setField(term1052, term1052.getClass(), "acceptedOffer", null);
        setField(term1052, term1052.getClass(), "offers", null);
        setField(term1052, term1052.getClass(), "isAccepted", null);
        setField(term1052, term1052.getClass(), "events", null);
        setIntField(term1052, term1052.getClass(), "numberOfPassengers", 0);
        Object term1054 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term1054, term1054.getClass(), "source", null);
        setField(term1054, term1054.getClass(), "destination", null);
        setField(term1054, term1054.getClass(), "passenger", null);
        setField(term1054, term1054.getClass(), "acceptedOffer", null);
        setField(term1054, term1054.getClass(), "offers", null);
        setField(term1054, term1054.getClass(), "isAccepted", null);
        setField(term1054, term1054.getClass(), "events", null);
        setIntField(term1054, term1054.getClass(), "numberOfPassengers", 0);
        Object term1056 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term1056, term1056.getClass(), "source", null);
        setField(term1056, term1056.getClass(), "destination", null);
        setField(term1056, term1056.getClass(), "passenger", null);
        setField(term1056, term1056.getClass(), "acceptedOffer", null);
        setField(term1056, term1056.getClass(), "offers", null);
        setField(term1056, term1056.getClass(), "isAccepted", null);
        setField(term1056, term1056.getClass(), "events", null);
        setIntField(term1056, term1056.getClass(), "numberOfPassengers", 0);
        Object term1058 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term1058, term1058.getClass(), "source", null);
        setField(term1058, term1058.getClass(), "destination", null);
        setField(term1058, term1058.getClass(), "passenger", null);
        setField(term1058, term1058.getClass(), "acceptedOffer", null);
        setField(term1058, term1058.getClass(), "offers", null);
        setField(term1058, term1058.getClass(), "isAccepted", null);
        setField(term1058, term1058.getClass(), "events", null);
        setIntField(term1058, term1058.getClass(), "numberOfPassengers", 0);
        ArrayList term1046 = new ArrayList();
        ((ArrayList) term1046).add(term1048);
        ((ArrayList) term1046).add(term1052);
        ((ArrayList) term1046).add(term1054);
        ((ArrayList) term1046).add(term1056);
        ((ArrayList) term1046).add(term1054);
        ((ArrayList) term1046).add(term1058);
        HashMap term1063 = new HashMap();
        Class<? extends Object> term1197 = Class.forName((String) "com.API.OnDriver.CustomerSubsystem.UserStatus");
        Field term1196 = ((Class) term1197).getDeclaredField((String) "activated");
        ((Field) term1196).setAccessible(true);
        Object enum2 = ((Field) term1196).get((Object) null);
        term1012 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Offer"));
        Object term1015 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Driver"));
        Object term1062 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Rating"));
        Object term1070 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setDoubleField(term1012, term1012.getClass(), "price", 0.544608645520025);
        setDoubleField(term1012, term1012.getClass(), "discountedPrice", 0.28570734989730284);
        setField(term1015, term1015.getClass(), "driverLicense", "yGtHPyvYiQ");
        setField(term1015, term1015.getClass(), "nationalID", "MvRIxilFMJ");
        setField(term1015, term1015.getClass(), "isVerified", term1040);
        setField(term1015, term1015.getClass(), "favouriteAreas", term1042);
        setField(term1015, term1015.getClass(), "rides", term1046);
        setField(term1062, term1062.getClass(), "driverRatings", term1063);
        setIntField(term1062, term1062.getClass(), "ratingSum", 1225272962);
        setIntField(term1062, term1062.getClass(), "numberOfRatings", 1324040357);
        setField(term1015, term1015.getClass(), "rating", term1062);
        setField(term1070, term1070.getClass(), "source", null);
        setField(term1070, term1070.getClass(), "destination", null);
        setField(term1070, term1070.getClass(), "passenger", null);
        setField(term1070, term1070.getClass(), "acceptedOffer", null);
        setField(term1070, term1070.getClass(), "offers", null);
        setField(term1070, term1070.getClass(), "isAccepted", null);
        setField(term1070, term1070.getClass(), "events", null);
        setIntField(term1070, term1070.getClass(), "numberOfPassengers", 0);
        setField(term1015, term1015.getClass(), "currentRide", term1070);
        setIntField(term1015, term1015.getClass(), "numberOfPassengers", -1588772968);
        setField(term1015, term1015.getClass(), "username", "RbVQXSpxXy");
        setField(term1015, term1015.getClass(), "mobileNumber", "YpJbIgJWWv");
        setField(term1015, term1015.getClass(), "email", "JppkknKVOw");
        setField(term1015, term1015.getClass(), "password", "iljANwuEjk");
        setField(term1015, term1015.getClass(), "userStatus", enum2);
        setField(term1012, term1012.getClass(), "driver", term1015);
        term1134 = new Integer(-93135961);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.RideSubsystem.Offer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1134;
        callMethod(klass, "makeDiscount", argTypes, term1012, args);
    }

};


