package com.piinalpin.queryrequest.domain.common.query;

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
import static com.piinalpin.queryrequest.domain.common.query.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SortRequest_canEqual_14823376086 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29996;
     Object term30009;

    public SortRequest_canEqual_14823376086() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29996 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term29996, term29996.getClass(), "key", "AHbZyFOmlo");
        setField(term29996, term29996.getClass(), "direction", null);
        term30009 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term30009;
        callMethod(klass, "canEqual", argTypes, term29996, args);
    }

};


