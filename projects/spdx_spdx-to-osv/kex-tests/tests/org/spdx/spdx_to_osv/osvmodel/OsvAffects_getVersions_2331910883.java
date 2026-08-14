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

public class OsvAffects_getVersions_2331910883 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10554;

    public OsvAffects_getVersions_2331910883() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10642 = Class.forName((String) "org.spdx.spdx_to_osv.osvmodel.OsvAffectedRange$OsvAffectedType");
        Field term10641 = ((Class) term10642).getDeclaredField((String) "SEMVER");
        ((Field) term10641).setAccessible(true);
        Object enum20 = ((Field) term10641).get((Object) null);
        Object term10557 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvAffectedRange"));
        setField(term10557, term10557.getClass(), "type", enum20);
        setField(term10557, term10557.getClass(), "repo", "");
        setField(term10557, term10557.getClass(), "introduced", "");
        setField(term10557, term10557.getClass(), "fixed", "");
        ArrayList term10555 = new ArrayList();
        ((ArrayList) term10555).add(term10557);
        ArrayList term10565 = new ArrayList();
        ((ArrayList) term10565).add("JmcmxoGhIK");
        ((ArrayList) term10565).add("jXzmYyrnnT");
        ((ArrayList) term10565).add("igCAtimmYB");
        ((ArrayList) term10565).add("DyiXbeYIaN");
        ((ArrayList) term10565).add("VGizxZnyHX");
        ((ArrayList) term10565).add("kVEZMHmRtR");
        term10554 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvAffects"));
        setField(term10554, term10554.getClass(), "ranges", term10555);
        setField(term10554, term10554.getClass(), "versions", term10565);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvAffects");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVersions", argTypes, term10554, args);
    }

};


