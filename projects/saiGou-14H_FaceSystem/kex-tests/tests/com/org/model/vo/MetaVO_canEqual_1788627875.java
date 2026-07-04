package com.org.model.vo;

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
import static com.org.model.vo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MetaVO_canEqual_1788627875 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3807;
     Object term3832;

    public MetaVO_canEqual_1788627875() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3807 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term3807, term3807.getClass(), "title", "QxiiHtQAzN");
        setField(term3807, term3807.getClass(), "icon", "gQgTBlRIvX");
        term3832 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.MetaVO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3832;
        callMethod(klass, "canEqual", argTypes, term3807, args);
    }

};


