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

public class ExportCsvConfig_ExportCsvConfigBuilder_applyQuotesToAll_86577184221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1850;
     Object term1864;

    public ExportCsvConfig_ExportCsvConfigBuilder_applyQuotesToAll_86577184221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1850 = newInstance(Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig$ExportCsvConfigBuilder"));
        setBooleanField(term1850, term1850.getClass(), "charset$set", false);
        setField(term1850, term1850.getClass(), "charset$value", null);
        setBooleanField(term1850, term1850.getClass(), "separator$set", false);
        setCharField(term1850, term1850.getClass(), "separator$value", (char) 0);
        setBooleanField(term1850, term1850.getClass(), "quoteChar$set", false);
        setCharField(term1850, term1850.getClass(), "quoteChar$value", (char) 0);
        setBooleanField(term1850, term1850.getClass(), "escapeChar$set", false);
        setCharField(term1850, term1850.getClass(), "escapeChar$value", (char) 0);
        setBooleanField(term1850, term1850.getClass(), "lineEnd$set", false);
        setField(term1850, term1850.getClass(), "lineEnd$value", null);
        setBooleanField(term1850, term1850.getClass(), "applyQuotesToAll$set", false);
        setBooleanField(term1850, term1850.getClass(), "applyQuotesToAll$value", false);
        setBooleanField(term1850, term1850.getClass(), "sanitizeFormulas$set", false);
        setBooleanField(term1850, term1850.getClass(), "sanitizeFormulas$value", false);
        setBooleanField(term1850, term1850.getClass(), "fieldNamesExcludedFromSanitization$set", false);
        setField(term1850, term1850.getClass(), "fieldNamesExcludedFromSanitization$value", null);
        term1864 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig$ExportCsvConfigBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1864;
        callMethod(klass, "applyQuotesToAll", argTypes, term1850, args);
    }

};


