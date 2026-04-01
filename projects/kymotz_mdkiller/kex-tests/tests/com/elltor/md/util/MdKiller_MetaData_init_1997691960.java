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

public class MdKiller_MetaData_init_1997691960 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6058;

    public MdKiller_MetaData_init_1997691960() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6072 = new HashMap();
        Set<Object> term6098 =  ((Map) term6072).keySet();
        HashSet term6071 = new HashSet((Collection<? extends Object>) term6098);
        term6058 = newInstance(Class.forName("com.elltor.md.util.MdKiller$Fonts"));
        setField(term6058, term6058.getClass(), "text", "MuLcgQHgqz");
        setField(term6058, term6058.getClass(), "styles", term6071);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.elltor.md.util.MdKiller$MetaData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.elltor.md.util.MdKiller$Fonts");
        Object[] args = new Object[1];
        args[0] = term6058;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


