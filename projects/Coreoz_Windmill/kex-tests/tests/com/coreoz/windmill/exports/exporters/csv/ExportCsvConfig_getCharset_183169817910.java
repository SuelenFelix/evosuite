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

public class ExportCsvConfig_getCharset_183169817910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179;

    public ExportCsvConfig_getCharset_183169817910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term205 = new HashMap();
        Set<Object> term225 =  ((Map) term205).keySet();
        HashSet term204 = new HashSet((Collection<? extends Object>) term225);
        term179 = newInstance(Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig"));
        Object term180 = newInstance(Class.forName("com.coreoz.windmill.files.BomCharset"));
        byte[] term181 = (byte[]) newByteArray(5);
        setField(term180, term180.getClass(), "charset", null);
        setByteElement(term181, 0, (byte) -10);
        setByteElement(term181, 1, (byte) 79);
        setByteElement(term181, 2, (byte) -119);
        setByteElement(term181, 3, (byte) -66);
        setByteElement(term181, 4, (byte) 83);
        setField(term180, term180.getClass(), "bomBytes", term181);
        setField(term179, term179.getClass(), "charset", term180);
        setCharField(term179, term179.getClass(), "separator", 'Z');
        setCharField(term179, term179.getClass(), "quoteChar", 't');
        setCharField(term179, term179.getClass(), "escapeChar", 'T');
        setField(term179, term179.getClass(), "lineEnd", "RMFIsYGgne");
        setBooleanField(term179, term179.getClass(), "applyQuotesToAll", true);
        setBooleanField(term179, term179.getClass(), "sanitizeFormulas", true);
        setField(term179, term179.getClass(), "fieldNamesExcludedFromSanitization", term204);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCharset", argTypes, term179, args);
    }

};


