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

public class ExportCsvConfig_ExportCsvConfigBuilder_separator_12487888704 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1165;
     Object term1211;

    public ExportCsvConfig_ExportCsvConfigBuilder_separator_12487888704() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1201 = new HashMap();
        Set<Object> term1230 =  ((Map) term1201).keySet();
        HashSet term1200 = new HashSet((Collection<? extends Object>) term1230);
        term1165 = newInstance(Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig$ExportCsvConfigBuilder"));
        Object term1167 = newInstance(Class.forName("com.coreoz.windmill.files.BomCharset"));
        byte[] term1168 = (byte[]) newByteArray(7);
        setBooleanField(term1165, term1165.getClass(), "charset$set", false);
        setField(term1167, term1167.getClass(), "charset", null);
        setByteElement(term1168, 0, (byte) -20);
        setByteElement(term1168, 1, (byte) 10);
        setByteElement(term1168, 2, (byte) 77);
        setByteElement(term1168, 3, (byte) 14);
        setByteElement(term1168, 4, (byte) -101);
        setByteElement(term1168, 5, (byte) 35);
        setByteElement(term1168, 6, (byte) 66);
        setField(term1167, term1167.getClass(), "bomBytes", term1168);
        setField(term1165, term1165.getClass(), "charset$value", term1167);
        setBooleanField(term1165, term1165.getClass(), "separator$set", true);
        setCharField(term1165, term1165.getClass(), "separator$value", 'n');
        setBooleanField(term1165, term1165.getClass(), "quoteChar$set", false);
        setCharField(term1165, term1165.getClass(), "quoteChar$value", 'W');
        setBooleanField(term1165, term1165.getClass(), "escapeChar$set", false);
        setCharField(term1165, term1165.getClass(), "escapeChar$value", 'E');
        setBooleanField(term1165, term1165.getClass(), "lineEnd$set", false);
        setField(term1165, term1165.getClass(), "lineEnd$value", "KoyGrUJeJW");
        setBooleanField(term1165, term1165.getClass(), "applyQuotesToAll$set", false);
        setBooleanField(term1165, term1165.getClass(), "applyQuotesToAll$value", true);
        setBooleanField(term1165, term1165.getClass(), "sanitizeFormulas$set", true);
        setBooleanField(term1165, term1165.getClass(), "sanitizeFormulas$value", false);
        setBooleanField(term1165, term1165.getClass(), "fieldNamesExcludedFromSanitization$set", false);
        setField(term1165, term1165.getClass(), "fieldNamesExcludedFromSanitization$value", term1200);
        term1211 = new Character('G');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig$ExportCsvConfigBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term1211;
        callMethod(klass, "separator", argTypes, term1165, args);
    }

};


