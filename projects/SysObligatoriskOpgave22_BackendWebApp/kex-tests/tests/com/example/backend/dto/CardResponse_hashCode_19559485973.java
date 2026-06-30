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

public class CardResponse_hashCode_19559485973 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1293;

    public CardResponse_hashCode_19559485973() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1294 = new Long(-4920224193275732920L);
        Class<? extends Object> term1363 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term1362 = ((Class) term1363).getDeclaredField((String) "SEVEN");
        ((Field) term1362).setAccessible(true);
        Object enum5 = ((Field) term1362).get((Object) null);
        Class<? extends Object> term1540 = Class.forName((String) "com.example.backend.entity.Suit");
        Field term1539 = ((Class) term1540).getDeclaredField((String) "CLUBS");
        ((Field) term1539).setAccessible(true);
        Object enum6 = ((Field) term1539).get((Object) null);
        term1293 = newInstance(Class.forName("com.example.backend.dto.CardResponse"));
        setField(term1293, term1293.getClass(), "id", term1294);
        setField(term1293, term1293.getClass(), "rank", enum5);
        setField(term1293, term1293.getClass(), "suit", enum6);
        setField(term1293, term1293.getClass(), "imageUrl", "IoAlmYsBwc");
        setField(term1293, term1293.getClass(), "person", "TEParAifyi");
        setField(term1293, term1293.getClass(), "action", "OWDIEULEFu");
        setField(term1293, term1293.getClass(), "object", "dWRymuLBtr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.dto.CardResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term1293, args);
    }

};


