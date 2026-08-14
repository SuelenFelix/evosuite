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

public class ExportCsvConfig_defaultquoteChar_190555369623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term754;

    public ExportCsvConfig_defaultquoteChar_190555369623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term754 = newInstance(Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig"));
        setField(term754, term754.getClass(), "charset", null);
        setCharField(term754, term754.getClass(), "separator", (char) 0);
        setCharField(term754, term754.getClass(), "quoteChar", (char) 0);
        setCharField(term754, term754.getClass(), "escapeChar", (char) 0);
        setField(term754, term754.getClass(), "lineEnd", null);
        setBooleanField(term754, term754.getClass(), "applyQuotesToAll", false);
        setBooleanField(term754, term754.getClass(), "sanitizeFormulas", false);
        setField(term754, term754.getClass(), "fieldNamesExcludedFromSanitization", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "$default$quoteChar", argTypes, term754, args);
    }

};


