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

public class SourceSystem_setKeyLookupMap_200258702555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21804;

    public SourceSystem_setKeyLookupMap_200258702555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21804 = newInstance(Class.forName("com.scaleguard.server.http.router.SourceSystem"));
        setField(term21804, term21804.getClass(), "host", null);
        setBooleanField(term21804, term21804.getClass(), "tunnel", false);
        setField(term21804, term21804.getClass(), "port", null);
        setField(term21804, term21804.getClass(), "scheme", null);
        setField(term21804, term21804.getClass(), "basePath", null);
        setField(term21804, term21804.getClass(), "id", null);
        setField(term21804, term21804.getClass(), "name", null);
        setField(term21804, term21804.getClass(), "groupId", null);
        setField(term21804, term21804.getClass(), "target", null);
        setBooleanField(term21804, term21804.getClass(), "async", false);
        setField(term21804, term21804.getClass(), "asyncEngine", null);
        setField(term21804, term21804.getClass(), "callbackId", null);
        setField(term21804, term21804.getClass(), "jwtKeylookup", null);
        setField(term21804, term21804.getClass(), "certificateId", null);
        setField(term21804, term21804.getClass(), "secappid", null);
        setBooleanField(term21804, term21804.getClass(), "autoProcure", false);
        setField(term21804, term21804.getClass(), "targetSystem", null);
        setField(term21804, term21804.getClass(), "headerLookup", null);
        setField(term21804, term21804.getClass(), "keyLookupMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.SourceSystem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setKeyLookupMap", argTypes, term21804, args);
    }

};


