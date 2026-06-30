package com.example.backend.entity;

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
import static com.example.backend.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Pao_getPaoCard_8939596559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9903;

    public Pao_getPaoCard_8939596559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9903 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term9903, term9903.getClass(), "id", null);
        setField(term9903, term9903.getClass(), "imageUrl", null);
        setField(term9903, term9903.getClass(), "person", null);
        setField(term9903, term9903.getClass(), "action", null);
        setField(term9903, term9903.getClass(), "object", null);
        setField(term9903, term9903.getClass(), "paoCard", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.entity.Pao");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPaoCard", argTypes, term9903, args);
    }

};


