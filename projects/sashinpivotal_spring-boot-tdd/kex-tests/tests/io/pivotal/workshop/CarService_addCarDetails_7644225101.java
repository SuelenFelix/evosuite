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

public class CarService_addCarDetails_7644225101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term446;

    public CarService_addCarDetails_7644225101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term447 = new Long(6811161968424632369L);
        term446 = newInstance(Class.forName("io.pivotal.workshop.Car"));
        setField(term446, term446.getClass(), "id", term447);
        setField(term446, term446.getClass(), "name", "pCTimMblYc");
        setField(term446, term446.getClass(), "type", "hNxWaHcfhY");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.pivotal.workshop.CarService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.pivotal.workshop.Car");
        Object[] args = new Object[1];
        args[0] = term446;
        callMethod(klass, "addCarDetails", argTypes, null, args);
    }

};


