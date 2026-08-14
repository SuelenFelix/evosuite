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

public class ExportCsvConfig_defaultlineEnd_172610682225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term766;

    public ExportCsvConfig_defaultlineEnd_172610682225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term766 = newInstance(Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig"));
        setField(term766, term766.getClass(), "charset", null);
        setCharField(term766, term766.getClass(), "separator", (char) 0);
        setCharField(term766, term766.getClass(), "quoteChar", (char) 0);
        setCharField(term766, term766.getClass(), "escapeChar", (char) 0);
        setField(term766, term766.getClass(), "lineEnd", null);
        setBooleanField(term766, term766.getClass(), "applyQuotesToAll", false);
        setBooleanField(term766, term766.getClass(), "sanitizeFormulas", false);
        setField(term766, term766.getClass(), "fieldNamesExcludedFromSanitization", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "$default$lineEnd", argTypes, term766, args);
    }

};


