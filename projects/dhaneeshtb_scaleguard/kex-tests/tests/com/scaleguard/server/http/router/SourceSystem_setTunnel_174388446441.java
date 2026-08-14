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

public class SourceSystem_setTunnel_174388446441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21744;
     Object term21748;

    public SourceSystem_setTunnel_174388446441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21744 = newInstance(Class.forName("com.scaleguard.server.http.router.SourceSystem"));
        setField(term21744, term21744.getClass(), "host", null);
        setBooleanField(term21744, term21744.getClass(), "tunnel", false);
        setField(term21744, term21744.getClass(), "port", null);
        setField(term21744, term21744.getClass(), "scheme", null);
        setField(term21744, term21744.getClass(), "basePath", null);
        setField(term21744, term21744.getClass(), "id", null);
        setField(term21744, term21744.getClass(), "name", null);
        setField(term21744, term21744.getClass(), "groupId", null);
        setField(term21744, term21744.getClass(), "target", null);
        setBooleanField(term21744, term21744.getClass(), "async", false);
        setField(term21744, term21744.getClass(), "asyncEngine", null);
        setField(term21744, term21744.getClass(), "callbackId", null);
        setField(term21744, term21744.getClass(), "jwtKeylookup", null);
        setField(term21744, term21744.getClass(), "certificateId", null);
        setField(term21744, term21744.getClass(), "secappid", null);
        setBooleanField(term21744, term21744.getClass(), "autoProcure", false);
        setField(term21744, term21744.getClass(), "targetSystem", null);
        setField(term21744, term21744.getClass(), "headerLookup", null);
        setField(term21744, term21744.getClass(), "keyLookupMap", null);
        term21748 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.SourceSystem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term21748;
        callMethod(klass, "setTunnel", argTypes, term21744, args);
    }

};


