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

public class OsvReference_getType_11404649761 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1195;

    public OsvReference_getType_11404649761() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1216 = Class.forName((String) "org.spdx.spdx_to_osv.osvmodel.OsvReference$OsvReferenceType");
        Field term1215 = ((Class) term1216).getDeclaredField((String) "WEB");
        ((Field) term1215).setAccessible(true);
        Object enum2 = ((Field) term1215).get((Object) null);
        term1195 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvReference"));
        setField(term1195, term1195.getClass(), "type", enum2);
        setField(term1195, term1195.getClass(), "url", "xOEqzGAmDU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvReference");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term1195, args);
    }

};


