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
import java.lang.Character;

public class ExportCsvConfig_ExportCsvConfigBuilder_escapeChar_30935408819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1820;
     Object term1834;

    public ExportCsvConfig_ExportCsvConfigBuilder_escapeChar_30935408819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1820 = newInstance(Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig$ExportCsvConfigBuilder"));
        setBooleanField(term1820, term1820.getClass(), "charset$set", false);
        setField(term1820, term1820.getClass(), "charset$value", null);
        setBooleanField(term1820, term1820.getClass(), "separator$set", false);
        setCharField(term1820, term1820.getClass(), "separator$value", (char) 0);
        setBooleanField(term1820, term1820.getClass(), "quoteChar$set", false);
        setCharField(term1820, term1820.getClass(), "quoteChar$value", (char) 0);
        setBooleanField(term1820, term1820.getClass(), "escapeChar$set", false);
        setCharField(term1820, term1820.getClass(), "escapeChar$value", (char) 0);
        setBooleanField(term1820, term1820.getClass(), "lineEnd$set", false);
        setField(term1820, term1820.getClass(), "lineEnd$value", null);
        setBooleanField(term1820, term1820.getClass(), "applyQuotesToAll$set", false);
        setBooleanField(term1820, term1820.getClass(), "applyQuotesToAll$value", false);
        setBooleanField(term1820, term1820.getClass(), "sanitizeFormulas$set", false);
        setBooleanField(term1820, term1820.getClass(), "sanitizeFormulas$value", false);
        setBooleanField(term1820, term1820.getClass(), "fieldNamesExcludedFromSanitization$set", false);
        setField(term1820, term1820.getClass(), "fieldNamesExcludedFromSanitization$value", null);
        term1834 = new Character((char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig$ExportCsvConfigBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term1834;
        callMethod(klass, "escapeChar", argTypes, term1820, args);
    }

};


