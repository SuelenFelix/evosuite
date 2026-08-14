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

public class SourceSystem_setAutoProcure_109456501747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21770;
     Object term21774;

    public SourceSystem_setAutoProcure_109456501747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21770 = newInstance(Class.forName("com.scaleguard.server.http.router.SourceSystem"));
        setField(term21770, term21770.getClass(), "host", null);
        setBooleanField(term21770, term21770.getClass(), "tunnel", false);
        setField(term21770, term21770.getClass(), "port", null);
        setField(term21770, term21770.getClass(), "scheme", null);
        setField(term21770, term21770.getClass(), "basePath", null);
        setField(term21770, term21770.getClass(), "id", null);
        setField(term21770, term21770.getClass(), "name", null);
        setField(term21770, term21770.getClass(), "groupId", null);
        setField(term21770, term21770.getClass(), "target", null);
        setBooleanField(term21770, term21770.getClass(), "async", false);
        setField(term21770, term21770.getClass(), "asyncEngine", null);
        setField(term21770, term21770.getClass(), "callbackId", null);
        setField(term21770, term21770.getClass(), "jwtKeylookup", null);
        setField(term21770, term21770.getClass(), "certificateId", null);
        setField(term21770, term21770.getClass(), "secappid", null);
        setBooleanField(term21770, term21770.getClass(), "autoProcure", false);
        setField(term21770, term21770.getClass(), "targetSystem", null);
        setField(term21770, term21770.getClass(), "headerLookup", null);
        setField(term21770, term21770.getClass(), "keyLookupMap", null);
        term21774 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.SourceSystem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term21774;
        callMethod(klass, "setAutoProcure", argTypes, term21770, args);
    }

};


