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

public class ExportRowsConfig_asExcel_7134973754 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83;

    public ExportRowsConfig_asExcel_7134973754() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83 = newInstance(Class.forName("com.coreoz.windmill.exports.config.ExportRowsConfig"));
        setField(term83, term83.getClass(), "rows", null);
        setField(term83, term83.getClass(), "mapping", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.exports.config.ExportRowsConfig");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.coreoz.windmill.exports.exporters.excel.ExportExcelConfig");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "asExcel", argTypes, term83, args);
    }

};


