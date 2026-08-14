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

public class ExportCsvConfig_ExportCsvConfigBuilder_toString_8558062525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1910;

    public ExportCsvConfig_ExportCsvConfigBuilder_toString_8558062525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1910 = newInstance(Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig$ExportCsvConfigBuilder"));
        setBooleanField(term1910, term1910.getClass(), "charset$set", false);
        setField(term1910, term1910.getClass(), "charset$value", null);
        setBooleanField(term1910, term1910.getClass(), "separator$set", false);
        setCharField(term1910, term1910.getClass(), "separator$value", (char) 0);
        setBooleanField(term1910, term1910.getClass(), "quoteChar$set", false);
        setCharField(term1910, term1910.getClass(), "quoteChar$value", (char) 0);
        setBooleanField(term1910, term1910.getClass(), "escapeChar$set", false);
        setCharField(term1910, term1910.getClass(), "escapeChar$value", (char) 0);
        setBooleanField(term1910, term1910.getClass(), "lineEnd$set", false);
        setField(term1910, term1910.getClass(), "lineEnd$value", null);
        setBooleanField(term1910, term1910.getClass(), "applyQuotesToAll$set", false);
        setBooleanField(term1910, term1910.getClass(), "applyQuotesToAll$value", false);
        setBooleanField(term1910, term1910.getClass(), "sanitizeFormulas$set", false);
        setBooleanField(term1910, term1910.getClass(), "sanitizeFormulas$value", false);
        setBooleanField(term1910, term1910.getClass(), "fieldNamesExcludedFromSanitization$set", false);
        setField(term1910, term1910.getClass(), "fieldNamesExcludedFromSanitization$value", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig$ExportCsvConfigBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1910, args);
    }

};


