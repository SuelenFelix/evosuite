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
import java.lang.Long;
import java.lang.Integer;
import java.lang.Object;

public class ReferenceEntity_setCode_387592264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177;

    public ReferenceEntity_setCode_387592264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term178 = new Long(5270370404989704783L);
        Integer term204 = new Integer(391863371);
        term177 = newInstance(Class.forName("com.leanstacks.ws.model.ReferenceEntity"));
        Object term206 = newInstance(Class.forName("java.time.Instant"));
        Object term209 = newInstance(Class.forName("java.time.Instant"));
        Object term212 = newInstance(Class.forName("java.time.Instant"));
        setField(term177, term177.getClass(), "id", term178);
        setField(term177, term177.getClass(), "code", "SzjVpOQTyS");
        setField(term177, term177.getClass(), "label", "MjGYSRKTNF");
        setField(term177, term177.getClass(), "ordinal", term204);
        setLongField(term206, term206.getClass(), "seconds", 1500721068L);
        setIntField(term206, term206.getClass(), "nanos", 23000000);
        setField(term177, term177.getClass(), "effectiveAt", term206);
        setLongField(term209, term209.getClass(), "seconds", 1797203628L);
        setIntField(term209, term209.getClass(), "nanos", 25000000);
        setField(term177, term177.getClass(), "expiresAt", term209);
        setLongField(term212, term212.getClass(), "seconds", 1589457921L);
        setIntField(term212, term212.getClass(), "nanos", 30000000);
        setField(term177, term177.getClass(), "createdAt", term212);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.ReferenceEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hRNSzYYIrc";
        callMethod(klass, "setCode", argTypes, term177, args);
    }

};


