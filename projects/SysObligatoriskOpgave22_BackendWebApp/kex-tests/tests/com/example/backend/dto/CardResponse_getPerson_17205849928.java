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

public class CardResponse_getPerson_17205849928 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3616;

    public CardResponse_getPerson_17205849928() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3617 = new Long(2486810210675247493L);
        Class<? extends Object> term3689 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term3688 = ((Class) term3689).getDeclaredField((String) "QUEEN");
        ((Field) term3688).setAccessible(true);
        Object enum15 = ((Field) term3688).get((Object) null);
        Class<? extends Object> term3866 = Class.forName((String) "com.example.backend.entity.Suit");
        Field term3865 = ((Class) term3866).getDeclaredField((String) "DIAMONDS");
        ((Field) term3865).setAccessible(true);
        Object enum16 = ((Field) term3865).get((Object) null);
        term3616 = newInstance(Class.forName("com.example.backend.dto.CardResponse"));
        setField(term3616, term3616.getClass(), "id", term3617);
        setField(term3616, term3616.getClass(), "rank", enum15);
        setField(term3616, term3616.getClass(), "suit", enum16);
        setField(term3616, term3616.getClass(), "imageUrl", "xLbjWUgOIL");
        setField(term3616, term3616.getClass(), "person", "jDtqGUpnZN");
        setField(term3616, term3616.getClass(), "action", "nGKItKLYNC");
        setField(term3616, term3616.getClass(), "object", "UiUYnPrcCi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.dto.CardResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPerson", argTypes, term3616, args);
    }

};


