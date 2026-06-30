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

public class Place_init_89309798128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8497;
     Object term8499;
     Object term8501;
     Object term8503;
     Object term8505;

    public Place_init_89309798128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8497 = new Integer(0);
        term8499 = new Integer(0);
        term8501 = new Double(0.0);
        term8503 = new Double(0.0);
        term8505 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Place");
        Class<?>[] argTypes = new Class<?>[11];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = double.class;
        argTypes[5] = double.class;
        argTypes[6] = int.class;
        argTypes[7] = Class.forName("java.lang.String");
        argTypes[8] = Class.forName("java.lang.String");
        argTypes[9] = Class.forName("java.lang.String");
        argTypes[10] = Class.forName("java.lang.String");
        Object[] args = new Object[11];
        args[0] = term8497;
        args[1] = term8499;
        args[2] = null;
        args[3] = null;
        args[4] = term8501;
        args[5] = term8503;
        args[6] = term8505;
        args[7] = null;
        args[8] = null;
        args[9] = null;
        args[10] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


