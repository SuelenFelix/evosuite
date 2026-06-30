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
import java.lang.Boolean;
import java.lang.Object;
import java.util.HashMap;
import java.lang.String;

public class Area_subscribe_18052836264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17561;
     Object term17579;

    public Area_subscribe_18052836264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term17575 = new ArrayList();
        term17561 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        setField(term17561, term17561.getClass(), "location", "hpTAdtnQku");
        setBooleanField(term17561, term17561.getClass(), "isDiscounted", false);
        setField(term17561, term17561.getClass(), "drivers", term17575);
        Boolean term17604 = new Boolean(true);
        ArrayList term17611 = new ArrayList();
        Object term17608 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        setField(term17608, term17608.getClass(), "location", "");
        setBooleanField(term17608, term17608.getClass(), "isDiscounted", false);
        setField(term17608, term17608.getClass(), "drivers", term17611);
        ArrayList term17617 = new ArrayList();
        ((ArrayList) term17617).add((Object)null);
        ((ArrayList) term17617).add((Object)null);
        ((ArrayList) term17617).add((Object)null);
        ((ArrayList) term17617).add((Object)null);
        ((ArrayList) term17617).add((Object)null);
        ((ArrayList) term17617).add((Object)null);
        Object term17614 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        setField(term17614, term17614.getClass(), "location", "");
        setBooleanField(term17614, term17614.getClass(), "isDiscounted", true);
        setField(term17614, term17614.getClass(), "drivers", term17617);
        Object term17620 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        setField(term17620, term17620.getClass(), "location", null);
        setBooleanField(term17620, term17620.getClass(), "isDiscounted", false);
        setField(term17620, term17620.getClass(), "drivers", null);
        ArrayList term17625 = new ArrayList();
        ((ArrayList) term17625).add((Object)null);
        ((ArrayList) term17625).add((Object)null);
        ((ArrayList) term17625).add((Object)null);
        ((ArrayList) term17625).add((Object)null);
        ((ArrayList) term17625).add((Object)null);
        ((ArrayList) term17625).add((Object)null);
        ((ArrayList) term17625).add((Object)null);
        ((ArrayList) term17625).add((Object)null);
        ((ArrayList) term17625).add((Object)null);
        Object term17622 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        setField(term17622, term17622.getClass(), "location", "");
        setBooleanField(term17622, term17622.getClass(), "isDiscounted", false);
        setField(term17622, term17622.getClass(), "drivers", term17625);
        ArrayList term17631 = new ArrayList();
        ((ArrayList) term17631).add((Object)null);
        ((ArrayList) term17631).add((Object)null);
        ((ArrayList) term17631).add((Object)null);
        ((ArrayList) term17631).add((Object)null);
        ((ArrayList) term17631).add((Object)null);
        ((ArrayList) term17631).add((Object)null);
        ((ArrayList) term17631).add((Object)null);
        Object term17628 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        setField(term17628, term17628.getClass(), "location", "");
        setBooleanField(term17628, term17628.getClass(), "isDiscounted", true);
        setField(term17628, term17628.getClass(), "drivers", term17631);
        Object term17634 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        setField(term17634, term17634.getClass(), "location", null);
        setBooleanField(term17634, term17634.getClass(), "isDiscounted", false);
        setField(term17634, term17634.getClass(), "drivers", null);
        ArrayList term17639 = new ArrayList();
        ((ArrayList) term17639).add((Object)null);
        ((ArrayList) term17639).add((Object)null);
        ((ArrayList) term17639).add((Object)null);
        ((ArrayList) term17639).add((Object)null);
        ((ArrayList) term17639).add((Object)null);
        ((ArrayList) term17639).add((Object)null);
        ((ArrayList) term17639).add((Object)null);
        Object term17636 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        setField(term17636, term17636.getClass(), "location", "");
        setBooleanField(term17636, term17636.getClass(), "isDiscounted", true);
        setField(term17636, term17636.getClass(), "drivers", term17639);
        ArrayList term17606 = new ArrayList();
        ((ArrayList) term17606).add(term17608);
        ((ArrayList) term17606).add(term17614);
        ((ArrayList) term17606).add(term17620);
        ((ArrayList) term17606).add(term17622);
        ((ArrayList) term17606).add(term17628);
        ((ArrayList) term17606).add(term17634);
        ((ArrayList) term17606).add(term17614);
        ((ArrayList) term17606).add(term17636);
        Object term17646 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term17646, term17646.getClass(), "source", null);
        setField(term17646, term17646.getClass(), "destination", null);
        setField(term17646, term17646.getClass(), "passenger", null);
        setField(term17646, term17646.getClass(), "acceptedOffer", null);
        setField(term17646, term17646.getClass(), "offers", null);
        setField(term17646, term17646.getClass(), "isAccepted", null);
        setField(term17646, term17646.getClass(), "events", null);
        setIntField(term17646, term17646.getClass(), "numberOfPassengers", 0);
        Object term17648 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term17648, term17648.getClass(), "source", null);
        setField(term17648, term17648.getClass(), "destination", null);
        setField(term17648, term17648.getClass(), "passenger", null);
        setField(term17648, term17648.getClass(), "acceptedOffer", null);
        setField(term17648, term17648.getClass(), "offers", null);
        setField(term17648, term17648.getClass(), "isAccepted", null);
        setField(term17648, term17648.getClass(), "events", null);
        setIntField(term17648, term17648.getClass(), "numberOfPassengers", 0);
        Object term17650 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term17650, term17650.getClass(), "source", null);
        setField(term17650, term17650.getClass(), "destination", null);
        setField(term17650, term17650.getClass(), "passenger", null);
        setField(term17650, term17650.getClass(), "acceptedOffer", null);
        setField(term17650, term17650.getClass(), "offers", null);
        setField(term17650, term17650.getClass(), "isAccepted", null);
        setField(term17650, term17650.getClass(), "events", null);
        setIntField(term17650, term17650.getClass(), "numberOfPassengers", 0);
        ArrayList term17644 = new ArrayList();
        ((ArrayList) term17644).add(term17646);
        ((ArrayList) term17644).add(term17648);
        ((ArrayList) term17644).add(term17650);
        HashMap term17655 = new HashMap();
        Class<? extends Object> term17793 = Class.forName((String) "com.API.OnDriver.CustomerSubsystem.UserStatus");
        Field term17792 = ((Class) term17793).getDeclaredField((String) "admin");
        ((Field) term17792).setAccessible(true);
        Object enum41 = ((Field) term17792).get((Object) null);
        term17579 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Driver"));
        Object term17654 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Rating"));
        Object term17662 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term17579, term17579.getClass(), "driverLicense", "GdMAXFBAtl");
        setField(term17579, term17579.getClass(), "nationalID", "KWVRAlcIqd");
        setField(term17579, term17579.getClass(), "isVerified", term17604);
        setField(term17579, term17579.getClass(), "favouriteAreas", term17606);
        setField(term17579, term17579.getClass(), "rides", term17644);
        setField(term17654, term17654.getClass(), "driverRatings", term17655);
        setIntField(term17654, term17654.getClass(), "ratingSum", -31751777);
        setIntField(term17654, term17654.getClass(), "numberOfRatings", -246967963);
        setField(term17579, term17579.getClass(), "rating", term17654);
        setField(term17662, term17662.getClass(), "source", null);
        setField(term17662, term17662.getClass(), "destination", null);
        setField(term17662, term17662.getClass(), "passenger", null);
        setField(term17662, term17662.getClass(), "acceptedOffer", null);
        setField(term17662, term17662.getClass(), "offers", null);
        setField(term17662, term17662.getClass(), "isAccepted", null);
        setField(term17662, term17662.getClass(), "events", null);
        setIntField(term17662, term17662.getClass(), "numberOfPassengers", 0);
        setField(term17579, term17579.getClass(), "currentRide", term17662);
        setIntField(term17579, term17579.getClass(), "numberOfPassengers", -1777140369);
        setField(term17579, term17579.getClass(), "username", "rvYqMRgiPA");
        setField(term17579, term17579.getClass(), "mobileNumber", "qOZXeUUmdz");
        setField(term17579, term17579.getClass(), "email", "FCovVZHqPx");
        setField(term17579, term17579.getClass(), "password", "jSTBfkWjge");
        setField(term17579, term17579.getClass(), "userStatus", enum41);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.RideSubsystem.Area");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.API.OnDriver.CustomerSubsystem.Driver");
        Object[] args = new Object[1];
        args[0] = term17579;
        callMethod(klass, "subscribe", argTypes, term17561, args);
    }

};


