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

public class SourceSystem_isAutoProcure_27550453546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21766;

    public SourceSystem_isAutoProcure_27550453546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21766 = newInstance(Class.forName("com.scaleguard.server.http.router.SourceSystem"));
        setField(term21766, term21766.getClass(), "host", null);
        setBooleanField(term21766, term21766.getClass(), "tunnel", false);
        setField(term21766, term21766.getClass(), "port", null);
        setField(term21766, term21766.getClass(), "scheme", null);
        setField(term21766, term21766.getClass(), "basePath", null);
        setField(term21766, term21766.getClass(), "id", null);
        setField(term21766, term21766.getClass(), "name", null);
        setField(term21766, term21766.getClass(), "groupId", null);
        setField(term21766, term21766.getClass(), "target", null);
        setBooleanField(term21766, term21766.getClass(), "async", false);
        setField(term21766, term21766.getClass(), "asyncEngine", null);
        setField(term21766, term21766.getClass(), "callbackId", null);
        setField(term21766, term21766.getClass(), "jwtKeylookup", null);
        setField(term21766, term21766.getClass(), "certificateId", null);
        setField(term21766, term21766.getClass(), "secappid", null);
        setBooleanField(term21766, term21766.getClass(), "autoProcure", false);
        setField(term21766, term21766.getClass(), "targetSystem", null);
        setField(term21766, term21766.getClass(), "headerLookup", null);
        setField(term21766, term21766.getClass(), "keyLookupMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.SourceSystem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isAutoProcure", argTypes, term21766, args);
    }

};


