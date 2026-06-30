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

public class Driver_listFavouriteAreas_20882165814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44906;

    public Driver_listFavouriteAreas_20882165814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term44931 = new Boolean(false);
        ArrayList term44938 = new ArrayList();
        ((ArrayList) term44938).add((Object)null);
        Object term44935 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        setField(term44935, term44935.getClass(), "location", "");
        setBooleanField(term44935, term44935.getClass(), "isDiscounted", true);
        setField(term44935, term44935.getClass(), "drivers", term44938);
        Object term44941 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        setField(term44941, term44941.getClass(), "location", null);
        setBooleanField(term44941, term44941.getClass(), "isDiscounted", false);
        setField(term44941, term44941.getClass(), "drivers", null);
        ArrayList term44946 = new ArrayList();
        ((ArrayList) term44946).add((Object)null);
        Object term44943 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        setField(term44943, term44943.getClass(), "location", "");
        setBooleanField(term44943, term44943.getClass(), "isDiscounted", false);
        setField(term44943, term44943.getClass(), "drivers", term44946);
        ArrayList term44952 = new ArrayList();
        ((ArrayList) term44952).add((Object)null);
        ((ArrayList) term44952).add((Object)null);
        ((ArrayList) term44952).add((Object)null);
        ((ArrayList) term44952).add((Object)null);
        ((ArrayList) term44952).add((Object)null);
        ((ArrayList) term44952).add((Object)null);
        ((ArrayList) term44952).add((Object)null);
        ((ArrayList) term44952).add((Object)null);
        ((ArrayList) term44952).add((Object)null);
        Object term44949 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        setField(term44949, term44949.getClass(), "location", "");
        setBooleanField(term44949, term44949.getClass(), "isDiscounted", false);
        setField(term44949, term44949.getClass(), "drivers", term44952);
        ArrayList term44958 = new ArrayList();
        Object term44955 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        setField(term44955, term44955.getClass(), "location", "");
        setBooleanField(term44955, term44955.getClass(), "isDiscounted", false);
        setField(term44955, term44955.getClass(), "drivers", term44958);
        ArrayList term44964 = new ArrayList();
        ((ArrayList) term44964).add((Object)null);
        ((ArrayList) term44964).add((Object)null);
        ((ArrayList) term44964).add((Object)null);
        ((ArrayList) term44964).add((Object)null);
        ((ArrayList) term44964).add((Object)null);
        ((ArrayList) term44964).add((Object)null);
        ((ArrayList) term44964).add((Object)null);
        Object term44961 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        setField(term44961, term44961.getClass(), "location", "");
        setBooleanField(term44961, term44961.getClass(), "isDiscounted", false);
        setField(term44961, term44961.getClass(), "drivers", term44964);
        ArrayList term44933 = new ArrayList();
        ((ArrayList) term44933).add(term44935);
        ((ArrayList) term44933).add(term44941);
        ((ArrayList) term44933).add(term44943);
        ((ArrayList) term44933).add(term44949);
        ((ArrayList) term44933).add(term44941);
        ((ArrayList) term44933).add(term44941);
        ((ArrayList) term44933).add(term44955);
        ((ArrayList) term44933).add(term44961);
        ((ArrayList) term44933).add(term44943);
        ArrayList term44969 = new ArrayList();
        HashMap term44974 = new HashMap();
        Object term44990 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Offer"));
        setDoubleField(term44990, term44990.getClass(), "price", 0.0);
        setDoubleField(term44990, term44990.getClass(), "discountedPrice", 0.0);
        setField(term44990, term44990.getClass(), "driver", null);
        Object term44993 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Offer"));
        setDoubleField(term44993, term44993.getClass(), "price", 0.0);
        setDoubleField(term44993, term44993.getClass(), "discountedPrice", 0.0);
        setField(term44993, term44993.getClass(), "driver", null);
        Object term44996 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Offer"));
        setDoubleField(term44996, term44996.getClass(), "price", 0.0);
        setDoubleField(term44996, term44996.getClass(), "discountedPrice", 0.0);
        setField(term44996, term44996.getClass(), "driver", null);
        ArrayList term44988 = new ArrayList();
        ((ArrayList) term44988).add(term44990);
        ((ArrayList) term44988).add(term44993);
        ((ArrayList) term44988).add(term44996);
        Boolean term45001 = new Boolean(false);
        Object term45005 = newInstance(Class.forName("com.API.OnDriver.EventSubsystem.Event"));
        setField(term45005, term45005.getClass(), "name", null);
        setField(term45005, term45005.getClass(), "attributes", null);
        Object term45006 = newInstance(Class.forName("com.API.OnDriver.EventSubsystem.Event"));
        setField(term45006, term45006.getClass(), "name", null);
        setField(term45006, term45006.getClass(), "attributes", null);
        Object term45007 = newInstance(Class.forName("com.API.OnDriver.EventSubsystem.Event"));
        setField(term45007, term45007.getClass(), "name", null);
        setField(term45007, term45007.getClass(), "attributes", null);
        Object term45008 = newInstance(Class.forName("com.API.OnDriver.EventSubsystem.Event"));
        setField(term45008, term45008.getClass(), "name", null);
        setField(term45008, term45008.getClass(), "attributes", null);
        Object term45009 = newInstance(Class.forName("com.API.OnDriver.EventSubsystem.Event"));
        setField(term45009, term45009.getClass(), "name", null);
        setField(term45009, term45009.getClass(), "attributes", null);
        ArrayList term45003 = new ArrayList();
        ((ArrayList) term45003).add(term45005);
        ((ArrayList) term45003).add(term45006);
        ((ArrayList) term45003).add(term45005);
        ((ArrayList) term45003).add(term45007);
        ((ArrayList) term45003).add(term45008);
        ((ArrayList) term45003).add(term45009);
        Class<? extends Object> term45136 = Class.forName((String) "com.API.OnDriver.CustomerSubsystem.UserStatus");
        Field term45135 = ((Class) term45136).getDeclaredField((String) "activated");
        ((Field) term45135).setAccessible(true);
        Object enum104 = ((Field) term45135).get((Object) null);
        term44906 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Driver"));
        Object term44973 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Rating"));
        Object term44981 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        Object term44982 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        Object term44984 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger"));
        Object term44985 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Offer"));
        setField(term44906, term44906.getClass(), "driverLicense", "JlirfQsPTm");
        setField(term44906, term44906.getClass(), "nationalID", "jqfJtiVFaf");
        setField(term44906, term44906.getClass(), "isVerified", term44931);
        setField(term44906, term44906.getClass(), "favouriteAreas", term44933);
        setField(term44906, term44906.getClass(), "rides", term44969);
        setField(term44973, term44973.getClass(), "driverRatings", term44974);
        setIntField(term44973, term44973.getClass(), "ratingSum", 1846078344);
        setIntField(term44973, term44973.getClass(), "numberOfRatings", 1692543802);
        setField(term44906, term44906.getClass(), "rating", term44973);
        setField(term44981, term44981.getClass(), "source", term44941);
        setField(term44982, term44982.getClass(), "location", null);
        setBooleanField(term44982, term44982.getClass(), "isDiscounted", false);
        setField(term44982, term44982.getClass(), "drivers", null);
        setField(term44981, term44981.getClass(), "destination", term44982);
        setField(term44984, term44984.getClass(), "pastRides", null);
        setField(term44984, term44984.getClass(), "currentRide", null);
        setField(term44984, term44984.getClass(), "dateOfBirth", null);
        setField(term44984, term44984.getClass(), "username", null);
        setField(term44984, term44984.getClass(), "mobileNumber", null);
        setField(term44984, term44984.getClass(), "email", null);
        setField(term44984, term44984.getClass(), "password", null);
        setField(term44984, term44984.getClass(), "userStatus", null);
        setField(term44981, term44981.getClass(), "passenger", term44984);
        setDoubleField(term44985, term44985.getClass(), "price", 0.0);
        setDoubleField(term44985, term44985.getClass(), "discountedPrice", 0.0);
        setField(term44985, term44985.getClass(), "driver", null);
        setField(term44981, term44981.getClass(), "acceptedOffer", term44985);
        setField(term44981, term44981.getClass(), "offers", term44988);
        setField(term44981, term44981.getClass(), "isAccepted", term45001);
        setField(term44981, term44981.getClass(), "events", term45003);
        setIntField(term44981, term44981.getClass(), "numberOfPassengers", 2081679151);
        setField(term44906, term44906.getClass(), "currentRide", term44981);
        setIntField(term44906, term44906.getClass(), "numberOfPassengers", 376341151);
        setField(term44906, term44906.getClass(), "username", "OhYEjeUQkK");
        setField(term44906, term44906.getClass(), "mobileNumber", "rgZeldfAMO");
        setField(term44906, term44906.getClass(), "email", "btsBDylBZe");
        setField(term44906, term44906.getClass(), "password", "eAWJddaxnT");
        setField(term44906, term44906.getClass(), "userStatus", enum104);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.CustomerSubsystem.Driver");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "listFavouriteAreas", argTypes, term44906, args);
    }

};


