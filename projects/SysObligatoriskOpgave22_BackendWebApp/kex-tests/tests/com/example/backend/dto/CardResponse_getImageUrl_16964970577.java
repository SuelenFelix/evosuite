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

public class CardResponse_getImageUrl_16964970577 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3157;

    public CardResponse_getImageUrl_16964970577() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3158 = new Long(-4365849114644724155L);
        Class<? extends Object> term3226 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term3225 = ((Class) term3226).getDeclaredField((String) "TEN");
        ((Field) term3225).setAccessible(true);
        Object enum13 = ((Field) term3225).get((Object) null);
        Class<? extends Object> term3397 = Class.forName((String) "com.example.backend.entity.Suit");
        Field term3396 = ((Class) term3397).getDeclaredField((String) "SPADES");
        ((Field) term3396).setAccessible(true);
        Object enum14 = ((Field) term3396).get((Object) null);
        term3157 = newInstance(Class.forName("com.example.backend.dto.CardResponse"));
        setField(term3157, term3157.getClass(), "id", term3158);
        setField(term3157, term3157.getClass(), "rank", enum13);
        setField(term3157, term3157.getClass(), "suit", enum14);
        setField(term3157, term3157.getClass(), "imageUrl", "BndsHwAFMv");
        setField(term3157, term3157.getClass(), "person", "GzFkzHGYFt");
        setField(term3157, term3157.getClass(), "action", "tShwQLRGNe");
        setField(term3157, term3157.getClass(), "object", "LvtrsXUliU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.dto.CardResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getImageUrl", argTypes, term3157, args);
    }

};


