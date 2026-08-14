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

public class DanMuServiceBuilder_danMuExportType_11408346191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;
     Object enum1;

    public DanMuServiceBuilder_danMuExportType_11408346191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term216 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.WebsiteType");
        Field term215 = ((Class) term216).getDeclaredField((String) "Bil");
        ((Field) term215).setAccessible(true);
        Object enum0 = ((Field) term215).get((Object) null);
        Class<? extends Object> term539 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.DanMuExportType");
        Field term538 = ((Class) term539).getDeclaredField((String) "SQLITE");
        ((Field) term538).setAccessible(true);
        enum1 = ((Field) term538).get((Object) null);
        Class<? extends Object> term963 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.ExportPattern");
        Field term962 = ((Class) term963).getDeclaredField((String) "ALL_COLLECT");
        ((Field) term962).setAccessible(true);
        Object enum2 = ((Field) term962).get((Object) null);
        term23 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.builder.DanMuServiceBuilder"));
        setField(term23, term23.getClass(), "websiteType", enum0);
        setField(term23, term23.getClass(), "danMuExportType", enum1);
        setField(term23, term23.getClass(), "danMuExportPattern", enum2);
        setField(term23, term23.getClass(), "liveUrl", "sjlJAEtRrb");
        setField(term23, term23.getClass(), "saveName", "MuLcgQHgqz");
        setField(term23, term23.getClass(), "danMuClientEventManager", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.builder.DanMuServiceBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.cuteluobo.livedanmuarchive.enums.DanMuExportType");
        Object[] args = new Object[1];
        args[0] = enum1;
        callMethod(klass, "danMuExportType", argTypes, term23, args);
    }

};


