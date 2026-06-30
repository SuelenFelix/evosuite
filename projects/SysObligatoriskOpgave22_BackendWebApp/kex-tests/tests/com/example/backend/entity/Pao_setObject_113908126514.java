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

public class Pao_setObject_113908126514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12007;

    public Pao_setObject_113908126514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12008 = new Long(-1526328443223793465L);
        Long term12059 = new Long(-412186147449928821L);
        Long term12062 = new Long(-1449569009562240465L);
        Class<? extends Object> term12183 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term12182 = ((Class) term12183).getDeclaredField((String) "QUEEN");
        ((Field) term12182).setAccessible(true);
        Object enum47 = ((Field) term12182).get((Object) null);
        Class<? extends Object> term12360 = Class.forName((String) "com.example.backend.entity.Suit");
        Field term12359 = ((Class) term12360).getDeclaredField((String) "DIAMONDS");
        ((Field) term12359).setAccessible(true);
        Object enum48 = ((Field) term12359).get((Object) null);
        ArrayList term12070 = new ArrayList();
        ((ArrayList) term12070).add((Object)null);
        ((ArrayList) term12070).add((Object)null);
        ((ArrayList) term12070).add((Object)null);
        ((ArrayList) term12070).add((Object)null);
        ((ArrayList) term12070).add((Object)null);
        Long term12075 = new Long(1193381106528373019L);
        Long term12126 = new Long(185544001230120339L);
        term12007 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        Object term12058 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term12061 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term12074 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        Object term12125 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term12128 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term12129 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term12007, term12007.getClass(), "id", term12008);
        setField(term12007, term12007.getClass(), "imageUrl", "UuYWMTqWTV");
        setField(term12007, term12007.getClass(), "person", "DSFGlcaXUb");
        setField(term12007, term12007.getClass(), "action", "sHMXNUzNeM");
        setField(term12007, term12007.getClass(), "object", "gPzGDOEPPw");
        setField(term12058, term12058.getClass(), "id", term12059);
        setField(term12061, term12061.getClass(), "id", term12062);
        setField(term12061, term12061.getClass(), "rank", enum47);
        setField(term12061, term12061.getClass(), "suit", enum48);
        setField(term12061, term12061.getClass(), "paoCards", term12070);
        setField(term12058, term12058.getClass(), "card", term12061);
        setField(term12074, term12074.getClass(), "id", term12075);
        setField(term12074, term12074.getClass(), "imageUrl", "JeZbrwZmsP");
        setField(term12074, term12074.getClass(), "person", "bxyfeicqrK");
        setField(term12074, term12074.getClass(), "action", "vBnWPlsZMk");
        setField(term12074, term12074.getClass(), "object", "fIZsWucfXz");
        setField(term12125, term12125.getClass(), "id", term12126);
        setField(term12128, term12128.getClass(), "id", null);
        setField(term12128, term12128.getClass(), "rank", null);
        setField(term12128, term12128.getClass(), "suit", null);
        setField(term12128, term12128.getClass(), "paoCards", null);
        setField(term12125, term12125.getClass(), "card", term12128);
        setField(term12129, term12129.getClass(), "id", null);
        setField(term12129, term12129.getClass(), "imageUrl", null);
        setField(term12129, term12129.getClass(), "person", null);
        setField(term12129, term12129.getClass(), "action", null);
        setField(term12129, term12129.getClass(), "object", null);
        setField(term12129, term12129.getClass(), "paoCard", null);
        setField(term12125, term12125.getClass(), "pao", term12129);
        setField(term12074, term12074.getClass(), "paoCard", term12125);
        setField(term12058, term12058.getClass(), "pao", term12074);
        setField(term12007, term12007.getClass(), "paoCard", term12058);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.entity.Pao");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IApvtmfhnq";
        callMethod(klass, "setObject", argTypes, term12007, args);
    }

};


