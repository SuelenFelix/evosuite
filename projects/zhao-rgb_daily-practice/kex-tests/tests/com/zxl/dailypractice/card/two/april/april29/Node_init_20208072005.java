package com.zxl.dailypractice.card.two.april.april29;

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
import static com.zxl.dailypractice.card.two.april.april29.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class Node_init_20208072005 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133;
     Object term135;

    public Node_init_20208072005() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133 = new Boolean(false);
        term135 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.two.april.april29.Node");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = boolean.class;
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("com.zxl.dailypractice.card.two.april.april29.Node");
        argTypes[3] = Class.forName("com.zxl.dailypractice.card.two.april.april29.Node");
        argTypes[4] = Class.forName("com.zxl.dailypractice.card.two.april.april29.Node");
        argTypes[5] = Class.forName("com.zxl.dailypractice.card.two.april.april29.Node");
        Object[] args = new Object[6];
        args[0] = term133;
        args[1] = term135;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


