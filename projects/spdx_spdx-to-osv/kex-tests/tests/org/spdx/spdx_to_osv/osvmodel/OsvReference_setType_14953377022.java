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

public class OsvReference_setType_14953377022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1536;
     Object enum4;

    public OsvReference_setType_14953377022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1569 = Class.forName((String) "org.spdx.spdx_to_osv.osvmodel.OsvReference$OsvReferenceType");
        Field term1568 = ((Class) term1569).getDeclaredField((String) "ADVISORY");
        ((Field) term1568).setAccessible(true);
        Object enum3 = ((Field) term1568).get((Object) null);
        term1536 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvReference"));
        setField(term1536, term1536.getClass(), "type", enum3);
        setField(term1536, term1536.getClass(), "url", "eZFUvlxvGV");
        Class<? extends Object> term1905 = Class.forName((String) "org.spdx.spdx_to_osv.osvmodel.OsvReference$OsvReferenceType");
        Field term1904 = ((Class) term1905).getDeclaredField((String) "FIX");
        ((Field) term1904).setAccessible(true);
        enum4 = ((Field) term1904).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvReference");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvReference$OsvReferenceType");
        Object[] args = new Object[1];
        args[0] = enum4;
        callMethod(klass, "setType", argTypes, term1536, args);
    }

};


