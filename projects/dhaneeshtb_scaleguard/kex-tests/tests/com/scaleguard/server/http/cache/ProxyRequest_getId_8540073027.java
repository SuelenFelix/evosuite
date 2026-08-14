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

public class ProxyRequest_getId_8540073027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1347;

    public ProxyRequest_getId_8540073027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1444 = new HashMap();
        term1347 = newInstance(Class.forName("com.scaleguard.server.http.cache.ProxyRequest"));
        setField(term1347, term1347.getClass(), "id", "whBvTVIIlC");
        setField(term1347, term1347.getClass(), "method", "IgRJUzaCwW");
        setField(term1347, term1347.getClass(), "scheme", "JUmudUmaaV");
        setField(term1347, term1347.getClass(), "groupId", "KoyGrUJeJW");
        setField(term1347, term1347.getClass(), "hostGrpId", "HqBOwkVqjD");
        setField(term1347, term1347.getClass(), "host", "MAcUBcBckh");
        setField(term1347, term1347.getClass(), "port", "oVgzLbrsFr");
        setField(term1347, term1347.getClass(), "uri", "vQVyKLdtaz");
        setField(term1347, term1347.getClass(), "headers", term1444);
        setField(term1347, term1347.getClass(), "body", "idgaQsnJpQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.cache.ProxyRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1347, args);
    }

};


