package ru.sbt.azatakhunov.customerservice.web.controller.dto;

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
import static ru.sbt.azatakhunov.customerservice.web.controller.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CustomerInfoDTO_equals_69149813513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1442;
     Object term1503;

    public CustomerInfoDTO_equals_69149813513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1442 = newInstance(Class.forName("ru.sbt.azatakhunov.customerservice.web.controller.dto.CustomerInfoDTO"));
        setField(term1442, term1442.getClass(), "id", "uWHnvSvaPl");
        setField(term1442, term1442.getClass(), "pw", "kBdSllIBVz");
        setField(term1442, term1442.getClass(), "name", "TJmVBGfTML");
        setField(term1442, term1442.getClass(), "address", "tPlsykYBqO");
        setField(term1442, term1442.getClass(), "registeredDay", "bLPjGVBhlX");
        term1503 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.sbt.azatakhunov.customerservice.web.controller.dto.CustomerInfoDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1503;
        callMethod(klass, "equals", argTypes, term1442, args);
    }

};


