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

public class ExportCsvConfig_ExportCsvConfigBuilder_applyQuotesToAll_8657718428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1410;
     Object term1454;

    public ExportCsvConfig_ExportCsvConfigBuilder_applyQuotesToAll_8657718428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1440 = new HashMap();
        Set<Object> term1467 =  ((Map) term1440).keySet();
        HashSet term1439 = new HashSet((Collection<? extends Object>) term1467);
        term1410 = newInstance(Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig$ExportCsvConfigBuilder"));
        Object term1412 = newInstance(Class.forName("com.coreoz.windmill.files.BomCharset"));
        byte[] term1413 = (byte[]) newByteArray(1);
        setBooleanField(term1410, term1410.getClass(), "charset$set", true);
        setField(term1412, term1412.getClass(), "charset", null);
        setByteElement(term1413, 0, (byte) 84);
        setField(term1412, term1412.getClass(), "bomBytes", term1413);
        setField(term1410, term1410.getClass(), "charset$value", term1412);
        setBooleanField(term1410, term1410.getClass(), "separator$set", true);
        setCharField(term1410, term1410.getClass(), "separator$value", 'V');
        setBooleanField(term1410, term1410.getClass(), "quoteChar$set", true);
        setCharField(term1410, term1410.getClass(), "quoteChar$value", 'p');
        setBooleanField(term1410, term1410.getClass(), "escapeChar$set", false);
        setCharField(term1410, term1410.getClass(), "escapeChar$value", 'O');
        setBooleanField(term1410, term1410.getClass(), "lineEnd$set", true);
        setField(term1410, term1410.getClass(), "lineEnd$value", "jSpAteRute");
        setBooleanField(term1410, term1410.getClass(), "applyQuotesToAll$set", true);
        setBooleanField(term1410, term1410.getClass(), "applyQuotesToAll$value", false);
        setBooleanField(term1410, term1410.getClass(), "sanitizeFormulas$set", false);
        setBooleanField(term1410, term1410.getClass(), "sanitizeFormulas$value", true);
        setBooleanField(term1410, term1410.getClass(), "fieldNamesExcludedFromSanitization$set", true);
        setField(term1410, term1410.getClass(), "fieldNamesExcludedFromSanitization$value", term1439);
        term1454 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig$ExportCsvConfigBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1454;
        callMethod(klass, "applyQuotesToAll", argTypes, term1410, args);
    }

};


