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

public class ExportCsvConfig_ExportCsvConfigBuilder_disableFormulasSanitization_165374638713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1746;

    public ExportCsvConfig_ExportCsvConfigBuilder_disableFormulasSanitization_165374638713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1746 = newInstance(Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig$ExportCsvConfigBuilder"));
        setBooleanField(term1746, term1746.getClass(), "charset$set", false);
        setField(term1746, term1746.getClass(), "charset$value", null);
        setBooleanField(term1746, term1746.getClass(), "separator$set", false);
        setCharField(term1746, term1746.getClass(), "separator$value", (char) 0);
        setBooleanField(term1746, term1746.getClass(), "quoteChar$set", false);
        setCharField(term1746, term1746.getClass(), "quoteChar$value", (char) 0);
        setBooleanField(term1746, term1746.getClass(), "escapeChar$set", false);
        setCharField(term1746, term1746.getClass(), "escapeChar$value", (char) 0);
        setBooleanField(term1746, term1746.getClass(), "lineEnd$set", false);
        setField(term1746, term1746.getClass(), "lineEnd$value", null);
        setBooleanField(term1746, term1746.getClass(), "applyQuotesToAll$set", false);
        setBooleanField(term1746, term1746.getClass(), "applyQuotesToAll$value", false);
        setBooleanField(term1746, term1746.getClass(), "sanitizeFormulas$set", false);
        setBooleanField(term1746, term1746.getClass(), "sanitizeFormulas$value", false);
        setBooleanField(term1746, term1746.getClass(), "fieldNamesExcludedFromSanitization$set", false);
        setField(term1746, term1746.getClass(), "fieldNamesExcludedFromSanitization$value", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig$ExportCsvConfigBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "disableFormulasSanitization", argTypes, term1746, args);
    }

};


