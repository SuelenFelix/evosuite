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

public class HostGroup_getId_20003887011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22060;

    public HostGroup_getId_20003887011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22060 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term22060, term22060.getClass(), "id", "oNgxBniAuz");
        setField(term22060, term22060.getClass(), "host", "hvbJVpbmAQ");
        setField(term22060, term22060.getClass(), "port", "aqayJgOWOQ");
        setField(term22060, term22060.getClass(), "health", "YStxlrcedL");
        setField(term22060, term22060.getClass(), "scheme", "mDLwflwlja");
        setIntField(term22060, term22060.getClass(), "priority", 1557431527);
        setBooleanField(term22060, term22060.getClass(), "isActive", true);
        setField(term22060, term22060.getClass(), "type", "RqkgPxDFnv");
        setField(term22060, term22060.getClass(), "groupId", "egaLajwFgY");
        setFloatField(term22060, term22060.getClass(), "loadFactor", 0.045893133F);
        setBooleanField(term22060, term22060.getClass(), "isReachable", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.HostGroup");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term22060, args);
    }

};


