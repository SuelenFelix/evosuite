package com.scaleguard.server.http.cache;

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
import static com.scaleguard.server.http.cache.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class CachedResponse_setResponse_6623518928 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8871;
     Object term9162;

    public CachedResponse_setResponse_6623518928() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term9130 = new HashMap();
        term8871 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResponse"));
        Object term8872 = newInstance(Class.forName("java.lang.Object"));
        Object term8873 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term8912 = (Object[]) newArray("java.lang.String", 9);
        Object term9033 = newInstance(Class.forName("com.scaleguard.server.http.cache.ProxyRequest"));
        setField(term8871, term8871.getClass(), "response", term8872);
        setField(term8873, term8873.getClass(), "pattern", "XjDhvToxJy");
        setField(term8873, term8873.getClass(), "method", "nxSTJflLQy");
        setBooleanField(term8873, term8873.getClass(), "cached", true);
        setBooleanField(term8873, term8873.getClass(), "async", true);
        setField(term8873, term8873.getClass(), "keyLookupType", "FlHzxEfFzI");
        setElement(term8912, 0, "aSATgQUpoe");
        setElement(term8912, 1, "VkPSXewZfB");
        setElement(term8912, 2, "ubodzJoMGW");
        setElement(term8912, 3, "weddIktxOA");
        setElement(term8912, 4, "uSlMeISsDD");
        setElement(term8912, 5, "WdCiTDUKqn");
        setElement(term8912, 6, "PSizQDoxxe");
        setElement(term8912, 7, "mKaHyMybrK");
        setElement(term8912, 8, "AyrEXuGrEj");
        setField(term8873, term8873.getClass(), "keyLookupHeaders", term8912);
        setField(term8873, term8873.getClass(), "keyLookupClass", "yevIIoVYHq");
        setField(term8871, term8871.getClass(), "resource", term8873);
        setField(term9033, term9033.getClass(), "id", "UuYWMTqWTV");
        setField(term9033, term9033.getClass(), "method", "DSFGlcaXUb");
        setField(term9033, term9033.getClass(), "scheme", "sHMXNUzNeM");
        setField(term9033, term9033.getClass(), "groupId", "gPzGDOEPPw");
        setField(term9033, term9033.getClass(), "hostGrpId", "rwKoAngzCu");
        setField(term9033, term9033.getClass(), "host", "VUkRVwROTl");
        setField(term9033, term9033.getClass(), "port", "UDlkdccCRn");
        setField(term9033, term9033.getClass(), "uri", "McpzErOcYb");
        setField(term9033, term9033.getClass(), "headers", term9130);
        setField(term9033, term9033.getClass(), "body", "pXxkiXgQnq");
        setField(term8871, term8871.getClass(), "proxyRequest", term9033);
        setField(term8871, term8871.getClass(), "key", "tKmrUDURku");
        term9162 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.cache.CachedResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term9162;
        callMethod(klass, "setResponse", argTypes, term8871, args);
    }

};


