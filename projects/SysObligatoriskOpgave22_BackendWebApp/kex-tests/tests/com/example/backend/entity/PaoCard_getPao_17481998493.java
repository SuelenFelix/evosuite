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

public class PaoCard_getPao_17481998493 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2072;

    public PaoCard_getPao_17481998493() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2073 = new Long(682356318767179819L);
        Long term2076 = new Long(-7291743527973326814L);
        Class<? extends Object> term2157 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term2156 = ((Class) term2157).getDeclaredField((String) "QUEEN");
        ((Field) term2156).setAccessible(true);
        Object enum8 = ((Field) term2156).get((Object) null);
        Class<? extends Object> term2334 = Class.forName((String) "com.example.backend.entity.Suit");
        Field term2333 = ((Class) term2334).getDeclaredField((String) "CLUBS");
        ((Field) term2333).setAccessible(true);
        Object enum9 = ((Field) term2333).get((Object) null);
        Long term2099 = new Long(-5963439350418910964L);
        Object term2098 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        setField(term2098, term2098.getClass(), "id", term2099);
        setField(term2098, term2098.getClass(), "card", null);
        setField(term2098, term2098.getClass(), "pao", null);
        Object term2101 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        setField(term2101, term2101.getClass(), "id", null);
        setField(term2101, term2101.getClass(), "card", null);
        setField(term2101, term2101.getClass(), "pao", null);
        ArrayList term2096 = new ArrayList();
        ((ArrayList) term2096).add(term2098);
        ((ArrayList) term2096).add(term2101);
        ((ArrayList) term2096).add(term2101);
        Long term2105 = new Long(5836128569274066678L);
        term2072 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term2075 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term2104 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        Object term2155 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        setField(term2072, term2072.getClass(), "id", term2073);
        setField(term2075, term2075.getClass(), "id", term2076);
        setField(term2075, term2075.getClass(), "rank", enum8);
        setField(term2075, term2075.getClass(), "suit", enum9);
        setField(term2075, term2075.getClass(), "paoCards", term2096);
        setField(term2072, term2072.getClass(), "card", term2075);
        setField(term2104, term2104.getClass(), "id", term2105);
        setField(term2104, term2104.getClass(), "imageUrl", "QXzGXbEXMu");
        setField(term2104, term2104.getClass(), "person", "qxSDVejjiY");
        setField(term2104, term2104.getClass(), "action", "xBsXSDjXYK");
        setField(term2104, term2104.getClass(), "object", "sEnIVFtZuQ");
        setField(term2155, term2155.getClass(), "id", null);
        setField(term2155, term2155.getClass(), "card", null);
        setField(term2155, term2155.getClass(), "pao", null);
        setField(term2104, term2104.getClass(), "paoCard", term2155);
        setField(term2072, term2072.getClass(), "pao", term2104);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.entity.PaoCard");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPao", argTypes, term2072, args);
    }

};


