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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;

public class MdKiller_Fonts_parseStyle_4506404985 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65598;
     Object enum268;

    public MdKiller_Fonts_parseStyle_4506404985() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term65612 = new HashMap();
        Set<Object> term65666 =  ((Map) term65612).keySet();
        HashSet term65611 = new HashSet((Collection<? extends Object>) term65666);
        term65598 = newInstance(Class.forName("com.elltor.md.util.MdKiller$Fonts"));
        setField(term65598, term65598.getClass(), "text", "whBvTVIIlC");
        setField(term65598, term65598.getClass(), "styles", term65611);
        Class<? extends Object> term65678 = Class.forName((String) "com.elltor.md.util.MdKiller$Style");
        Field term65677 = ((Class) term65678).getDeclaredField((String) "NORMAL");
        ((Field) term65677).setAccessible(true);
        enum268 = ((Field) term65677).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.elltor.md.util.MdKiller$Fonts");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.elltor.md.util.MdKiller$Style");
        Object[] args = new Object[2];
        args[0] = "IgRJUzaCwW";
        args[1] = enum268;
        callMethod(klass, "parseStyle", argTypes, term65598, args);
    }

};


