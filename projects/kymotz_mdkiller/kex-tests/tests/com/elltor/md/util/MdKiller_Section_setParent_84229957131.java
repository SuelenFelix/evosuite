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

public class MdKiller_Section_setParent_84229957131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56001;

    public MdKiller_Section_setParent_84229957131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56001 = newInstance(Class.forName("com.elltor.md.util.MdKiller$Section"));
        setIntField(term56001, term56001.getClass(), "depth", 0);
        setField(term56001, term56001.getClass(), "type", null);
        setField(term56001, term56001.getClass(), "data", null);
        setField(term56001, term56001.getClass(), "parent", null);
        setField(term56001, term56001.getClass(), "children", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.elltor.md.util.MdKiller$Section");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.elltor.md.util.MdKiller$Section");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setParent", argTypes, term56001, args);
    }

};


