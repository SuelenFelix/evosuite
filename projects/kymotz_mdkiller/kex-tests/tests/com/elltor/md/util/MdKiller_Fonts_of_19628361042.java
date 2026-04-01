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

public class MdKiller_Fonts_of_19628361042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64286;

    public MdKiller_Fonts_of_19628361042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term64394 = Class.forName((String) "com.elltor.md.util.MdKiller$Style");
        Field term64393 = ((Class) term64394).getDeclaredField((String) "NORMAL");
        ((Field) term64393).setAccessible(true);
        Object enum262 = ((Field) term64393).get((Object) null);
        Class<? extends Object> term64584 = Class.forName((String) "com.elltor.md.util.MdKiller$Style");
        Field term64583 = ((Class) term64584).getDeclaredField((String) "BLUE");
        ((Field) term64583).setAccessible(true);
        Object enum263 = ((Field) term64583).get((Object) null);
        Class<? extends Object> term64768 = Class.forName((String) "com.elltor.md.util.MdKiller$Style");
        Field term64767 = ((Class) term64768).getDeclaredField((String) "ITALIC");
        ((Field) term64767).setAccessible(true);
        Object enum264 = ((Field) term64767).get((Object) null);
        Class<? extends Object> term64958 = Class.forName((String) "com.elltor.md.util.MdKiller$Style");
        Field term64957 = ((Class) term64958).getDeclaredField((String) "YELLOW");
        ((Field) term64957).setAccessible(true);
        Object enum265 = ((Field) term64957).get((Object) null);
        Class<? extends Object> term65148 = Class.forName((String) "com.elltor.md.util.MdKiller$Style");
        Field term65147 = ((Class) term65148).getDeclaredField((String) "GREEN");
        ((Field) term65147).setAccessible(true);
        Object enum266 = ((Field) term65147).get((Object) null);
        Class<? extends Object> term65335 = Class.forName((String) "com.elltor.md.util.MdKiller$Style");
        Field term65334 = ((Class) term65335).getDeclaredField((String) "BOLD");
        ((Field) term65334).setAccessible(true);
        Object enum267 = ((Field) term65334).get((Object) null);
        term64286 = (Object[]) newArray("com.elltor.md.util.MdKiller$Style", 8);
        setElement(term64286, 0, enum262);
        setElement(term64286, 1, enum263);
        setElement(term64286, 2, enum263);
        setElement(term64286, 3, enum264);
        setElement(term64286, 4, enum265);
        setElement(term64286, 5, enum266);
        setElement(term64286, 6, enum264);
        setElement(term64286, 7, enum267);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.elltor.md.util.MdKiller$Fonts");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(Class.forName("com.elltor.md.util.MdKiller$Style"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = "TJmVBGfTML";
        args[1] = term64286;
        callMethod(klass, "of", argTypes, null, args);
    }

};


