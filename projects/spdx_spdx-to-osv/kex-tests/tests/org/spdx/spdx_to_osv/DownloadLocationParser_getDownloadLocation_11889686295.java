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

public class DownloadLocationParser_getDownloadLocation_11889686295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12741;

    public DownloadLocationParser_getDownloadLocation_11889686295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12741 = newInstance(Class.forName("org.spdx.spdx_to_osv.DownloadLocationParser"));
        Object term12754 = newInstance(Class.forName("java.util.Optional"));
        Object term12755 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvVulnerabilityRequest"));
        Object term12756 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvPackage"));
        setField(term12741, term12741.getClass(), "downloadLocation", "wGmYcqUkgE");
        setField(term12756, term12756.getClass(), "name", "");
        setField(term12756, term12756.getClass(), "ecosystem", "");
        setField(term12756, term12756.getClass(), "purl", "");
        setField(term12755, term12755.getClass(), "osvPackage", term12756);
        setField(term12755, term12755.getClass(), "version", "bWWfajKbEX");
        setField(term12755, term12755.getClass(), "commit", "cAPeiZHKGJ");
        setField(term12754, term12754.getClass(), "value", term12755);
        setField(term12741, term12741.getClass(), "osvVulnerabilityRequest", term12754);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.spdx.spdx_to_osv.DownloadLocationParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDownloadLocation", argTypes, term12741, args);
    }

};


