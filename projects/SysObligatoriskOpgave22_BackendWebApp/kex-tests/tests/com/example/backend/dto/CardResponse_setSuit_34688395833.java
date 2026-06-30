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

public class CardResponse_setSuit_34688395833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9205;

    public CardResponse_setSuit_34688395833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9205 = newInstance(Class.forName("com.example.backend.dto.CardResponse"));
        setField(term9205, term9205.getClass(), "id", null);
        setField(term9205, term9205.getClass(), "rank", null);
        setField(term9205, term9205.getClass(), "suit", null);
        setField(term9205, term9205.getClass(), "imageUrl", null);
        setField(term9205, term9205.getClass(), "person", null);
        setField(term9205, term9205.getClass(), "action", null);
        setField(term9205, term9205.getClass(), "object", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.dto.CardResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.example.backend.entity.Suit");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSuit", argTypes, term9205, args);
    }

};


