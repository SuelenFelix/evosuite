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

public class CustomerApplicationService_init_19817559525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public CustomerApplicationService_init_19817559525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.sbt.azatakhunov.customerservice.application.CustomerApplicationService");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("ru.sbt.azatakhunov.customerservice.domain.CustomerIDService");
        argTypes[1] = Class.forName("ru.sbt.azatakhunov.customerservice.domain.CustomerFactoryService");
        argTypes[2] = Class.forName("ru.sbt.azatakhunov.customerservice.port.adapter.persistance.CustomerRepository");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


