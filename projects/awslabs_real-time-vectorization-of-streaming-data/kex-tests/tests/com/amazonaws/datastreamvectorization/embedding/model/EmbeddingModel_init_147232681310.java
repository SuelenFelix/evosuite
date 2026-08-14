package com.amazonaws.datastreamvectorization.embedding.model;

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
import static com.amazonaws.datastreamvectorization.embedding.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedHashMap;
import java.lang.Integer;

public class EmbeddingModel_init_147232681310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3443;
     Object term3508;
     Object term3595;
     Object term3597;

    public EmbeddingModel_init_147232681310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3443 = new LinkedHashMap();
        term3508 = new LinkedHashMap();
        term3595 = new Integer(568599855);
        term3597 = new Integer(1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.datastreamvectorization.embedding.model.EmbeddingModel");
        Class<?>[] argTypes = new Class<?>[10];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.Class");
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = Class.forName("java.util.Map");
        argTypes[7] = Class.forName("java.util.Map");
        argTypes[8] = int.class;
        argTypes[9] = int.class;
        Object[] args = new Object[10];
        args[0] = "VgZnGoIFwQ";
        args[1] = "jUbSRrkrYZ";
        args[2] = null;
        args[3] = "bWWfajKbEX";
        args[4] = term3443;
        args[5] = term3508;
        args[6] = term3595;
        args[7] = term3597;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


