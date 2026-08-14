package com.getindata.connectors.http.internal.status;

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
import static com.getindata.connectors.http.internal.status.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ComposeHttpStatusCodeChecker_ComposeHttpStatusCodeCheckerConfig_ComposeHttpStatusCodeCheckerConfigBuilder_build_18621422284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3454;

    public ComposeHttpStatusCodeChecker_ComposeHttpStatusCodeCheckerConfig_ComposeHttpStatusCodeCheckerConfigBuilder_build_18621422284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3454 = newInstance(Class.forName("com.getindata.connectors.http.internal.status.ComposeHttpStatusCodeChecker$ComposeHttpStatusCodeCheckerConfig$ComposeHttpStatusCodeCheckerConfigBuilder"));
        Object term3479 = newInstance(Class.forName("java.util.Properties"));
        Object term3480 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term3454, term3454.getClass(), "whiteListPrefix", "AijpHYOFuy");
        setField(term3454, term3454.getClass(), "errorCodePrefix", "SbAoxhfrkn");
        setField(term3479, term3479.getClass(), "defaults", null);
        setField(term3480, term3480.getClass(), "table", null);
        setField(term3480, term3480.getClass(), "nextTable", null);
        setLongField(term3480, term3480.getClass(), "baseCount", 0L);
        setIntField(term3480, term3480.getClass(), "sizeCtl", 16);
        setIntField(term3480, term3480.getClass(), "transferIndex", 0);
        setIntField(term3480, term3480.getClass(), "cellsBusy", 0);
        setField(term3480, term3480.getClass(), "counterCells", null);
        setField(term3480, term3480.getClass(), "keySet", null);
        setField(term3480, term3480.getClass(), "values", null);
        setField(term3480, term3480.getClass(), "entrySet", null);
        setField(term3480, term3480.getClass(), "keySet", null);
        setField(term3480, term3480.getClass(), "values", null);
        setField(term3479, term3479.getClass(), "map", term3480);
        setField(term3479, term3479.getClass(), "table", null);
        setIntField(term3479, term3479.getClass(), "count", 0);
        setIntField(term3479, term3479.getClass(), "threshold", 0);
        setFloatField(term3479, term3479.getClass(), "loadFactor", 0.0F);
        setIntField(term3479, term3479.getClass(), "modCount", 0);
        setField(term3479, term3479.getClass(), "keySet", null);
        setField(term3479, term3479.getClass(), "entrySet", null);
        setField(term3479, term3479.getClass(), "values", null);
        setField(term3454, term3454.getClass(), "properties", term3479);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.status.ComposeHttpStatusCodeChecker$ComposeHttpStatusCodeCheckerConfig$ComposeHttpStatusCodeCheckerConfigBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term3454, args);
    }

};


