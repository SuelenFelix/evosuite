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

public class ExportCsvConfig_ExportCsvConfigBuilder_charset_72614868316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1774;

    public ExportCsvConfig_ExportCsvConfigBuilder_charset_72614868316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1774 = newInstance(Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig$ExportCsvConfigBuilder"));
        setBooleanField(term1774, term1774.getClass(), "charset$set", false);
        setField(term1774, term1774.getClass(), "charset$value", null);
        setBooleanField(term1774, term1774.getClass(), "separator$set", false);
        setCharField(term1774, term1774.getClass(), "separator$value", (char) 0);
        setBooleanField(term1774, term1774.getClass(), "quoteChar$set", false);
        setCharField(term1774, term1774.getClass(), "quoteChar$value", (char) 0);
        setBooleanField(term1774, term1774.getClass(), "escapeChar$set", false);
        setCharField(term1774, term1774.getClass(), "escapeChar$value", (char) 0);
        setBooleanField(term1774, term1774.getClass(), "lineEnd$set", false);
        setField(term1774, term1774.getClass(), "lineEnd$value", null);
        setBooleanField(term1774, term1774.getClass(), "applyQuotesToAll$set", false);
        setBooleanField(term1774, term1774.getClass(), "applyQuotesToAll$value", false);
        setBooleanField(term1774, term1774.getClass(), "sanitizeFormulas$set", false);
        setBooleanField(term1774, term1774.getClass(), "sanitizeFormulas$value", false);
        setBooleanField(term1774, term1774.getClass(), "fieldNamesExcludedFromSanitization$set", false);
        setField(term1774, term1774.getClass(), "fieldNamesExcludedFromSanitization$value", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig$ExportCsvConfigBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.coreoz.windmill.files.BomCharset");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "charset", argTypes, term1774, args);
    }

};


