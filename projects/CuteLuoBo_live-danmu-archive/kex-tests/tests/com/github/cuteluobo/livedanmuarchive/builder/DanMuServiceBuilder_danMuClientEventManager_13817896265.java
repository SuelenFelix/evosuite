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

public class DanMuServiceBuilder_danMuClientEventManager_13817896265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4867;

    public DanMuServiceBuilder_danMuClientEventManager_13817896265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4985 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.WebsiteType");
        Field term4984 = ((Class) term4985).getDeclaredField((String) "Bil");
        ((Field) term4984).setAccessible(true);
        Object enum13 = ((Field) term4984).get((Object) null);
        Class<? extends Object> term5276 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.DanMuExportType");
        Field term5275 = ((Class) term5276).getDeclaredField((String) "JSON");
        ((Field) term5275).setAccessible(true);
        Object enum14 = ((Field) term5275).get((Object) null);
        Class<? extends Object> term5590 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.ExportPattern");
        Field term5589 = ((Class) term5590).getDeclaredField((String) "DAY_FOLDER");
        ((Field) term5589).setAccessible(true);
        Object enum15 = ((Field) term5589).get((Object) null);
        term4867 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.builder.DanMuServiceBuilder"));
        setField(term4867, term4867.getClass(), "websiteType", enum13);
        setField(term4867, term4867.getClass(), "danMuExportType", enum14);
        setField(term4867, term4867.getClass(), "danMuExportPattern", enum15);
        setField(term4867, term4867.getClass(), "liveUrl", "NRdvgJlhkX");
        setField(term4867, term4867.getClass(), "saveName", "uuaPigETmJ");
        setField(term4867, term4867.getClass(), "danMuClientEventManager", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.builder.DanMuServiceBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.cuteluobo.livedanmuarchive.manager.EventManager");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "danMuClientEventManager", argTypes, term4867, args);
    }

};


