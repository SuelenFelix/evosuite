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

public class ExportCsvConfig_getFieldNamesExcludedFromSanitization_175284328817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term541;

    public ExportCsvConfig_getFieldNamesExcludedFromSanitization_175284328817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term567 = new HashMap();
        Set<Object> term596 =  ((Map) term567).keySet();
        HashSet term566 = new HashSet((Collection<? extends Object>) term596);
        term541 = newInstance(Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig"));
        Object term542 = newInstance(Class.forName("com.coreoz.windmill.files.BomCharset"));
        byte[] term543 = (byte[]) newByteArray(5);
        setField(term542, term542.getClass(), "charset", null);
        setByteElement(term543, 0, (byte) 99);
        setByteElement(term543, 1, (byte) -12);
        setByteElement(term543, 2, (byte) -61);
        setByteElement(term543, 3, (byte) -85);
        setByteElement(term543, 4, (byte) -22);
        setField(term542, term542.getClass(), "bomBytes", term543);
        setField(term541, term541.getClass(), "charset", term542);
        setCharField(term541, term541.getClass(), "separator", 'g');
        setCharField(term541, term541.getClass(), "quoteChar", 'q');
        setCharField(term541, term541.getClass(), "escapeChar", 'z');
        setField(term541, term541.getClass(), "lineEnd", "xrwlQZdwCp");
        setBooleanField(term541, term541.getClass(), "applyQuotesToAll", false);
        setBooleanField(term541, term541.getClass(), "sanitizeFormulas", false);
        setField(term541, term541.getClass(), "fieldNamesExcludedFromSanitization", term566);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFieldNamesExcludedFromSanitization", argTypes, term541, args);
    }

};


