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

public class DanMuServiceBuilder_setDanMuExportType_127008768111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11606;
     Object enum35;

    public DanMuServiceBuilder_setDanMuExportType_127008768111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11742 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.WebsiteType");
        Field term11741 = ((Class) term11742).getDeclaredField((String) "Bil");
        ((Field) term11741).setAccessible(true);
        Object enum32 = ((Field) term11741).get((Object) null);
        Class<? extends Object> term12033 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.DanMuExportType");
        Field term12032 = ((Class) term12033).getDeclaredField((String) "JSON");
        ((Field) term12032).setAccessible(true);
        Object enum33 = ((Field) term12032).get((Object) null);
        Class<? extends Object> term12347 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.ExportPattern");
        Field term12346 = ((Class) term12347).getDeclaredField((String) "DAY_FOLDER");
        ((Field) term12346).setAccessible(true);
        Object enum34 = ((Field) term12346).get((Object) null);
        term11606 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.builder.DanMuServiceBuilder"));
        setField(term11606, term11606.getClass(), "websiteType", enum32);
        setField(term11606, term11606.getClass(), "danMuExportType", enum33);
        setField(term11606, term11606.getClass(), "danMuExportPattern", enum34);
        setField(term11606, term11606.getClass(), "liveUrl", "eZFUvlxvGV");
        setField(term11606, term11606.getClass(), "saveName", "BYqFIqCKAV");
        setField(term11606, term11606.getClass(), "danMuClientEventManager", null);
        Class<? extends Object> term12689 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.DanMuExportType");
        Field term12688 = ((Class) term12689).getDeclaredField((String) "SQLITE");
        ((Field) term12688).setAccessible(true);
        enum35 = ((Field) term12688).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.builder.DanMuServiceBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.cuteluobo.livedanmuarchive.enums.DanMuExportType");
        Object[] args = new Object[1];
        args[0] = enum35;
        callMethod(klass, "setDanMuExportType", argTypes, term11606, args);
    }

};


