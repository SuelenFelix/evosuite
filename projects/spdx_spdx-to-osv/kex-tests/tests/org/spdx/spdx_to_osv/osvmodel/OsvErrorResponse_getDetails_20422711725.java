package org.spdx.spdx_to_osv.osvmodel;

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
import static org.spdx.spdx_to_osv.osvmodel.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class OsvErrorResponse_getDetails_20422711725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9064;

    public OsvErrorResponse_getDetails_20422711725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9064 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvErrorResponse"));
        Object term9089 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvErrorDetails"));
        setField(term9064, term9064.getClass(), "code", "mvrkADEgpp");
        setField(term9064, term9064.getClass(), "message", "pXOkjyeIRb");
        setField(term9089, term9089.getClass(), "typeUrl", "GgZWSjxjyE");
        setField(term9089, term9089.getClass(), "value", "EeBVbzjcCI");
        setField(term9064, term9064.getClass(), "details", term9089);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvErrorResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDetails", argTypes, term9064, args);
    }

};


