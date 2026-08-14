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

public class ExportCsvConfig_ExportCsvConfigBuilder_fieldNamesExcludedFromSanitization_140207605810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1532;
     Object term1575;

    public ExportCsvConfig_ExportCsvConfigBuilder_fieldNamesExcludedFromSanitization_140207605810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1561 = new HashMap();
        Set<Object> term1608 =  ((Map) term1561).keySet();
        HashSet term1560 = new HashSet((Collection<? extends Object>) term1608);
        term1532 = newInstance(Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig$ExportCsvConfigBuilder"));
        Object term1534 = newInstance(Class.forName("com.coreoz.windmill.files.BomCharset"));
        byte[] term1535 = (byte[]) newByteArray(0);
        setBooleanField(term1532, term1532.getClass(), "charset$set", false);
        setField(term1534, term1534.getClass(), "charset", null);
        setField(term1534, term1534.getClass(), "bomBytes", term1535);
        setField(term1532, term1532.getClass(), "charset$value", term1534);
        setBooleanField(term1532, term1532.getClass(), "separator$set", false);
        setCharField(term1532, term1532.getClass(), "separator$value", 'S');
        setBooleanField(term1532, term1532.getClass(), "quoteChar$set", false);
        setCharField(term1532, term1532.getClass(), "quoteChar$value", 'M');
        setBooleanField(term1532, term1532.getClass(), "escapeChar$set", false);
        setCharField(term1532, term1532.getClass(), "escapeChar$value", 'j');
        setBooleanField(term1532, term1532.getClass(), "lineEnd$set", false);
        setField(term1532, term1532.getClass(), "lineEnd$value", "SPpkrGcPRr");
        setBooleanField(term1532, term1532.getClass(), "applyQuotesToAll$set", false);
        setBooleanField(term1532, term1532.getClass(), "applyQuotesToAll$value", false);
        setBooleanField(term1532, term1532.getClass(), "sanitizeFormulas$set", false);
        setBooleanField(term1532, term1532.getClass(), "sanitizeFormulas$value", true);
        setBooleanField(term1532, term1532.getClass(), "fieldNamesExcludedFromSanitization$set", false);
        setField(term1532, term1532.getClass(), "fieldNamesExcludedFromSanitization$value", term1560);
        HashMap term1576 = new HashMap();
        Set<Object> term1609 =  ((Map) term1576).keySet();
        term1575 = new HashSet((Collection<? extends Object>) term1609);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig$ExportCsvConfigBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term1575;
        callMethod(klass, "fieldNamesExcludedFromSanitization", argTypes, term1532, args);
    }

};


