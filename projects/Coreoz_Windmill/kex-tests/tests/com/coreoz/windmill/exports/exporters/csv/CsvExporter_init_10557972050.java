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

public class CsvExporter_init_10557972050 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public CsvExporter_init_10557972050() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term27 = new HashMap();
        Set<Object> term54 =  ((Map) term27).keySet();
        HashSet term26 = new HashSet((Collection<? extends Object>) term54);
        term1 = newInstance(Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig"));
        Object term2 = newInstance(Class.forName("com.coreoz.windmill.files.BomCharset"));
        byte[] term3 = (byte[]) newByteArray(5);
        setField(term2, term2.getClass(), "charset", null);
        setByteElement(term3, 0, (byte) 47);
        setByteElement(term3, 1, (byte) 48);
        setByteElement(term3, 2, (byte) 89);
        setByteElement(term3, 3, (byte) 75);
        setByteElement(term3, 4, (byte) 18);
        setField(term2, term2.getClass(), "bomBytes", term3);
        setField(term1, term1.getClass(), "charset", term2);
        setCharField(term1, term1.getClass(), "separator", 'P');
        setCharField(term1, term1.getClass(), "quoteChar", 'A');
        setCharField(term1, term1.getClass(), "escapeChar", 'E');
        setField(term1, term1.getClass(), "lineEnd", "PAEBtnZtTD");
        setBooleanField(term1, term1.getClass(), "applyQuotesToAll", false);
        setBooleanField(term1, term1.getClass(), "sanitizeFormulas", false);
        setField(term1, term1.getClass(), "fieldNamesExcludedFromSanitization", term26);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.exports.exporters.csv.CsvExporter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Iterable");
        argTypes[1] = Class.forName("com.coreoz.windmill.exports.config.ExportMapping");
        argTypes[2] = Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term1;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


