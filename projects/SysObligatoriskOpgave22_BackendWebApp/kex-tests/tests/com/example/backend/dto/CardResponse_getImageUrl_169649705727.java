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

public class CardResponse_getImageUrl_169649705727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9199;

    public CardResponse_getImageUrl_169649705727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9199 = newInstance(Class.forName("com.example.backend.dto.CardResponse"));
        setField(term9199, term9199.getClass(), "id", null);
        setField(term9199, term9199.getClass(), "rank", null);
        setField(term9199, term9199.getClass(), "suit", null);
        setField(term9199, term9199.getClass(), "imageUrl", null);
        setField(term9199, term9199.getClass(), "person", null);
        setField(term9199, term9199.getClass(), "action", null);
        setField(term9199, term9199.getClass(), "object", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.dto.CardResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getImageUrl", argTypes, term9199, args);
    }

};


