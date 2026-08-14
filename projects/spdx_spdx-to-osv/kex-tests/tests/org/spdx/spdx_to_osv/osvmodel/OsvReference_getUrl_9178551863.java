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

public class OsvReference_getUrl_9178551863 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2215;

    public OsvReference_getUrl_9178551863() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2240 = Class.forName((String) "org.spdx.spdx_to_osv.osvmodel.OsvReference$OsvReferenceType");
        Field term2239 = ((Class) term2240).getDeclaredField((String) "PACKAGE");
        ((Field) term2239).setAccessible(true);
        Object enum5 = ((Field) term2239).get((Object) null);
        term2215 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvReference"));
        setField(term2215, term2215.getClass(), "type", enum5);
        setField(term2215, term2215.getClass(), "url", "BYqFIqCKAV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvReference");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUrl", argTypes, term2215, args);
    }

};


