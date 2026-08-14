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

public class ExportCsvConfig_isSanitizeFormulas_160519050716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term487;

    public ExportCsvConfig_isSanitizeFormulas_160519050716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term515 = new HashMap();
        Set<Object> term540 =  ((Map) term515).keySet();
        HashSet term514 = new HashSet((Collection<? extends Object>) term540);
        term487 = newInstance(Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig"));
        Object term488 = newInstance(Class.forName("com.coreoz.windmill.files.BomCharset"));
        byte[] term489 = (byte[]) newByteArray(7);
        setField(term488, term488.getClass(), "charset", null);
        setByteElement(term489, 0, (byte) -121);
        setByteElement(term489, 1, (byte) -119);
        setByteElement(term489, 2, (byte) 71);
        setByteElement(term489, 3, (byte) 80);
        setByteElement(term489, 4, (byte) 42);
        setByteElement(term489, 5, (byte) 72);
        setByteElement(term489, 6, (byte) 111);
        setField(term488, term488.getClass(), "bomBytes", term489);
        setField(term487, term487.getClass(), "charset", term488);
        setCharField(term487, term487.getClass(), "separator", 'g');
        setCharField(term487, term487.getClass(), "quoteChar", 'Q');
        setCharField(term487, term487.getClass(), "escapeChar", 'H');
        setField(term487, term487.getClass(), "lineEnd", "kuTXqwMtDB");
        setBooleanField(term487, term487.getClass(), "applyQuotesToAll", true);
        setBooleanField(term487, term487.getClass(), "sanitizeFormulas", true);
        setField(term487, term487.getClass(), "fieldNamesExcludedFromSanitization", term514);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSanitizeFormulas", argTypes, term487, args);
    }

};


