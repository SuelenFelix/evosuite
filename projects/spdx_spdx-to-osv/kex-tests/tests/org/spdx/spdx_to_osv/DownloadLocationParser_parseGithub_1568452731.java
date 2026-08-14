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

public class DownloadLocationParser_parseGithub_1568452731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12449;

    public DownloadLocationParser_parseGithub_1568452731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12449 = newInstance(Class.forName("org.spdx.spdx_to_osv.DownloadLocationParser"));
        Object term12462 = newInstance(Class.forName("java.util.Optional"));
        Object term12463 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvVulnerabilityRequest"));
        Object term12464 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvPackage"));
        setField(term12449, term12449.getClass(), "downloadLocation", "YRHGsAkhxb");
        setField(term12464, term12464.getClass(), "name", "");
        setField(term12464, term12464.getClass(), "ecosystem", "");
        setField(term12464, term12464.getClass(), "purl", "");
        setField(term12463, term12463.getClass(), "osvPackage", term12464);
        setField(term12463, term12463.getClass(), "version", "nHXjMycHlU");
        setField(term12463, term12463.getClass(), "commit", "ieCtQFdkii");
        setField(term12462, term12462.getClass(), "value", term12463);
        setField(term12449, term12449.getClass(), "osvVulnerabilityRequest", term12462);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.spdx.spdx_to_osv.DownloadLocationParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "parseGithub", argTypes, term12449, args);
    }

};


