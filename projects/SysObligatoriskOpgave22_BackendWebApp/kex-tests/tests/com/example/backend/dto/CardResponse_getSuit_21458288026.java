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

public class CardResponse_getSuit_21458288026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2690;

    public CardResponse_getSuit_21458288026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2691 = new Long(8059786003080744426L);
        Class<? extends Object> term2761 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term2760 = ((Class) term2761).getDeclaredField((String) "SIX");
        ((Field) term2760).setAccessible(true);
        Object enum11 = ((Field) term2760).get((Object) null);
        Class<? extends Object> term2932 = Class.forName((String) "com.example.backend.entity.Suit");
        Field term2931 = ((Class) term2932).getDeclaredField((String) "DIAMONDS");
        ((Field) term2931).setAccessible(true);
        Object enum12 = ((Field) term2931).get((Object) null);
        term2690 = newInstance(Class.forName("com.example.backend.dto.CardResponse"));
        setField(term2690, term2690.getClass(), "id", term2691);
        setField(term2690, term2690.getClass(), "rank", enum11);
        setField(term2690, term2690.getClass(), "suit", enum12);
        setField(term2690, term2690.getClass(), "imageUrl", "wSQxaModmm");
        setField(term2690, term2690.getClass(), "person", "UlajhuVLaP");
        setField(term2690, term2690.getClass(), "action", "gGSMzuGICf");
        setField(term2690, term2690.getClass(), "object", "hxCBltsObl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.dto.CardResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSuit", argTypes, term2690, args);
    }

};


