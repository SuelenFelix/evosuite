package io.reactive.learning.controller;

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
import static io.reactive.learning.controller.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Ip_canEqual_8114276843 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1164;
     Object term1177;

    public Ip_canEqual_8114276843() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1164 = newInstance(Class.forName("io.reactive.learning.controller.Ip"));
        setField(term1164, term1164.getClass(), "origin", "vQVyKLdtaz");
        term1177 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.reactive.learning.controller.Ip");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1177;
        callMethod(klass, "canEqual", argTypes, term1164, args);
    }

};


