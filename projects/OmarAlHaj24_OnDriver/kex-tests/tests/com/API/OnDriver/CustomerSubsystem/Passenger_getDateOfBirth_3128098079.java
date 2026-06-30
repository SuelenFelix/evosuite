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

public class Passenger_getDateOfBirth_3128098079 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6426;

    public Passenger_getDateOfBirth_3128098079() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6438 = new ArrayList();
        ((ArrayList) term6438).add((Object)null);
        ((ArrayList) term6438).add((Object)null);
        ((ArrayList) term6438).add((Object)null);
        Boolean term6441 = new Boolean(true);
        ArrayList term6443 = new ArrayList();
        ((ArrayList) term6443).add((Object)null);
        ((ArrayList) term6443).add((Object)null);
        ((ArrayList) term6443).add((Object)null);
        ((ArrayList) term6443).add((Object)null);
        ((ArrayList) term6443).add((Object)null);
        ((ArrayList) term6443).add((Object)null);
        ((ArrayList) term6443).add((Object)null);
        Object term6429 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        Object term6430 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        Object term6432 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Area"));
        Object term6434 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger"));
        Object term6435 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Offer"));
        setField(term6430, term6430.getClass(), "location", null);
        setBooleanField(term6430, term6430.getClass(), "isDiscounted", false);
        setField(term6430, term6430.getClass(), "drivers", null);
        setField(term6429, term6429.getClass(), "source", term6430);
        setField(term6432, term6432.getClass(), "location", null);
        setBooleanField(term6432, term6432.getClass(), "isDiscounted", false);
        setField(term6432, term6432.getClass(), "drivers", null);
        setField(term6429, term6429.getClass(), "destination", term6432);
        setField(term6434, term6434.getClass(), "pastRides", null);
        setField(term6434, term6434.getClass(), "currentRide", null);
        setField(term6434, term6434.getClass(), "dateOfBirth", null);
        setField(term6434, term6434.getClass(), "username", null);
        setField(term6434, term6434.getClass(), "mobileNumber", null);
        setField(term6434, term6434.getClass(), "email", null);
        setField(term6434, term6434.getClass(), "password", null);
        setField(term6434, term6434.getClass(), "userStatus", null);
        setField(term6429, term6429.getClass(), "passenger", term6434);
        setDoubleField(term6435, term6435.getClass(), "price", 0.29874017652881824);
        setDoubleField(term6435, term6435.getClass(), "discountedPrice", 0.32554480512985284);
        setField(term6435, term6435.getClass(), "driver", null);
        setField(term6429, term6429.getClass(), "acceptedOffer", term6435);
        setField(term6429, term6429.getClass(), "offers", term6438);
        setField(term6429, term6429.getClass(), "isAccepted", term6441);
        setField(term6429, term6429.getClass(), "events", term6443);
        setIntField(term6429, term6429.getClass(), "numberOfPassengers", 252575029);
        Object term6447 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term6447, term6447.getClass(), "source", null);
        setField(term6447, term6447.getClass(), "destination", null);
        setField(term6447, term6447.getClass(), "passenger", null);
        setField(term6447, term6447.getClass(), "acceptedOffer", null);
        setField(term6447, term6447.getClass(), "offers", null);
        setField(term6447, term6447.getClass(), "isAccepted", null);
        setField(term6447, term6447.getClass(), "events", null);
        setIntField(term6447, term6447.getClass(), "numberOfPassengers", 0);
        Object term6449 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term6449, term6449.getClass(), "source", null);
        setField(term6449, term6449.getClass(), "destination", null);
        setField(term6449, term6449.getClass(), "passenger", null);
        setField(term6449, term6449.getClass(), "acceptedOffer", null);
        setField(term6449, term6449.getClass(), "offers", null);
        setField(term6449, term6449.getClass(), "isAccepted", null);
        setField(term6449, term6449.getClass(), "events", null);
        setIntField(term6449, term6449.getClass(), "numberOfPassengers", 0);
        Object term6451 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term6451, term6451.getClass(), "source", null);
        setField(term6451, term6451.getClass(), "destination", null);
        setField(term6451, term6451.getClass(), "passenger", null);
        setField(term6451, term6451.getClass(), "acceptedOffer", null);
        setField(term6451, term6451.getClass(), "offers", null);
        setField(term6451, term6451.getClass(), "isAccepted", null);
        setField(term6451, term6451.getClass(), "events", null);
        setIntField(term6451, term6451.getClass(), "numberOfPassengers", 0);
        Object term6453 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term6453, term6453.getClass(), "source", null);
        setField(term6453, term6453.getClass(), "destination", null);
        setField(term6453, term6453.getClass(), "passenger", null);
        setField(term6453, term6453.getClass(), "acceptedOffer", null);
        setField(term6453, term6453.getClass(), "offers", null);
        setField(term6453, term6453.getClass(), "isAccepted", null);
        setField(term6453, term6453.getClass(), "events", null);
        setIntField(term6453, term6453.getClass(), "numberOfPassengers", 0);
        Object term6455 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term6455, term6455.getClass(), "source", null);
        setField(term6455, term6455.getClass(), "destination", null);
        setField(term6455, term6455.getClass(), "passenger", null);
        setField(term6455, term6455.getClass(), "acceptedOffer", null);
        setField(term6455, term6455.getClass(), "offers", null);
        setField(term6455, term6455.getClass(), "isAccepted", null);
        setField(term6455, term6455.getClass(), "events", null);
        setIntField(term6455, term6455.getClass(), "numberOfPassengers", 0);
        Object term6457 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term6457, term6457.getClass(), "source", null);
        setField(term6457, term6457.getClass(), "destination", null);
        setField(term6457, term6457.getClass(), "passenger", null);
        setField(term6457, term6457.getClass(), "acceptedOffer", null);
        setField(term6457, term6457.getClass(), "offers", null);
        setField(term6457, term6457.getClass(), "isAccepted", null);
        setField(term6457, term6457.getClass(), "events", null);
        setIntField(term6457, term6457.getClass(), "numberOfPassengers", 0);
        Object term6459 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term6459, term6459.getClass(), "source", null);
        setField(term6459, term6459.getClass(), "destination", null);
        setField(term6459, term6459.getClass(), "passenger", null);
        setField(term6459, term6459.getClass(), "acceptedOffer", null);
        setField(term6459, term6459.getClass(), "offers", null);
        setField(term6459, term6459.getClass(), "isAccepted", null);
        setField(term6459, term6459.getClass(), "events", null);
        setIntField(term6459, term6459.getClass(), "numberOfPassengers", 0);
        ArrayList term6427 = new ArrayList();
        ((ArrayList) term6427).add(term6429);
        ((ArrayList) term6427).add(term6447);
        ((ArrayList) term6427).add(term6449);
        ((ArrayList) term6427).add(term6451);
        ((ArrayList) term6427).add(term6453);
        ((ArrayList) term6427).add(term6455);
        ((ArrayList) term6427).add(term6453);
        ((ArrayList) term6427).add(term6457);
        ((ArrayList) term6427).add(term6459);
        Class<? extends Object> term6589 = Class.forName((String) "com.API.OnDriver.CustomerSubsystem.UserStatus");
        Field term6588 = ((Class) term6589).getDeclaredField((String) "activated");
        ((Field) term6588).setAccessible(true);
        Object enum13 = ((Field) term6588).get((Object) null);
        term6426 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger"));
        Object term6463 = newInstance(Class.forName("com.API.OnDriver.RideSubsystem.Ride"));
        setField(term6426, term6426.getClass(), "pastRides", term6427);
        setField(term6463, term6463.getClass(), "source", null);
        setField(term6463, term6463.getClass(), "destination", null);
        setField(term6463, term6463.getClass(), "passenger", null);
        setField(term6463, term6463.getClass(), "acceptedOffer", null);
        setField(term6463, term6463.getClass(), "offers", null);
        setField(term6463, term6463.getClass(), "isAccepted", null);
        setField(term6463, term6463.getClass(), "events", null);
        setIntField(term6463, term6463.getClass(), "numberOfPassengers", 0);
        setField(term6426, term6426.getClass(), "currentRide", term6463);
        setField(term6426, term6426.getClass(), "dateOfBirth", "QXyFXBjFde");
        setField(term6426, term6426.getClass(), "username", "xVFgeyYxZS");
        setField(term6426, term6426.getClass(), "mobileNumber", "iQiGTulJiH");
        setField(term6426, term6426.getClass(), "email", "utCuuVCKqE");
        setField(term6426, term6426.getClass(), "password", "zSfoqzJbPT");
        setField(term6426, term6426.getClass(), "userStatus", enum13);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.CustomerSubsystem.Passenger");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDateOfBirth", argTypes, term6426, args);
    }

};


