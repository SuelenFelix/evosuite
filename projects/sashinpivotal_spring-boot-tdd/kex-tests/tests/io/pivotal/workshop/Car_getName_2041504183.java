package io.pivotal.workshop;

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
import static io.pivotal.workshop.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class Car_getName_2041504183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91;

    public Car_getName_2041504183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term92 = new Long(6375119433582206027L);
        term91 = newInstance(Class.forName("io.pivotal.workshop.Car"));
        setField(term91, term91.getClass(), "id", term92);
        setField(term91, term91.getClass(), "name", "jJCZpVmanW");
        setField(term91, term91.getClass(), "type", "EGtDIRbSSb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.pivotal.workshop.Car");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term91, args);
    }

};


