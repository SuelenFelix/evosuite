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

public class OsvRange_setType_17231939442 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11530;
     Object enum22;

    public OsvRange_setType_17231939442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11559 = Class.forName((String) "org.spdx.spdx_to_osv.osvmodel.OsvRange$OsvRangeType");
        Field term11558 = ((Class) term11559).getDeclaredField((String) "GIT");
        ((Field) term11558).setAccessible(true);
        enum22 = ((Field) term11558).get((Object) null);
        Object term11552 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvEvent"));
        setField(term11552, term11552.getClass(), "introduced", "");
        setField(term11552, term11552.getClass(), "fixed", "");
        setField(term11552, term11552.getClass(), "limit", "");
        ArrayList term11550 = new ArrayList();
        ((ArrayList) term11550).add(term11552);
        term11530 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvRange"));
        setField(term11530, term11530.getClass(), "type", enum22);
        setField(term11530, term11530.getClass(), "repo", "HDaezxQfQR");
        setField(term11530, term11530.getClass(), "events", term11550);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvRange");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvRange$OsvRangeType");
        Object[] args = new Object[1];
        args[0] = enum22;
        callMethod(klass, "setType", argTypes, term11530, args);
    }

};


