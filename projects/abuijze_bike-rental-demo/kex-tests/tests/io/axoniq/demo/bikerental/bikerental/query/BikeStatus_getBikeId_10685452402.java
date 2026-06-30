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

public class BikeStatus_getBikeId_10685452402 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67;

    public BikeStatus_getBikeId_10685452402() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67 = newInstance(Class.forName("io.axoniq.demo.bikerental.bikerental.query.BikeStatus"));
        setField(term67, term67.getClass(), "bikeId", "xxtlPwDYFs");
        setField(term67, term67.getClass(), "bikeType", "jJCZpVmanW");
        setField(term67, term67.getClass(), "location", "EGtDIRbSSb");
        setField(term67, term67.getClass(), "renter", "SzjVpOQTyS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.axoniq.demo.bikerental.bikerental.query.BikeStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBikeId", argTypes, term67, args);
    }

};


