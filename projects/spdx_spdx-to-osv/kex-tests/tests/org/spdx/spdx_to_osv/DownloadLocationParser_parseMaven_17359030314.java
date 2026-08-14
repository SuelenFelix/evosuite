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

public class DownloadLocationParser_parseMaven_17359030314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12668;

    public DownloadLocationParser_parseMaven_17359030314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12668 = newInstance(Class.forName("org.spdx.spdx_to_osv.DownloadLocationParser"));
        Object term12681 = newInstance(Class.forName("java.util.Optional"));
        Object term12682 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvVulnerabilityRequest"));
        Object term12683 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvPackage"));
        setField(term12668, term12668.getClass(), "downloadLocation", "KoyGrUJeJW");
        setField(term12683, term12683.getClass(), "name", "");
        setField(term12683, term12683.getClass(), "ecosystem", "");
        setField(term12683, term12683.getClass(), "purl", "");
        setField(term12682, term12682.getClass(), "osvPackage", term12683);
        setField(term12682, term12682.getClass(), "version", "vQVyKLdtaz");
        setField(term12682, term12682.getClass(), "commit", "OWKQODBLzb");
        setField(term12681, term12681.getClass(), "value", term12682);
        setField(term12668, term12668.getClass(), "osvVulnerabilityRequest", term12681);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.spdx.spdx_to_osv.DownloadLocationParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "parseMaven", argTypes, term12668, args);
    }

};


