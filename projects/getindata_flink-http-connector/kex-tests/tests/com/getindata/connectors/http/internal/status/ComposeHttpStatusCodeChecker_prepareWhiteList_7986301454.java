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

public class ComposeHttpStatusCodeChecker_prepareWhiteList_7986301454 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1187;
     Object term1214;

    public ComposeHttpStatusCodeChecker_prepareWhiteList_7986301454() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1189 = new HashMap();
        Set<Object> term1249 =  ((Map) term1189).keySet();
        HashSet term1188 = new HashSet((Collection<? extends Object>) term1249);
        HashMap term1206 = new HashMap();
        Set<Object> term1250 =  ((Map) term1206).keySet();
        HashSet term1205 = new HashSet((Collection<? extends Object>) term1250);
        term1187 = newInstance(Class.forName("com.getindata.connectors.http.internal.status.ComposeHttpStatusCodeChecker"));
        setField(term1187, term1187.getClass(), "excludedCodes", term1188);
        setField(term1187, term1187.getClass(), "errorCodes", term1205);
        term1214 = newInstance(Class.forName("com.getindata.connectors.http.internal.status.ComposeHttpStatusCodeChecker$ComposeHttpStatusCodeCheckerConfig"));
        Object term1239 = newInstance(Class.forName("java.util.Properties"));
        Object term1240 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term1214, term1214.getClass(), "whiteListPrefix", "hNxWaHcfhY");
        setField(term1214, term1214.getClass(), "errorCodePrefix", "RkybSrpybU");
        setField(term1239, term1239.getClass(), "defaults", null);
        setField(term1240, term1240.getClass(), "table", null);
        setField(term1240, term1240.getClass(), "nextTable", null);
        setLongField(term1240, term1240.getClass(), "baseCount", 0L);
        setIntField(term1240, term1240.getClass(), "sizeCtl", 16);
        setIntField(term1240, term1240.getClass(), "transferIndex", 0);
        setIntField(term1240, term1240.getClass(), "cellsBusy", 0);
        setField(term1240, term1240.getClass(), "counterCells", null);
        setField(term1240, term1240.getClass(), "keySet", null);
        setField(term1240, term1240.getClass(), "values", null);
        setField(term1240, term1240.getClass(), "entrySet", null);
        setField(term1240, term1240.getClass(), "keySet", null);
        setField(term1240, term1240.getClass(), "values", null);
        setField(term1239, term1239.getClass(), "map", term1240);
        setField(term1239, term1239.getClass(), "table", null);
        setIntField(term1239, term1239.getClass(), "count", 0);
        setIntField(term1239, term1239.getClass(), "threshold", 0);
        setFloatField(term1239, term1239.getClass(), "loadFactor", 0.0F);
        setIntField(term1239, term1239.getClass(), "modCount", 0);
        setField(term1239, term1239.getClass(), "keySet", null);
        setField(term1239, term1239.getClass(), "entrySet", null);
        setField(term1239, term1239.getClass(), "values", null);
        setField(term1214, term1214.getClass(), "properties", term1239);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.status.ComposeHttpStatusCodeChecker");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.getindata.connectors.http.internal.status.ComposeHttpStatusCodeChecker$ComposeHttpStatusCodeCheckerConfig");
        Object[] args = new Object[1];
        args[0] = term1214;
        callMethod(klass, "prepareWhiteList", argTypes, term1187, args);
    }

};


