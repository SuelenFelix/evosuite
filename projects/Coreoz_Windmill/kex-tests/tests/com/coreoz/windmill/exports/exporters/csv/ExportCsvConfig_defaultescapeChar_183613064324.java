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

public class ExportCsvConfig_defaultescapeChar_183613064324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term760;

    public ExportCsvConfig_defaultescapeChar_183613064324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term760 = newInstance(Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig"));
        setField(term760, term760.getClass(), "charset", null);
        setCharField(term760, term760.getClass(), "separator", (char) 0);
        setCharField(term760, term760.getClass(), "quoteChar", (char) 0);
        setCharField(term760, term760.getClass(), "escapeChar", (char) 0);
        setField(term760, term760.getClass(), "lineEnd", null);
        setBooleanField(term760, term760.getClass(), "applyQuotesToAll", false);
        setBooleanField(term760, term760.getClass(), "sanitizeFormulas", false);
        setField(term760, term760.getClass(), "fieldNamesExcludedFromSanitization", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "$default$escapeChar", argTypes, term760, args);
    }

};


