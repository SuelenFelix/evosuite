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
import java.lang.Integer;

public class Jedi_setVersion_2584768097 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183;
     Object term200;

    public Jedi_setVersion_2584768097() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term184 = new Integer(-616727354);
        term183 = newInstance(Class.forName("com.bootcampjava.startwars.model.Jedi"));
        setField(term183, term183.getClass(), "id", term184);
        setField(term183, term183.getClass(), "name", "MjGYSRKTNF");
        setIntField(term183, term183.getClass(), "strength", -522618178);
        setIntField(term183, term183.getClass(), "version", 1134449235);
        term200 = new Integer(-883034806);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bootcampjava.startwars.model.Jedi");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term200;
        callMethod(klass, "setVersion", argTypes, term183, args);
    }

};


