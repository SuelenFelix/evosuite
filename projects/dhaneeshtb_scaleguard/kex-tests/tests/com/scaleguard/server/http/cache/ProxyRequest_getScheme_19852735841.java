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

public class ProxyRequest_getScheme_19852735841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27;

    public ProxyRequest_getScheme_19852735841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term124 = new HashMap();
        term27 = newInstance(Class.forName("com.scaleguard.server.http.cache.ProxyRequest"));
        setField(term27, term27.getClass(), "id", "sjlJAEtRrb");
        setField(term27, term27.getClass(), "method", "MuLcgQHgqz");
        setField(term27, term27.getClass(), "scheme", "xxtlPwDYFs");
        setField(term27, term27.getClass(), "groupId", "jJCZpVmanW");
        setField(term27, term27.getClass(), "hostGrpId", "EGtDIRbSSb");
        setField(term27, term27.getClass(), "host", "SzjVpOQTyS");
        setField(term27, term27.getClass(), "port", "MjGYSRKTNF");
        setField(term27, term27.getClass(), "uri", "hRNSzYYIrc");
        setField(term27, term27.getClass(), "headers", term124);
        setField(term27, term27.getClass(), "body", "uuaPigETmJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.cache.ProxyRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScheme", argTypes, term27, args);
    }

};


