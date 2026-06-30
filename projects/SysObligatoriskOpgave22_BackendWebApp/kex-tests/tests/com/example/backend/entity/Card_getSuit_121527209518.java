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

public class Card_getSuit_121527209518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19770;

    public Card_getSuit_121527209518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19770 = newInstance(Class.forName("com.example.backend.entity.Card"));
        setField(term19770, term19770.getClass(), "id", null);
        setField(term19770, term19770.getClass(), "rank", null);
        setField(term19770, term19770.getClass(), "suit", null);
        setField(term19770, term19770.getClass(), "paoCards", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.entity.Card");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSuit", argTypes, term19770, args);
    }

};


