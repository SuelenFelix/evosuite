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

public class ExportCsvConfig_ExportCsvConfigBuilder_disableFormulasSanitization_16537463870 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term872;

    public ExportCsvConfig_ExportCsvConfigBuilder_disableFormulasSanitization_16537463870() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term903 = new HashMap();
        Set<Object> term927 =  ((Map) term903).keySet();
        HashSet term902 = new HashSet((Collection<? extends Object>) term927);
        term872 = newInstance(Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig$ExportCsvConfigBuilder"));
        Object term874 = newInstance(Class.forName("com.coreoz.windmill.files.BomCharset"));
        byte[] term875 = (byte[]) newByteArray(2);
        setBooleanField(term872, term872.getClass(), "charset$set", false);
        setField(term874, term874.getClass(), "charset", null);
        setByteElement(term875, 0, (byte) -57);
        setByteElement(term875, 1, (byte) -103);
        setField(term874, term874.getClass(), "bomBytes", term875);
        setField(term872, term872.getClass(), "charset$value", term874);
        setBooleanField(term872, term872.getClass(), "separator$set", false);
        setCharField(term872, term872.getClass(), "separator$value", 's');
        setBooleanField(term872, term872.getClass(), "quoteChar$set", true);
        setCharField(term872, term872.getClass(), "quoteChar$value", 'j');
        setBooleanField(term872, term872.getClass(), "escapeChar$set", true);
        setCharField(term872, term872.getClass(), "escapeChar$value", 'J');
        setBooleanField(term872, term872.getClass(), "lineEnd$set", true);
        setField(term872, term872.getClass(), "lineEnd$value", "JDswTTCZHV");
        setBooleanField(term872, term872.getClass(), "applyQuotesToAll$set", true);
        setBooleanField(term872, term872.getClass(), "applyQuotesToAll$value", true);
        setBooleanField(term872, term872.getClass(), "sanitizeFormulas$set", true);
        setBooleanField(term872, term872.getClass(), "sanitizeFormulas$value", false);
        setBooleanField(term872, term872.getClass(), "fieldNamesExcludedFromSanitization$set", true);
        setField(term872, term872.getClass(), "fieldNamesExcludedFromSanitization$value", term902);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig$ExportCsvConfigBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "disableFormulasSanitization", argTypes, term872, args);
    }

};


