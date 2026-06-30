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

public class CustomerApplicationService_withdrawCustomer_15350699143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119;

    public CustomerApplicationService_withdrawCustomer_15350699143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119 = newInstance(Class.forName("ru.sbt.azatakhunov.customerservice.application.CustomerApplicationService"));
        Object term120 = newInstance(Class.forName("ru.sbt.azatakhunov.customerservice.domain.CustomerFactoryService"));
        Object term121 = newInstance(Class.forName("ru.sbt.azatakhunov.customerservice.port.adapter.persistance.CustomerRepository"));
        setField(term119, term119.getClass(), "customerIDService", null);
        setField(term119, term119.getClass(), "customerFactoryService", term120);
        setField(term119, term119.getClass(), "customerRepository", term121);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.sbt.azatakhunov.customerservice.application.CustomerApplicationService");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "EGtDIRbSSb";
        args[1] = "SzjVpOQTyS";
        callMethod(klass, "withdrawCustomer", argTypes, term119, args);
    }

};


