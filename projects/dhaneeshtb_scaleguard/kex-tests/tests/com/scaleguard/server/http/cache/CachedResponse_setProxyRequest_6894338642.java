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

public class CachedResponse_setProxyRequest_6894338642 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6016;
     Object term6199;

    public CachedResponse_setProxyRequest_6894338642() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6167 = new HashMap();
        term6016 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResponse"));
        Object term6017 = newInstance(Class.forName("java.lang.Object"));
        Object term6018 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term6057 = (Object[]) newArray("java.lang.String", 0);
        Object term6070 = newInstance(Class.forName("com.scaleguard.server.http.cache.ProxyRequest"));
        setField(term6016, term6016.getClass(), "response", term6017);
        setField(term6018, term6018.getClass(), "pattern", "PXdVZyoJyC");
        setField(term6018, term6018.getClass(), "method", "vLerpqavFM");
        setBooleanField(term6018, term6018.getClass(), "cached", false);
        setBooleanField(term6018, term6018.getClass(), "async", false);
        setField(term6018, term6018.getClass(), "keyLookupType", "qnvxzwuGKX");
        setField(term6018, term6018.getClass(), "keyLookupHeaders", term6057);
        setField(term6018, term6018.getClass(), "keyLookupClass", "EdPAvpluZg");
        setField(term6016, term6016.getClass(), "resource", term6018);
        setField(term6070, term6070.getClass(), "id", "DzHVBMqWtE");
        setField(term6070, term6070.getClass(), "method", "THZSpzBRYP");
        setField(term6070, term6070.getClass(), "scheme", "ZfBIVGBQOE");
        setField(term6070, term6070.getClass(), "groupId", "QSrDQfEsTR");
        setField(term6070, term6070.getClass(), "hostGrpId", "PsqusYmejD");
        setField(term6070, term6070.getClass(), "host", "NTWMiBEaDF");
        setField(term6070, term6070.getClass(), "port", "SPBstwKFVr");
        setField(term6070, term6070.getClass(), "uri", "WxYUTuqmIq");
        setField(term6070, term6070.getClass(), "headers", term6167);
        setField(term6070, term6070.getClass(), "body", "GEJABPlHSI");
        setField(term6016, term6016.getClass(), "proxyRequest", term6070);
        setField(term6016, term6016.getClass(), "key", "aQFUvuaYxd");
        HashMap term6296 = new HashMap();
        term6199 = newInstance(Class.forName("com.scaleguard.server.http.cache.ProxyRequest"));
        setField(term6199, term6199.getClass(), "id", "zNFLXMifnS");
        setField(term6199, term6199.getClass(), "method", "HHQcYMSBVc");
        setField(term6199, term6199.getClass(), "scheme", "wdoqITnaAP");
        setField(term6199, term6199.getClass(), "groupId", "rIPMBcrNqB");
        setField(term6199, term6199.getClass(), "hostGrpId", "UDaboHZHhz");
        setField(term6199, term6199.getClass(), "host", "nRvKihUSPj");
        setField(term6199, term6199.getClass(), "port", "BbNeQJpYPr");
        setField(term6199, term6199.getClass(), "uri", "riMtzCoxNj");
        setField(term6199, term6199.getClass(), "headers", term6296);
        setField(term6199, term6199.getClass(), "body", "HwLHeGLyhe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.cache.CachedResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.scaleguard.server.http.cache.ProxyRequest");
        Object[] args = new Object[1];
        args[0] = term6199;
        callMethod(klass, "setProxyRequest", argTypes, term6016, args);
    }

};


