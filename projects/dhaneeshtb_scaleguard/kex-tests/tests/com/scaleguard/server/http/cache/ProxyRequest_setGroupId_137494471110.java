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

public class ProxyRequest_setGroupId_137494471110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1996;

    public ProxyRequest_setGroupId_137494471110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2093 = new HashMap();
        term1996 = newInstance(Class.forName("com.scaleguard.server.http.cache.ProxyRequest"));
        setField(term1996, term1996.getClass(), "id", "QXzGXbEXMu");
        setField(term1996, term1996.getClass(), "method", "qxSDVejjiY");
        setField(term1996, term1996.getClass(), "scheme", "xBsXSDjXYK");
        setField(term1996, term1996.getClass(), "groupId", "sEnIVFtZuQ");
        setField(term1996, term1996.getClass(), "hostGrpId", "ZVecLZMLHF");
        setField(term1996, term1996.getClass(), "host", "fztQhjqwdP");
        setField(term1996, term1996.getClass(), "port", "eVpkWxjuki");
        setField(term1996, term1996.getClass(), "uri", "SJiQaLvSKv");
        setField(term1996, term1996.getClass(), "headers", term2093);
        setField(term1996, term1996.getClass(), "body", "yGtHPyvYiQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.cache.ProxyRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MvRIxilFMJ";
        callMethod(klass, "setGroupId", argTypes, term1996, args);
    }

};


