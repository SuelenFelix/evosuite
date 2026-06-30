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

public class CardResponse_setObject_22733948617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8239;

    public CardResponse_setObject_22733948617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8240 = new Long(-484994522244390100L);
        Class<? extends Object> term8321 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term8320 = ((Class) term8321).getDeclaredField((String) "QUEEN");
        ((Field) term8320).setAccessible(true);
        Object enum35 = ((Field) term8320).get((Object) null);
        Class<? extends Object> term8498 = Class.forName((String) "com.example.backend.entity.Suit");
        Field term8497 = ((Class) term8498).getDeclaredField((String) "CLUBS");
        ((Field) term8497).setAccessible(true);
        Object enum36 = ((Field) term8497).get((Object) null);
        term8239 = newInstance(Class.forName("com.example.backend.dto.CardResponse"));
        setField(term8239, term8239.getClass(), "id", term8240);
        setField(term8239, term8239.getClass(), "rank", enum35);
        setField(term8239, term8239.getClass(), "suit", enum36);
        setField(term8239, term8239.getClass(), "imageUrl", "TimdotUuNC");
        setField(term8239, term8239.getClass(), "person", "PkWMRdJcBb");
        setField(term8239, term8239.getClass(), "action", "jSpAteRute");
        setField(term8239, term8239.getClass(), "object", "swZVeJAxjt");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.dto.CardResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xOcJIiQQDu";
        callMethod(klass, "setObject", argTypes, term8239, args);
    }

};


