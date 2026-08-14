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

public class CachedResponse_getResponse_18952014967 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8350;

    public CachedResponse_getResponse_18952014967() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8609 = new HashMap();
        term8350 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResponse"));
        Object term8351 = newInstance(Class.forName("java.lang.Object"));
        Object term8352 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term8391 = (Object[]) newArray("java.lang.String", 9);
        Object term8512 = newInstance(Class.forName("com.scaleguard.server.http.cache.ProxyRequest"));
        setField(term8350, term8350.getClass(), "response", term8351);
        setField(term8352, term8352.getClass(), "pattern", "BJhjdJUhkz");
        setField(term8352, term8352.getClass(), "method", "cdHYQDgUZR");
        setBooleanField(term8352, term8352.getClass(), "cached", false);
        setBooleanField(term8352, term8352.getClass(), "async", false);
        setField(term8352, term8352.getClass(), "keyLookupType", "KAORSSPSeV");
        setElement(term8391, 0, "UimMMORkzd");
        setElement(term8391, 1, "huVIXUWLtI");
        setElement(term8391, 2, "vhKzFyKPOT");
        setElement(term8391, 3, "nQhIgWXdRc");
        setElement(term8391, 4, "EusenEbIoF");
        setElement(term8391, 5, "SScVQYSvWH");
        setElement(term8391, 6, "MnovcqFhCl");
        setElement(term8391, 7, "qYtAeLzOhW");
        setElement(term8391, 8, "tJzmOfcUnY");
        setField(term8352, term8352.getClass(), "keyLookupHeaders", term8391);
        setField(term8352, term8352.getClass(), "keyLookupClass", "TKlccZUpjz");
        setField(term8350, term8350.getClass(), "resource", term8352);
        setField(term8512, term8512.getClass(), "id", "GGzwMoHZXC");
        setField(term8512, term8512.getClass(), "method", "IpmgwHTgnG");
        setField(term8512, term8512.getClass(), "scheme", "tIpkeYIezR");
        setField(term8512, term8512.getClass(), "groupId", "YkZtEtthvz");
        setField(term8512, term8512.getClass(), "hostGrpId", "dwlZSxlXOo");
        setField(term8512, term8512.getClass(), "host", "lKrEAkypza");
        setField(term8512, term8512.getClass(), "port", "KtuuNAqGCQ");
        setField(term8512, term8512.getClass(), "uri", "OGQsfjmReM");
        setField(term8512, term8512.getClass(), "headers", term8609);
        setField(term8512, term8512.getClass(), "body", "NxgmYPzWCI");
        setField(term8350, term8350.getClass(), "proxyRequest", term8512);
        setField(term8350, term8350.getClass(), "key", "SqjyKmayBx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.cache.CachedResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getResponse", argTypes, term8350, args);
    }

};


