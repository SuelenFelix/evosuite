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

public class OsvEvent_getIntroduced_9638341718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1189;

    public OsvEvent_getIntroduced_9638341718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1189 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvEvent"));
        setField(term1189, term1189.getClass(), "introduced", null);
        setField(term1189, term1189.getClass(), "fixed", null);
        setField(term1189, term1189.getClass(), "limit", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIntroduced", argTypes, term1189, args);
    }

};


