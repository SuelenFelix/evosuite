package com.github.cuteluobo.livedanmuarchive.builder;

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
import static com.github.cuteluobo.livedanmuarchive.builder.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class DanMuServiceBuilder_saveName_640611243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2387;

    public DanMuServiceBuilder_saveName_640611243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2523 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.WebsiteType");
        Field term2522 = ((Class) term2523).getDeclaredField((String) "Bil");
        ((Field) term2522).setAccessible(true);
        Object enum6 = ((Field) term2522).get((Object) null);
        Class<? extends Object> term2814 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.DanMuExportType");
        Field term2813 = ((Class) term2814).getDeclaredField((String) "SQLITE");
        ((Field) term2813).setAccessible(true);
        Object enum7 = ((Field) term2813).get((Object) null);
        Class<? extends Object> term3134 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.ExportPattern");
        Field term3133 = ((Class) term3134).getDeclaredField((String) "ALL_COLLECT");
        ((Field) term3133).setAccessible(true);
        Object enum8 = ((Field) term3133).get((Object) null);
        term2387 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.builder.DanMuServiceBuilder"));
        setField(term2387, term2387.getClass(), "websiteType", enum6);
        setField(term2387, term2387.getClass(), "danMuExportType", enum7);
        setField(term2387, term2387.getClass(), "danMuExportPattern", enum8);
        setField(term2387, term2387.getClass(), "liveUrl", "EGtDIRbSSb");
        setField(term2387, term2387.getClass(), "saveName", "SzjVpOQTyS");
        setField(term2387, term2387.getClass(), "danMuClientEventManager", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.builder.DanMuServiceBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MjGYSRKTNF";
        callMethod(klass, "saveName", argTypes, term2387, args);
    }

};


