package com.scaleguard.server.http.router;

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
import static com.scaleguard.server.http.router.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Boolean;

public class RateLimitManager_isInRate_14904563617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22004;
     Object term22029;

    public RateLimitManager_isInRate_14904563617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22004 = newInstance(Class.forName("com.scaleguard.server.http.router.RateLimitManager"));
        Object term22005 = newInstance(Class.forName("com.scaleguard.server.http.router.IPBlockingManager"));
        Object term22006 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term22011 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term22006, term22006.getClass(), "table", null);
        setField(term22006, term22006.getClass(), "nextTable", null);
        setLongField(term22006, term22006.getClass(), "baseCount", 0L);
        setIntField(term22006, term22006.getClass(), "sizeCtl", 0);
        setIntField(term22006, term22006.getClass(), "transferIndex", 0);
        setIntField(term22006, term22006.getClass(), "cellsBusy", 0);
        setField(term22006, term22006.getClass(), "counterCells", null);
        setField(term22006, term22006.getClass(), "keySet", null);
        setField(term22006, term22006.getClass(), "values", null);
        setField(term22006, term22006.getClass(), "entrySet", null);
        setField(term22006, term22006.getClass(), "keySet", null);
        setField(term22006, term22006.getClass(), "values", null);
        setField(term22005, term22005.getClass(), "rateLimitMap", term22006);
        setField(term22004, term22004.getClass(), "ibm", term22005);
        setField(term22011, term22011.getClass(), "table", null);
        setField(term22011, term22011.getClass(), "nextTable", null);
        setLongField(term22011, term22011.getClass(), "baseCount", 0L);
        setIntField(term22011, term22011.getClass(), "sizeCtl", 0);
        setIntField(term22011, term22011.getClass(), "transferIndex", 0);
        setIntField(term22011, term22011.getClass(), "cellsBusy", 0);
        setField(term22011, term22011.getClass(), "counterCells", null);
        setField(term22011, term22011.getClass(), "keySet", null);
        setField(term22011, term22011.getClass(), "values", null);
        setField(term22011, term22011.getClass(), "entrySet", null);
        setField(term22011, term22011.getClass(), "keySet", null);
        setField(term22011, term22011.getClass(), "values", null);
        setField(term22004, term22004.getClass(), "rateLimitMap", term22011);
        setIntField(term22004, term22004.getClass(), "allowedRate", 1000);
        term22029 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.RateLimitManager");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.scaleguard.server.http.router.RouteTarget");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = "MeFZCtLbdV";
        args[2] = term22029;
        callMethod(klass, "isInRate", argTypes, term22004, args);
    }

};


