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

public class CardResponse_setAction_197400669516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7750;

    public CardResponse_setAction_197400669516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7751 = new Long(-6823727938421990489L);
        Class<? extends Object> term7833 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term7832 = ((Class) term7833).getDeclaredField((String) "EIGHT");
        ((Field) term7832).setAccessible(true);
        Object enum33 = ((Field) term7832).get((Object) null);
        Class<? extends Object> term8010 = Class.forName((String) "com.example.backend.entity.Suit");
        Field term8009 = ((Class) term8010).getDeclaredField((String) "SPADES");
        ((Field) term8009).setAccessible(true);
        Object enum34 = ((Field) term8009).get((Object) null);
        term7750 = newInstance(Class.forName("com.example.backend.dto.CardResponse"));
        setField(term7750, term7750.getClass(), "id", term7751);
        setField(term7750, term7750.getClass(), "rank", enum33);
        setField(term7750, term7750.getClass(), "suit", enum34);
        setField(term7750, term7750.getClass(), "imageUrl", "jUbSRrkrYZ");
        setField(term7750, term7750.getClass(), "person", "bWWfajKbEX");
        setField(term7750, term7750.getClass(), "action", "cAPeiZHKGJ");
        setField(term7750, term7750.getClass(), "object", "LvJFtLBaxj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.dto.CardResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PHvxnGHptP";
        callMethod(klass, "setAction", argTypes, term7750, args);
    }

};


