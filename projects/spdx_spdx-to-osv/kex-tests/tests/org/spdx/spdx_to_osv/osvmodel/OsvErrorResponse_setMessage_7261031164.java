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

public class OsvErrorResponse_setMessage_7261031164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8952;

    public OsvErrorResponse_setMessage_7261031164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8952 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvErrorResponse"));
        Object term8977 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvErrorDetails"));
        setField(term8952, term8952.getClass(), "code", "VMeAzAHwZj");
        setField(term8952, term8952.getClass(), "message", "PznxWXsZME");
        setField(term8977, term8977.getClass(), "typeUrl", "ZzIujlwVsw");
        setField(term8977, term8977.getClass(), "value", "LWyEaeIyAo");
        setField(term8952, term8952.getClass(), "details", term8977);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvErrorResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "yVMkkQhvmN";
        callMethod(klass, "setMessage", argTypes, term8952, args);
    }

};


