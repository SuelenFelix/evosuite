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
import java.lang.Character;

public class ExportCsvConfig_ExportCsvConfigBuilder_quoteChar_15583991495 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1231;
     Object term1270;

    public ExportCsvConfig_ExportCsvConfigBuilder_quoteChar_15583991495() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1262 = new HashMap();
        Set<Object> term1284 =  ((Map) term1262).keySet();
        HashSet term1261 = new HashSet((Collection<? extends Object>) term1284);
        term1231 = newInstance(Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig$ExportCsvConfigBuilder"));
        Object term1233 = newInstance(Class.forName("com.coreoz.windmill.files.BomCharset"));
        byte[] term1234 = (byte[]) newByteArray(2);
        setBooleanField(term1231, term1231.getClass(), "charset$set", true);
        setField(term1233, term1233.getClass(), "charset", null);
        setByteElement(term1234, 0, (byte) 123);
        setByteElement(term1234, 1, (byte) -5);
        setField(term1233, term1233.getClass(), "bomBytes", term1234);
        setField(term1231, term1231.getClass(), "charset$value", term1233);
        setBooleanField(term1231, term1231.getClass(), "separator$set", true);
        setCharField(term1231, term1231.getClass(), "separator$value", 't');
        setBooleanField(term1231, term1231.getClass(), "quoteChar$set", true);
        setCharField(term1231, term1231.getClass(), "quoteChar$value", 'D');
        setBooleanField(term1231, term1231.getClass(), "escapeChar$set", false);
        setCharField(term1231, term1231.getClass(), "escapeChar$value", 'I');
        setBooleanField(term1231, term1231.getClass(), "lineEnd$set", false);
        setField(term1231, term1231.getClass(), "lineEnd$value", "oVgzLbrsFr");
        setBooleanField(term1231, term1231.getClass(), "applyQuotesToAll$set", false);
        setBooleanField(term1231, term1231.getClass(), "applyQuotesToAll$value", false);
        setBooleanField(term1231, term1231.getClass(), "sanitizeFormulas$set", false);
        setBooleanField(term1231, term1231.getClass(), "sanitizeFormulas$value", false);
        setBooleanField(term1231, term1231.getClass(), "fieldNamesExcludedFromSanitization$set", false);
        setField(term1231, term1231.getClass(), "fieldNamesExcludedFromSanitization$value", term1261);
        term1270 = new Character('R');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig$ExportCsvConfigBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term1270;
        callMethod(klass, "quoteChar", argTypes, term1231, args);
    }

};


