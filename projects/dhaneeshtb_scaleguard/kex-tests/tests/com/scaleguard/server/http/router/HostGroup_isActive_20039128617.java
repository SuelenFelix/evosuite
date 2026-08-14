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

public class HostGroup_isActive_20039128617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23080;

    public HostGroup_isActive_20039128617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23080 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term23080, term23080.getClass(), "id", "bakvKrXWXm");
        setField(term23080, term23080.getClass(), "host", "ixpDCFiQaP");
        setField(term23080, term23080.getClass(), "port", "vrRPhHcJDp");
        setField(term23080, term23080.getClass(), "health", "GAfAmizshG");
        setField(term23080, term23080.getClass(), "scheme", "mouoQUznmq");
        setIntField(term23080, term23080.getClass(), "priority", -1970452551);
        setBooleanField(term23080, term23080.getClass(), "isActive", true);
        setField(term23080, term23080.getClass(), "type", "WaacgRHGZQ");
        setField(term23080, term23080.getClass(), "groupId", "GiqQhSRhZD");
        setFloatField(term23080, term23080.getClass(), "loadFactor", 0.88196456F);
        setBooleanField(term23080, term23080.getClass(), "isReachable", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.HostGroup");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isActive", argTypes, term23080, args);
    }

};


