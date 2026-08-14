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

public class ExportCsvConfig_getQuoteChar_76775777512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term281;

    public ExportCsvConfig_getQuoteChar_76775777512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term311 = new HashMap();
        Set<Object> term352 =  ((Map) term311).keySet();
        HashSet term310 = new HashSet((Collection<? extends Object>) term352);
        term281 = newInstance(Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig"));
        Object term282 = newInstance(Class.forName("com.coreoz.windmill.files.BomCharset"));
        byte[] term283 = (byte[]) newByteArray(9);
        setField(term282, term282.getClass(), "charset", null);
        setByteElement(term283, 0, (byte) -2);
        setByteElement(term283, 1, (byte) -16);
        setByteElement(term283, 2, (byte) -112);
        setByteElement(term283, 3, (byte) -111);
        setByteElement(term283, 4, (byte) 23);
        setByteElement(term283, 5, (byte) -15);
        setByteElement(term283, 6, (byte) 36);
        setByteElement(term283, 7, (byte) 118);
        setByteElement(term283, 8, (byte) 106);
        setField(term282, term282.getClass(), "bomBytes", term283);
        setField(term281, term281.getClass(), "charset", term282);
        setCharField(term281, term281.getClass(), "separator", 'l');
        setCharField(term281, term281.getClass(), "quoteChar", 'J');
        setCharField(term281, term281.getClass(), "escapeChar", 'A');
        setField(term281, term281.getClass(), "lineEnd", "uuaPigETmJ");
        setBooleanField(term281, term281.getClass(), "applyQuotesToAll", false);
        setBooleanField(term281, term281.getClass(), "sanitizeFormulas", true);
        setField(term281, term281.getClass(), "fieldNamesExcludedFromSanitization", term310);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getQuoteChar", argTypes, term281, args);
    }

};


