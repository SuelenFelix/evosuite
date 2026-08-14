package com.scaleguard.server.http.async;

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
import static com.scaleguard.server.http.async.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;

public class OutboundDispatchUtil_sendRequest_3713181381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public OutboundDispatchUtil_sendRequest_3713181381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term98 = new HashMap();
        term1 = newInstance(Class.forName("com.scaleguard.server.http.cache.ProxyRequest"));
        setField(term1, term1.getClass(), "id", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "method", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "scheme", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "groupId", "xxtlPwDYFs");
        setField(term1, term1.getClass(), "hostGrpId", "jJCZpVmanW");
        setField(term1, term1.getClass(), "host", "EGtDIRbSSb");
        setField(term1, term1.getClass(), "port", "SzjVpOQTyS");
        setField(term1, term1.getClass(), "uri", "MjGYSRKTNF");
        setField(term1, term1.getClass(), "headers", term98);
        setField(term1, term1.getClass(), "body", "NRdvgJlhkX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.async.OutboundDispatchUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.scaleguard.server.http.cache.ProxyRequest");
        Object[] args = new Object[1];
        args[0] = term1;
        callMethod(klass, "sendRequest", argTypes, null, args);
    }

};


