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

public class Driver_getRating_10696799299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41492;

    public Driver_getRating_10696799299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term41517 = new Boolean(true);
        ArrayList term41519 = new ArrayList();
        ArrayList term41534 = new ArrayList();
        ((ArrayList) term41534).add((Object)null);
        ((ArrayList) term41534).add((Object)null);
        ((ArrayList) term41534).add((Object)null);
        ((ArrayList) term41534).add((Object)null);
        ((ArrayList) term41534).add((Object)null);
        ((ArrayList) term41534).add((Object)null);
        ((ArrayList) term41534).add((Object)null);
        ((ArrayList) term41534).add((Object)null);
        Boolean term41537 = new Boolean(false);
        ArrayList term41539 = new ArrayList();
        ((ArrayList) term41539).add((Object)null);
        ((ArrayList) term41539).add((Object)null);
        ((ArrayList) term41539).add((Object)null);
        ((ArrayList) term41539).add((Object)null);
        ((ArrayList) term41539).add((Object)null);
        ((ArrayList) term41539).add((Object)null);
        Object term41525 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        Object term41526 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        Object term41528 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        Object term41530 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger"));
        Object term41531 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Offer"));
        setField(term41526, term41526.getClass(), "location", null);
        setBooleanField(term41526, term41526.getClass(), "isDiscounted", false);
        setField(term41526, term41526.getClass(), "drivers", null);
        setField(term41525, term41525.getClass(), "source", term41526);
        setField(term41528, term41528.getClass(), "location", null);
        setBooleanField(term41528, term41528.getClass(), "isDiscounted", false);
        setField(term41528, term41528.getClass(), "drivers", null);
        setField(term41525, term41525.getClass(), "destination", term41528);
        setField(term41530, term41530.getClass(), "pastRides", null);
        setField(term41530, term41530.getClass(), "currentRide", null);
        setField(term41530, term41530.getClass(), "dateOfBirth", null);
        setField(term41530, term41530.getClass(), "username", null);
        setField(term41530, term41530.getClass(), "mobileNumber", null);
        setField(term41530, term41530.getClass(), "email", null);
        setField(term41530, term41530.getClass(), "password", null);
        setField(term41530, term41530.getClass(), "userStatus", null);
        setField(term41525, term41525.getClass(), "passenger", term41530);
        setDoubleField(term41531, term41531.getClass(), "price", 0.3800208987762318);
        setDoubleField(term41531, term41531.getClass(), "discountedPrice", 0.6329228631168875);
        setField(term41531, term41531.getClass(), "driver", null);
        setField(term41525, term41525.getClass(), "acceptedOffer", term41531);
        setField(term41525, term41525.getClass(), "offers", term41534);
        setField(term41525, term41525.getClass(), "isAccepted", term41537);
        setField(term41525, term41525.getClass(), "events", term41539);
        setIntField(term41525, term41525.getClass(), "numberOfPassengers", 1349806561);
        ArrayList term41523 = new ArrayList();
        ((ArrayList) term41523).add(term41525);
        HashMap term41546 = new HashMap();
        Class<? extends Object> term41678 = Class.forName((String) "com.API.OnDriver.CustomerSubsystem.UserStatus");
        Field term41677 = ((Class) term41678).getDeclaredField((String) "suspended");
        ((Field) term41677).setAccessible(true);
        Object enum97 = ((Field) term41677).get((Object) null);
        term41492 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Driver"));
        Object term41545 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Rating"));
        Object term41553 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term41492, term41492.getClass(), "driverLicense", "EeSPJPLqrn");
        setField(term41492, term41492.getClass(), "nationalID", "ixVPsPApNw");
        setField(term41492, term41492.getClass(), "isVerified", term41517);
        setField(term41492, term41492.getClass(), "favouriteAreas", term41519);
        setField(term41492, term41492.getClass(), "rides", term41523);
        setField(term41545, term41545.getClass(), "driverRatings", term41546);
        setIntField(term41545, term41545.getClass(), "ratingSum", 923905351);
        setIntField(term41545, term41545.getClass(), "numberOfRatings", 428360161);
        setField(term41492, term41492.getClass(), "rating", term41545);
        setField(term41553, term41553.getClass(), "source", null);
        setField(term41553, term41553.getClass(), "destination", null);
        setField(term41553, term41553.getClass(), "passenger", null);
        setField(term41553, term41553.getClass(), "acceptedOffer", null);
        setField(term41553, term41553.getClass(), "offers", null);
        setField(term41553, term41553.getClass(), "isAccepted", null);
        setField(term41553, term41553.getClass(), "events", null);
        setIntField(term41553, term41553.getClass(), "numberOfPassengers", 0);
        setField(term41492, term41492.getClass(), "currentRide", term41553);
        setIntField(term41492, term41492.getClass(), "numberOfPassengers", 631528579);
        setField(term41492, term41492.getClass(), "username", "wiqxbqDkJU");
        setField(term41492, term41492.getClass(), "mobileNumber", "psNunGzDVf");
        setField(term41492, term41492.getClass(), "email", "YFOetAfnRt");
        setField(term41492, term41492.getClass(), "password", "VgCCefhtcT");
        setField(term41492, term41492.getClass(), "userStatus", enum97);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.CustomerSubsystem.Driver");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRating", argTypes, term41492, args);
    }

};


