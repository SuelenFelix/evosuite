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

public class CardResponse_CardFromEntity_149392945521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9193;

    public CardResponse_CardFromEntity_149392945521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9193 = newInstance(Class.forName("com.example.backend.dto.CardResponse"));
        setField(term9193, term9193.getClass(), "id", null);
        setField(term9193, term9193.getClass(), "rank", null);
        setField(term9193, term9193.getClass(), "suit", null);
        setField(term9193, term9193.getClass(), "imageUrl", null);
        setField(term9193, term9193.getClass(), "person", null);
        setField(term9193, term9193.getClass(), "action", null);
        setField(term9193, term9193.getClass(), "object", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.dto.CardResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "CardFromEntity", argTypes, term9193, args);
    }

};


