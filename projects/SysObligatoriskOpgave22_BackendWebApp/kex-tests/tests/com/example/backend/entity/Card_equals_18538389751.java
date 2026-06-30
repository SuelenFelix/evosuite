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

public class Card_equals_18538389751 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14963;
     Object term14988;

    public Card_equals_18538389751() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term14964 = new Long(-5967061076297699457L);
        Class<? extends Object> term14990 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term14989 = ((Class) term14990).getDeclaredField((String) "EIGHT");
        ((Field) term14989).setAccessible(true);
        Object enum59 = ((Field) term14989).get((Object) null);
        Class<? extends Object> term15167 = Class.forName((String) "com.example.backend.entity.Suit");
        Field term15166 = ((Class) term15167).getDeclaredField((String) "CLUBS");
        ((Field) term15166).setAccessible(true);
        Object enum60 = ((Field) term15166).get((Object) null);
        ArrayList term14984 = new ArrayList();
        term14963 = newInstance(Class.forName("com.example.backend.entity.Card"));
        setField(term14963, term14963.getClass(), "id", term14964);
        setField(term14963, term14963.getClass(), "rank", enum59);
        setField(term14963, term14963.getClass(), "suit", enum60);
        setField(term14963, term14963.getClass(), "paoCards", term14984);
        term14988 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.entity.Card");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term14988;
        callMethod(klass, "equals", argTypes, term14963, args);
    }

};


