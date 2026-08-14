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

public class DownloadLocationParser_parseNuget_2896633792 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12522;

    public DownloadLocationParser_parseNuget_2896633792() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12522 = newInstance(Class.forName("org.spdx.spdx_to_osv.DownloadLocationParser"));
        Object term12535 = newInstance(Class.forName("java.util.Optional"));
        Object term12536 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvVulnerabilityRequest"));
        Object term12537 = newInstance(Class.forName("org.spdx.spdx_to_osv.osvmodel.OsvPackage"));
        setField(term12522, term12522.getClass(), "downloadLocation", "dEnhdmILtU");
        setField(term12537, term12537.getClass(), "name", "");
        setField(term12537, term12537.getClass(), "ecosystem", "");
        setField(term12537, term12537.getClass(), "purl", "");
        setField(term12536, term12536.getClass(), "osvPackage", term12537);
        setField(term12536, term12536.getClass(), "version", "uWHnvSvaPl");
        setField(term12536, term12536.getClass(), "commit", "kBdSllIBVz");
        setField(term12535, term12535.getClass(), "value", term12536);
        setField(term12522, term12522.getClass(), "osvVulnerabilityRequest", term12535);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.spdx.spdx_to_osv.DownloadLocationParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "parseNuget", argTypes, term12522, args);
    }

};


