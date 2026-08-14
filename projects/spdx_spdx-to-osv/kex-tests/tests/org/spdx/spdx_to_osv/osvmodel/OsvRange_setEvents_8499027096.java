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
import java.util.LinkedList;

public class OsvRange_setEvents_8499027096 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12884;
     Object term12935;

    public OsvRange_setEvents_8499027096() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13031 = Class.forName((String) "org.spdx.spdx_to_osv.osvmodel.OsvRange$OsvRangeType");
        Field term13030 = ((Class) term13031).getDeclaredField((String) "SEMVER");
        ((Field) term13030).setAccessible(true);
        Object enum26 = ((Field) term13030).get((Object) null);
        Object term12909 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvEvent"));
        setField(term12909, term12909.getClass(), "introduced", "");
        setField(term12909, term12909.getClass(), "fixed", "");
        setField(term12909, term12909.getClass(), "limit", "");
        Object term12913 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvEvent"));
        setField(term12913, term12913.getClass(), "introduced", "");
        setField(term12913, term12913.getClass(), "fixed", "");
        setField(term12913, term12913.getClass(), "limit", "");
        Object term12917 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvEvent"));
        setField(term12917, term12917.getClass(), "introduced", "");
        setField(term12917, term12917.getClass(), "fixed", "");
        setField(term12917, term12917.getClass(), "limit", "");
        Object term12921 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvEvent"));
        setField(term12921, term12921.getClass(), "introduced", "");
        setField(term12921, term12921.getClass(), "fixed", "");
        setField(term12921, term12921.getClass(), "limit", "");
        Object term12925 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvEvent"));
        setField(term12925, term12925.getClass(), "introduced", "");
        setField(term12925, term12925.getClass(), "fixed", "");
        setField(term12925, term12925.getClass(), "limit", "");
        Object term12929 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvEvent"));
        setField(term12929, term12929.getClass(), "introduced", "");
        setField(term12929, term12929.getClass(), "fixed", "");
        setField(term12929, term12929.getClass(), "limit", "");
        ArrayList term12907 = new ArrayList();
        ((ArrayList) term12907).add(term12909);
        ((ArrayList) term12907).add(term12913);
        ((ArrayList) term12907).add(term12917);
        ((ArrayList) term12907).add(term12921);
        ((ArrayList) term12907).add(term12925);
        ((ArrayList) term12907).add(term12929);
        term12884 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvRange"));
        setField(term12884, term12884.getClass(), "type", enum26);
        setField(term12884, term12884.getClass(), "repo", "ShIELyuULw");
        setField(term12884, term12884.getClass(), "events", term12907);
        Object term12938 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvEvent"));
        setField(term12938, term12938.getClass(), "introduced", "lCyLIcSuom");
        setField(term12938, term12938.getClass(), "fixed", "CGOpQSZZwI");
        setField(term12938, term12938.getClass(), "limit", "ypEdrstygY");
        Object term12976 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvEvent"));
        setField(term12976, term12976.getClass(), "introduced", "");
        setField(term12976, term12976.getClass(), "fixed", "");
        setField(term12976, term12976.getClass(), "limit", "");
        Object term12981 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvEvent"));
        setField(term12981, term12981.getClass(), "introduced", null);
        setField(term12981, term12981.getClass(), "fixed", null);
        setField(term12981, term12981.getClass(), "limit", null);
        term12935 = new LinkedList();
        ((LinkedList) term12935).add(term12938);
        ((LinkedList) term12935).add(term12976);
        ((LinkedList) term12935).add(term12981);
        ((LinkedList) term12935).add((Object)null);
        ((LinkedList) term12935).add((Object)null);
        ((LinkedList) term12935).add((Object)null);
        ((LinkedList) term12935).add((Object)null);
        ((LinkedList) term12935).add((Object)null);
        ((LinkedList) term12935).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvRange");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term12935;
        callMethod(klass, "setEvents", argTypes, term12884, args);
    }

};


