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

public class SourceSystem_setCertificateId_87914363149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21780;

    public SourceSystem_setCertificateId_87914363149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21780 = newInstance(Class.forName("com.scaleguard.server.http.router.SourceSystem"));
        setField(term21780, term21780.getClass(), "host", null);
        setBooleanField(term21780, term21780.getClass(), "tunnel", false);
        setField(term21780, term21780.getClass(), "port", null);
        setField(term21780, term21780.getClass(), "scheme", null);
        setField(term21780, term21780.getClass(), "basePath", null);
        setField(term21780, term21780.getClass(), "id", null);
        setField(term21780, term21780.getClass(), "name", null);
        setField(term21780, term21780.getClass(), "groupId", null);
        setField(term21780, term21780.getClass(), "target", null);
        setBooleanField(term21780, term21780.getClass(), "async", false);
        setField(term21780, term21780.getClass(), "asyncEngine", null);
        setField(term21780, term21780.getClass(), "callbackId", null);
        setField(term21780, term21780.getClass(), "jwtKeylookup", null);
        setField(term21780, term21780.getClass(), "certificateId", null);
        setField(term21780, term21780.getClass(), "secappid", null);
        setBooleanField(term21780, term21780.getClass(), "autoProcure", false);
        setField(term21780, term21780.getClass(), "targetSystem", null);
        setField(term21780, term21780.getClass(), "headerLookup", null);
        setField(term21780, term21780.getClass(), "keyLookupMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.SourceSystem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCertificateId", argTypes, term21780, args);
    }

};


