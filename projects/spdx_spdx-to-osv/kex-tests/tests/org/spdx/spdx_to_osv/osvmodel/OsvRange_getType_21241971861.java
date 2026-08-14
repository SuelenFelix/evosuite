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

public class OsvRange_getType_21241971861 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11136;

    public OsvRange_getType_21241971861() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11226 = Class.forName((String) "org.spdx.spdx_to_osv.osvmodel.OsvRange$OsvRangeType");
        Field term11225 = ((Class) term11226).getDeclaredField((String) "UNSPECIFIED");
        ((Field) term11225).setAccessible(true);
        Object enum21 = ((Field) term11225).get((Object) null);
        Object term11166 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvEvent"));
        setField(term11166, term11166.getClass(), "introduced", "");
        setField(term11166, term11166.getClass(), "fixed", "");
        setField(term11166, term11166.getClass(), "limit", "");
        Object term11170 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvEvent"));
        setField(term11170, term11170.getClass(), "introduced", "");
        setField(term11170, term11170.getClass(), "fixed", "");
        setField(term11170, term11170.getClass(), "limit", "");
        Object term11174 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvEvent"));
        setField(term11174, term11174.getClass(), "introduced", "");
        setField(term11174, term11174.getClass(), "fixed", "");
        setField(term11174, term11174.getClass(), "limit", "");
        ArrayList term11164 = new ArrayList();
        ((ArrayList) term11164).add(term11166);
        ((ArrayList) term11164).add(term11170);
        ((ArrayList) term11164).add(term11174);
        term11136 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvRange"));
        setField(term11136, term11136.getClass(), "type", enum21);
        setField(term11136, term11136.getClass(), "repo", "vKQukfbJUd");
        setField(term11136, term11136.getClass(), "events", term11164);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvRange");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term11136, args);
    }

};


