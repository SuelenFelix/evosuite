package com.scaleguard.server.http.router;

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
import static com.scaleguard.server.http.router.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;

public class DBSystemLoader_loadTargets_21010576083 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112;

    public DBSystemLoader_loadTargets_21010576083() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term115 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term115, term115.getClass(), "id", "EGtDIRbSSb");
        setField(term115, term115.getClass(), "host", "SzjVpOQTyS");
        setField(term115, term115.getClass(), "port", "MjGYSRKTNF");
        setField(term115, term115.getClass(), "health", "hRNSzYYIrc");
        setField(term115, term115.getClass(), "scheme", "RMFIsYGgne");
        setIntField(term115, term115.getClass(), "priority", 568599855);
        setBooleanField(term115, term115.getClass(), "isActive", true);
        setField(term115, term115.getClass(), "type", "NRdvgJlhkX");
        setField(term115, term115.getClass(), "groupId", "uuaPigETmJ");
        setFloatField(term115, term115.getClass(), "loadFactor", 0.13238746F);
        setBooleanField(term115, term115.getClass(), "isReachable", true);
        term112 = new LinkedList();
        ((LinkedList) term112).add(term115);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.DBSystemLoader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term112;
        callMethod(klass, "loadTargets", argTypes, null, args);
    }

};


