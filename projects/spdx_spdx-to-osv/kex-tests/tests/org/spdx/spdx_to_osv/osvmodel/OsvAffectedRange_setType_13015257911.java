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

public class OsvAffectedRange_setType_13015257911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8653;

    public OsvAffectedRange_setType_13015257911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8653 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvAffectedRange"));
        setField(term8653, term8653.getClass(), "type", null);
        setField(term8653, term8653.getClass(), "repo", null);
        setField(term8653, term8653.getClass(), "introduced", null);
        setField(term8653, term8653.getClass(), "fixed", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvAffectedRange");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvAffectedRange$OsvAffectedType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setType", argTypes, term8653, args);
    }

};


