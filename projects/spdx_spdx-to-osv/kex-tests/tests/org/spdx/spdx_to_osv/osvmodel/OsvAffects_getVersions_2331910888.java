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

public class OsvAffects_getVersions_2331910888 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11134;

    public OsvAffects_getVersions_2331910888() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11134 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvAffects"));
        setField(term11134, term11134.getClass(), "ranges", null);
        setField(term11134, term11134.getClass(), "versions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvAffects");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVersions", argTypes, term11134, args);
    }

};


