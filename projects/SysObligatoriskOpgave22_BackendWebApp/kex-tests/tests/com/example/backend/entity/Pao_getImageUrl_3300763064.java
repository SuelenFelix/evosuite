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

public class Pao_getImageUrl_3300763064 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7303;

    public Pao_getImageUrl_3300763064() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7304 = new Long(4069264186851023313L);
        Long term7355 = new Long(5184635470881147510L);
        Long term7358 = new Long(918397384129253729L);
        Class<? extends Object> term7412 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term7411 = ((Class) term7412).getDeclaredField((String) "KING");
        ((Field) term7411).setAccessible(true);
        Object enum29 = ((Field) term7411).get((Object) null);
        Class<? extends Object> term7586 = Class.forName((String) "com.example.backend.entity.Suit");
        Field term7585 = ((Class) term7586).getDeclaredField((String) "CLUBS");
        ((Field) term7585).setAccessible(true);
        Object enum30 = ((Field) term7585).get((Object) null);
        ArrayList term7366 = new ArrayList();
        ((ArrayList) term7366).add((Object)null);
        ((ArrayList) term7366).add((Object)null);
        ((ArrayList) term7366).add((Object)null);
        ((ArrayList) term7366).add((Object)null);
        ((ArrayList) term7366).add((Object)null);
        ((ArrayList) term7366).add((Object)null);
        ((ArrayList) term7366).add((Object)null);
        ((ArrayList) term7366).add((Object)null);
        term7303 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        Object term7354 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term7357 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term7370 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term7303, term7303.getClass(), "id", term7304);
        setField(term7303, term7303.getClass(), "imageUrl", "EKjQdtKxAM");
        setField(term7303, term7303.getClass(), "person", "TXZAIPQJHt");
        setField(term7303, term7303.getClass(), "action", "DIbeDHICho");
        setField(term7303, term7303.getClass(), "object", "dJGPlmSRnz");
        setField(term7354, term7354.getClass(), "id", term7355);
        setField(term7357, term7357.getClass(), "id", term7358);
        setField(term7357, term7357.getClass(), "rank", enum29);
        setField(term7357, term7357.getClass(), "suit", enum30);
        setField(term7357, term7357.getClass(), "paoCards", term7366);
        setField(term7354, term7354.getClass(), "card", term7357);
        setField(term7370, term7370.getClass(), "id", null);
        setField(term7370, term7370.getClass(), "imageUrl", null);
        setField(term7370, term7370.getClass(), "person", null);
        setField(term7370, term7370.getClass(), "action", null);
        setField(term7370, term7370.getClass(), "object", null);
        setField(term7370, term7370.getClass(), "paoCard", null);
        setField(term7354, term7354.getClass(), "pao", term7370);
        setField(term7303, term7303.getClass(), "paoCard", term7354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.entity.Pao");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getImageUrl", argTypes, term7303, args);
    }

};


