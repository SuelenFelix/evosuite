package com.example.backend.entity;

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
import static com.example.backend.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Deck_setDescription_132564511716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21305;

    public Deck_setDescription_132564511716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21305 = newInstance(Class.forName("com.example.backend.entity.Deck"));
        setField(term21305, term21305.getClass(), "id", null);
        setField(term21305, term21305.getClass(), "name", null);
        setField(term21305, term21305.getClass(), "description", null);
        setField(term21305, term21305.getClass(), "paoCards", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.entity.Deck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setDescription", argTypes, term21305, args);
    }

};


