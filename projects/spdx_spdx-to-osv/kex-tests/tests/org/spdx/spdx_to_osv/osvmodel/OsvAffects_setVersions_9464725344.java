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
import java.util.LinkedList;
import java.lang.Object;

public class OsvAffects_setVersions_9464725344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11036;
     Object term11057;

    public OsvAffects_setVersions_9464725344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term11037 = new ArrayList();
        ArrayList term11041 = new ArrayList();
        ((ArrayList) term11041).add("ekxGuOYIwi");
        term11036 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvAffects"));
        setField(term11036, term11036.getClass(), "ranges", term11037);
        setField(term11036, term11036.getClass(), "versions", term11041);
        term11057 = new LinkedList();
        ((LinkedList) term11057).add("RbVQXSpxXy");
        ((LinkedList) term11057).add("YpJbIgJWWv");
        ((LinkedList) term11057).add("");
        ((LinkedList) term11057).add((Object)null);
        ((LinkedList) term11057).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvAffects");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term11057;
        callMethod(klass, "setVersions", argTypes, term11036, args);
    }

};


