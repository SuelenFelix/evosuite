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

public class CardResponse_setId_183414808311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5017;
     Object term5086;

    public CardResponse_setId_183414808311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5018 = new Long(-4502405999831680926L);
        Class<? extends Object> term5089 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term5088 = ((Class) term5089).getDeclaredField((String) "FIVE");
        ((Field) term5088).setAccessible(true);
        Object enum21 = ((Field) term5088).get((Object) null);
        Class<? extends Object> term5263 = Class.forName((String) "com.example.backend.entity.Suit");
        Field term5262 = ((Class) term5263).getDeclaredField((String) "HEARTS");
        ((Field) term5262).setAccessible(true);
        Object enum22 = ((Field) term5262).get((Object) null);
        term5017 = newInstance(Class.forName("com.example.backend.dto.CardResponse"));
        setField(term5017, term5017.getClass(), "id", term5018);
        setField(term5017, term5017.getClass(), "rank", enum21);
        setField(term5017, term5017.getClass(), "suit", enum22);
        setField(term5017, term5017.getClass(), "imageUrl", "ieCtQFdkii");
        setField(term5017, term5017.getClass(), "person", "dEnhdmILtU");
        setField(term5017, term5017.getClass(), "action", "hoicvmsovO");
        setField(term5017, term5017.getClass(), "object", "eqJfYWRaEL");
        term5086 = new Long(1967728129628047933L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.dto.CardResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term5086;
        callMethod(klass, "setId", argTypes, term5017, args);
    }

};


