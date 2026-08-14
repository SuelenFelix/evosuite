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

public class DanMuServiceBuilder_setSaveName_163946081217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18751;

    public DanMuServiceBuilder_setSaveName_163946081217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18880 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.WebsiteType");
        Field term18879 = ((Class) term18880).getDeclaredField((String) "Huya");
        ((Field) term18879).setAccessible(true);
        Object enum52 = ((Field) term18879).get((Object) null);
        Class<? extends Object> term19174 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.DanMuExportType");
        Field term19173 = ((Class) term19174).getDeclaredField((String) "SQLITE");
        ((Field) term19173).setAccessible(true);
        Object enum53 = ((Field) term19173).get((Object) null);
        Class<? extends Object> term19494 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.ExportPattern");
        Field term19493 = ((Class) term19494).getDeclaredField((String) "ALL_COLLECT");
        ((Field) term19493).setAccessible(true);
        Object enum54 = ((Field) term19493).get((Object) null);
        term18751 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.builder.DanMuServiceBuilder"));
        setField(term18751, term18751.getClass(), "websiteType", enum52);
        setField(term18751, term18751.getClass(), "danMuExportType", enum53);
        setField(term18751, term18751.getClass(), "danMuExportPattern", enum54);
        setField(term18751, term18751.getClass(), "liveUrl", "xrwlQZdwCp");
        setField(term18751, term18751.getClass(), "saveName", "IDCWpPLRkE");
        setField(term18751, term18751.getClass(), "danMuClientEventManager", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.builder.DanMuServiceBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "nyiiPDVjAc";
        callMethod(klass, "setSaveName", argTypes, term18751, args);
    }

};


