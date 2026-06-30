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

public class CustomerApplicationService_getCustomerByID_7276639696 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term257;

    public CustomerApplicationService_getCustomerByID_7276639696() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term257 = newInstance(Class.forName("ru.sbt.azatakhunov.customerservice.application.CustomerApplicationService"));
        setField(term257, term257.getClass(), "customerIDService", null);
        setField(term257, term257.getClass(), "customerFactoryService", null);
        setField(term257, term257.getClass(), "customerRepository", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.sbt.azatakhunov.customerservice.application.CustomerApplicationService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getCustomerByID", argTypes, term257, args);
    }

};


