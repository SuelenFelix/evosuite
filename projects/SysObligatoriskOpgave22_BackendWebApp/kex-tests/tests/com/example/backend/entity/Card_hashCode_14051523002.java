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
import java.lang.Long;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class Card_hashCode_14051523002 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15343;

    public Card_hashCode_14051523002() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term15344 = new Long(1550364590565203407L);
        Class<? extends Object> term15388 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term15387 = ((Class) term15388).getDeclaredField((String) "FIVE");
        ((Field) term15387).setAccessible(true);
        Object enum61 = ((Field) term15387).get((Object) null);
        Class<? extends Object> term15562 = Class.forName((String) "com.example.backend.entity.Suit");
        Field term15561 = ((Class) term15562).getDeclaredField((String) "HEARTS");
        ((Field) term15561).setAccessible(true);
        Object enum62 = ((Field) term15561).get((Object) null);
        Long term15367 = new Long(4530705892517898929L);
        Long term15370 = new Long(7450734758126089960L);
        Long term15373 = new Long(1377567570761089535L);
        Object term15366 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term15369 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term15372 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term15366, term15366.getClass(), "id", term15367);
        setField(term15369, term15369.getClass(), "id", term15370);
        setField(term15369, term15369.getClass(), "rank", null);
        setField(term15369, term15369.getClass(), "suit", null);
        setField(term15369, term15369.getClass(), "paoCards", null);
        setField(term15366, term15366.getClass(), "card", term15369);
        setField(term15372, term15372.getClass(), "id", term15373);
        setField(term15372, term15372.getClass(), "imageUrl", null);
        setField(term15372, term15372.getClass(), "person", null);
        setField(term15372, term15372.getClass(), "action", null);
        setField(term15372, term15372.getClass(), "object", null);
        setField(term15372, term15372.getClass(), "paoCard", null);
        setField(term15366, term15366.getClass(), "pao", term15372);
        Long term15376 = new Long(-1978508496784157882L);
        Object term15375 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term15378 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term15379 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term15375, term15375.getClass(), "id", term15376);
        setField(term15378, term15378.getClass(), "id", null);
        setField(term15378, term15378.getClass(), "rank", null);
        setField(term15378, term15378.getClass(), "suit", null);
        setField(term15378, term15378.getClass(), "paoCards", null);
        setField(term15375, term15375.getClass(), "card", term15378);
        setField(term15379, term15379.getClass(), "id", null);
        setField(term15379, term15379.getClass(), "imageUrl", null);
        setField(term15379, term15379.getClass(), "person", null);
        setField(term15379, term15379.getClass(), "action", null);
        setField(term15379, term15379.getClass(), "object", null);
        setField(term15379, term15379.getClass(), "paoCard", null);
        setField(term15375, term15375.getClass(), "pao", term15379);
        Long term15381 = new Long(-7574091101944828886L);
        Object term15380 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term15383 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term15384 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term15380, term15380.getClass(), "id", term15381);
        setField(term15383, term15383.getClass(), "id", null);
        setField(term15383, term15383.getClass(), "rank", null);
        setField(term15383, term15383.getClass(), "suit", null);
        setField(term15383, term15383.getClass(), "paoCards", null);
        setField(term15380, term15380.getClass(), "card", term15383);
        setField(term15384, term15384.getClass(), "id", null);
        setField(term15384, term15384.getClass(), "imageUrl", null);
        setField(term15384, term15384.getClass(), "person", null);
        setField(term15384, term15384.getClass(), "action", null);
        setField(term15384, term15384.getClass(), "object", null);
        setField(term15384, term15384.getClass(), "paoCard", null);
        setField(term15380, term15380.getClass(), "pao", term15384);
        ArrayList term15364 = new ArrayList();
        ((ArrayList) term15364).add(term15366);
        ((ArrayList) term15364).add(term15375);
        ((ArrayList) term15364).add(term15380);
        term15343 = newInstance(Class.forName("com.example.backend.entity.Card"));
        setField(term15343, term15343.getClass(), "id", term15344);
        setField(term15343, term15343.getClass(), "rank", enum61);
        setField(term15343, term15343.getClass(), "suit", enum62);
        setField(term15343, term15343.getClass(), "paoCards", term15364);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.entity.Card");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term15343, args);
    }

};


