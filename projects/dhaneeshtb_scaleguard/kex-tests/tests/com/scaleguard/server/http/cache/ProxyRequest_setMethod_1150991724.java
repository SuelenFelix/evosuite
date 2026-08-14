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

public class ProxyRequest_setMethod_1150991724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term676;

    public ProxyRequest_setMethod_1150991724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term773 = new HashMap();
        term676 = newInstance(Class.forName("com.scaleguard.server.http.cache.ProxyRequest"));
        setField(term676, term676.getClass(), "id", "Ghbwtircqb");
        setField(term676, term676.getClass(), "method", "xrwlQZdwCp");
        setField(term676, term676.getClass(), "scheme", "IDCWpPLRkE");
        setField(term676, term676.getClass(), "groupId", "nyiiPDVjAc");
        setField(term676, term676.getClass(), "hostGrpId", "aKnKipADSo");
        setField(term676, term676.getClass(), "host", "wSQxaModmm");
        setField(term676, term676.getClass(), "port", "UlajhuVLaP");
        setField(term676, term676.getClass(), "uri", "gGSMzuGICf");
        setField(term676, term676.getClass(), "headers", term773);
        setField(term676, term676.getClass(), "body", "GzFkzHGYFt");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.cache.ProxyRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tShwQLRGNe";
        callMethod(klass, "setMethod", argTypes, term676, args);
    }

};


