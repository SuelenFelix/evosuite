package com.coreoz.windmill.exports.config;

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
import static com.coreoz.windmill.exports.config.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ExportConfig_withNoHeaderMapping_18581568697 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term326;

    public ExportConfig_withNoHeaderMapping_18581568697() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term326 = newInstance(Class.forName("com.coreoz.windmill.exports.config.ExportConfig"));
        setField(term326, term326.getClass(), "rows", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.exports.config.ExportConfig");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.util.function.Function"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "withNoHeaderMapping", argTypes, term326, args);
    }

};


