package org.spdx.spdx_to_osv;

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
import static org.spdx.spdx_to_osv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SwhApi_getResponseString_4927355223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11171;

    public SwhApi_getResponseString_4927355223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11171 = newInstance(Class.forName("java.net.URL"));
        Object term11215 = newInstance(Class.forName("sun.net.www.protocol.http.Handler"));
        setField(term11171, term11171.getClass(), "protocol", "http");
        setField(term11171, term11171.getClass(), "host", "www.oracle.com");
        setIntField(term11171, term11171.getClass(), "port", -1);
        setField(term11171, term11171.getClass(), "file", "");
        setField(term11171, term11171.getClass(), "query", null);
        setField(term11171, term11171.getClass(), "authority", "www.oracle.com");
        setField(term11171, term11171.getClass(), "path", "");
        setField(term11171, term11171.getClass(), "userInfo", null);
        setField(term11171, term11171.getClass(), "ref", null);
        setField(term11171, term11171.getClass(), "hostAddress", null);
        setField(term11215, term11215.getClass(), "proxy", null);
        setIntField(term11215, term11215.getClass(), "proxyPort", -1);
        setField(term11171, term11171.getClass(), "handler", term11215);
        setField(term11171, term11171.getClass(), "tempState", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.spdx.spdx_to_osv.SwhApi");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.net.URL");
        Object[] args = new Object[1];
        args[0] = term11171;
        callMethod(klass, "getResponseString", argTypes, null, args);
    }

};


