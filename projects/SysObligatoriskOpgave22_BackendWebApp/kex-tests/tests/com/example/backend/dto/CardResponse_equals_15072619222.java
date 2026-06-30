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

public class CardResponse_equals_15072619222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term833;
     Object term901;

    public CardResponse_equals_15072619222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term834 = new Long(-6573104506744284592L);
        Class<? extends Object> term903 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term902 = ((Class) term903).getDeclaredField((String) "KING");
        ((Field) term902).setAccessible(true);
        Object enum3 = ((Field) term902).get((Object) null);
        Class<? extends Object> term1077 = Class.forName((String) "com.example.backend.entity.Suit");
        Field term1076 = ((Class) term1077).getDeclaredField((String) "CLUBS");
        ((Field) term1076).setAccessible(true);
        Object enum4 = ((Field) term1076).get((Object) null);
        term833 = newInstance(Class.forName("com.example.backend.dto.CardResponse"));
        setField(term833, term833.getClass(), "id", term834);
        setField(term833, term833.getClass(), "rank", enum3);
        setField(term833, term833.getClass(), "suit", enum4);
        setField(term833, term833.getClass(), "imageUrl", "BYqFIqCKAV");
        setField(term833, term833.getClass(), "person", "vrQLuWIDJX");
        setField(term833, term833.getClass(), "action", "flxyYxBRtu");
        setField(term833, term833.getClass(), "object", "OclPbYPkcH");
        term901 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.dto.CardResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term901;
        callMethod(klass, "equals", argTypes, term833, args);
    }

};


