package ru.sbt.azatakhunov.customerservice.application;

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
import static ru.sbt.azatakhunov.customerservice.application.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CustomerApplicationService_registerCustomer_16511689937 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term258;

    public CustomerApplicationService_registerCustomer_16511689937() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term258 = newInstance(Class.forName("ru.sbt.azatakhunov.customerservice.application.CustomerApplicationService"));
        setField(term258, term258.getClass(), "customerIDService", null);
        setField(term258, term258.getClass(), "customerFactoryService", null);
        setField(term258, term258.getClass(), "customerRepository", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.sbt.azatakhunov.customerservice.application.CustomerApplicationService");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "registerCustomer", argTypes, term258, args);
    }

};


