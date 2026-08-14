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

public class OsvAffectedRange_setType_1301525792 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5694;
     Object enum10;

    public OsvAffectedRange_setType_1301525792() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5739 = Class.forName((String) "org.spdx.spdx_to_osv.osvmodel.OsvAffectedRange$OsvAffectedType");
        Field term5738 = ((Class) term5739).getDeclaredField((String) "GIT");
        ((Field) term5738).setAccessible(true);
        enum10 = ((Field) term5738).get((Object) null);
        term5694 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvAffectedRange"));
        setField(term5694, term5694.getClass(), "type", enum10);
        setField(term5694, term5694.getClass(), "repo", "SPpkrGcPRr");
        setField(term5694, term5694.getClass(), "introduced", "sEccwbJKYE");
        setField(term5694, term5694.getClass(), "fixed", "AWRooQKkdW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvAffectedRange");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvAffectedRange$OsvAffectedType");
        Object[] args = new Object[1];
        args[0] = enum10;
        callMethod(klass, "setType", argTypes, term5694, args);
    }

};


