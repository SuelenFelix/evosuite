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

public class ExportCsvConfig_getFieldNamesExcludedFromSanitization_175284328838 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term848;

    public ExportCsvConfig_getFieldNamesExcludedFromSanitization_175284328838() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term848 = newInstance(Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig"));
        setField(term848, term848.getClass(), "charset", null);
        setCharField(term848, term848.getClass(), "separator", (char) 0);
        setCharField(term848, term848.getClass(), "quoteChar", (char) 0);
        setCharField(term848, term848.getClass(), "escapeChar", (char) 0);
        setField(term848, term848.getClass(), "lineEnd", null);
        setBooleanField(term848, term848.getClass(), "applyQuotesToAll", false);
        setBooleanField(term848, term848.getClass(), "sanitizeFormulas", false);
        setField(term848, term848.getClass(), "fieldNamesExcludedFromSanitization", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFieldNamesExcludedFromSanitization", argTypes, term848, args);
    }

};


