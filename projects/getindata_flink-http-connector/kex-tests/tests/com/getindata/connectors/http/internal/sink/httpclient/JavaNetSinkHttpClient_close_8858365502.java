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

public class JavaNetSinkHttpClient_close_8858365502 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term733;

    public JavaNetSinkHttpClient_close_8858365502() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term819 = new HashMap();
        term733 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.JavaNetSinkHttpClient"));
        Object[] term734 = (Object[]) newArray("java.lang.String", 7);
        Object term829 = newInstance(Class.forName("java.util.Properties"));
        Object term830 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setElement(term734, 0, "tbcdzjIfER");
        setElement(term734, 1, "HyxfbSQYBe");
        setElement(term734, 2, "pCTimMblYc");
        setElement(term734, 3, "hNxWaHcfhY");
        setElement(term734, 4, "RkybSrpybU");
        setElement(term734, 5, "xOEqzGAmDU");
        setElement(term734, 6, "eZFUvlxvGV");
        setField(term733, term733.getClass(), "headersAndValues", term734);
        setField(term733, term733.getClass(), "headerMap", term819);
        setField(term733, term733.getClass(), "statusCodeChecker", null);
        setField(term733, term733.getClass(), "httpPostRequestCallback", null);
        setField(term733, term733.getClass(), "requestSubmitter", null);
        setField(term829, term829.getClass(), "defaults", null);
        setField(term830, term830.getClass(), "table", null);
        setField(term830, term830.getClass(), "nextTable", null);
        setLongField(term830, term830.getClass(), "baseCount", 0L);
        setIntField(term830, term830.getClass(), "sizeCtl", 16);
        setIntField(term830, term830.getClass(), "transferIndex", 0);
        setIntField(term830, term830.getClass(), "cellsBusy", 0);
        setField(term830, term830.getClass(), "counterCells", null);
        setField(term830, term830.getClass(), "keySet", null);
        setField(term830, term830.getClass(), "values", null);
        setField(term830, term830.getClass(), "entrySet", null);
        setField(term830, term830.getClass(), "keySet", null);
        setField(term830, term830.getClass(), "values", null);
        setField(term829, term829.getClass(), "map", term830);
        setField(term829, term829.getClass(), "table", null);
        setIntField(term829, term829.getClass(), "count", 0);
        setIntField(term829, term829.getClass(), "threshold", 0);
        setFloatField(term829, term829.getClass(), "loadFactor", 0.0F);
        setIntField(term829, term829.getClass(), "modCount", 0);
        setField(term829, term829.getClass(), "keySet", null);
        setField(term829, term829.getClass(), "entrySet", null);
        setField(term829, term829.getClass(), "values", null);
        setField(term733, term733.getClass(), "properties", term829);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.sink.httpclient.JavaNetSinkHttpClient");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term733, args);
    }

};


