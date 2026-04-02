package com.bootcampjava.startwars.model;

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
import static com.bootcampjava.startwars.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Jedi_getName_183432779114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term303;

    public Jedi_getName_183432779114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term303 = newInstance(Class.forName("com.bootcampjava.startwars.model.Jedi"));
        setField(term303, term303.getClass(), "id", null);
        setField(term303, term303.getClass(), "name", null);
        setIntField(term303, term303.getClass(), "strength", 0);
        setIntField(term303, term303.getClass(), "version", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bootcampjava.startwars.model.Jedi");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term303, args);
    }

};


