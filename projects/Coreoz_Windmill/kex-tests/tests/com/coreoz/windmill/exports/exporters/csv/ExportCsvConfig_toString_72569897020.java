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

public class ExportCsvConfig_toString_72569897020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term700;

    public ExportCsvConfig_toString_72569897020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term722 = new HashMap();
        Set<Object> term741 =  ((Map) term722).keySet();
        HashSet term721 = new HashSet((Collection<? extends Object>) term741);
        term700 = newInstance(Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig"));
        Object term701 = newInstance(Class.forName("com.coreoz.windmill.files.BomCharset"));
        byte[] term702 = (byte[]) newByteArray(1);
        setField(term701, term701.getClass(), "charset", null);
        setByteElement(term702, 0, (byte) 106);
        setField(term701, term701.getClass(), "bomBytes", term702);
        setField(term700, term700.getClass(), "charset", term701);
        setCharField(term700, term700.getClass(), "separator", 'D');
        setCharField(term700, term700.getClass(), "quoteChar", 'Y');
        setCharField(term700, term700.getClass(), "escapeChar", 'F');
        setField(term700, term700.getClass(), "lineEnd", "UiUYnPrcCi");
        setBooleanField(term700, term700.getClass(), "applyQuotesToAll", true);
        setBooleanField(term700, term700.getClass(), "sanitizeFormulas", false);
        setField(term700, term700.getClass(), "fieldNamesExcludedFromSanitization", term721);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term700, args);
    }

};


