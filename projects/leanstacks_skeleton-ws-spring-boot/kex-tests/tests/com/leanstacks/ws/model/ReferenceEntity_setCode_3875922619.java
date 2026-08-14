package com.leanstacks.ws.model;

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
import static com.leanstacks.ws.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ReferenceEntity_setCode_3875922619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term873;

    public ReferenceEntity_setCode_3875922619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term873 = newInstance(Class.forName("com.leanstacks.ws.model.ReferenceEntity"));
        setField(term873, term873.getClass(), "id", null);
        setField(term873, term873.getClass(), "code", null);
        setField(term873, term873.getClass(), "label", null);
        setField(term873, term873.getClass(), "ordinal", null);
        setField(term873, term873.getClass(), "effectiveAt", null);
        setField(term873, term873.getClass(), "expiresAt", null);
        setField(term873, term873.getClass(), "createdAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.ReferenceEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCode", argTypes, term873, args);
    }

};


