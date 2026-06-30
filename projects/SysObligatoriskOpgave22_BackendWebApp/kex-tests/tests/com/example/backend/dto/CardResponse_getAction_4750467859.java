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

public class CardResponse_getAction_4750467859 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4091;

    public CardResponse_getAction_4750467859() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4092 = new Long(7009926388951271268L);
        Class<? extends Object> term4160 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term4159 = ((Class) term4160).getDeclaredField((String) "TEN");
        ((Field) term4159).setAccessible(true);
        Object enum17 = ((Field) term4159).get((Object) null);
        Class<? extends Object> term4331 = Class.forName((String) "com.example.backend.entity.Suit");
        Field term4330 = ((Class) term4331).getDeclaredField((String) "SPADES");
        ((Field) term4330).setAccessible(true);
        Object enum18 = ((Field) term4330).get((Object) null);
        term4091 = newInstance(Class.forName("com.example.backend.dto.CardResponse"));
        setField(term4091, term4091.getClass(), "id", term4092);
        setField(term4091, term4091.getClass(), "rank", enum17);
        setField(term4091, term4091.getClass(), "suit", enum18);
        setField(term4091, term4091.getClass(), "imageUrl", "UoYtihxVaS");
        setField(term4091, term4091.getClass(), "person", "JDswTTCZHV");
        setField(term4091, term4091.getClass(), "action", "onpbIeEKoi");
        setField(term4091, term4091.getClass(), "object", "YRHGsAkhxb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.dto.CardResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAction", argTypes, term4091, args);
    }

};


