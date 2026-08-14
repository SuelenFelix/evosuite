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

public class OsvRange_setRepo_12950707454 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12176;

    public OsvRange_setRepo_12950707454() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12224 = Class.forName((String) "org.spdx.spdx_to_osv.osvmodel.OsvRange$OsvRangeType");
        Field term12223 = ((Class) term12224).getDeclaredField((String) "SEMVER");
        ((Field) term12223).setAccessible(true);
        Object enum24 = ((Field) term12223).get((Object) null);
        Object term12201 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvEvent"));
        setField(term12201, term12201.getClass(), "introduced", "");
        setField(term12201, term12201.getClass(), "fixed", "");
        setField(term12201, term12201.getClass(), "limit", "");
        Object term12205 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvEvent"));
        setField(term12205, term12205.getClass(), "introduced", "");
        setField(term12205, term12205.getClass(), "fixed", "");
        setField(term12205, term12205.getClass(), "limit", "");
        ArrayList term12199 = new ArrayList();
        ((ArrayList) term12199).add(term12201);
        ((ArrayList) term12199).add(term12205);
        term12176 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvRange"));
        setField(term12176, term12176.getClass(), "type", enum24);
        setField(term12176, term12176.getClass(), "repo", "BjugTaMcxJ");
        setField(term12176, term12176.getClass(), "events", term12199);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvRange");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "QduALnDSVo";
        callMethod(klass, "setRepo", argTypes, term12176, args);
    }

};


