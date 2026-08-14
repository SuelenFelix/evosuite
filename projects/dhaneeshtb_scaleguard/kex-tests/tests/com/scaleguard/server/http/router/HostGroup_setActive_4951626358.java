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
import java.lang.Boolean;

public class HostGroup_setActive_4951626358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23239;
     Object term23328;

    public HostGroup_setActive_4951626358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23239 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term23239, term23239.getClass(), "id", "oycMVEbykz");
        setField(term23239, term23239.getClass(), "host", "DdxinlKAiI");
        setField(term23239, term23239.getClass(), "port", "DZPXiwRtmo");
        setField(term23239, term23239.getClass(), "health", "abnCcSSxwb");
        setField(term23239, term23239.getClass(), "scheme", "PMbUpRmZHC");
        setIntField(term23239, term23239.getClass(), "priority", -1896376975);
        setBooleanField(term23239, term23239.getClass(), "isActive", true);
        setField(term23239, term23239.getClass(), "type", "VGeGoUWPCQ");
        setField(term23239, term23239.getClass(), "groupId", "ZjkLeKLILi");
        setFloatField(term23239, term23239.getClass(), "loadFactor", 0.8818646F);
        setBooleanField(term23239, term23239.getClass(), "isReachable", true);
        term23328 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.HostGroup");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term23328;
        callMethod(klass, "setActive", argTypes, term23239, args);
    }

};


