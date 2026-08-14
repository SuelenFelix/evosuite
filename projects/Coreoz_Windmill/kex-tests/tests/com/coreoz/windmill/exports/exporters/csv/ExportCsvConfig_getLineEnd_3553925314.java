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

public class ExportCsvConfig_getLineEnd_3553925314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term405;

    public ExportCsvConfig_getLineEnd_3553925314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term426 = new HashMap();
        Set<Object> term444 =  ((Map) term426).keySet();
        HashSet term425 = new HashSet((Collection<? extends Object>) term444);
        term405 = newInstance(Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig"));
        Object term406 = newInstance(Class.forName("com.coreoz.windmill.files.BomCharset"));
        byte[] term407 = (byte[]) newByteArray(0);
        setField(term406, term406.getClass(), "charset", null);
        setField(term406, term406.getClass(), "bomBytes", term407);
        setField(term405, term405.getClass(), "charset", term406);
        setCharField(term405, term405.getClass(), "separator", 'r');
        setCharField(term405, term405.getClass(), "quoteChar", 'b');
        setCharField(term405, term405.getClass(), "escapeChar", 'M');
        setField(term405, term405.getClass(), "lineEnd", "TEParAifyi");
        setBooleanField(term405, term405.getClass(), "applyQuotesToAll", false);
        setBooleanField(term405, term405.getClass(), "sanitizeFormulas", true);
        setField(term405, term405.getClass(), "fieldNamesExcludedFromSanitization", term425);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLineEnd", argTypes, term405, args);
    }

};


