package com.iwamih31;

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
import static com.iwamih31.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Set_getNameSet_21171664135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145;

    public Set_getNameSet_21171664135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145 = (Object[]) newArray("com.iwamih31.Set", 5);
        Object term146 = newInstance(Class.forName("com.iwamih31.Set"));
        Object term160 = newInstance(Class.forName("com.iwamih31.Set"));
        Object term174 = newInstance(Class.forName("com.iwamih31.Set"));
        Object term188 = newInstance(Class.forName("com.iwamih31.Set"));
        Object term202 = newInstance(Class.forName("com.iwamih31.Set"));
        setField(term146, term146.getClass(), "name", "SzjVpOQTyS");
        setIntField(term146, term146.getClass(), "value", -1955890973);
        setElement(term145, 0, term146);
        setField(term160, term160.getClass(), "name", "MjGYSRKTNF");
        setIntField(term160, term160.getClass(), "value", -2038273078);
        setElement(term145, 1, term160);
        setField(term174, term174.getClass(), "name", "hRNSzYYIrc");
        setIntField(term174, term174.getClass(), "value", 1227103734);
        setElement(term145, 2, term174);
        setField(term188, term188.getClass(), "name", "RMFIsYGgne");
        setIntField(term188, term188.getClass(), "value", -1339778481);
        setElement(term145, 3, term188);
        setField(term202, term202.getClass(), "name", "NRdvgJlhkX");
        setIntField(term202, term202.getClass(), "value", 1725571209);
        setElement(term145, 4, term202);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Set");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("com.iwamih31.Set"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term145;
        callMethod(klass, "get_Name_Set", argTypes, null, args);
    }

};


