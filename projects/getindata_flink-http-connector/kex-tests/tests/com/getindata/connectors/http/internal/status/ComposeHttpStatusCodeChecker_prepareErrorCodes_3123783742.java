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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class ComposeHttpStatusCodeChecker_prepareErrorCodes_3123783742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1086;
     Object term1111;

    public ComposeHttpStatusCodeChecker_prepareErrorCodes_3123783742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1088 = new HashMap();
        Set<Object> term1146 =  ((Map) term1088).keySet();
        HashSet term1087 = new HashSet((Collection<? extends Object>) term1146);
        HashMap term1103 = new HashMap();
        Set<Object> term1147 =  ((Map) term1103).keySet();
        HashSet term1102 = new HashSet((Collection<? extends Object>) term1147);
        term1086 = newInstance(Class.forName("com.getindata.connectors.http.internal.status.ComposeHttpStatusCodeChecker"));
        setField(term1086, term1086.getClass(), "excludedCodes", term1087);
        setField(term1086, term1086.getClass(), "errorCodes", term1102);
        term1111 = newInstance(Class.forName("com.getindata.connectors.http.internal.status.ComposeHttpStatusCodeChecker$ComposeHttpStatusCodeCheckerConfig"));
        Object term1136 = newInstance(Class.forName("java.util.Properties"));
        Object term1137 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term1111, term1111.getClass(), "whiteListPrefix", "HyxfbSQYBe");
        setField(term1111, term1111.getClass(), "errorCodePrefix", "pCTimMblYc");
        setField(term1136, term1136.getClass(), "defaults", null);
        setField(term1137, term1137.getClass(), "table", null);
        setField(term1137, term1137.getClass(), "nextTable", null);
        setLongField(term1137, term1137.getClass(), "baseCount", 0L);
        setIntField(term1137, term1137.getClass(), "sizeCtl", 16);
        setIntField(term1137, term1137.getClass(), "transferIndex", 0);
        setIntField(term1137, term1137.getClass(), "cellsBusy", 0);
        setField(term1137, term1137.getClass(), "counterCells", null);
        setField(term1137, term1137.getClass(), "keySet", null);
        setField(term1137, term1137.getClass(), "values", null);
        setField(term1137, term1137.getClass(), "entrySet", null);
        setField(term1137, term1137.getClass(), "keySet", null);
        setField(term1137, term1137.getClass(), "values", null);
        setField(term1136, term1136.getClass(), "map", term1137);
        setField(term1136, term1136.getClass(), "table", null);
        setIntField(term1136, term1136.getClass(), "count", 0);
        setIntField(term1136, term1136.getClass(), "threshold", 0);
        setFloatField(term1136, term1136.getClass(), "loadFactor", 0.0F);
        setIntField(term1136, term1136.getClass(), "modCount", 0);
        setField(term1136, term1136.getClass(), "keySet", null);
        setField(term1136, term1136.getClass(), "entrySet", null);
        setField(term1136, term1136.getClass(), "values", null);
        setField(term1111, term1111.getClass(), "properties", term1136);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.status.ComposeHttpStatusCodeChecker");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.getindata.connectors.http.internal.status.ComposeHttpStatusCodeChecker$ComposeHttpStatusCodeCheckerConfig");
        Object[] args = new Object[1];
        args[0] = term1111;
        callMethod(klass, "prepareErrorCodes", argTypes, term1086, args);
    }

};


