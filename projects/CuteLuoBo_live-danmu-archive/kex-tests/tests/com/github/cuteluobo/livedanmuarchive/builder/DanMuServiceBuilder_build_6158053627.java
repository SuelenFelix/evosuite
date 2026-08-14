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

public class DanMuServiceBuilder_build_6158053627 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7018;

    public DanMuServiceBuilder_build_6158053627() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7129 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.WebsiteType");
        Field term7128 = ((Class) term7129).getDeclaredField((String) "Huya");
        ((Field) term7128).setAccessible(true);
        Object enum19 = ((Field) term7128).get((Object) null);
        Class<? extends Object> term7423 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.DanMuExportType");
        Field term7422 = ((Class) term7423).getDeclaredField((String) "JSON");
        ((Field) term7422).setAccessible(true);
        Object enum20 = ((Field) term7422).get((Object) null);
        Class<? extends Object> term7737 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.ExportPattern");
        Field term7736 = ((Class) term7737).getDeclaredField((String) "DAY_FOLDER");
        ((Field) term7736).setAccessible(true);
        Object enum21 = ((Field) term7736).get((Object) null);
        term7018 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.builder.DanMuServiceBuilder"));
        setField(term7018, term7018.getClass(), "websiteType", enum19);
        setField(term7018, term7018.getClass(), "danMuExportType", enum20);
        setField(term7018, term7018.getClass(), "danMuExportPattern", enum21);
        setField(term7018, term7018.getClass(), "liveUrl", "aJlieCFVtF");
        setField(term7018, term7018.getClass(), "saveName", "ZiaGIbnzTs");
        setField(term7018, term7018.getClass(), "danMuClientEventManager", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.builder.DanMuServiceBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term7018, args);
    }

};


