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

public class HostGroup_getGroupId_87710760611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23740;

    public HostGroup_getGroupId_87710760611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23740 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term23740, term23740.getClass(), "id", "dqznIFBmKx");
        setField(term23740, term23740.getClass(), "host", "MhTJfnBVaz");
        setField(term23740, term23740.getClass(), "port", "tWJuxHLcBL");
        setField(term23740, term23740.getClass(), "health", "ZOcslmWgQG");
        setField(term23740, term23740.getClass(), "scheme", "YzxEEHlDUj");
        setIntField(term23740, term23740.getClass(), "priority", 1687361082);
        setBooleanField(term23740, term23740.getClass(), "isActive", true);
        setField(term23740, term23740.getClass(), "type", "UcCUEwaHWp");
        setField(term23740, term23740.getClass(), "groupId", "IZewAlURAW");
        setFloatField(term23740, term23740.getClass(), "loadFactor", 0.16988689F);
        setBooleanField(term23740, term23740.getClass(), "isReachable", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.HostGroup");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGroupId", argTypes, term23740, args);
    }

};


