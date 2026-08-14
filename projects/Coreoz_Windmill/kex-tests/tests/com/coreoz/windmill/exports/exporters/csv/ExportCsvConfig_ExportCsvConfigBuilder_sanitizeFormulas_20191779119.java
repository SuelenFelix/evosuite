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
import java.lang.Boolean;

public class ExportCsvConfig_ExportCsvConfigBuilder_sanitizeFormulas_20191779119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1468;
     Object term1515;

    public ExportCsvConfig_ExportCsvConfigBuilder_sanitizeFormulas_20191779119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1501 = new HashMap();
        Set<Object> term1531 =  ((Map) term1501).keySet();
        HashSet term1500 = new HashSet((Collection<? extends Object>) term1531);
        term1468 = newInstance(Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig$ExportCsvConfigBuilder"));
        Object term1470 = newInstance(Class.forName("com.coreoz.windmill.files.BomCharset"));
        byte[] term1471 = (byte[]) newByteArray(4);
        setBooleanField(term1468, term1468.getClass(), "charset$set", false);
        setField(term1470, term1470.getClass(), "charset", null);
        setByteElement(term1471, 0, (byte) -97);
        setByteElement(term1471, 1, (byte) -24);
        setByteElement(term1471, 2, (byte) 88);
        setByteElement(term1471, 3, (byte) 96);
        setField(term1470, term1470.getClass(), "bomBytes", term1471);
        setField(term1468, term1468.getClass(), "charset$value", term1470);
        setBooleanField(term1468, term1468.getClass(), "separator$set", true);
        setCharField(term1468, term1468.getClass(), "separator$value", 'Q');
        setBooleanField(term1468, term1468.getClass(), "quoteChar$set", true);
        setCharField(term1468, term1468.getClass(), "quoteChar$value", 'T');
        setBooleanField(term1468, term1468.getClass(), "escapeChar$set", true);
        setCharField(term1468, term1468.getClass(), "escapeChar$value", 'y');
        setBooleanField(term1468, term1468.getClass(), "lineEnd$set", false);
        setField(term1468, term1468.getClass(), "lineEnd$value", "DfISiziTgG");
        setBooleanField(term1468, term1468.getClass(), "applyQuotesToAll$set", true);
        setBooleanField(term1468, term1468.getClass(), "applyQuotesToAll$value", false);
        setBooleanField(term1468, term1468.getClass(), "sanitizeFormulas$set", false);
        setBooleanField(term1468, term1468.getClass(), "sanitizeFormulas$value", false);
        setBooleanField(term1468, term1468.getClass(), "fieldNamesExcludedFromSanitization$set", true);
        setField(term1468, term1468.getClass(), "fieldNamesExcludedFromSanitization$value", term1500);
        term1515 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig$ExportCsvConfigBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1515;
        callMethod(klass, "sanitizeFormulas", argTypes, term1468, args);
    }

};


