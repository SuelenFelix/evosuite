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

public class Pao_getObject_7068325517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8883;

    public Pao_getObject_7068325517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8884 = new Long(-8890284990655172580L);
        Long term8935 = new Long(-5951743062322506095L);
        Long term8938 = new Long(768144790810175653L);
        Class<? extends Object> term8992 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term8991 = ((Class) term8992).getDeclaredField((String) "ACE");
        ((Field) term8991).setAccessible(true);
        Object enum35 = ((Field) term8991).get((Object) null);
        Class<? extends Object> term9163 = Class.forName((String) "com.example.backend.entity.Suit");
        Field term9162 = ((Class) term9163).getDeclaredField((String) "SPADES");
        ((Field) term9162).setAccessible(true);
        Object enum36 = ((Field) term9162).get((Object) null);
        ArrayList term8946 = new ArrayList();
        ((ArrayList) term8946).add((Object)null);
        ((ArrayList) term8946).add((Object)null);
        ((ArrayList) term8946).add((Object)null);
        ((ArrayList) term8946).add((Object)null);
        ((ArrayList) term8946).add((Object)null);
        term8883 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        Object term8934 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term8937 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term8950 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term8883, term8883.getClass(), "id", term8884);
        setField(term8883, term8883.getClass(), "imageUrl", "xClUIcPECX");
        setField(term8883, term8883.getClass(), "person", "avhRaGZaBF");
        setField(term8883, term8883.getClass(), "action", "JkgoRtImdE");
        setField(term8883, term8883.getClass(), "object", "qFGKIJjlmV");
        setField(term8934, term8934.getClass(), "id", term8935);
        setField(term8937, term8937.getClass(), "id", term8938);
        setField(term8937, term8937.getClass(), "rank", enum35);
        setField(term8937, term8937.getClass(), "suit", enum36);
        setField(term8937, term8937.getClass(), "paoCards", term8946);
        setField(term8934, term8934.getClass(), "card", term8937);
        setField(term8950, term8950.getClass(), "id", null);
        setField(term8950, term8950.getClass(), "imageUrl", null);
        setField(term8950, term8950.getClass(), "person", null);
        setField(term8950, term8950.getClass(), "action", null);
        setField(term8950, term8950.getClass(), "object", null);
        setField(term8950, term8950.getClass(), "paoCard", null);
        setField(term8934, term8934.getClass(), "pao", term8950);
        setField(term8883, term8883.getClass(), "paoCard", term8934);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.entity.Pao");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getObject", argTypes, term8883, args);
    }

};


