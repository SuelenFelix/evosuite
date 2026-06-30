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

public class Pao_setImageUrl_191641874627 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14201;

    public Pao_setImageUrl_191641874627() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14201 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term14201, term14201.getClass(), "id", null);
        setField(term14201, term14201.getClass(), "imageUrl", null);
        setField(term14201, term14201.getClass(), "person", null);
        setField(term14201, term14201.getClass(), "action", null);
        setField(term14201, term14201.getClass(), "object", null);
        setField(term14201, term14201.getClass(), "paoCard", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.entity.Pao");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setImageUrl", argTypes, term14201, args);
    }

};


