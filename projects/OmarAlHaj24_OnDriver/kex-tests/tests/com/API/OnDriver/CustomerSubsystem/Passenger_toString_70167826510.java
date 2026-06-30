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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.String;

public class Passenger_toString_70167826510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6847;

    public Passenger_toString_70167826510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6859 = new ArrayList();
        ((ArrayList) term6859).add((Object)null);
        ((ArrayList) term6859).add((Object)null);
        ((ArrayList) term6859).add((Object)null);
        ((ArrayList) term6859).add((Object)null);
        ((ArrayList) term6859).add((Object)null);
        ((ArrayList) term6859).add((Object)null);
        ((ArrayList) term6859).add((Object)null);
        ((ArrayList) term6859).add((Object)null);
        ((ArrayList) term6859).add((Object)null);
        Boolean term6862 = new Boolean(false);
        ArrayList term6864 = new ArrayList();
        ((ArrayList) term6864).add((Object)null);
        ((ArrayList) term6864).add((Object)null);
        ((ArrayList) term6864).add((Object)null);
        ((ArrayList) term6864).add((Object)null);
        Object term6850 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        Object term6851 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        Object term6853 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        Object term6855 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger"));
        Object term6856 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Offer"));
        setField(term6851, term6851.getClass(), "location", null);
        setBooleanField(term6851, term6851.getClass(), "isDiscounted", true);
        setField(term6851, term6851.getClass(), "drivers", null);
        setField(term6850, term6850.getClass(), "source", term6851);
        setField(term6853, term6853.getClass(), "location", null);
        setBooleanField(term6853, term6853.getClass(), "isDiscounted", false);
        setField(term6853, term6853.getClass(), "drivers", null);
        setField(term6850, term6850.getClass(), "destination", term6853);
        setField(term6855, term6855.getClass(), "pastRides", null);
        setField(term6855, term6855.getClass(), "currentRide", null);
        setField(term6855, term6855.getClass(), "dateOfBirth", null);
        setField(term6855, term6855.getClass(), "username", null);
        setField(term6855, term6855.getClass(), "mobileNumber", null);
        setField(term6855, term6855.getClass(), "email", null);
        setField(term6855, term6855.getClass(), "password", null);
        setField(term6855, term6855.getClass(), "userStatus", null);
        setField(term6850, term6850.getClass(), "passenger", term6855);
        setDoubleField(term6856, term6856.getClass(), "price", 0.5187846213101265);
        setDoubleField(term6856, term6856.getClass(), "discountedPrice", 0.045893173090043815);
        setField(term6856, term6856.getClass(), "driver", null);
        setField(term6850, term6850.getClass(), "acceptedOffer", term6856);
        setField(term6850, term6850.getClass(), "offers", term6859);
        setField(term6850, term6850.getClass(), "isAccepted", term6862);
        setField(term6850, term6850.getClass(), "events", term6864);
        setIntField(term6850, term6850.getClass(), "numberOfPassengers", 515182546);
        Object term6868 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term6868, term6868.getClass(), "source", null);
        setField(term6868, term6868.getClass(), "destination", null);
        setField(term6868, term6868.getClass(), "passenger", null);
        setField(term6868, term6868.getClass(), "acceptedOffer", null);
        setField(term6868, term6868.getClass(), "offers", null);
        setField(term6868, term6868.getClass(), "isAccepted", null);
        setField(term6868, term6868.getClass(), "events", null);
        setIntField(term6868, term6868.getClass(), "numberOfPassengers", 0);
        Object term6870 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term6870, term6870.getClass(), "source", null);
        setField(term6870, term6870.getClass(), "destination", null);
        setField(term6870, term6870.getClass(), "passenger", null);
        setField(term6870, term6870.getClass(), "acceptedOffer", null);
        setField(term6870, term6870.getClass(), "offers", null);
        setField(term6870, term6870.getClass(), "isAccepted", null);
        setField(term6870, term6870.getClass(), "events", null);
        setIntField(term6870, term6870.getClass(), "numberOfPassengers", 0);
        Object term6872 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term6872, term6872.getClass(), "source", null);
        setField(term6872, term6872.getClass(), "destination", null);
        setField(term6872, term6872.getClass(), "passenger", null);
        setField(term6872, term6872.getClass(), "acceptedOffer", null);
        setField(term6872, term6872.getClass(), "offers", null);
        setField(term6872, term6872.getClass(), "isAccepted", null);
        setField(term6872, term6872.getClass(), "events", null);
        setIntField(term6872, term6872.getClass(), "numberOfPassengers", 0);
        Object term6874 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term6874, term6874.getClass(), "source", null);
        setField(term6874, term6874.getClass(), "destination", null);
        setField(term6874, term6874.getClass(), "passenger", null);
        setField(term6874, term6874.getClass(), "acceptedOffer", null);
        setField(term6874, term6874.getClass(), "offers", null);
        setField(term6874, term6874.getClass(), "isAccepted", null);
        setField(term6874, term6874.getClass(), "events", null);
        setIntField(term6874, term6874.getClass(), "numberOfPassengers", 0);
        ArrayList term6848 = new ArrayList();
        ((ArrayList) term6848).add(term6850);
        ((ArrayList) term6848).add(term6868);
        ((ArrayList) term6848).add(term6870);
        ((ArrayList) term6848).add(term6872);
        ((ArrayList) term6848).add(term6850);
        ((ArrayList) term6848).add(term6874);
        ((ArrayList) term6848).add(term6870);
        ((ArrayList) term6848).add(term6872);
        Class<? extends Object> term7002 = Class.forName((String) "com.API.OnDriver.CustomerSubsystem.UserStatus");
        Field term7001 = ((Class) term7002).getDeclaredField((String) "activated");
        ((Field) term7001).setAccessible(true);
        Object enum14 = ((Field) term7001).get((Object) null);
        term6847 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger"));
        setField(term6847, term6847.getClass(), "pastRides", term6848);
        setField(term6847, term6847.getClass(), "currentRide", term6870);
        setField(term6847, term6847.getClass(), "dateOfBirth", "MIwvgVrhzP");
        setField(term6847, term6847.getClass(), "username", "HcUUieXdep");
        setField(term6847, term6847.getClass(), "mobileNumber", "AbonCTtbef");
        setField(term6847, term6847.getClass(), "email", "maXrGOGoKA");
        setField(term6847, term6847.getClass(), "password", "zAkgWQVCpM");
        setField(term6847, term6847.getClass(), "userStatus", enum14);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term6847, args);
    }

};


