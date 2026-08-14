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

public class ProxyRequest_getHostGrpId_16869304095 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term907;

    public ProxyRequest_getHostGrpId_16869304095() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1004 = new HashMap();
        term907 = newInstance(Class.forName("com.scaleguard.server.http.cache.ProxyRequest"));
        setField(term907, term907.getClass(), "id", "LvtrsXUliU");
        setField(term907, term907.getClass(), "method", "xLbjWUgOIL");
        setField(term907, term907.getClass(), "scheme", "jDtqGUpnZN");
        setField(term907, term907.getClass(), "groupId", "nGKItKLYNC");
        setField(term907, term907.getClass(), "hostGrpId", "UiUYnPrcCi");
        setField(term907, term907.getClass(), "host", "UoYtihxVaS");
        setField(term907, term907.getClass(), "port", "JDswTTCZHV");
        setField(term907, term907.getClass(), "uri", "onpbIeEKoi");
        setField(term907, term907.getClass(), "headers", term1004);
        setField(term907, term907.getClass(), "body", "MLqYREekMl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.cache.ProxyRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHostGrpId", argTypes, term907, args);
    }

};


