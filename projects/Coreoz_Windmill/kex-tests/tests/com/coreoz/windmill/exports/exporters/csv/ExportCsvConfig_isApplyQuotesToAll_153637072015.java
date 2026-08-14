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

public class ExportCsvConfig_isApplyQuotesToAll_153637072015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term445;

    public ExportCsvConfig_isApplyQuotesToAll_153637072015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term466 = new HashMap();
        Set<Object> term486 =  ((Map) term466).keySet();
        HashSet term465 = new HashSet((Collection<? extends Object>) term486);
        term445 = newInstance(Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig"));
        Object term446 = newInstance(Class.forName("com.coreoz.windmill.files.BomCharset"));
        byte[] term447 = (byte[]) newByteArray(0);
        setField(term446, term446.getClass(), "charset", null);
        setField(term446, term446.getClass(), "bomBytes", term447);
        setField(term445, term445.getClass(), "charset", term446);
        setCharField(term445, term445.getClass(), "separator", 'u');
        setCharField(term445, term445.getClass(), "quoteChar", 'L');
        setCharField(term445, term445.getClass(), "escapeChar", 'c');
        setField(term445, term445.getClass(), "lineEnd", "dWRymuLBtr");
        setBooleanField(term445, term445.getClass(), "applyQuotesToAll", false);
        setBooleanField(term445, term445.getClass(), "sanitizeFormulas", false);
        setField(term445, term445.getClass(), "fieldNamesExcludedFromSanitization", term465);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isApplyQuotesToAll", argTypes, term445, args);
    }

};


