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
import java.util.HashMap;

public class ProxyRequest_getUri_139812763715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3107;

    public ProxyRequest_getUri_139812763715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3204 = new HashMap();
        term3107 = newInstance(Class.forName("com.scaleguard.server.http.cache.ProxyRequest"));
        setField(term3107, term3107.getClass(), "id", "BRIVNtfUWU");
        setField(term3107, term3107.getClass(), "method", "DbiCVtPPCT");
        setField(term3107, term3107.getClass(), "scheme", "WzFopsaDuG");
        setField(term3107, term3107.getClass(), "groupId", "PapWxkhEWe");
        setField(term3107, term3107.getClass(), "hostGrpId", "smnHEqRFRx");
        setField(term3107, term3107.getClass(), "host", "XYtryyobou");
        setField(term3107, term3107.getClass(), "port", "OYbzXylRWW");
        setField(term3107, term3107.getClass(), "uri", "DSNsTGYXDF");
        setField(term3107, term3107.getClass(), "headers", term3204);
        setField(term3107, term3107.getClass(), "body", "zUlRdimJtU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.cache.ProxyRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUri", argTypes, term3107, args);
    }

};


