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
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class OsvRange_getRepo_12800199833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11839;

    public OsvRange_getRepo_12800199833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11872 = Class.forName((String) "org.spdx.spdx_to_osv.osvmodel.OsvRange$OsvRangeType");
        Field term11871 = ((Class) term11872).getDeclaredField((String) "UNSPECIFIED");
        ((Field) term11871).setAccessible(true);
        Object enum23 = ((Field) term11871).get((Object) null);
        ArrayList term11867 = new ArrayList();
        term11839 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvRange"));
        setField(term11839, term11839.getClass(), "type", enum23);
        setField(term11839, term11839.getClass(), "repo", "tXfQjSqDzN");
        setField(term11839, term11839.getClass(), "events", term11867);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvRange");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRepo", argTypes, term11839, args);
    }

};


