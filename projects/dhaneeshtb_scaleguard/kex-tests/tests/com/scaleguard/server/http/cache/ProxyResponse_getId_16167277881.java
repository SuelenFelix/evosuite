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

public class ProxyResponse_getId_16167277881 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4543;

    public ProxyResponse_getId_16167277881() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4543 = newInstance(Class.forName("com.scaleguard.server.http.cache.ProxyResponse"));
        setField(term4543, term4543.getClass(), "id", "iIRsCSYqXH");
        setField(term4543, term4543.getClass(), "groupId", "nghfqDXyCG");
        setField(term4543, term4543.getClass(), "status", "pending");
        setIntField(term4543, term4543.getClass(), "responseCode", -2038273078);
        setField(term4543, term4543.getClass(), "responseBody", "WBAOTqErtm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.cache.ProxyResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term4543, args);
    }

};


