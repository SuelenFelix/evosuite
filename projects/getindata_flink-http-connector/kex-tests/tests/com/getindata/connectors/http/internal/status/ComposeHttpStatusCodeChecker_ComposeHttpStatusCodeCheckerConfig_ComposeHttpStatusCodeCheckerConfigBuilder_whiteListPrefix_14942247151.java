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

public class ComposeHttpStatusCodeChecker_ComposeHttpStatusCodeCheckerConfig_ComposeHttpStatusCodeCheckerConfigBuilder_whiteListPrefix_14942247151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3219;

    public ComposeHttpStatusCodeChecker_ComposeHttpStatusCodeCheckerConfig_ComposeHttpStatusCodeCheckerConfigBuilder_whiteListPrefix_14942247151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3219 = newInstance(Class.forName("com.getindata.connectors.http.internal.status.ComposeHttpStatusCodeChecker$ComposeHttpStatusCodeCheckerConfig$ComposeHttpStatusCodeCheckerConfigBuilder"));
        Object term3244 = newInstance(Class.forName("java.util.Properties"));
        Object term3245 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term3219, term3219.getClass(), "whiteListPrefix", "BYqFIqCKAV");
        setField(term3219, term3219.getClass(), "errorCodePrefix", "vrQLuWIDJX");
        setField(term3244, term3244.getClass(), "defaults", null);
        setField(term3245, term3245.getClass(), "table", null);
        setField(term3245, term3245.getClass(), "nextTable", null);
        setLongField(term3245, term3245.getClass(), "baseCount", 0L);
        setIntField(term3245, term3245.getClass(), "sizeCtl", 16);
        setIntField(term3245, term3245.getClass(), "transferIndex", 0);
        setIntField(term3245, term3245.getClass(), "cellsBusy", 0);
        setField(term3245, term3245.getClass(), "counterCells", null);
        setField(term3245, term3245.getClass(), "keySet", null);
        setField(term3245, term3245.getClass(), "values", null);
        setField(term3245, term3245.getClass(), "entrySet", null);
        setField(term3245, term3245.getClass(), "keySet", null);
        setField(term3245, term3245.getClass(), "values", null);
        setField(term3244, term3244.getClass(), "map", term3245);
        setField(term3244, term3244.getClass(), "table", null);
        setIntField(term3244, term3244.getClass(), "count", 0);
        setIntField(term3244, term3244.getClass(), "threshold", 0);
        setFloatField(term3244, term3244.getClass(), "loadFactor", 0.0F);
        setIntField(term3244, term3244.getClass(), "modCount", 0);
        setField(term3244, term3244.getClass(), "keySet", null);
        setField(term3244, term3244.getClass(), "entrySet", null);
        setField(term3244, term3244.getClass(), "values", null);
        setField(term3219, term3219.getClass(), "properties", term3244);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.status.ComposeHttpStatusCodeChecker$ComposeHttpStatusCodeCheckerConfig$ComposeHttpStatusCodeCheckerConfigBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "flxyYxBRtu";
        callMethod(klass, "whiteListPrefix", argTypes, term3219, args);
    }

};


