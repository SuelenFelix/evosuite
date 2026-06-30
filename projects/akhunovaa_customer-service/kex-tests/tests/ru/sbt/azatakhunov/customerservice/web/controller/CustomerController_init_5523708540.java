package ru.sbt.azatakhunov.customerservice.web.controller;

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
import static ru.sbt.azatakhunov.customerservice.web.controller.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CustomerController_init_5523708540 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2447;
     Object term2449;

    public CustomerController_init_5523708540() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2447 = newInstance(Class.forName("ru.sbt.azatakhunov.customerservice.application.CustomerQueryService"));
        Object term2448 = newInstance(Class.forName("ru.sbt.azatakhunov.customerservice.port.adapter.persistance.CustomerProjectionRepository"));
        setField(term2447, term2447.getClass(), "customerProjectionRepository", term2448);
        term2449 = newInstance(Class.forName("ru.sbt.azatakhunov.customerservice.application.CustomerApplicationService"));
        Object term2450 = newInstance(Class.forName("ru.sbt.azatakhunov.customerservice.domain.CustomerFactoryService"));
        Object term2451 = newInstance(Class.forName("ru.sbt.azatakhunov.customerservice.port.adapter.persistance.CustomerRepository"));
        setField(term2449, term2449.getClass(), "customerIDService", null);
        setField(term2449, term2449.getClass(), "customerFactoryService", term2450);
        setField(term2449, term2449.getClass(), "customerRepository", term2451);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.sbt.azatakhunov.customerservice.web.controller.CustomerController");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("ru.sbt.azatakhunov.customerservice.application.CustomerQueryService");
        argTypes[1] = Class.forName("ru.sbt.azatakhunov.customerservice.application.CustomerApplicationService");
        Object[] args = new Object[2];
        args[0] = term2447;
        args[1] = term2449;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


