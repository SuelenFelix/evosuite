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

public class ExportCsvConfig_ExportCsvConfigBuilder_build_177668132211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1610;

    public ExportCsvConfig_ExportCsvConfigBuilder_build_177668132211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1648 = new HashMap();
        Set<Object> term1685 =  ((Map) term1648).keySet();
        HashSet term1647 = new HashSet((Collection<? extends Object>) term1685);
        term1610 = newInstance(Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig$ExportCsvConfigBuilder"));
        Object term1612 = newInstance(Class.forName("com.coreoz.windmill.files.BomCharset"));
        byte[] term1613 = (byte[]) newByteArray(9);
        setBooleanField(term1610, term1610.getClass(), "charset$set", false);
        setField(term1612, term1612.getClass(), "charset", null);
        setByteElement(term1613, 0, (byte) 70);
        setByteElement(term1613, 1, (byte) 48);
        setByteElement(term1613, 2, (byte) -46);
        setByteElement(term1613, 3, (byte) -128);
        setByteElement(term1613, 4, (byte) 66);
        setByteElement(term1613, 5, (byte) -112);
        setByteElement(term1613, 6, (byte) 81);
        setByteElement(term1613, 7, (byte) 65);
        setByteElement(term1613, 8, (byte) -44);
        setField(term1612, term1612.getClass(), "bomBytes", term1613);
        setField(term1610, term1610.getClass(), "charset$value", term1612);
        setBooleanField(term1610, term1610.getClass(), "separator$set", true);
        setCharField(term1610, term1610.getClass(), "separator$value", 'G');
        setBooleanField(term1610, term1610.getClass(), "quoteChar$set", true);
        setCharField(term1610, term1610.getClass(), "quoteChar$value", 'Y');
        setBooleanField(term1610, term1610.getClass(), "escapeChar$set", false);
        setCharField(term1610, term1610.getClass(), "escapeChar$value", 'S');
        setBooleanField(term1610, term1610.getClass(), "lineEnd$set", false);
        setField(term1610, term1610.getClass(), "lineEnd$value", "RYdKCNNMBR");
        setBooleanField(term1610, term1610.getClass(), "applyQuotesToAll$set", true);
        setBooleanField(term1610, term1610.getClass(), "applyQuotesToAll$value", false);
        setBooleanField(term1610, term1610.getClass(), "sanitizeFormulas$set", true);
        setBooleanField(term1610, term1610.getClass(), "sanitizeFormulas$value", false);
        setBooleanField(term1610, term1610.getClass(), "fieldNamesExcludedFromSanitization$set", false);
        setField(term1610, term1610.getClass(), "fieldNamesExcludedFromSanitization$value", term1647);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig$ExportCsvConfigBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term1610, args);
    }

};


