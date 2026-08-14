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

public class ExportCsvConfig_ExportCsvConfigBuilder_escapeChar_3093540886 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1285;
     Object term1330;

    public ExportCsvConfig_ExportCsvConfigBuilder_escapeChar_3093540886() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1314 = new HashMap();
        Set<Object> term1342 =  ((Map) term1314).keySet();
        HashSet term1313 = new HashSet((Collection<? extends Object>) term1342);
        term1285 = newInstance(Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig$ExportCsvConfigBuilder"));
        Object term1287 = newInstance(Class.forName("com.coreoz.windmill.files.BomCharset"));
        byte[] term1288 = (byte[]) newByteArray(0);
        setBooleanField(term1285, term1285.getClass(), "charset$set", true);
        setField(term1287, term1287.getClass(), "charset", null);
        setField(term1287, term1287.getClass(), "bomBytes", term1288);
        setField(term1285, term1285.getClass(), "charset$value", term1287);
        setBooleanField(term1285, term1285.getClass(), "separator$set", false);
        setCharField(term1285, term1285.getClass(), "separator$value", 'b');
        setBooleanField(term1285, term1285.getClass(), "quoteChar$set", false);
        setCharField(term1285, term1285.getClass(), "quoteChar$value", 'S');
        setBooleanField(term1285, term1285.getClass(), "escapeChar$set", true);
        setCharField(term1285, term1285.getClass(), "escapeChar$value", 'S');
        setBooleanField(term1285, term1285.getClass(), "lineEnd$set", false);
        setField(term1285, term1285.getClass(), "lineEnd$value", "OWKQODBLzb");
        setBooleanField(term1285, term1285.getClass(), "applyQuotesToAll$set", false);
        setBooleanField(term1285, term1285.getClass(), "applyQuotesToAll$value", true);
        setBooleanField(term1285, term1285.getClass(), "sanitizeFormulas$set", false);
        setBooleanField(term1285, term1285.getClass(), "sanitizeFormulas$value", true);
        setBooleanField(term1285, term1285.getClass(), "fieldNamesExcludedFromSanitization$set", false);
        setField(term1285, term1285.getClass(), "fieldNamesExcludedFromSanitization$value", term1313);
        term1330 = new Character('b');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig$ExportCsvConfigBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term1330;
        callMethod(klass, "escapeChar", argTypes, term1285, args);
    }

};


