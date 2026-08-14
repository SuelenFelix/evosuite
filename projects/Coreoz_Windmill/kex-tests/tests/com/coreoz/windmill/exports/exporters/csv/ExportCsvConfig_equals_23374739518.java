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

public class ExportCsvConfig_equals_23374739518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term597;
     Object term630;

    public ExportCsvConfig_equals_23374739518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term622 = new HashMap();
        Set<Object> term645 =  ((Map) term622).keySet();
        HashSet term621 = new HashSet((Collection<? extends Object>) term645);
        term597 = newInstance(Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig"));
        Object term598 = newInstance(Class.forName("com.coreoz.windmill.files.BomCharset"));
        byte[] term599 = (byte[]) newByteArray(4);
        setField(term598, term598.getClass(), "charset", null);
        setByteElement(term599, 0, (byte) 93);
        setByteElement(term599, 1, (byte) 69);
        setByteElement(term599, 2, (byte) -74);
        setByteElement(term599, 3, (byte) -123);
        setField(term598, term598.getClass(), "bomBytes", term599);
        setField(term597, term597.getClass(), "charset", term598);
        setCharField(term597, term597.getClass(), "separator", 'x');
        setCharField(term597, term597.getClass(), "quoteChar", 'x');
        setCharField(term597, term597.getClass(), "escapeChar", 't');
        setField(term597, term597.getClass(), "lineEnd", "gGSMzuGICf");
        setBooleanField(term597, term597.getClass(), "applyQuotesToAll", true);
        setBooleanField(term597, term597.getClass(), "sanitizeFormulas", true);
        setField(term597, term597.getClass(), "fieldNamesExcludedFromSanitization", term621);
        term630 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term630;
        callMethod(klass, "equals", argTypes, term597, args);
    }

};


