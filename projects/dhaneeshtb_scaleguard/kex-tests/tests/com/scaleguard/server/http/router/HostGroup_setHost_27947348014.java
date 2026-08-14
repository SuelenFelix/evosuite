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

public class HostGroup_setHost_27947348014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24239;

    public HostGroup_setHost_27947348014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24239 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term24239, term24239.getClass(), "id", "CYfPHswxIT");
        setField(term24239, term24239.getClass(), "host", "IDibKvfdDt");
        setField(term24239, term24239.getClass(), "port", "sKLtBTAssF");
        setField(term24239, term24239.getClass(), "health", "ROGqSdboUf");
        setField(term24239, term24239.getClass(), "scheme", "NfGNgrTcyY");
        setIntField(term24239, term24239.getClass(), "priority", -1899301124);
        setBooleanField(term24239, term24239.getClass(), "isActive", true);
        setField(term24239, term24239.getClass(), "type", "uPuFIjvpsv");
        setField(term24239, term24239.getClass(), "groupId", "zNKHFvTvNQ");
        setFloatField(term24239, term24239.getClass(), "loadFactor", 0.13618106F);
        setBooleanField(term24239, term24239.getClass(), "isReachable", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.HostGroup");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "cyqgSKerVH";
        callMethod(klass, "setHost", argTypes, term24239, args);
    }

};


