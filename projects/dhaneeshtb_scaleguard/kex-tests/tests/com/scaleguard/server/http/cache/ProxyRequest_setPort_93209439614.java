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

public class ProxyRequest_setPort_93209439614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2876;

    public ProxyRequest_setPort_93209439614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2973 = new HashMap();
        term2876 = newInstance(Class.forName("com.scaleguard.server.http.cache.ProxyRequest"));
        setField(term2876, term2876.getClass(), "id", "jwsfVjMoJT");
        setField(term2876, term2876.getClass(), "method", "ZfdXfCCFDf");
        setField(term2876, term2876.getClass(), "scheme", "MwwjNtdOFT");
        setField(term2876, term2876.getClass(), "groupId", "VYkqXKVlAJ");
        setField(term2876, term2876.getClass(), "hostGrpId", "XkIoWJRNwN");
        setField(term2876, term2876.getClass(), "host", "aNWLJdrZMq");
        setField(term2876, term2876.getClass(), "port", "HHmNoYxIGj");
        setField(term2876, term2876.getClass(), "uri", "PtirvZmsGt");
        setField(term2876, term2876.getClass(), "headers", term2973);
        setField(term2876, term2876.getClass(), "body", "VeDtgDzGAN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.cache.ProxyRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "aWYOWZFyaX";
        callMethod(klass, "setPort", argTypes, term2876, args);
    }

};


