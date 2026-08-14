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

public class HostGroup_isReachable_42180446421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25400;

    public HostGroup_isReachable_42180446421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25400 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term25400, term25400.getClass(), "id", "rwsyozeRfD");
        setField(term25400, term25400.getClass(), "host", "FYBnWmfXch");
        setField(term25400, term25400.getClass(), "port", "ZCKJKntKil");
        setField(term25400, term25400.getClass(), "health", "fyrqWlhCEt");
        setField(term25400, term25400.getClass(), "scheme", "tFABhePKqp");
        setIntField(term25400, term25400.getClass(), "priority", 1102721075);
        setBooleanField(term25400, term25400.getClass(), "isActive", true);
        setField(term25400, term25400.getClass(), "type", "FtjQbVqqqx");
        setField(term25400, term25400.getClass(), "groupId", "FMhmrgLOkN");
        setFloatField(term25400, term25400.getClass(), "loadFactor", 0.6116407F);
        setBooleanField(term25400, term25400.getClass(), "isReachable", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.HostGroup");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isReachable", argTypes, term25400, args);
    }

};


