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

public class Place_init_8930979811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4191;
     Object term4193;
     Object term4219;
     Object term4221;
     Object term4223;

    public Place_init_8930979811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4191 = new Integer(568599855);
        term4193 = new Integer(1162663216);
        term4219 = new Double(0.8823181080774973);
        term4221 = new Double(0.2192450926212024);
        term4223 = new Integer(1484323161);
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
        args[0] = term4191;
        args[1] = term4193;
        args[2] = "RbVQXSpxXy";
        args[3] = "YpJbIgJWWv";
        args[4] = term4219;
        args[5] = term4221;
        args[6] = term4223;
        args[7] = "JppkknKVOw";
        args[8] = "iljANwuEjk";
        args[9] = "kNqaJKIATy";
        args[10] = "vKQukfbJUd";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


