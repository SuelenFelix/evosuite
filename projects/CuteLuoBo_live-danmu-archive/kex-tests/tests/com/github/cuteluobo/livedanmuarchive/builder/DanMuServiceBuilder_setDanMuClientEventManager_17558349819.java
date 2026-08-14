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

public class DanMuServiceBuilder_setDanMuClientEventManager_17558349819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20927;

    public DanMuServiceBuilder_setDanMuClientEventManager_17558349819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21045 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.WebsiteType");
        Field term21044 = ((Class) term21045).getDeclaredField((String) "Bil");
        ((Field) term21044).setAccessible(true);
        Object enum58 = ((Field) term21044).get((Object) null);
        Class<? extends Object> term21336 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.DanMuExportType");
        Field term21335 = ((Class) term21336).getDeclaredField((String) "JSON");
        ((Field) term21335).setAccessible(true);
        Object enum59 = ((Field) term21335).get((Object) null);
        Class<? extends Object> term21650 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.ExportPattern");
        Field term21649 = ((Class) term21650).getDeclaredField((String) "DAY_FOLDER");
        ((Field) term21649).setAccessible(true);
        Object enum60 = ((Field) term21649).get((Object) null);
        term20927 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.builder.DanMuServiceBuilder"));
        setField(term20927, term20927.getClass(), "websiteType", enum58);
        setField(term20927, term20927.getClass(), "danMuExportType", enum59);
        setField(term20927, term20927.getClass(), "danMuExportPattern", enum60);
        setField(term20927, term20927.getClass(), "liveUrl", "UlajhuVLaP");
        setField(term20927, term20927.getClass(), "saveName", "gGSMzuGICf");
        setField(term20927, term20927.getClass(), "danMuClientEventManager", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.builder.DanMuServiceBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.cuteluobo.livedanmuarchive.manager.EventManager");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setDanMuClientEventManager", argTypes, term20927, args);
    }

};


