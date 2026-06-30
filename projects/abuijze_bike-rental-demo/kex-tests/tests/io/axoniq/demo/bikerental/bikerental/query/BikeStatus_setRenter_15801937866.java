package io.axoniq.demo.bikerental.bikerental.query;

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
import static io.axoniq.demo.bikerental.bikerental.query.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BikeStatus_setRenter_15801937866 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term445;

    public BikeStatus_setRenter_15801937866() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term445 = newInstance(Class.forName("io.axoniq.demo.bikerental.bikerental.query.BikeStatus"));
        setField(term445, term445.getClass(), "bikeId", "hNxWaHcfhY");
        setField(term445, term445.getClass(), "bikeType", "RkybSrpybU");
        setField(term445, term445.getClass(), "location", "xOEqzGAmDU");
        setField(term445, term445.getClass(), "renter", "eZFUvlxvGV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.axoniq.demo.bikerental.bikerental.query.BikeStatus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BYqFIqCKAV";
        callMethod(klass, "setRenter", argTypes, term445, args);
    }

};


