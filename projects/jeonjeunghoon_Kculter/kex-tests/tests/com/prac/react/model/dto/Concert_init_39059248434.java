package com.prac.react.model.dto;

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
import static com.prac.react.model.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Double;

public class Concert_init_39059248434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23965;
     Object term23967;
     Object term23969;
     Object term23971;
     Object term23973;

    public Concert_init_39059248434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23965 = new Integer(0);
        term23967 = new Double(0.0);
        term23969 = new Double(0.0);
        term23971 = new Integer(0);
        term23973 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Concert");
        Class<?>[] argTypes = new Class<?>[15];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.util.Date");
        argTypes[5] = Class.forName("java.util.Date");
        argTypes[6] = double.class;
        argTypes[7] = double.class;
        argTypes[8] = int.class;
        argTypes[9] = Class.forName("java.lang.String");
        argTypes[10] = Class.forName("java.lang.String");
        argTypes[11] = int.class;
        argTypes[12] = Class.forName("java.lang.String");
        argTypes[13] = Class.forName("java.lang.String");
        argTypes[14] = Class.forName("java.lang.String");
        Object[] args = new Object[15];
        args[0] = term23965;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = term23967;
        args[7] = term23969;
        args[8] = term23971;
        args[9] = null;
        args[10] = null;
        args[11] = term23973;
        args[12] = null;
        args[13] = null;
        args[14] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


