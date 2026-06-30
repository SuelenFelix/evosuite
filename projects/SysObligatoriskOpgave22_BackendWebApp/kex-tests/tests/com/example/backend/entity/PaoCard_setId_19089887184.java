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
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class PaoCard_setId_19089887184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2550;
     Object term2635;

    public PaoCard_setId_19089887184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2551 = new Long(-2177368829816872572L);
        Long term2554 = new Long(-8463029266761149071L);
        Class<? extends Object> term2638 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term2637 = ((Class) term2638).getDeclaredField((String) "FOUR");
        ((Field) term2637).setAccessible(true);
        Object enum10 = ((Field) term2637).get((Object) null);
        Class<? extends Object> term2812 = Class.forName((String) "com.example.backend.entity.Suit");
        Field term2811 = ((Class) term2812).getDeclaredField((String) "CLUBS");
        ((Field) term2811).setAccessible(true);
        Object enum11 = ((Field) term2811).get((Object) null);
        Long term2576 = new Long(3133860696238261492L);
        Object term2575 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        setField(term2575, term2575.getClass(), "id", term2576);
        setField(term2575, term2575.getClass(), "card", null);
        setField(term2575, term2575.getClass(), "pao", null);
        Long term2579 = new Long(-5216789073301458893L);
        Object term2578 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        setField(term2578, term2578.getClass(), "id", term2579);
        setField(term2578, term2578.getClass(), "card", null);
        setField(term2578, term2578.getClass(), "pao", null);
        ArrayList term2573 = new ArrayList();
        ((ArrayList) term2573).add(term2575);
        ((ArrayList) term2573).add(term2578);
        Long term2584 = new Long(2354625302846375590L);
        term2550 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term2553 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term2583 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        Object term2634 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        setField(term2550, term2550.getClass(), "id", term2551);
        setField(term2553, term2553.getClass(), "id", term2554);
        setField(term2553, term2553.getClass(), "rank", enum10);
        setField(term2553, term2553.getClass(), "suit", enum11);
        setField(term2553, term2553.getClass(), "paoCards", term2573);
        setField(term2550, term2550.getClass(), "card", term2553);
        setField(term2583, term2583.getClass(), "id", term2584);
        setField(term2583, term2583.getClass(), "imageUrl", "AdxvLJhNLe");
        setField(term2583, term2583.getClass(), "person", "lHfTrWKMPk");
        setField(term2583, term2583.getClass(), "action", "JDaAnsVTGV");
        setField(term2583, term2583.getClass(), "object", "mLUZFTfjle");
        setField(term2634, term2634.getClass(), "id", null);
        setField(term2634, term2634.getClass(), "card", null);
        setField(term2634, term2634.getClass(), "pao", null);
        setField(term2583, term2583.getClass(), "paoCard", term2634);
        setField(term2550, term2550.getClass(), "pao", term2583);
        term2635 = new Long(7276637106827860087L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.entity.PaoCard");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term2635;
        callMethod(klass, "setId", argTypes, term2550, args);
    }

};


