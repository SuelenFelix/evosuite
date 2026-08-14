package com.coreoz.windmill.exports.exporters.csv;

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
import static com.coreoz.windmill.exports.exporters.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ExportCsvConfig_equals_23374739539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term854;

    public ExportCsvConfig_equals_23374739539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term854 = newInstance(Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig"));
        setField(term854, term854.getClass(), "charset", null);
        setCharField(term854, term854.getClass(), "separator", (char) 0);
        setCharField(term854, term854.getClass(), "quoteChar", (char) 0);
        setCharField(term854, term854.getClass(), "escapeChar", (char) 0);
        setField(term854, term854.getClass(), "lineEnd", null);
        setBooleanField(term854, term854.getClass(), "applyQuotesToAll", false);
        setBooleanField(term854, term854.getClass(), "sanitizeFormulas", false);
        setField(term854, term854.getClass(), "fieldNamesExcludedFromSanitization", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term854, args);
    }

};


