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

public class PaoCard_getId_14789469601 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1115;

    public PaoCard_getId_14789469601() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1116 = new Long(-2068172595987555756L);
        Long term1119 = new Long(-6292278961887936280L);
        Class<? extends Object> term1199 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term1198 = ((Class) term1199).getDeclaredField((String) "TEN");
        ((Field) term1198).setAccessible(true);
        Object enum4 = ((Field) term1198).get((Object) null);
        Class<? extends Object> term1370 = Class.forName((String) "com.example.backend.entity.Suit");
        Field term1369 = ((Class) term1370).getDeclaredField((String) "SPADES");
        ((Field) term1369).setAccessible(true);
        Object enum5 = ((Field) term1369).get((Object) null);
        Long term1141 = new Long(-6645965768855543712L);
        Object term1140 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        setField(term1140, term1140.getClass(), "id", term1141);
        setField(term1140, term1140.getClass(), "card", null);
        setField(term1140, term1140.getClass(), "pao", null);
        Object term1143 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        setField(term1143, term1143.getClass(), "id", null);
        setField(term1143, term1143.getClass(), "card", null);
        setField(term1143, term1143.getClass(), "pao", null);
        Object term1144 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        setField(term1144, term1144.getClass(), "id", null);
        setField(term1144, term1144.getClass(), "card", null);
        setField(term1144, term1144.getClass(), "pao", null);
        ArrayList term1138 = new ArrayList();
        ((ArrayList) term1138).add(term1140);
        ((ArrayList) term1138).add(term1140);
        ((ArrayList) term1138).add(term1140);
        ((ArrayList) term1138).add(term1143);
        ((ArrayList) term1138).add(term1144);
        Long term1148 = new Long(-3838084482494604218L);
        term1115 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term1118 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term1147 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term1115, term1115.getClass(), "id", term1116);
        setField(term1118, term1118.getClass(), "id", term1119);
        setField(term1118, term1118.getClass(), "rank", enum4);
        setField(term1118, term1118.getClass(), "suit", enum5);
        setField(term1118, term1118.getClass(), "paoCards", term1138);
        setField(term1115, term1115.getClass(), "card", term1118);
        setField(term1147, term1147.getClass(), "id", term1148);
        setField(term1147, term1147.getClass(), "imageUrl", "ieCtQFdkii");
        setField(term1147, term1147.getClass(), "person", "dEnhdmILtU");
        setField(term1147, term1147.getClass(), "action", "hoicvmsovO");
        setField(term1147, term1147.getClass(), "object", "eqJfYWRaEL");
        setField(term1147, term1147.getClass(), "paoCard", term1144);
        setField(term1115, term1115.getClass(), "pao", term1147);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.entity.PaoCard");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1115, args);
    }

};


