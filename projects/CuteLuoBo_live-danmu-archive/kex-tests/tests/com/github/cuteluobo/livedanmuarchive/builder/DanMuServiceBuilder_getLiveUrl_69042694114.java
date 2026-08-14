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

public class DanMuServiceBuilder_getLiveUrl_69042694114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15526;

    public DanMuServiceBuilder_getLiveUrl_69042694114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15650 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.WebsiteType");
        Field term15649 = ((Class) term15650).getDeclaredField((String) "Bil");
        ((Field) term15649).setAccessible(true);
        Object enum43 = ((Field) term15649).get((Object) null);
        Class<? extends Object> term15941 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.DanMuExportType");
        Field term15940 = ((Class) term15941).getDeclaredField((String) "SQLITE");
        ((Field) term15940).setAccessible(true);
        Object enum44 = ((Field) term15940).get((Object) null);
        Class<? extends Object> term16261 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.ExportPattern");
        Field term16260 = ((Class) term16261).getDeclaredField((String) "ALL_COLLECT");
        ((Field) term16260).setAccessible(true);
        Object enum45 = ((Field) term16260).get((Object) null);
        term15526 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.builder.DanMuServiceBuilder"));
        setField(term15526, term15526.getClass(), "websiteType", enum43);
        setField(term15526, term15526.getClass(), "danMuExportType", enum44);
        setField(term15526, term15526.getClass(), "danMuExportPattern", enum45);
        setField(term15526, term15526.getClass(), "liveUrl", "TEParAifyi");
        setField(term15526, term15526.getClass(), "saveName", "OWDIEULEFu");
        setField(term15526, term15526.getClass(), "danMuClientEventManager", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.builder.DanMuServiceBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLiveUrl", argTypes, term15526, args);
    }

};


