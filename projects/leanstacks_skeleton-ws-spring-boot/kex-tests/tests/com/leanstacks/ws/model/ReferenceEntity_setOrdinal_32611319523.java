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

public class ReferenceEntity_setOrdinal_32611319523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term877;

    public ReferenceEntity_setOrdinal_32611319523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term877 = newInstance(Class.forName("com.leanstacks.ws.model.ReferenceEntity"));
        setField(term877, term877.getClass(), "id", null);
        setField(term877, term877.getClass(), "code", null);
        setField(term877, term877.getClass(), "label", null);
        setField(term877, term877.getClass(), "ordinal", null);
        setField(term877, term877.getClass(), "effectiveAt", null);
        setField(term877, term877.getClass(), "expiresAt", null);
        setField(term877, term877.getClass(), "createdAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.ReferenceEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setOrdinal", argTypes, term877, args);
    }

};


