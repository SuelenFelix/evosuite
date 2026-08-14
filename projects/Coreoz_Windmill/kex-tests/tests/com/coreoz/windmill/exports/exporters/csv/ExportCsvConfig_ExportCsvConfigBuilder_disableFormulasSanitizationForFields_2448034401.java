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
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class ExportCsvConfig_ExportCsvConfigBuilder_disableFormulasSanitizationForFields_2448034401 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term928;
     Object term981;

    public ExportCsvConfig_ExportCsvConfigBuilder_disableFormulasSanitizationForFields_2448034401() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term961 = new HashMap();
        Set<Object> term1044 =  ((Map) term961).keySet();
        HashSet term960 = new HashSet((Collection<? extends Object>) term1044);
        term928 = newInstance(Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig$ExportCsvConfigBuilder"));
        Object term930 = newInstance(Class.forName("com.coreoz.windmill.files.BomCharset"));
        byte[] term931 = (byte[]) newByteArray(4);
        setBooleanField(term928, term928.getClass(), "charset$set", true);
        setField(term930, term930.getClass(), "charset", null);
        setByteElement(term931, 0, (byte) 98);
        setByteElement(term931, 1, (byte) 79);
        setByteElement(term931, 2, (byte) 61);
        setByteElement(term931, 3, (byte) -92);
        setField(term930, term930.getClass(), "bomBytes", term931);
        setField(term928, term928.getClass(), "charset$value", term930);
        setBooleanField(term928, term928.getClass(), "separator$set", true);
        setCharField(term928, term928.getClass(), "separator$value", 'C');
        setBooleanField(term928, term928.getClass(), "quoteChar$set", true);
        setCharField(term928, term928.getClass(), "quoteChar$value", 'Z');
        setBooleanField(term928, term928.getClass(), "escapeChar$set", false);
        setCharField(term928, term928.getClass(), "escapeChar$value", 'p');
        setBooleanField(term928, term928.getClass(), "lineEnd$set", false);
        setField(term928, term928.getClass(), "lineEnd$value", "MLqYREekMl");
        setBooleanField(term928, term928.getClass(), "applyQuotesToAll$set", false);
        setBooleanField(term928, term928.getClass(), "applyQuotesToAll$value", true);
        setBooleanField(term928, term928.getClass(), "sanitizeFormulas$set", true);
        setBooleanField(term928, term928.getClass(), "sanitizeFormulas$value", false);
        setBooleanField(term928, term928.getClass(), "fieldNamesExcludedFromSanitization$set", true);
        setField(term928, term928.getClass(), "fieldNamesExcludedFromSanitization$value", term960);
        term981 = (Object[]) newArray("java.lang.String", 4);
        setElement(term981, 0, "TJmVBGfTML");
        setElement(term981, 1, "tPlsykYBqO");
        setElement(term981, 2, "bLPjGVBhlX");
        setElement(term981, 3, "whBvTVIIlC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig$ExportCsvConfigBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term981;
        callMethod(klass, "disableFormulasSanitizationForFields", argTypes, term928, args);
    }

};


