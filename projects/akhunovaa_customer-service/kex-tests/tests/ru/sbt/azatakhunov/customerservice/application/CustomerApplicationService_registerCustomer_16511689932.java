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
import java.lang.Object;

public class CustomerApplicationService_registerCustomer_16511689932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28;

    public CustomerApplicationService_registerCustomer_16511689932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28 = newInstance(Class.forName("ru.sbt.azatakhunov.customerservice.application.CustomerApplicationService"));
        Object term29 = newInstance(Class.forName("ru.sbt.azatakhunov.customerservice.domain.CustomerFactoryService"));
        Object term30 = newInstance(Class.forName("ru.sbt.azatakhunov.customerservice.port.adapter.persistance.CustomerRepository"));
        setField(term28, term28.getClass(), "customerIDService", null);
        setField(term28, term28.getClass(), "customerFactoryService", term29);
        setField(term28, term28.getClass(), "customerRepository", term30);
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
        args[0] = "sjlJAEtRrb";
        args[1] = "MuLcgQHgqz";
        args[2] = "xxtlPwDYFs";
        args[3] = "jJCZpVmanW";
        callMethod(klass, "registerCustomer", argTypes, term28, args);
    }

};


