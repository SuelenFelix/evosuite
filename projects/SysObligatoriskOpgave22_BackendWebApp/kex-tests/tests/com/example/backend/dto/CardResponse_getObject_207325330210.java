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

public class CardResponse_getObject_207325330210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4550;

    public CardResponse_getObject_207325330210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4551 = new Long(-7672528020740371001L);
        Class<? extends Object> term4621 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term4620 = ((Class) term4621).getDeclaredField((String) "ACE");
        ((Field) term4620).setAccessible(true);
        Object enum19 = ((Field) term4620).get((Object) null);
        Class<? extends Object> term4792 = Class.forName((String) "com.example.backend.entity.Suit");
        Field term4791 = ((Class) term4792).getDeclaredField((String) "DIAMONDS");
        ((Field) term4791).setAccessible(true);
        Object enum20 = ((Field) term4791).get((Object) null);
        term4550 = newInstance(Class.forName("com.example.backend.dto.CardResponse"));
        setField(term4550, term4550.getClass(), "id", term4551);
        setField(term4550, term4550.getClass(), "rank", enum19);
        setField(term4550, term4550.getClass(), "suit", enum20);
        setField(term4550, term4550.getClass(), "imageUrl", "ffYhPOzlUs");
        setField(term4550, term4550.getClass(), "person", "MLqYREekMl");
        setField(term4550, term4550.getClass(), "action", "ytSBIKXogI");
        setField(term4550, term4550.getClass(), "object", "nHXjMycHlU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.dto.CardResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getObject", argTypes, term4550, args);
    }

};


