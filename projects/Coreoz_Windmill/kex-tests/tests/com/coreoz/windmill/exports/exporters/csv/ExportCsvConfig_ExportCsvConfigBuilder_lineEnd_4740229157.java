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

public class ExportCsvConfig_ExportCsvConfigBuilder_lineEnd_4740229157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1343;

    public ExportCsvConfig_ExportCsvConfigBuilder_lineEnd_4740229157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1372 = new HashMap();
        Set<Object> term1399 =  ((Map) term1372).keySet();
        HashSet term1371 = new HashSet((Collection<? extends Object>) term1399);
        term1343 = newInstance(Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig$ExportCsvConfigBuilder"));
        Object term1345 = newInstance(Class.forName("com.coreoz.windmill.files.BomCharset"));
        byte[] term1346 = (byte[]) newByteArray(0);
        setBooleanField(term1343, term1343.getClass(), "charset$set", true);
        setField(term1345, term1345.getClass(), "charset", null);
        setField(term1345, term1345.getClass(), "bomBytes", term1346);
        setField(term1343, term1343.getClass(), "charset$value", term1345);
        setBooleanField(term1343, term1343.getClass(), "separator$set", false);
        setCharField(term1343, term1343.getClass(), "separator$value", 'S');
        setBooleanField(term1343, term1343.getClass(), "quoteChar$set", false);
        setCharField(term1343, term1343.getClass(), "quoteChar$value", 'z');
        setBooleanField(term1343, term1343.getClass(), "escapeChar$set", true);
        setCharField(term1343, term1343.getClass(), "escapeChar$value", 'j');
        setBooleanField(term1343, term1343.getClass(), "lineEnd$set", true);
        setField(term1343, term1343.getClass(), "lineEnd$value", "TimdotUuNC");
        setBooleanField(term1343, term1343.getClass(), "applyQuotesToAll$set", true);
        setBooleanField(term1343, term1343.getClass(), "applyQuotesToAll$value", true);
        setBooleanField(term1343, term1343.getClass(), "sanitizeFormulas$set", true);
        setBooleanField(term1343, term1343.getClass(), "sanitizeFormulas$value", false);
        setBooleanField(term1343, term1343.getClass(), "fieldNamesExcludedFromSanitization$set", false);
        setField(term1343, term1343.getClass(), "fieldNamesExcludedFromSanitization$value", term1371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig$ExportCsvConfigBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PkWMRdJcBb";
        callMethod(klass, "lineEnd", argTypes, term1343, args);
    }

};


