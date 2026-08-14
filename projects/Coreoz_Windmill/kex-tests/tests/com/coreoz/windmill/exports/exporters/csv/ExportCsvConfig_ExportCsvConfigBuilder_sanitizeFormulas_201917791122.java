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
import java.lang.Boolean;

public class ExportCsvConfig_ExportCsvConfigBuilder_sanitizeFormulas_201917791122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1866;
     Object term1880;

    public ExportCsvConfig_ExportCsvConfigBuilder_sanitizeFormulas_201917791122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1866 = newInstance(Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig$ExportCsvConfigBuilder"));
        setBooleanField(term1866, term1866.getClass(), "charset$set", false);
        setField(term1866, term1866.getClass(), "charset$value", null);
        setBooleanField(term1866, term1866.getClass(), "separator$set", false);
        setCharField(term1866, term1866.getClass(), "separator$value", (char) 0);
        setBooleanField(term1866, term1866.getClass(), "quoteChar$set", false);
        setCharField(term1866, term1866.getClass(), "quoteChar$value", (char) 0);
        setBooleanField(term1866, term1866.getClass(), "escapeChar$set", false);
        setCharField(term1866, term1866.getClass(), "escapeChar$value", (char) 0);
        setBooleanField(term1866, term1866.getClass(), "lineEnd$set", false);
        setField(term1866, term1866.getClass(), "lineEnd$value", null);
        setBooleanField(term1866, term1866.getClass(), "applyQuotesToAll$set", false);
        setBooleanField(term1866, term1866.getClass(), "applyQuotesToAll$value", false);
        setBooleanField(term1866, term1866.getClass(), "sanitizeFormulas$set", false);
        setBooleanField(term1866, term1866.getClass(), "sanitizeFormulas$value", false);
        setBooleanField(term1866, term1866.getClass(), "fieldNamesExcludedFromSanitization$set", false);
        setField(term1866, term1866.getClass(), "fieldNamesExcludedFromSanitization$value", null);
        term1880 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig$ExportCsvConfigBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1880;
        callMethod(klass, "sanitizeFormulas", argTypes, term1866, args);
    }

};


