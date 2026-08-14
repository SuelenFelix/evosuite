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

public class OsvErrorResponse_setCode_7530347422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8750;

    public OsvErrorResponse_setCode_7530347422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8750 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvErrorResponse"));
        Object term8775 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvErrorDetails"));
        setField(term8750, term8750.getClass(), "code", "xIeFjkHkOe");
        setField(term8750, term8750.getClass(), "message", "SdCKLMIYnX");
        setField(term8775, term8775.getClass(), "typeUrl", "OJJtVNPyKZ");
        setField(term8775, term8775.getClass(), "value", "AKNapTAfmD");
        setField(term8750, term8750.getClass(), "details", term8775);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvErrorResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xJgPlLxpgC";
        callMethod(klass, "setCode", argTypes, term8750, args);
    }

};


