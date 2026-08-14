package com.codex.aposta.model;

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
import static com.codex.aposta.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class Aposta_init_4240568672 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term669;

    public Aposta_init_4240568672() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term670 = new Long(-2813493605142626659L);
        term669 = newInstance(Class.forName("com.codex.aposta.model.Apostador"));
        setField(term669, term669.getClass(), "id", term670);
        setField(term669, term669.getClass(), "nome", "TEParAifyi");
        setField(term669, term669.getClass(), "email", "OWDIEULEFu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.codex.aposta.model.Aposta");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.codex.aposta.model.Apostador");
        Object[] args = new Object[2];
        args[0] = "IoAlmYsBwc";
        args[1] = term669;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


