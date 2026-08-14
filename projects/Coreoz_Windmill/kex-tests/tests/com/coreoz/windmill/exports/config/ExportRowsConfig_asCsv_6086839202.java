package com.coreoz.windmill.exports.config;

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
import static com.coreoz.windmill.exports.config.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class ExportRowsConfig_asCsv_6086839202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34;
     Object term35;

    public ExportRowsConfig_asCsv_6086839202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34 = newInstance(Class.forName("com.coreoz.windmill.exports.config.ExportRowsConfig"));
        setField(term34, term34.getClass(), "rows", null);
        setField(term34, term34.getClass(), "mapping", null);
        HashMap term61 = new HashMap();
        Set<Object> term81 =  ((Map) term61).keySet();
        HashSet term60 = new HashSet((Collection<? extends Object>) term81);
        term35 = newInstance(Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig"));
        Object term36 = newInstance(Class.forName("com.coreoz.windmill.files.BomCharset"));
        byte[] term37 = (byte[]) newByteArray(5);
        setField(term36, term36.getClass(), "charset", null);
        setByteElement(term37, 0, (byte) 47);
        setByteElement(term37, 1, (byte) 48);
        setByteElement(term37, 2, (byte) 89);
        setByteElement(term37, 3, (byte) 75);
        setByteElement(term37, 4, (byte) 18);
        setField(term36, term36.getClass(), "bomBytes", term37);
        setField(term35, term35.getClass(), "charset", term36);
        setCharField(term35, term35.getClass(), "separator", 'P');
        setCharField(term35, term35.getClass(), "quoteChar", 'A');
        setCharField(term35, term35.getClass(), "escapeChar", 'E');
        setField(term35, term35.getClass(), "lineEnd", "PAEBtnZtTD");
        setBooleanField(term35, term35.getClass(), "applyQuotesToAll", false);
        setBooleanField(term35, term35.getClass(), "sanitizeFormulas", false);
        setField(term35, term35.getClass(), "fieldNamesExcludedFromSanitization", term60);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.exports.config.ExportRowsConfig");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig");
        Object[] args = new Object[1];
        args[0] = term35;
        callMethod(klass, "asCsv", argTypes, term34, args);
    }

};


