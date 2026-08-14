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

public class ExportCsvConfig_ExportCsvConfigBuilder_lineEnd_47402291520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1836;

    public ExportCsvConfig_ExportCsvConfigBuilder_lineEnd_47402291520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1836 = newInstance(Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig$ExportCsvConfigBuilder"));
        setBooleanField(term1836, term1836.getClass(), "charset$set", false);
        setField(term1836, term1836.getClass(), "charset$value", null);
        setBooleanField(term1836, term1836.getClass(), "separator$set", false);
        setCharField(term1836, term1836.getClass(), "separator$value", (char) 0);
        setBooleanField(term1836, term1836.getClass(), "quoteChar$set", false);
        setCharField(term1836, term1836.getClass(), "quoteChar$value", (char) 0);
        setBooleanField(term1836, term1836.getClass(), "escapeChar$set", false);
        setCharField(term1836, term1836.getClass(), "escapeChar$value", (char) 0);
        setBooleanField(term1836, term1836.getClass(), "lineEnd$set", false);
        setField(term1836, term1836.getClass(), "lineEnd$value", null);
        setBooleanField(term1836, term1836.getClass(), "applyQuotesToAll$set", false);
        setBooleanField(term1836, term1836.getClass(), "applyQuotesToAll$value", false);
        setBooleanField(term1836, term1836.getClass(), "sanitizeFormulas$set", false);
        setBooleanField(term1836, term1836.getClass(), "sanitizeFormulas$value", false);
        setBooleanField(term1836, term1836.getClass(), "fieldNamesExcludedFromSanitization$set", false);
        setField(term1836, term1836.getClass(), "fieldNamesExcludedFromSanitization$value", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig$ExportCsvConfigBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "lineEnd", argTypes, term1836, args);
    }

};


