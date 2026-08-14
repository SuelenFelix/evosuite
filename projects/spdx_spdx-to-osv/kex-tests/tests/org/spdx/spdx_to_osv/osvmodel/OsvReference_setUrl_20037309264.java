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

public class OsvReference_setUrl_20037309264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2572;

    public OsvReference_setUrl_20037309264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2608 = Class.forName((String) "org.spdx.spdx_to_osv.osvmodel.OsvReference$OsvReferenceType");
        Field term2607 = ((Class) term2608).getDeclaredField((String) "REPORT");
        ((Field) term2607).setAccessible(true);
        Object enum6 = ((Field) term2607).get((Object) null);
        term2572 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvReference"));
        setField(term2572, term2572.getClass(), "type", enum6);
        setField(term2572, term2572.getClass(), "url", "vrQLuWIDJX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvReference");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "flxyYxBRtu";
        callMethod(klass, "setUrl", argTypes, term2572, args);
    }

};


