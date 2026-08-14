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

public class ExportCsvConfig_hashCode_21493928019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term646;

    public ExportCsvConfig_hashCode_21493928019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term669 = new HashMap();
        Set<Object> term699 =  ((Map) term669).keySet();
        HashSet term668 = new HashSet((Collection<? extends Object>) term699);
        term646 = newInstance(Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig"));
        Object term647 = newInstance(Class.forName("com.coreoz.windmill.files.BomCharset"));
        byte[] term648 = (byte[]) newByteArray(2);
        setField(term647, term647.getClass(), "charset", null);
        setByteElement(term648, 0, (byte) -23);
        setByteElement(term648, 1, (byte) 100);
        setField(term647, term647.getClass(), "bomBytes", term648);
        setField(term646, term646.getClass(), "charset", term647);
        setCharField(term646, term646.getClass(), "separator", 'l');
        setCharField(term646, term646.getClass(), "quoteChar", 'P');
        setCharField(term646, term646.getClass(), "escapeChar", 'w');
        setField(term646, term646.getClass(), "lineEnd", "BndsHwAFMv");
        setBooleanField(term646, term646.getClass(), "applyQuotesToAll", true);
        setBooleanField(term646, term646.getClass(), "sanitizeFormulas", true);
        setField(term646, term646.getClass(), "fieldNamesExcludedFromSanitization", term668);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term646, args);
    }

};


