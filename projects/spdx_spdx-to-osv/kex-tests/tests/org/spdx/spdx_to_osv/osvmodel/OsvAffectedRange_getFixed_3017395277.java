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

public class OsvAffectedRange_getFixed_3017395277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7818;

    public OsvAffectedRange_getFixed_3017395277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7866 = Class.forName((String) "org.spdx.spdx_to_osv.osvmodel.OsvAffectedRange$OsvAffectedType");
        Field term7865 = ((Class) term7866).getDeclaredField((String) "SEMVER");
        ((Field) term7865).setAccessible(true);
        Object enum15 = ((Field) term7865).get((Object) null);
        term7818 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvAffectedRange"));
        setField(term7818, term7818.getClass(), "type", enum15);
        setField(term7818, term7818.getClass(), "repo", "XylxrMBraH");
        setField(term7818, term7818.getClass(), "introduced", "pORebkoRdD");
        setField(term7818, term7818.getClass(), "fixed", "mXGCWJDOqA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvAffectedRange");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFixed", argTypes, term7818, args);
    }

};


