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

public class ProxyRequest_setScheme_1393597682 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term236;

    public ProxyRequest_setScheme_1393597682() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term333 = new HashMap();
        term236 = newInstance(Class.forName("com.scaleguard.server.http.cache.ProxyRequest"));
        setField(term236, term236.getClass(), "id", "MxlszYVzRf");
        setField(term236, term236.getClass(), "method", "LQFpaHEwXR");
        setField(term236, term236.getClass(), "scheme", "oVcInYnLWB");
        setField(term236, term236.getClass(), "groupId", "aJlieCFVtF");
        setField(term236, term236.getClass(), "hostGrpId", "ZiaGIbnzTs");
        setField(term236, term236.getClass(), "host", "tbcdzjIfER");
        setField(term236, term236.getClass(), "port", "HyxfbSQYBe");
        setField(term236, term236.getClass(), "uri", "pCTimMblYc");
        setField(term236, term236.getClass(), "headers", term333);
        setField(term236, term236.getClass(), "body", "xOEqzGAmDU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.cache.ProxyRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "eZFUvlxvGV";
        callMethod(klass, "setScheme", argTypes, term236, args);
    }

};


