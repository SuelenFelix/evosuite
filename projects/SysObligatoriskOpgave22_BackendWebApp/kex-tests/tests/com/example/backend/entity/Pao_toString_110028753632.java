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

public class Pao_toString_110028753632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14206;

    public Pao_toString_110028753632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14206 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term14206, term14206.getClass(), "id", null);
        setField(term14206, term14206.getClass(), "imageUrl", null);
        setField(term14206, term14206.getClass(), "person", null);
        setField(term14206, term14206.getClass(), "action", null);
        setField(term14206, term14206.getClass(), "object", null);
        setField(term14206, term14206.getClass(), "paoCard", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.entity.Pao");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term14206, args);
    }

};


