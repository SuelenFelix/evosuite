package com.example.springsecurityjwttutorial;

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
import static com.example.springsecurityjwttutorial.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SpringSecurityJwtTutorialApplication_main_11066256391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term701;

    public SpringSecurityJwtTutorialApplication_main_11066256391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term701 = (Object[]) newArray("java.lang.String", 5);
        setElement(term701, 0, "OWDIEULEFu");
        setElement(term701, 1, "dWRymuLBtr");
        setElement(term701, 2, "AijpHYOFuy");
        setElement(term701, 3, "SbAoxhfrkn");
        setElement(term701, 4, "kuTXqwMtDB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.springsecurityjwttutorial.SpringSecurityJwtTutorialApplication");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term701;
        callMethod(klass, "main", argTypes, null, args);
    }

};


