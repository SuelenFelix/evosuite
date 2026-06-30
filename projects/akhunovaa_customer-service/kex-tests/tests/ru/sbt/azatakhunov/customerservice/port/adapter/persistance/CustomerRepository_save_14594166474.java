package ru.sbt.azatakhunov.customerservice.port.adapter.persistance;

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
import static ru.sbt.azatakhunov.customerservice.port.adapter.persistance.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CustomerRepository_save_14594166474 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154;

    public CustomerRepository_save_14594166474() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154 = newInstance(Class.forName("ru.sbt.azatakhunov.customerservice.port.adapter.persistance.CustomerRepository"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.sbt.azatakhunov.customerservice.port.adapter.persistance.CustomerRepository");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.sbt.azatakhunov.customerservice.domain.CustomerInfo");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "save", argTypes, term154, args);
    }

};


