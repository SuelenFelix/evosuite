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

public class MdKiller_TableDataBuilder_data_1307737043 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3583;

    public MdKiller_TableDataBuilder_data_1307737043() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3583 = newInstance(Class.forName("com.elltor.md.util.MdKiller$TableDataBuilder"));
        setField(term3583, term3583.getClass(), "parentSec", null);
        setField(term3583, term3583.getClass(), "parentBuilder", null);
        setField(term3583, term3583.getClass(), "tableData", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.elltor.md.util.MdKiller$TableDataBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(Class.forName("java.lang.Object"), 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "data", argTypes, term3583, args);
    }

};


