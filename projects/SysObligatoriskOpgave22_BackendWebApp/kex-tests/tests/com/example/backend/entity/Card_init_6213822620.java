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
import java.lang.String;
import java.lang.Object;

public class Card_init_6213822620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum57;
     Object enum58;

    public Card_init_6213822620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14613 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term14612 = ((Class) term14613).getDeclaredField((String) "ACE");
        ((Field) term14612).setAccessible(true);
        enum57 = ((Field) term14612).get((Object) null);
        Class<? extends Object> term14784 = Class.forName((String) "com.example.backend.entity.Suit");
        Field term14783 = ((Class) term14784).getDeclaredField((String) "HEARTS");
        ((Field) term14783).setAccessible(true);
        enum58 = ((Field) term14783).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.entity.Card");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.example.backend.entity.Rank");
        argTypes[1] = Class.forName("com.example.backend.entity.Suit");
        Object[] args = new Object[2];
        args[0] = enum57;
        args[1] = enum58;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


