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

public class DanMuServiceBuilder_setWebsiteType_9504547219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9153;
     Object enum28;

    public DanMuServiceBuilder_setWebsiteType_9504547219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9291 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.WebsiteType");
        Field term9290 = ((Class) term9291).getDeclaredField((String) "Huya");
        ((Field) term9290).setAccessible(true);
        Object enum25 = ((Field) term9290).get((Object) null);
        Class<? extends Object> term9585 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.DanMuExportType");
        Field term9584 = ((Class) term9585).getDeclaredField((String) "JSON");
        ((Field) term9584).setAccessible(true);
        Object enum26 = ((Field) term9584).get((Object) null);
        Class<? extends Object> term9899 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.ExportPattern");
        Field term9898 = ((Class) term9899).getDeclaredField((String) "DAY_FOLDER");
        ((Field) term9898).setAccessible(true);
        Object enum27 = ((Field) term9898).get((Object) null);
        term9153 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.builder.DanMuServiceBuilder"));
        setField(term9153, term9153.getClass(), "websiteType", enum25);
        setField(term9153, term9153.getClass(), "danMuExportType", enum26);
        setField(term9153, term9153.getClass(), "danMuExportPattern", enum27);
        setField(term9153, term9153.getClass(), "liveUrl", "pCTimMblYc");
        setField(term9153, term9153.getClass(), "saveName", "hNxWaHcfhY");
        setField(term9153, term9153.getClass(), "danMuClientEventManager", null);
        Class<? extends Object> term10241 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.WebsiteType");
        Field term10240 = ((Class) term10241).getDeclaredField((String) "Bil");
        ((Field) term10240).setAccessible(true);
        enum28 = ((Field) term10240).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.builder.DanMuServiceBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.cuteluobo.livedanmuarchive.enums.WebsiteType");
        Object[] args = new Object[1];
        args[0] = enum28;
        callMethod(klass, "setWebsiteType", argTypes, term9153, args);
    }

};


