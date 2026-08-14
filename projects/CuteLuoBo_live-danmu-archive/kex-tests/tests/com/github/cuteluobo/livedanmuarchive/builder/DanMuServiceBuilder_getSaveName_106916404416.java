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

public class DanMuServiceBuilder_getSaveName_106916404416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17691;

    public DanMuServiceBuilder_getSaveName_106916404416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17802 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.WebsiteType");
        Field term17801 = ((Class) term17802).getDeclaredField((String) "Huya");
        ((Field) term17801).setAccessible(true);
        Object enum49 = ((Field) term17801).get((Object) null);
        Class<? extends Object> term18096 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.DanMuExportType");
        Field term18095 = ((Class) term18096).getDeclaredField((String) "JSON");
        ((Field) term18095).setAccessible(true);
        Object enum50 = ((Field) term18095).get((Object) null);
        Class<? extends Object> term18410 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.ExportPattern");
        Field term18409 = ((Class) term18410).getDeclaredField((String) "DAY_FOLDER");
        ((Field) term18409).setAccessible(true);
        Object enum51 = ((Field) term18409).get((Object) null);
        term17691 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.builder.DanMuServiceBuilder"));
        setField(term17691, term17691.getClass(), "websiteType", enum49);
        setField(term17691, term17691.getClass(), "danMuExportType", enum50);
        setField(term17691, term17691.getClass(), "danMuExportPattern", enum51);
        setField(term17691, term17691.getClass(), "liveUrl", "kuTXqwMtDB");
        setField(term17691, term17691.getClass(), "saveName", "Ghbwtircqb");
        setField(term17691, term17691.getClass(), "danMuClientEventManager", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.builder.DanMuServiceBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSaveName", argTypes, term17691, args);
    }

};


