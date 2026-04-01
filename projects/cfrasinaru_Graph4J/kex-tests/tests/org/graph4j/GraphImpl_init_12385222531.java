package org.graph4j;

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
import static org.graph4j.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Boolean;

public class GraphImpl_init_12385222531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61;
     Object term68;
     Object term70;
     Object term72;
     Object term74;
     Object term76;
     Object term78;
     Object term80;

    public GraphImpl_init_12385222531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61 = (int[]) newIntArray(6);
        setIntElement(term61, 0, -2038273078);
        setIntElement(term61, 1, 1227103734);
        setIntElement(term61, 2, -1339778481);
        setIntElement(term61, 3, 1725571209);
        setIntElement(term61, 4, -522618178);
        setIntElement(term61, 5, 1134449235);
        term68 = new Integer(-883034806);
        term70 = new Integer(1585847225);
        term72 = new Boolean(false);
        term74 = new Boolean(false);
        term76 = new Boolean(false);
        term78 = new Integer(597278769);
        term80 = new Integer(-1685132342);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = boolean.class;
        argTypes[4] = boolean.class;
        argTypes[5] = boolean.class;
        argTypes[6] = int.class;
        argTypes[7] = int.class;
        Object[] args = new Object[8];
        args[0] = term61;
        args[1] = term68;
        args[2] = term70;
        args[3] = term72;
        args[4] = term74;
        args[5] = term76;
        args[6] = term78;
        args[7] = term80;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


