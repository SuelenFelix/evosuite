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

public class MdKiller_SectionBuilder_text_114859888212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14807;

    public MdKiller_SectionBuilder_text_114859888212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14807 = newInstance(Class.forName("com.elltor.md.util.MdKiller$SectionBuilder"));
        setField(term14807, term14807.getClass(), "curSec", null);
        setField(term14807, term14807.getClass(), "parentSec", null);
        setField(term14807, term14807.getClass(), "parentBuilder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.elltor.md.util.MdKiller$SectionBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.elltor.md.util.MdKiller$Style");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "text", argTypes, term14807, args);
    }

};


