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

public class OsvErrorResponse_setDetails_2313532666 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9154;
     Object term9204;

    public OsvErrorResponse_setDetails_2313532666() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9154 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvErrorResponse"));
        Object term9179 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvErrorDetails"));
        setField(term9154, term9154.getClass(), "code", "UfQtPRyWRC");
        setField(term9154, term9154.getClass(), "message", "FPvxVzzSvD");
        setField(term9179, term9179.getClass(), "typeUrl", "WHcwFgsGFC");
        setField(term9179, term9179.getClass(), "value", "HzqpegHiRq");
        setField(term9154, term9154.getClass(), "details", term9179);
        term9204 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvErrorDetails"));
        setField(term9204, term9204.getClass(), "typeUrl", "jwsfVjMoJT");
        setField(term9204, term9204.getClass(), "value", "ZfdXfCCFDf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvErrorResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvErrorDetails");
        Object[] args = new Object[1];
        args[0] = term9204;
        callMethod(klass, "setDetails", argTypes, term9154, args);
    }

};


