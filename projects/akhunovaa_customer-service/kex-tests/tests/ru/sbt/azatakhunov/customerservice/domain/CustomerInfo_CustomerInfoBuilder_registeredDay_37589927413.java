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

public class CustomerInfo_CustomerInfoBuilder_registeredDay_37589927413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term892;

    public CustomerInfo_CustomerInfoBuilder_registeredDay_37589927413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term892 = newInstance(Class.forName("ru.sbt.azatakhunov.customerservice.domain.CustomerInfo$CustomerInfoBuilder"));
        setField(term892, term892.getClass(), "id", null);
        setField(term892, term892.getClass(), "pw", null);
        setField(term892, term892.getClass(), "name", null);
        setField(term892, term892.getClass(), "address", null);
        setField(term892, term892.getClass(), "registeredDay", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.sbt.azatakhunov.customerservice.domain.CustomerInfo$CustomerInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "registeredDay", argTypes, term892, args);
    }

};


