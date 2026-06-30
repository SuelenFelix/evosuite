package ru.sbt.azatakhunov.customerservice.domain;

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
import static ru.sbt.azatakhunov.customerservice.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CustomerInfo_getName_116097061729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3541;

    public CustomerInfo_getName_116097061729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3541 = newInstance(Class.forName("ru.sbt.azatakhunov.customerservice.domain.CustomerInfo"));
        setField(term3541, term3541.getClass(), "id", null);
        setField(term3541, term3541.getClass(), "pw", null);
        setField(term3541, term3541.getClass(), "name", null);
        setField(term3541, term3541.getClass(), "address", null);
        setField(term3541, term3541.getClass(), "registeredDay", null);
        setField(term3541, term3541.getClass(), "eventList", null);
        setField(term3541, term3541.getClass(), "methodMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.sbt.azatakhunov.customerservice.domain.CustomerInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term3541, args);
    }

};


