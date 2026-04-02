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

public class Jedi_setName_11445122315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term306;

    public Jedi_setName_11445122315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term306 = newInstance(Class.forName("com.bootcampjava.startwars.model.Jedi"));
        setField(term306, term306.getClass(), "id", null);
        setField(term306, term306.getClass(), "name", null);
        setIntField(term306, term306.getClass(), "strength", 0);
        setIntField(term306, term306.getClass(), "version", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bootcampjava.startwars.model.Jedi");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setName", argTypes, term306, args);
    }

};


