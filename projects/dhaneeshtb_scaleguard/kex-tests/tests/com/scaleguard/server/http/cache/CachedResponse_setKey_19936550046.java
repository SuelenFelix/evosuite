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

public class CachedResponse_setKey_19936550046 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8005;

    public CachedResponse_setKey_19936550046() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8156 = new HashMap();
        term8005 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResponse"));
        Object term8006 = newInstance(Class.forName("java.lang.Object"));
        Object term8007 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term8046 = (Object[]) newArray("java.lang.String", 0);
        Object term8059 = newInstance(Class.forName("com.scaleguard.server.http.cache.ProxyRequest"));
        setField(term8005, term8005.getClass(), "response", term8006);
        setField(term8007, term8007.getClass(), "pattern", "gltJarNuUk");
        setField(term8007, term8007.getClass(), "method", "ZwZIDwYcSW");
        setBooleanField(term8007, term8007.getClass(), "cached", false);
        setBooleanField(term8007, term8007.getClass(), "async", true);
        setField(term8007, term8007.getClass(), "keyLookupType", "sOdkipUKRu");
        setField(term8007, term8007.getClass(), "keyLookupHeaders", term8046);
        setField(term8007, term8007.getClass(), "keyLookupClass", "oKwCDqywym");
        setField(term8005, term8005.getClass(), "resource", term8007);
        setField(term8059, term8059.getClass(), "id", "zjZYTddemL");
        setField(term8059, term8059.getClass(), "method", "QtrylgCLiF");
        setField(term8059, term8059.getClass(), "scheme", "orEuhCStGM");
        setField(term8059, term8059.getClass(), "groupId", "HhEaSXWvrY");
        setField(term8059, term8059.getClass(), "hostGrpId", "CVRGEomOth");
        setField(term8059, term8059.getClass(), "host", "vSeruUyNWX");
        setField(term8059, term8059.getClass(), "port", "UkKvaeJfEC");
        setField(term8059, term8059.getClass(), "uri", "WPxXsahPRq");
        setField(term8059, term8059.getClass(), "headers", term8156);
        setField(term8059, term8059.getClass(), "body", "bKBSncrMEZ");
        setField(term8005, term8005.getClass(), "proxyRequest", term8059);
        setField(term8005, term8005.getClass(), "key", "yeSXGqQExb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.cache.CachedResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "uXYcXVYJZM";
        callMethod(klass, "setKey", argTypes, term8005, args);
    }

};


