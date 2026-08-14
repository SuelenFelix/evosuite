package com.getindata.connectors.http.internal.sink.httpclient;

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
import static com.getindata.connectors.http.internal.sink.httpclient.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class JavaNetSinkHttpClient_open_9912794001 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term557;

    public JavaNetSinkHttpClient_open_9912794001() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term643 = new HashMap();
        term557 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.JavaNetSinkHttpClient"));
        Object[] term558 = (Object[]) newArray("java.lang.String", 7);
        Object term653 = newInstance(Class.forName("java.util.Properties"));
        Object term654 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setElement(term558, 0, "hRNSzYYIrc");
        setElement(term558, 1, "RMFIsYGgne");
        setElement(term558, 2, "NRdvgJlhkX");
        setElement(term558, 3, "uuaPigETmJ");
        setElement(term558, 4, "MxlszYVzRf");
        setElement(term558, 5, "LQFpaHEwXR");
        setElement(term558, 6, "oVcInYnLWB");
        setField(term557, term557.getClass(), "headersAndValues", term558);
        setField(term557, term557.getClass(), "headerMap", term643);
        setField(term557, term557.getClass(), "statusCodeChecker", null);
        setField(term557, term557.getClass(), "httpPostRequestCallback", null);
        setField(term557, term557.getClass(), "requestSubmitter", null);
        setField(term653, term653.getClass(), "defaults", null);
        setField(term654, term654.getClass(), "table", null);
        setField(term654, term654.getClass(), "nextTable", null);
        setLongField(term654, term654.getClass(), "baseCount", 0L);
        setIntField(term654, term654.getClass(), "sizeCtl", 16);
        setIntField(term654, term654.getClass(), "transferIndex", 0);
        setIntField(term654, term654.getClass(), "cellsBusy", 0);
        setField(term654, term654.getClass(), "counterCells", null);
        setField(term654, term654.getClass(), "keySet", null);
        setField(term654, term654.getClass(), "values", null);
        setField(term654, term654.getClass(), "entrySet", null);
        setField(term654, term654.getClass(), "keySet", null);
        setField(term654, term654.getClass(), "values", null);
        setField(term653, term653.getClass(), "map", term654);
        setField(term653, term653.getClass(), "table", null);
        setIntField(term653, term653.getClass(), "count", 0);
        setIntField(term653, term653.getClass(), "threshold", 0);
        setFloatField(term653, term653.getClass(), "loadFactor", 0.0F);
        setIntField(term653, term653.getClass(), "modCount", 0);
        setField(term653, term653.getClass(), "keySet", null);
        setField(term653, term653.getClass(), "entrySet", null);
        setField(term653, term653.getClass(), "values", null);
        setField(term557, term557.getClass(), "properties", term653);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.sink.httpclient.JavaNetSinkHttpClient");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "open", argTypes, term557, args);
    }

};


