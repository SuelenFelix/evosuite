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

public class Pao_setId_109439846210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9904;
     Object term9972;

    public Pao_setId_109439846210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9905 = new Long(3077284143733577490L);
        Long term9956 = new Long(4458302820344896046L);
        Long term9959 = new Long(-432424084523104253L);
        Class<? extends Object> term10015 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term10014 = ((Class) term10015).getDeclaredField((String) "FOUR");
        ((Field) term10014).setAccessible(true);
        Object enum39 = ((Field) term10014).get((Object) null);
        Class<? extends Object> term10189 = Class.forName((String) "com.example.backend.entity.Suit");
        Field term10188 = ((Class) term10189).getDeclaredField((String) "CLUBS");
        ((Field) term10188).setAccessible(true);
        Object enum40 = ((Field) term10188).get((Object) null);
        ArrayList term9967 = new ArrayList();
        ((ArrayList) term9967).add((Object)null);
        ((ArrayList) term9967).add((Object)null);
        ((ArrayList) term9967).add((Object)null);
        term9904 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        Object term9955 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term9958 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term9971 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term9904, term9904.getClass(), "id", term9905);
        setField(term9904, term9904.getClass(), "imageUrl", "qUtkFGMNUV");
        setField(term9904, term9904.getClass(), "person", "mGRiYhnMcR");
        setField(term9904, term9904.getClass(), "action", "NFlvfJCVPO");
        setField(term9904, term9904.getClass(), "object", "KarbTXFmUU");
        setField(term9955, term9955.getClass(), "id", term9956);
        setField(term9958, term9958.getClass(), "id", term9959);
        setField(term9958, term9958.getClass(), "rank", enum39);
        setField(term9958, term9958.getClass(), "suit", enum40);
        setField(term9958, term9958.getClass(), "paoCards", term9967);
        setField(term9955, term9955.getClass(), "card", term9958);
        setField(term9971, term9971.getClass(), "id", null);
        setField(term9971, term9971.getClass(), "imageUrl", null);
        setField(term9971, term9971.getClass(), "person", null);
        setField(term9971, term9971.getClass(), "action", null);
        setField(term9971, term9971.getClass(), "object", null);
        setField(term9971, term9971.getClass(), "paoCard", null);
        setField(term9955, term9955.getClass(), "pao", term9971);
        setField(term9904, term9904.getClass(), "paoCard", term9955);
        term9972 = new Long(7799452759993694308L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.entity.Pao");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term9972;
        callMethod(klass, "setId", argTypes, term9904, args);
    }

};


