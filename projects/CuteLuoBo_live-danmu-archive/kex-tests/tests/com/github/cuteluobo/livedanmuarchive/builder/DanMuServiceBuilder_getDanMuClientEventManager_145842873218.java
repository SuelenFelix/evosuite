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

public class DanMuServiceBuilder_getDanMuClientEventManager_145842873218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19848;

    public DanMuServiceBuilder_getDanMuClientEventManager_145842873218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19972 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.WebsiteType");
        Field term19971 = ((Class) term19972).getDeclaredField((String) "Bil");
        ((Field) term19971).setAccessible(true);
        Object enum55 = ((Field) term19971).get((Object) null);
        Class<? extends Object> term20263 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.DanMuExportType");
        Field term20262 = ((Class) term20263).getDeclaredField((String) "SQLITE");
        ((Field) term20262).setAccessible(true);
        Object enum56 = ((Field) term20262).get((Object) null);
        Class<? extends Object> term20583 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.ExportPattern");
        Field term20582 = ((Class) term20583).getDeclaredField((String) "ALL_COLLECT");
        ((Field) term20582).setAccessible(true);
        Object enum57 = ((Field) term20582).get((Object) null);
        term19848 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.builder.DanMuServiceBuilder"));
        setField(term19848, term19848.getClass(), "websiteType", enum55);
        setField(term19848, term19848.getClass(), "danMuExportType", enum56);
        setField(term19848, term19848.getClass(), "danMuExportPattern", enum57);
        setField(term19848, term19848.getClass(), "liveUrl", "aKnKipADSo");
        setField(term19848, term19848.getClass(), "saveName", "wSQxaModmm");
        setField(term19848, term19848.getClass(), "danMuClientEventManager", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.builder.DanMuServiceBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDanMuClientEventManager", argTypes, term19848, args);
    }

};


