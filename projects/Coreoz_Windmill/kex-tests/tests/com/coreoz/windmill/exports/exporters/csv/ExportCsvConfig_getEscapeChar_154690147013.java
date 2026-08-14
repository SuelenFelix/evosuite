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

public class ExportCsvConfig_getEscapeChar_154690147013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term353;

    public ExportCsvConfig_getEscapeChar_154690147013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term377 = new HashMap();
        Set<Object> term404 =  ((Map) term377).keySet();
        HashSet term376 = new HashSet((Collection<? extends Object>) term404);
        term353 = newInstance(Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig"));
        Object term354 = newInstance(Class.forName("com.coreoz.windmill.files.BomCharset"));
        byte[] term355 = (byte[]) newByteArray(3);
        setField(term354, term354.getClass(), "charset", null);
        setByteElement(term355, 0, (byte) 98);
        setByteElement(term355, 1, (byte) 67);
        setByteElement(term355, 2, (byte) 66);
        setField(term354, term354.getClass(), "bomBytes", term355);
        setField(term353, term353.getClass(), "charset", term354);
        setCharField(term353, term353.getClass(), "separator", 'E');
        setCharField(term353, term353.getClass(), "quoteChar", 't');
        setCharField(term353, term353.getClass(), "escapeChar", 'R');
        setField(term353, term353.getClass(), "lineEnd", "RkybSrpybU");
        setBooleanField(term353, term353.getClass(), "applyQuotesToAll", false);
        setBooleanField(term353, term353.getClass(), "sanitizeFormulas", true);
        setField(term353, term353.getClass(), "fieldNamesExcludedFromSanitization", term376);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEscapeChar", argTypes, term353, args);
    }

};


