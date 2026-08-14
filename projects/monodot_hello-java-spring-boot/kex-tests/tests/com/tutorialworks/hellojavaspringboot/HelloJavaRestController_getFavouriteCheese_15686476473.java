package com.tutorialworks.hellojavaspringboot;

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
import static com.tutorialworks.hellojavaspringboot.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class HelloJavaRestController_getFavouriteCheese_15686476473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24;

    public HelloJavaRestController_getFavouriteCheese_15686476473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24 = newInstance(Class.forName("com.tutorialworks.hellojavaspringboot.HelloJavaRestController"));
        setField(term24, term24.getClass(), "favouriteCheese", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.tutorialworks.hellojavaspringboot.HelloJavaRestController");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFavouriteCheese", argTypes, term24, args);
    }

};


