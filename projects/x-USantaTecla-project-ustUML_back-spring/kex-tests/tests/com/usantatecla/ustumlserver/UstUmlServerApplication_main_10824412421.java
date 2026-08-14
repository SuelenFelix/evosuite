package com.usantatecla.ustumlserver;

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
import static com.usantatecla.ustumlserver.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class UstUmlServerApplication_main_10824412421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183744;

    public UstUmlServerApplication_main_10824412421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term183744 = (Object[]) newArray("java.lang.String", 6);
        setElement(term183744, 0, "BhmFDzFKBZ");
        setElement(term183744, 1, "LfhJOBaMfN");
        setElement(term183744, 2, "gTpNrKjAOw");
        setElement(term183744, 3, "mezvZVqRCp");
        setElement(term183744, 4, "bZOShgQvtT");
        setElement(term183744, 5, "SrodJwobhd");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.UstUmlServerApplication");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term183744;
        callMethod(klass, "main", argTypes, null, args);
    }

};


