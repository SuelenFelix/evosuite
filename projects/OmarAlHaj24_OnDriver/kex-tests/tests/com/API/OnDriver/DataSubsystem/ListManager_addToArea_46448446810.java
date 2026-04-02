package com.API.OnDriver.DataSubsystem;

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
import static com.API.OnDriver.DataSubsystem.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.String;

public class ListManager_addToArea_46448446810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1281;
     Object term1302;

    public ListManager_addToArea_46448446810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1282 = new ArrayList();
        ArrayList term1286 = new ArrayList();
        ArrayList term1290 = new ArrayList();
        ArrayList term1294 = new ArrayList();
        ArrayList term1298 = new ArrayList();
        term1281 = newInstance(Class.forName("com.API.OnDriver.DataSubsystem.ListManager"));
        setField(term1281, term1281.getClass(), "listOfPassengers", term1282);
        setField(term1281, term1281.getClass(), "listOfDrivers", term1286);
        setField(term1281, term1281.getClass(), "listOfAreas", term1290);
        setField(term1281, term1281.getClass(), "listOfAdmin", term1294);
        setField(term1281, term1281.getClass(), "listOfRides", term1298);
        Boolean term1321 = new Boolean(false);
        ArrayList term1323 = new ArrayList();
        ((ArrayList) term1323).add((Object)null);
        ArrayList term1326 = new ArrayList();
        ((ArrayList) term1326).add((Object)null);
        ((ArrayList) term1326).add((Object)null);
        ((ArrayList) term1326).add((Object)null);
        ((ArrayList) term1326).add((Object)null);
        ((ArrayList) term1326).add((Object)null);
        ((ArrayList) term1326).add((Object)null);
        Boolean term1333 = new Boolean(true);
        Class<? extends Object> term1406 = Class.forName((String) "com.API.OnDriver.CustomerSubsystem.UserStatus");
        Field term1405 = ((Class) term1406).getDeclaredField((String) "activated");
        ((Field) term1405).setAccessible(true);
        Object enum2 = ((Field) term1405).get((Object) null);
        Object term1318 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Driver"));
        Object term1329 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Rating"));
        Object term1332 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term1318, term1318.getClass(), "driverLicense", "");
        setField(term1318, term1318.getClass(), "nationalID", "");
        setField(term1318, term1318.getClass(), "isVerified", term1321);
        setField(term1318, term1318.getClass(), "favouriteAreas", term1323);
        setField(term1318, term1318.getClass(), "rides", term1326);
        setField(term1329, term1329.getClass(), "driverRatings", null);
        setIntField(term1329, term1329.getClass(), "ratingSum", -2095575670);
        setIntField(term1329, term1329.getClass(), "numberOfRatings", 1225272962);
        setField(term1318, term1318.getClass(), "rating", term1329);
        setField(term1332, term1332.getClass(), "source", null);
        setField(term1332, term1332.getClass(), "destination", null);
        setField(term1332, term1332.getClass(), "passenger", null);
        setField(term1332, term1332.getClass(), "acceptedOffer", null);
        setField(term1332, term1332.getClass(), "offers", null);
        setField(term1332, term1332.getClass(), "isAccepted", term1333);
        setField(term1332, term1332.getClass(), "events", null);
        setIntField(term1332, term1332.getClass(), "numberOfPassengers", -817164822);
        setField(term1318, term1318.getClass(), "currentRide", term1332);
        setIntField(term1318, term1318.getClass(), "numberOfPassengers", 1324040357);
        setField(term1318, term1318.getClass(), "username", "");
        setField(term1318, term1318.getClass(), "mobileNumber", "");
        setField(term1318, term1318.getClass(), "email", "");
        setField(term1318, term1318.getClass(), "password", "");
        setField(term1318, term1318.getClass(), "userStatus", enum2);
        Object term1343 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Driver"));
        setField(term1343, term1343.getClass(), "driverLicense", null);
        setField(term1343, term1343.getClass(), "nationalID", null);
        setField(term1343, term1343.getClass(), "isVerified", null);
        setField(term1343, term1343.getClass(), "favouriteAreas", null);
        setField(term1343, term1343.getClass(), "rides", null);
        setField(term1343, term1343.getClass(), "rating", null);
        setField(term1343, term1343.getClass(), "currentRide", null);
        setIntField(term1343, term1343.getClass(), "numberOfPassengers", 0);
        setField(term1343, term1343.getClass(), "username", null);
        setField(term1343, term1343.getClass(), "mobileNumber", null);
        setField(term1343, term1343.getClass(), "email", null);
        setField(term1343, term1343.getClass(), "password", null);
        setField(term1343, term1343.getClass(), "userStatus", null);
        Boolean term1348 = new Boolean(false);
        ArrayList term1350 = new ArrayList();
        ((ArrayList) term1350).add((Object)null);
        ArrayList term1353 = new ArrayList();
        ((ArrayList) term1353).add((Object)null);
        Boolean term1360 = new Boolean(true);
        Class<? extends Object> term1665 = Class.forName((String) "com.API.OnDriver.CustomerSubsystem.UserStatus");
        Field term1664 = ((Class) term1665).getDeclaredField((String) "activated");
        ((Field) term1664).setAccessible(true);
        Object enum3 = ((Field) term1664).get((Object) null);
        Object term1345 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Driver"));
        Object term1356 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Rating"));
        Object term1359 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term1345, term1345.getClass(), "driverLicense", "");
        setField(term1345, term1345.getClass(), "nationalID", "");
        setField(term1345, term1345.getClass(), "isVerified", term1348);
        setField(term1345, term1345.getClass(), "favouriteAreas", term1350);
        setField(term1345, term1345.getClass(), "rides", term1353);
        setField(term1356, term1356.getClass(), "driverRatings", null);
        setIntField(term1356, term1356.getClass(), "ratingSum", 1328271830);
        setIntField(term1356, term1356.getClass(), "numberOfRatings", 1596070772);
        setField(term1345, term1345.getClass(), "rating", term1356);
        setField(term1359, term1359.getClass(), "source", null);
        setField(term1359, term1359.getClass(), "destination", null);
        setField(term1359, term1359.getClass(), "passenger", null);
        setField(term1359, term1359.getClass(), "acceptedOffer", null);
        setField(term1359, term1359.getClass(), "offers", null);
        setField(term1359, term1359.getClass(), "isAccepted", term1360);
        setField(term1359, term1359.getClass(), "events", null);
        setIntField(term1359, term1359.getClass(), "numberOfPassengers", -1048298087);
        setField(term1345, term1345.getClass(), "currentRide", term1359);
        setIntField(term1345, term1345.getClass(), "numberOfPassengers", 97029295);
        setField(term1345, term1345.getClass(), "username", "");
        setField(term1345, term1345.getClass(), "mobileNumber", "");
        setField(term1345, term1345.getClass(), "email", "");
        setField(term1345, term1345.getClass(), "password", "");
        setField(term1345, term1345.getClass(), "userStatus", enum3);
        Boolean term1373 = new Boolean(true);
        ArrayList term1375 = new ArrayList();
        ((ArrayList) term1375).add((Object)null);
        ((ArrayList) term1375).add((Object)null);
        ((ArrayList) term1375).add((Object)null);
        ((ArrayList) term1375).add((Object)null);
        ((ArrayList) term1375).add((Object)null);
        ((ArrayList) term1375).add((Object)null);
        ArrayList term1378 = new ArrayList();
        ((ArrayList) term1378).add((Object)null);
        ((ArrayList) term1378).add((Object)null);
        ((ArrayList) term1378).add((Object)null);
        ((ArrayList) term1378).add((Object)null);
        Boolean term1385 = new Boolean(false);
        Object term1370 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Driver"));
        Object term1381 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Rating"));
        Object term1384 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term1370, term1370.getClass(), "driverLicense", "");
        setField(term1370, term1370.getClass(), "nationalID", "");
        setField(term1370, term1370.getClass(), "isVerified", term1373);
        setField(term1370, term1370.getClass(), "favouriteAreas", term1375);
        setField(term1370, term1370.getClass(), "rides", term1378);
        setField(term1381, term1381.getClass(), "driverRatings", null);
        setIntField(term1381, term1381.getClass(), "ratingSum", 579005622);
        setIntField(term1381, term1381.getClass(), "numberOfRatings", -14890619);
        setField(term1370, term1370.getClass(), "rating", term1381);
        setField(term1384, term1384.getClass(), "source", null);
        setField(term1384, term1384.getClass(), "destination", null);
        setField(term1384, term1384.getClass(), "passenger", null);
        setField(term1384, term1384.getClass(), "acceptedOffer", null);
        setField(term1384, term1384.getClass(), "offers", null);
        setField(term1384, term1384.getClass(), "isAccepted", term1385);
        setField(term1384, term1384.getClass(), "events", null);
        setIntField(term1384, term1384.getClass(), "numberOfPassengers", 1632125673);
        setField(term1370, term1370.getClass(), "currentRide", term1384);
        setIntField(term1370, term1370.getClass(), "numberOfPassengers", 454281060);
        setField(term1370, term1370.getClass(), "username", "");
        setField(term1370, term1370.getClass(), "mobileNumber", "");
        setField(term1370, term1370.getClass(), "email", "");
        setField(term1370, term1370.getClass(), "password", "");
        setField(term1370, term1370.getClass(), "userStatus", enum3);
        ArrayList term1316 = new ArrayList();
        ((ArrayList) term1316).add(term1318);
        ((ArrayList) term1316).add(term1343);
        ((ArrayList) term1316).add(term1318);
        ((ArrayList) term1316).add(term1345);
        ((ArrayList) term1316).add(term1370);
        term1302 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        setField(term1302, term1302.getClass(), "location", "WzMEhMXkKx");
        setBooleanField(term1302, term1302.getClass(), "isDiscounted", true);
        setField(term1302, term1302.getClass(), "drivers", term1316);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.DataSubsystem.ListManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.API.OnDriver.RideSubsystem.Area");
        Object[] args = new Object[1];
        args[0] = term1302;
        callMethod(klass, "addToArea", argTypes, term1281, args);
    }

};


