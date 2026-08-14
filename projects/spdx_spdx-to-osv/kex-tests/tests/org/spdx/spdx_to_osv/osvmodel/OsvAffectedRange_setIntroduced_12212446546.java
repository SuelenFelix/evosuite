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

public class OsvAffectedRange_setIntroduced_12212446546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7384;

    public OsvAffectedRange_setIntroduced_12212446546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7444 = Class.forName((String) "org.spdx.spdx_to_osv.osvmodel.OsvAffectedRange$OsvAffectedType");
        Field term7443 = ((Class) term7444).getDeclaredField((String) "SEMVER");
        ((Field) term7443).setAccessible(true);
        Object enum14 = ((Field) term7443).get((Object) null);
        term7384 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvAffectedRange"));
        setField(term7384, term7384.getClass(), "type", enum14);
        setField(term7384, term7384.getClass(), "repo", "RYdKCNNMBR");
        setField(term7384, term7384.getClass(), "introduced", "yGtHPyvYiQ");
        setField(term7384, term7384.getClass(), "fixed", "MvRIxilFMJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvAffectedRange");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "iNwOJRBEjp";
        callMethod(klass, "setIntroduced", argTypes, term7384, args);
    }

};


