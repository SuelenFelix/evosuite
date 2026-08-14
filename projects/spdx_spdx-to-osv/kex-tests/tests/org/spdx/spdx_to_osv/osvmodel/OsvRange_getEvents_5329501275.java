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

public class OsvRange_getEvents_5329501275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12523;

    public OsvRange_getEvents_5329501275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12586 = Class.forName((String) "org.spdx.spdx_to_osv.osvmodel.OsvRange$OsvRangeType");
        Field term12585 = ((Class) term12586).getDeclaredField((String) "ECOSYSTEM");
        ((Field) term12585).setAccessible(true);
        Object enum25 = ((Field) term12585).get((Object) null);
        Object term12551 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvEvent"));
        setField(term12551, term12551.getClass(), "introduced", "");
        setField(term12551, term12551.getClass(), "fixed", "");
        setField(term12551, term12551.getClass(), "limit", "");
        Object term12555 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvEvent"));
        setField(term12555, term12555.getClass(), "introduced", "");
        setField(term12555, term12555.getClass(), "fixed", "");
        setField(term12555, term12555.getClass(), "limit", "");
        Object term12559 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvEvent"));
        setField(term12559, term12559.getClass(), "introduced", "");
        setField(term12559, term12559.getClass(), "fixed", "");
        setField(term12559, term12559.getClass(), "limit", "");
        Object term12563 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvEvent"));
        setField(term12563, term12563.getClass(), "introduced", "");
        setField(term12563, term12563.getClass(), "fixed", "");
        setField(term12563, term12563.getClass(), "limit", "");
        Object term12567 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvEvent"));
        setField(term12567, term12567.getClass(), "introduced", "");
        setField(term12567, term12567.getClass(), "fixed", "");
        setField(term12567, term12567.getClass(), "limit", "");
        Object term12571 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvEvent"));
        setField(term12571, term12571.getClass(), "introduced", "");
        setField(term12571, term12571.getClass(), "fixed", "");
        setField(term12571, term12571.getClass(), "limit", "");
        Object term12575 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvEvent"));
        setField(term12575, term12575.getClass(), "introduced", "");
        setField(term12575, term12575.getClass(), "fixed", "");
        setField(term12575, term12575.getClass(), "limit", "");
        Object term12579 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvEvent"));
        setField(term12579, term12579.getClass(), "introduced", "");
        setField(term12579, term12579.getClass(), "fixed", "");
        setField(term12579, term12579.getClass(), "limit", "");
        ArrayList term12549 = new ArrayList();
        ((ArrayList) term12549).add(term12551);
        ((ArrayList) term12549).add(term12555);
        ((ArrayList) term12549).add(term12559);
        ((ArrayList) term12549).add(term12563);
        ((ArrayList) term12549).add(term12567);
        ((ArrayList) term12549).add(term12571);
        ((ArrayList) term12549).add(term12575);
        ((ArrayList) term12549).add(term12579);
        term12523 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvRange"));
        setField(term12523, term12523.getClass(), "type", enum25);
        setField(term12523, term12523.getClass(), "repo", "izPpKDErnQ");
        setField(term12523, term12523.getClass(), "events", term12549);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvRange");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEvents", argTypes, term12523, args);
    }

};


