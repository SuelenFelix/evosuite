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

public class ExportCsvConfig_getSeparator_203943024411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term226;

    public ExportCsvConfig_getSeparator_203943024411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term256 = new HashMap();
        Set<Object> term280 =  ((Map) term256).keySet();
        HashSet term255 = new HashSet((Collection<? extends Object>) term280);
        term226 = newInstance(Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig"));
        Object term227 = newInstance(Class.forName("com.coreoz.windmill.files.BomCharset"));
        byte[] term228 = (byte[]) newByteArray(9);
        setField(term227, term227.getClass(), "charset", null);
        setByteElement(term228, 0, (byte) 74);
        setByteElement(term228, 1, (byte) -71);
        setByteElement(term228, 2, (byte) 49);
        setByteElement(term228, 3, (byte) -54);
        setByteElement(term228, 4, (byte) 67);
        setByteElement(term228, 5, (byte) 78);
        setByteElement(term228, 6, (byte) 87);
        setByteElement(term228, 7, (byte) 121);
        setByteElement(term228, 8, (byte) -99);
        setField(term227, term227.getClass(), "bomBytes", term228);
        setField(term226, term226.getClass(), "charset", term227);
        setCharField(term226, term226.getClass(), "separator", 'D');
        setCharField(term226, term226.getClass(), "quoteChar", 's');
        setCharField(term226, term226.getClass(), "escapeChar", 'j');
        setField(term226, term226.getClass(), "lineEnd", "NRdvgJlhkX");
        setBooleanField(term226, term226.getClass(), "applyQuotesToAll", true);
        setBooleanField(term226, term226.getClass(), "sanitizeFormulas", true);
        setField(term226, term226.getClass(), "fieldNamesExcludedFromSanitization", term255);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSeparator", argTypes, term226, args);
    }

};


