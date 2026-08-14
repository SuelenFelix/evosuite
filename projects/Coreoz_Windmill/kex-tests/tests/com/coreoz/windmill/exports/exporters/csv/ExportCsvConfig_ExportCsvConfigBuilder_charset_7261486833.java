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

public class ExportCsvConfig_ExportCsvConfigBuilder_charset_7261486833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1085;
     Object term1129;

    public ExportCsvConfig_ExportCsvConfigBuilder_charset_7261486833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1121 = new HashMap();
        Set<Object> term1156 =  ((Map) term1121).keySet();
        HashSet term1120 = new HashSet((Collection<? extends Object>) term1156);
        term1085 = newInstance(Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig$ExportCsvConfigBuilder"));
        Object term1087 = newInstance(Class.forName("com.coreoz.windmill.files.BomCharset"));
        byte[] term1088 = (byte[]) newByteArray(7);
        setBooleanField(term1085, term1085.getClass(), "charset$set", true);
        setField(term1087, term1087.getClass(), "charset", null);
        setByteElement(term1088, 0, (byte) -42);
        setByteElement(term1088, 1, (byte) 116);
        setByteElement(term1088, 2, (byte) -81);
        setByteElement(term1088, 3, (byte) 102);
        setByteElement(term1088, 4, (byte) -118);
        setByteElement(term1088, 5, (byte) -126);
        setByteElement(term1088, 6, (byte) -91);
        setField(term1087, term1087.getClass(), "bomBytes", term1088);
        setField(term1085, term1085.getClass(), "charset$value", term1087);
        setBooleanField(term1085, term1085.getClass(), "separator$set", true);
        setCharField(term1085, term1085.getClass(), "separator$value", 'V');
        setBooleanField(term1085, term1085.getClass(), "quoteChar$set", false);
        setCharField(term1085, term1085.getClass(), "quoteChar$value", 'm');
        setBooleanField(term1085, term1085.getClass(), "escapeChar$set", true);
        setCharField(term1085, term1085.getClass(), "escapeChar$value", 'a');
        setBooleanField(term1085, term1085.getClass(), "lineEnd$set", false);
        setField(term1085, term1085.getClass(), "lineEnd$value", "IgRJUzaCwW");
        setBooleanField(term1085, term1085.getClass(), "applyQuotesToAll$set", false);
        setBooleanField(term1085, term1085.getClass(), "applyQuotesToAll$value", true);
        setBooleanField(term1085, term1085.getClass(), "sanitizeFormulas$set", false);
        setBooleanField(term1085, term1085.getClass(), "sanitizeFormulas$value", true);
        setBooleanField(term1085, term1085.getClass(), "fieldNamesExcludedFromSanitization$set", false);
        setField(term1085, term1085.getClass(), "fieldNamesExcludedFromSanitization$value", term1120);
        term1129 = newInstance(Class.forName("com.coreoz.windmill.files.BomCharset"));
        byte[] term1130 = (byte[]) newByteArray(8);
        setField(term1129, term1129.getClass(), "charset", null);
        setByteElement(term1130, 0, (byte) -104);
        setByteElement(term1130, 1, (byte) -89);
        setByteElement(term1130, 2, (byte) 13);
        setByteElement(term1130, 3, (byte) 44);
        setByteElement(term1130, 4, (byte) -63);
        setByteElement(term1130, 5, (byte) 15);
        setByteElement(term1130, 6, (byte) 45);
        setByteElement(term1130, 7, (byte) -39);
        setField(term1129, term1129.getClass(), "bomBytes", term1130);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig$ExportCsvConfigBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.coreoz.windmill.files.BomCharset");
        Object[] args = new Object[1];
        args[0] = term1129;
        callMethod(klass, "charset", argTypes, term1085, args);
    }

};


