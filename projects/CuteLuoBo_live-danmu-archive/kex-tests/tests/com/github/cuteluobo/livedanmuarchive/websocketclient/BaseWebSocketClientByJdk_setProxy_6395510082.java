package com.github.cuteluobo.livedanmuarchive.websocketclient;

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
import static com.github.cuteluobo.livedanmuarchive.websocketclient.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BaseWebSocketClientByJdk_setProxy_6395510082 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public BaseWebSocketClientByJdk_setProxy_6395510082() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("java.net.InetSocketAddress"));
        Object term2 = newInstance(Class.forName("java.net.InetSocketAddress$InetSocketAddressHolder"));
        Object term15 = newInstance(Class.forName("java.net.InetAddress"));
        Object term16 = newInstance(Class.forName("java.net.InetAddress$InetAddressHolder"));
        setField(term2, term2.getClass(), "hostname", "PAEBtnZtTD");
        setField(term16, term16.getClass(), "originalHostName", null);
        setField(term16, term16.getClass(), "hostName", null);
        setIntField(term16, term16.getClass(), "address", 0);
        setIntField(term16, term16.getClass(), "family", 0);
        setField(term15, term15.getClass(), "holder", term16);
        setField(term15, term15.getClass(), "canonicalHostName", "sjlJAEtRrb");
        setField(term2, term2.getClass(), "addr", term15);
        setIntField(term2, term2.getClass(), "port", -1922583790);
        setField(term1, term1.getClass(), "holder", term2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.websocketclient.BaseWebSocketClientByJdk");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.net.InetSocketAddress");
        Object[] args = new Object[1];
        args[0] = term1;
        callMethod(klass, "setProxy", argTypes, null, args);
    }

};


