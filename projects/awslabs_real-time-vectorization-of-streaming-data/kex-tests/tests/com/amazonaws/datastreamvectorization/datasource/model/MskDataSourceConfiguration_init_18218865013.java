package com.amazonaws.datastreamvectorization.datasource.model;

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
import static com.amazonaws.datastreamvectorization.datasource.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.util.HashMap;
import java.lang.String;
import java.lang.Object;

public class MskDataSourceConfiguration_init_18218865013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6251;
     Object term6278;
     Object enum11;

    public MskDataSourceConfiguration_init_18218865013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6251 = new LinkedList();
        term6278 = new HashMap();
        Class<? extends Object> term6346 = Class.forName((String) "com.amazonaws.datastreamvectorization.datasource.model.MskAuthType");
        Field term6345 = ((Class) term6346).getDeclaredField((String) "IAM");
        ((Field) term6345).setAccessible(true);
        enum11 = ((Field) term6345).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.datastreamvectorization.datasource.model.MskDataSourceConfiguration");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("com.amazonaws.datastreamvectorization.datasource.model.StartingOffset");
        argTypes[5] = Class.forName("java.util.Properties");
        argTypes[6] = Class.forName("com.amazonaws.datastreamvectorization.datasource.model.MskAuthType");
        argTypes[7] = Class.forName("com.amazonaws.datastreamvectorization.datasource.model.StreamDataType");
        Object[] args = new Object[8];
        args[0] = "jiKYgYHqIS";
        args[1] = term6251;
        args[2] = "DfISiziTgG";
        args[3] = "XqgfKFvPSD";
        args[4] = null;
        args[5] = term6278;
        args[6] = enum11;
        args[7] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


