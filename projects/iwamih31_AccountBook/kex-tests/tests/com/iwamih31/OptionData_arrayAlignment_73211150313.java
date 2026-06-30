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
import java.lang.Integer;

public class OptionData_arrayAlignment_73211150313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39436;
     Object term39443;

    public OptionData_arrayAlignment_73211150313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39436 = (Object[]) newArray("java.lang.Object", 6);
        Object term39437 = newInstance(Class.forName("java.lang.Object"));
        Object term39438 = newInstance(Class.forName("java.lang.Object"));
        Object term39439 = newInstance(Class.forName("java.lang.Object"));
        Object term39440 = newInstance(Class.forName("java.lang.Object"));
        Object term39441 = newInstance(Class.forName("java.lang.Object"));
        Object term39442 = newInstance(Class.forName("java.lang.Object"));
        setElement(term39436, 0, term39437);
        setElement(term39436, 1, term39438);
        setElement(term39436, 2, term39439);
        setElement(term39436, 3, term39440);
        setElement(term39436, 4, term39441);
        setElement(term39436, 5, term39442);
        term39443 = new Integer(663292551);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.OptionData");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term39436;
        args[1] = term39443;
        args[2] = "ncSPTkhKjO";
        callMethod(klass, "arrayAlignment", argTypes, null, args);
    }

};


