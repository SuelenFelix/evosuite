package com.elltor.md.util;

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
import static com.elltor.md.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class MdKiller_Fonts_init_3240168490 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63835;

    public MdKiller_Fonts_init_3240168490() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term63879 = Class.forName((String) "com.elltor.md.util.MdKiller$Style");
        Field term63878 = ((Class) term63879).getDeclaredField((String) "ITALIC");
        ((Field) term63878).setAccessible(true);
        Object enum260 = ((Field) term63878).get((Object) null);
        Class<? extends Object> term64069 = Class.forName((String) "com.elltor.md.util.MdKiller$Style");
        Field term64068 = ((Class) term64069).getDeclaredField((String) "BLUE");
        ((Field) term64068).setAccessible(true);
        Object enum261 = ((Field) term64068).get((Object) null);
        term63835 = (Object[]) newArray("com.elltor.md.util.MdKiller$Style", 3);
        setElement(term63835, 0, enum260);
        setElement(term63835, 1, enum261);
        setElement(term63835, 2, enum260);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.elltor.md.util.MdKiller$Fonts");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(Class.forName("com.elltor.md.util.MdKiller$Style"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = "uWHnvSvaPl";
        args[1] = term63835;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


