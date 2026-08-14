package org.spdx.spdx_to_osv;

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
import static org.spdx.spdx_to_osv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class OsvApi_queryVulnerabilities_12096278882 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34111;

    public OsvApi_queryVulnerabilities_12096278882() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34111 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvVulnerabilityRequest"));
        Object term34112 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvPackage"));
        setField(term34112, term34112.getClass(), "name", "DyiXbeYIaN");
        setField(term34112, term34112.getClass(), "ecosystem", "VGizxZnyHX");
        setField(term34112, term34112.getClass(), "purl", "kVEZMHmRtR");
        setField(term34111, term34111.getClass(), "osvPackage", term34112);
        setField(term34111, term34111.getClass(), "version", "ekxGuOYIwi");
        setField(term34111, term34111.getClass(), "commit", "RbVQXSpxXy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.spdx.spdx_to_osv.OsvApi");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvVulnerabilityRequest");
        Object[] args = new Object[1];
        args[0] = term34111;
        callMethod(klass, "queryVulnerabilities", argTypes, null, args);
    }

};


