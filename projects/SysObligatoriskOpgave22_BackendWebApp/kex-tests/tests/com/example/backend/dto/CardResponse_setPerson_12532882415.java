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

public class CardResponse_setPerson_12532882415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7265;

    public CardResponse_setPerson_12532882415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7266 = new Long(5262507301787091109L);
        Class<? extends Object> term7347 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term7346 = ((Class) term7347).getDeclaredField((String) "KING");
        ((Field) term7346).setAccessible(true);
        Object enum31 = ((Field) term7346).get((Object) null);
        Class<? extends Object> term7521 = Class.forName((String) "com.example.backend.entity.Suit");
        Field term7520 = ((Class) term7521).getDeclaredField((String) "SPADES");
        ((Field) term7520).setAccessible(true);
        Object enum32 = ((Field) term7520).get((Object) null);
        term7265 = newInstance(Class.forName("com.example.backend.dto.CardResponse"));
        setField(term7265, term7265.getClass(), "id", term7266);
        setField(term7265, term7265.getClass(), "rank", enum31);
        setField(term7265, term7265.getClass(), "suit", enum32);
        setField(term7265, term7265.getClass(), "imageUrl", "vQVyKLdtaz");
        setField(term7265, term7265.getClass(), "person", "OWKQODBLzb");
        setField(term7265, term7265.getClass(), "action", "wGmYcqUkgE");
        setField(term7265, term7265.getClass(), "object", "idgaQsnJpQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.dto.CardResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "VgZnGoIFwQ";
        callMethod(klass, "setPerson", argTypes, term7265, args);
    }

};


