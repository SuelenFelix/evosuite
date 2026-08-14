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

public class CachedResponse_getKey_6202738205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7484;

    public CachedResponse_getKey_6202738205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7743 = new HashMap();
        term7484 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResponse"));
        Object term7485 = newInstance(Class.forName("java.lang.Object"));
        Object term7486 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term7525 = (Object[]) newArray("java.lang.String", 9);
        Object term7646 = newInstance(Class.forName("com.scaleguard.server.http.cache.ProxyRequest"));
        setField(term7484, term7484.getClass(), "response", term7485);
        setField(term7486, term7486.getClass(), "pattern", "FbSIUZyBXZ");
        setField(term7486, term7486.getClass(), "method", "mhQDwIyrRi");
        setBooleanField(term7486, term7486.getClass(), "cached", false);
        setBooleanField(term7486, term7486.getClass(), "async", true);
        setField(term7486, term7486.getClass(), "keyLookupType", "HpZXWDPhlg");
        setElement(term7525, 0, "lBOokzEPfe");
        setElement(term7525, 1, "dtGZCsKXbW");
        setElement(term7525, 2, "bdyhHbDAmJ");
        setElement(term7525, 3, "BBXiTNHqGE");
        setElement(term7525, 4, "IEYhJmgCVd");
        setElement(term7525, 5, "KSJeYkkvpk");
        setElement(term7525, 6, "qUtkFGMNUV");
        setElement(term7525, 7, "mGRiYhnMcR");
        setElement(term7525, 8, "NFlvfJCVPO");
        setField(term7486, term7486.getClass(), "keyLookupHeaders", term7525);
        setField(term7486, term7486.getClass(), "keyLookupClass", "KarbTXFmUU");
        setField(term7484, term7484.getClass(), "resource", term7486);
        setField(term7646, term7646.getClass(), "id", "jiUSjqwSIQ");
        setField(term7646, term7646.getClass(), "method", "MgLCedQfoj");
        setField(term7646, term7646.getClass(), "scheme", "zgKiINdgNu");
        setField(term7646, term7646.getClass(), "groupId", "zLMTXDQHYH");
        setField(term7646, term7646.getClass(), "hostGrpId", "PqywFWJlpE");
        setField(term7646, term7646.getClass(), "host", "OzXRsFGTIp");
        setField(term7646, term7646.getClass(), "port", "TjWpyghUWN");
        setField(term7646, term7646.getClass(), "uri", "dkZFDZxcde");
        setField(term7646, term7646.getClass(), "headers", term7743);
        setField(term7646, term7646.getClass(), "body", "boSSpezHeU");
        setField(term7484, term7484.getClass(), "proxyRequest", term7646);
        setField(term7484, term7484.getClass(), "key", "OUeBWNTQDh");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.cache.CachedResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getKey", argTypes, term7484, args);
    }

};


