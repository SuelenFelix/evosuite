package com.example.backend.dto;

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
import static com.example.backend.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;

public class CardResponse_setSuit_34688395813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6127;
     Object enum28;

    public CardResponse_setSuit_34688395813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6128 = new Long(6855071767938501807L);
        Class<? extends Object> term6208 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term6207 = ((Class) term6208).getDeclaredField((String) "FIVE");
        ((Field) term6207).setAccessible(true);
        Object enum26 = ((Field) term6207).get((Object) null);
        Class<? extends Object> term6382 = Class.forName((String) "com.example.backend.entity.Suit");
        Field term6381 = ((Class) term6382).getDeclaredField((String) "CLUBS");
        ((Field) term6381).setAccessible(true);
        Object enum27 = ((Field) term6381).get((Object) null);
        term6127 = newInstance(Class.forName("com.example.backend.dto.CardResponse"));
        setField(term6127, term6127.getClass(), "id", term6128);
        setField(term6127, term6127.getClass(), "rank", enum26);
        setField(term6127, term6127.getClass(), "suit", enum27);
        setField(term6127, term6127.getClass(), "imageUrl", "tPlsykYBqO");
        setField(term6127, term6127.getClass(), "person", "bLPjGVBhlX");
        setField(term6127, term6127.getClass(), "action", "whBvTVIIlC");
        setField(term6127, term6127.getClass(), "object", "IgRJUzaCwW");
        Class<? extends Object> term6599 = Class.forName((String) "com.example.backend.entity.Suit");
        Field term6598 = ((Class) term6599).getDeclaredField((String) "DIAMONDS");
        ((Field) term6598).setAccessible(true);
        enum28 = ((Field) term6598).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.dto.CardResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.example.backend.entity.Suit");
        Object[] args = new Object[1];
        args[0] = enum28;
        callMethod(klass, "setSuit", argTypes, term6127, args);
    }

};


