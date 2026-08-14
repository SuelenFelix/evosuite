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

public class DownloadLocationParser_parseNpm_16102048233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12595;

    public DownloadLocationParser_parseNpm_16102048233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12595 = newInstance(Class.forName("org.spdx.spdx_to_osv.DownloadLocationParser"));
        Object term12608 = newInstance(Class.forName("java.util.Optional"));
        Object term12609 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvVulnerabilityRequest"));
        Object term12610 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvPackage"));
        setField(term12595, term12595.getClass(), "downloadLocation", "TJmVBGfTML");
        setField(term12610, term12610.getClass(), "name", "");
        setField(term12610, term12610.getClass(), "ecosystem", "");
        setField(term12610, term12610.getClass(), "purl", "");
        setField(term12609, term12609.getClass(), "osvPackage", term12610);
        setField(term12609, term12609.getClass(), "version", "IgRJUzaCwW");
        setField(term12609, term12609.getClass(), "commit", "JUmudUmaaV");
        setField(term12608, term12608.getClass(), "value", term12609);
        setField(term12595, term12595.getClass(), "osvVulnerabilityRequest", term12608);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.spdx.spdx_to_osv.DownloadLocationParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "parseNpm", argTypes, term12595, args);
    }

};


