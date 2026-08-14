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

public class SourceSystem_getScheme_97214580862 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21832;

    public SourceSystem_getScheme_97214580862() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21832 = newInstance(Class.forName("com.scaleguard.server.http.router.SourceSystem"));
        setField(term21832, term21832.getClass(), "host", null);
        setBooleanField(term21832, term21832.getClass(), "tunnel", false);
        setField(term21832, term21832.getClass(), "port", null);
        setField(term21832, term21832.getClass(), "scheme", null);
        setField(term21832, term21832.getClass(), "basePath", null);
        setField(term21832, term21832.getClass(), "id", null);
        setField(term21832, term21832.getClass(), "name", null);
        setField(term21832, term21832.getClass(), "groupId", null);
        setField(term21832, term21832.getClass(), "target", null);
        setBooleanField(term21832, term21832.getClass(), "async", false);
        setField(term21832, term21832.getClass(), "asyncEngine", null);
        setField(term21832, term21832.getClass(), "callbackId", null);
        setField(term21832, term21832.getClass(), "jwtKeylookup", null);
        setField(term21832, term21832.getClass(), "certificateId", null);
        setField(term21832, term21832.getClass(), "secappid", null);
        setBooleanField(term21832, term21832.getClass(), "autoProcure", false);
        setField(term21832, term21832.getClass(), "targetSystem", null);
        setField(term21832, term21832.getClass(), "headerLookup", null);
        setField(term21832, term21832.getClass(), "keyLookupMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.SourceSystem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScheme", argTypes, term21832, args);
    }

};


