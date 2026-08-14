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

public class OsvAffectedRange_getIntroduced_16240015145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6960;

    public OsvAffectedRange_getIntroduced_16240015145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7011 = Class.forName((String) "org.spdx.spdx_to_osv.osvmodel.OsvAffectedRange$OsvAffectedType");
        Field term7010 = ((Class) term7011).getDeclaredField((String) "ECOSYSTEM");
        ((Field) term7010).setAccessible(true);
        Object enum13 = ((Field) term7010).get((Object) null);
        term6960 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvAffectedRange"));
        setField(term6960, term6960.getClass(), "type", enum13);
        setField(term6960, term6960.getClass(), "repo", "eVpkWxjuki");
        setField(term6960, term6960.getClass(), "introduced", "SJiQaLvSKv");
        setField(term6960, term6960.getClass(), "fixed", "OEXDRUKcFl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvAffectedRange");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIntroduced", argTypes, term6960, args);
    }

};


