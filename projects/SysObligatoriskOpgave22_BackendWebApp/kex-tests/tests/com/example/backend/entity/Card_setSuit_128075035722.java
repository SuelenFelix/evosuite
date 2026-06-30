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

public class Card_setSuit_128075035722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19774;

    public Card_setSuit_128075035722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19774 = newInstance(Class.forName("com.example.backend.entity.Card"));
        setField(term19774, term19774.getClass(), "id", null);
        setField(term19774, term19774.getClass(), "rank", null);
        setField(term19774, term19774.getClass(), "suit", null);
        setField(term19774, term19774.getClass(), "paoCards", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.entity.Card");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.example.backend.entity.Suit");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSuit", argTypes, term19774, args);
    }

};


