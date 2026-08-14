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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;

public class OsvAffects_getRanges_12291532051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9295;

    public OsvAffects_getRanges_12291532051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9339 = Class.forName((String) "org.spdx.spdx_to_osv.osvmodel.OsvAffectedRange$OsvAffectedType");
        Field term9338 = ((Class) term9339).getDeclaredField((String) "GIT");
        ((Field) term9338).setAccessible(true);
        Object enum17 = ((Field) term9338).get((Object) null);
        Object term9298 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvAffectedRange"));
        setField(term9298, term9298.getClass(), "type", enum17);
        setField(term9298, term9298.getClass(), "repo", "");
        setField(term9298, term9298.getClass(), "introduced", "");
        setField(term9298, term9298.getClass(), "fixed", "");
        Class<? extends Object> term9665 = Class.forName((String) "org.spdx.spdx_to_osv.osvmodel.OsvAffectedRange$OsvAffectedType");
        Field term9664 = ((Class) term9665).getDeclaredField((String) "ECOSYSTEM");
        ((Field) term9664).setAccessible(true);
        Object enum18 = ((Field) term9664).get((Object) null);
        Object term9304 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvAffectedRange"));
        setField(term9304, term9304.getClass(), "type", enum18);
        setField(term9304, term9304.getClass(), "repo", "");
        setField(term9304, term9304.getClass(), "introduced", "");
        setField(term9304, term9304.getClass(), "fixed", "");
        Class<? extends Object> term10009 = Class.forName((String) "org.spdx.spdx_to_osv.osvmodel.OsvAffectedRange$OsvAffectedType");
        Field term10008 = ((Class) term10009).getDeclaredField((String) "GIT");
        ((Field) term10008).setAccessible(true);
        Object enum19 = ((Field) term10008).get((Object) null);
        Object term9310 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvAffectedRange"));
        setField(term9310, term9310.getClass(), "type", enum19);
        setField(term9310, term9310.getClass(), "repo", "");
        setField(term9310, term9310.getClass(), "introduced", "");
        setField(term9310, term9310.getClass(), "fixed", "");
        Object term9316 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvAffectedRange"));
        setField(term9316, term9316.getClass(), "type", enum18);
        setField(term9316, term9316.getClass(), "repo", "");
        setField(term9316, term9316.getClass(), "introduced", "");
        setField(term9316, term9316.getClass(), "fixed", "");
        ArrayList term9296 = new ArrayList();
        ((ArrayList) term9296).add(term9298);
        ((ArrayList) term9296).add(term9304);
        ((ArrayList) term9296).add(term9310);
        ((ArrayList) term9296).add(term9316);
        ArrayList term9322 = new ArrayList();
        ((ArrayList) term9322).add("WzFopsaDuG");
        term9295 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvAffects"));
        setField(term9295, term9295.getClass(), "ranges", term9296);
        setField(term9295, term9295.getClass(), "versions", term9322);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvAffects");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRanges", argTypes, term9295, args);
    }

};


