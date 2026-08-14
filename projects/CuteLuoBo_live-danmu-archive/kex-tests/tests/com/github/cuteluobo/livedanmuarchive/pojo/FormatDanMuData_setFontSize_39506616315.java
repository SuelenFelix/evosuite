package com.github.cuteluobo.livedanmuarchive.pojo;

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
import static com.github.cuteluobo.livedanmuarchive.pojo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Float;

public class FormatDanMuData_setFontSize_39506616315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23538;
     Object term23541;

    public FormatDanMuData_setFontSize_39506616315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23538 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.FormatDanMuData"));
        setLongField(term23538, term23538.getClass(), "startTime", 0L);
        setField(term23538, term23538.getClass(), "content", null);
        setFloatField(term23538, term23538.getClass(), "fontSize", 0.0F);
        term23541 = new Float(0.0F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.FormatDanMuData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term23541;
        callMethod(klass, "setFontSize", argTypes, term23538, args);
    }

};


