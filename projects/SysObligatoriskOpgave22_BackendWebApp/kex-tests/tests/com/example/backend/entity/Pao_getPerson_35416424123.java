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

public class Pao_getPerson_35416424123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14197;

    public Pao_getPerson_35416424123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14197 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term14197, term14197.getClass(), "id", null);
        setField(term14197, term14197.getClass(), "imageUrl", null);
        setField(term14197, term14197.getClass(), "person", null);
        setField(term14197, term14197.getClass(), "action", null);
        setField(term14197, term14197.getClass(), "object", null);
        setField(term14197, term14197.getClass(), "paoCard", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.entity.Pao");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPerson", argTypes, term14197, args);
    }

};


