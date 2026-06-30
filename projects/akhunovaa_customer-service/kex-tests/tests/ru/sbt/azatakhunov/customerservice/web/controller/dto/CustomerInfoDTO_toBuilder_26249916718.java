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

public class CustomerInfoDTO_toBuilder_26249916718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1889;

    public CustomerInfoDTO_toBuilder_26249916718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1889 = newInstance(Class.forName("ru.sbt.azatakhunov.customerservice.web.controller.dto.CustomerInfoDTO"));
        setField(term1889, term1889.getClass(), "id", null);
        setField(term1889, term1889.getClass(), "pw", null);
        setField(term1889, term1889.getClass(), "name", null);
        setField(term1889, term1889.getClass(), "address", null);
        setField(term1889, term1889.getClass(), "registeredDay", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.sbt.azatakhunov.customerservice.web.controller.dto.CustomerInfoDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toBuilder", argTypes, term1889, args);
    }

};


