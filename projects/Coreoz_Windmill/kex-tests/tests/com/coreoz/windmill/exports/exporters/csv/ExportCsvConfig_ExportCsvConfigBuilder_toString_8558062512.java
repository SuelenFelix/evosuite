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

public class ExportCsvConfig_ExportCsvConfigBuilder_toString_8558062512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1686;

    public ExportCsvConfig_ExportCsvConfigBuilder_toString_8558062512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1718 = new HashMap();
        Set<Object> term1745 =  ((Map) term1718).keySet();
        HashSet term1717 = new HashSet((Collection<? extends Object>) term1745);
        term1686 = newInstance(Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig$ExportCsvConfigBuilder"));
        Object term1688 = newInstance(Class.forName("com.coreoz.windmill.files.BomCharset"));
        byte[] term1689 = (byte[]) newByteArray(3);
        setBooleanField(term1686, term1686.getClass(), "charset$set", true);
        setField(term1688, term1688.getClass(), "charset", null);
        setByteElement(term1689, 0, (byte) 33);
        setByteElement(term1689, 1, (byte) -74);
        setByteElement(term1689, 2, (byte) -84);
        setField(term1688, term1688.getClass(), "bomBytes", term1689);
        setField(term1686, term1686.getClass(), "charset$value", term1688);
        setBooleanField(term1686, term1686.getClass(), "separator$set", true);
        setCharField(term1686, term1686.getClass(), "separator$value", 'R');
        setBooleanField(term1686, term1686.getClass(), "quoteChar$set", true);
        setCharField(term1686, term1686.getClass(), "quoteChar$value", 'K');
        setBooleanField(term1686, term1686.getClass(), "escapeChar$set", false);
        setCharField(term1686, term1686.getClass(), "escapeChar$value", 'T');
        setBooleanField(term1686, term1686.getClass(), "lineEnd$set", true);
        setField(term1686, term1686.getClass(), "lineEnd$value", "hCWPJQKpdc");
        setBooleanField(term1686, term1686.getClass(), "applyQuotesToAll$set", false);
        setBooleanField(term1686, term1686.getClass(), "applyQuotesToAll$value", false);
        setBooleanField(term1686, term1686.getClass(), "sanitizeFormulas$set", true);
        setBooleanField(term1686, term1686.getClass(), "sanitizeFormulas$value", false);
        setBooleanField(term1686, term1686.getClass(), "fieldNamesExcludedFromSanitization$set", false);
        setField(term1686, term1686.getClass(), "fieldNamesExcludedFromSanitization$value", term1717);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig$ExportCsvConfigBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1686, args);
    }

};


