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

public class DanMuServiceBuilder_getWebsiteType_10670372918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8078;

    public DanMuServiceBuilder_getWebsiteType_10670372918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8195 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.WebsiteType");
        Field term8194 = ((Class) term8195).getDeclaredField((String) "Huya");
        ((Field) term8194).setAccessible(true);
        Object enum22 = ((Field) term8194).get((Object) null);
        Class<? extends Object> term8489 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.DanMuExportType");
        Field term8488 = ((Class) term8489).getDeclaredField((String) "SQLITE");
        ((Field) term8488).setAccessible(true);
        Object enum23 = ((Field) term8488).get((Object) null);
        Class<? extends Object> term8809 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.ExportPattern");
        Field term8808 = ((Class) term8809).getDeclaredField((String) "ALL_COLLECT");
        ((Field) term8808).setAccessible(true);
        Object enum24 = ((Field) term8808).get((Object) null);
        term8078 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.builder.DanMuServiceBuilder"));
        setField(term8078, term8078.getClass(), "websiteType", enum22);
        setField(term8078, term8078.getClass(), "danMuExportType", enum23);
        setField(term8078, term8078.getClass(), "danMuExportPattern", enum24);
        setField(term8078, term8078.getClass(), "liveUrl", "tbcdzjIfER");
        setField(term8078, term8078.getClass(), "saveName", "HyxfbSQYBe");
        setField(term8078, term8078.getClass(), "danMuClientEventManager", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.builder.DanMuServiceBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWebsiteType", argTypes, term8078, args);
    }

};


