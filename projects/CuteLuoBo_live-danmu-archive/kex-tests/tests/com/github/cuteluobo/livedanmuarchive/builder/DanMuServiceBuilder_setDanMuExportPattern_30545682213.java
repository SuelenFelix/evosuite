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

public class DanMuServiceBuilder_setDanMuExportPattern_30545682213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14073;
     Object enum42;

    public DanMuServiceBuilder_setDanMuExportPattern_30545682213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14243 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.WebsiteType");
        Field term14242 = ((Class) term14243).getDeclaredField((String) "Douyu");
        ((Field) term14242).setAccessible(true);
        Object enum39 = ((Field) term14242).get((Object) null);
        Class<? extends Object> term14540 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.DanMuExportType");
        Field term14539 = ((Class) term14540).getDeclaredField((String) "SQLITE");
        ((Field) term14539).setAccessible(true);
        Object enum40 = ((Field) term14539).get((Object) null);
        Class<? extends Object> term14860 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.ExportPattern");
        Field term14859 = ((Class) term14860).getDeclaredField((String) "DAY_FOLDER");
        ((Field) term14859).setAccessible(true);
        Object enum41 = ((Field) term14859).get((Object) null);
        term14073 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.builder.DanMuServiceBuilder"));
        setField(term14073, term14073.getClass(), "websiteType", enum39);
        setField(term14073, term14073.getClass(), "danMuExportType", enum40);
        setField(term14073, term14073.getClass(), "danMuExportPattern", enum41);
        setField(term14073, term14073.getClass(), "liveUrl", "OclPbYPkcH");
        setField(term14073, term14073.getClass(), "saveName", "IoAlmYsBwc");
        setField(term14073, term14073.getClass(), "danMuClientEventManager", null);
        Class<? extends Object> term15202 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.ExportPattern");
        Field term15201 = ((Class) term15202).getDeclaredField((String) "ALL_COLLECT");
        ((Field) term15201).setAccessible(true);
        enum42 = ((Field) term15201).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.builder.DanMuServiceBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.cuteluobo.livedanmuarchive.enums.ExportPattern");
        Object[] args = new Object[1];
        args[0] = enum42;
        callMethod(klass, "setDanMuExportPattern", argTypes, term14073, args);
    }

};


