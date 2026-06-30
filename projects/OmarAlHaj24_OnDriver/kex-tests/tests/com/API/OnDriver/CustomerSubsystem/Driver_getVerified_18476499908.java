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

public class Driver_getVerified_18476499908 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41046;

    public Driver_getVerified_18476499908() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term41071 = new Boolean(true);
        ArrayList term41078 = new ArrayList();
        ((ArrayList) term41078).add((Object)null);
        ((ArrayList) term41078).add((Object)null);
        ((ArrayList) term41078).add((Object)null);
        ((ArrayList) term41078).add((Object)null);
        Object term41075 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        setField(term41075, term41075.getClass(), "location", "");
        setBooleanField(term41075, term41075.getClass(), "isDiscounted", false);
        setField(term41075, term41075.getClass(), "drivers", term41078);
        Object term41081 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        setField(term41081, term41081.getClass(), "location", null);
        setBooleanField(term41081, term41081.getClass(), "isDiscounted", false);
        setField(term41081, term41081.getClass(), "drivers", null);
        Object term41083 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        setField(term41083, term41083.getClass(), "location", null);
        setBooleanField(term41083, term41083.getClass(), "isDiscounted", false);
        setField(term41083, term41083.getClass(), "drivers", null);
        Object term41085 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        setField(term41085, term41085.getClass(), "location", null);
        setBooleanField(term41085, term41085.getClass(), "isDiscounted", false);
        setField(term41085, term41085.getClass(), "drivers", null);
        ArrayList term41073 = new ArrayList();
        ((ArrayList) term41073).add(term41075);
        ((ArrayList) term41073).add(term41081);
        ((ArrayList) term41073).add(term41083);
        ((ArrayList) term41073).add(term41081);
        ((ArrayList) term41073).add(term41085);
        Object term41091 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term41091, term41091.getClass(), "source", null);
        setField(term41091, term41091.getClass(), "destination", null);
        setField(term41091, term41091.getClass(), "passenger", null);
        setField(term41091, term41091.getClass(), "acceptedOffer", null);
        setField(term41091, term41091.getClass(), "offers", null);
        setField(term41091, term41091.getClass(), "isAccepted", null);
        setField(term41091, term41091.getClass(), "events", null);
        setIntField(term41091, term41091.getClass(), "numberOfPassengers", 0);
        Object term41093 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term41093, term41093.getClass(), "source", null);
        setField(term41093, term41093.getClass(), "destination", null);
        setField(term41093, term41093.getClass(), "passenger", null);
        setField(term41093, term41093.getClass(), "acceptedOffer", null);
        setField(term41093, term41093.getClass(), "offers", null);
        setField(term41093, term41093.getClass(), "isAccepted", null);
        setField(term41093, term41093.getClass(), "events", null);
        setIntField(term41093, term41093.getClass(), "numberOfPassengers", 0);
        Object term41095 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term41095, term41095.getClass(), "source", null);
        setField(term41095, term41095.getClass(), "destination", null);
        setField(term41095, term41095.getClass(), "passenger", null);
        setField(term41095, term41095.getClass(), "acceptedOffer", null);
        setField(term41095, term41095.getClass(), "offers", null);
        setField(term41095, term41095.getClass(), "isAccepted", null);
        setField(term41095, term41095.getClass(), "events", null);
        setIntField(term41095, term41095.getClass(), "numberOfPassengers", 0);
        ArrayList term41106 = new ArrayList();
        ((ArrayList) term41106).add((Object)null);
        Boolean term41109 = new Boolean(false);
        ArrayList term41111 = new ArrayList();
        ((ArrayList) term41111).add((Object)null);
        ((ArrayList) term41111).add((Object)null);
        ((ArrayList) term41111).add((Object)null);
        ((ArrayList) term41111).add((Object)null);
        ((ArrayList) term41111).add((Object)null);
        Object term41097 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        Object term41098 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        Object term41100 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        Object term41102 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger"));
        Object term41103 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Offer"));
        setField(term41098, term41098.getClass(), "location", null);
        setBooleanField(term41098, term41098.getClass(), "isDiscounted", false);
        setField(term41098, term41098.getClass(), "drivers", null);
        setField(term41097, term41097.getClass(), "source", term41098);
        setField(term41100, term41100.getClass(), "location", null);
        setBooleanField(term41100, term41100.getClass(), "isDiscounted", false);
        setField(term41100, term41100.getClass(), "drivers", null);
        setField(term41097, term41097.getClass(), "destination", term41100);
        setField(term41102, term41102.getClass(), "pastRides", null);
        setField(term41102, term41102.getClass(), "currentRide", null);
        setField(term41102, term41102.getClass(), "dateOfBirth", null);
        setField(term41102, term41102.getClass(), "username", null);
        setField(term41102, term41102.getClass(), "mobileNumber", null);
        setField(term41102, term41102.getClass(), "email", null);
        setField(term41102, term41102.getClass(), "password", null);
        setField(term41102, term41102.getClass(), "userStatus", null);
        setField(term41097, term41097.getClass(), "passenger", term41102);
        setDoubleField(term41103, term41103.getClass(), "price", 0.3294886032690195);
        setDoubleField(term41103, term41103.getClass(), "discountedPrice", 0.7286890609225415);
        setField(term41103, term41103.getClass(), "driver", null);
        setField(term41097, term41097.getClass(), "acceptedOffer", term41103);
        setField(term41097, term41097.getClass(), "offers", term41106);
        setField(term41097, term41097.getClass(), "isAccepted", term41109);
        setField(term41097, term41097.getClass(), "events", term41111);
        setIntField(term41097, term41097.getClass(), "numberOfPassengers", 241725499);
        ArrayList term41089 = new ArrayList();
        ((ArrayList) term41089).add(term41091);
        ((ArrayList) term41089).add(term41093);
        ((ArrayList) term41089).add(term41095);
        ((ArrayList) term41089).add(term41097);
        ((ArrayList) term41089).add(term41091);
        HashMap term41118 = new HashMap();
        Class<? extends Object> term41246 = Class.forName((String) "com.API.OnDriver.CustomerSubsystem.UserStatus");
        Field term41245 = ((Class) term41246).getDeclaredField((String) "admin");
        ((Field) term41245).setAccessible(true);
        Object enum96 = ((Field) term41245).get((Object) null);
        term41046 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Driver"));
        Object term41117 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Rating"));
        Object term41125 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term41046, term41046.getClass(), "driverLicense", "XNHngduAPd");
        setField(term41046, term41046.getClass(), "nationalID", "ewowfKAPBz");
        setField(term41046, term41046.getClass(), "isVerified", term41071);
        setField(term41046, term41046.getClass(), "favouriteAreas", term41073);
        setField(term41046, term41046.getClass(), "rides", term41089);
        setField(term41117, term41117.getClass(), "driverRatings", term41118);
        setIntField(term41117, term41117.getClass(), "ratingSum", 1174484848);
        setIntField(term41117, term41117.getClass(), "numberOfRatings", 939889496);
        setField(term41046, term41046.getClass(), "rating", term41117);
        setField(term41125, term41125.getClass(), "source", null);
        setField(term41125, term41125.getClass(), "destination", null);
        setField(term41125, term41125.getClass(), "passenger", null);
        setField(term41125, term41125.getClass(), "acceptedOffer", null);
        setField(term41125, term41125.getClass(), "offers", null);
        setField(term41125, term41125.getClass(), "isAccepted", null);
        setField(term41125, term41125.getClass(), "events", null);
        setIntField(term41125, term41125.getClass(), "numberOfPassengers", 0);
        setField(term41046, term41046.getClass(), "currentRide", term41125);
        setIntField(term41046, term41046.getClass(), "numberOfPassengers", -495242269);
        setField(term41046, term41046.getClass(), "username", "cAfXSAOdaf");
        setField(term41046, term41046.getClass(), "mobileNumber", "gFWxmEVAsk");
        setField(term41046, term41046.getClass(), "email", "LmtyEJAnHW");
        setField(term41046, term41046.getClass(), "password", "KPFNRywlFG");
        setField(term41046, term41046.getClass(), "userStatus", enum96);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.CustomerSubsystem.Driver");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVerified", argTypes, term41046, args);
    }

};


