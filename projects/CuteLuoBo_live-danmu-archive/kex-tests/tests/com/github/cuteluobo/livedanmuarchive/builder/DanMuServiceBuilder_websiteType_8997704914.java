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

public class DanMuServiceBuilder_websiteType_8997704914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3488;
     Object enum12;

    public DanMuServiceBuilder_websiteType_8997704914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3621 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.WebsiteType");
        Field term3620 = ((Class) term3621).getDeclaredField((String) "Douyu");
        ((Field) term3620).setAccessible(true);
        Object enum9 = ((Field) term3620).get((Object) null);
        Class<? extends Object> term3918 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.DanMuExportType");
        Field term3917 = ((Class) term3918).getDeclaredField((String) "JSON");
        ((Field) term3917).setAccessible(true);
        Object enum10 = ((Field) term3917).get((Object) null);
        Class<? extends Object> term4232 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.ExportPattern");
        Field term4231 = ((Class) term4232).getDeclaredField((String) "DAY_FOLDER");
        ((Field) term4231).setAccessible(true);
        Object enum11 = ((Field) term4231).get((Object) null);
        term3488 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.builder.DanMuServiceBuilder"));
        setField(term3488, term3488.getClass(), "websiteType", enum9);
        setField(term3488, term3488.getClass(), "danMuExportType", enum10);
        setField(term3488, term3488.getClass(), "danMuExportPattern", enum11);
        setField(term3488, term3488.getClass(), "liveUrl", "hRNSzYYIrc");
        setField(term3488, term3488.getClass(), "saveName", "RMFIsYGgne");
        setField(term3488, term3488.getClass(), "danMuClientEventManager", null);
        Class<? extends Object> term4574 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.WebsiteType");
        Field term4573 = ((Class) term4574).getDeclaredField((String) "Huya");
        ((Field) term4573).setAccessible(true);
        enum12 = ((Field) term4573).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.builder.DanMuServiceBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.cuteluobo.livedanmuarchive.enums.WebsiteType");
        Object[] args = new Object[1];
        args[0] = enum12;
        callMethod(klass, "websiteType", argTypes, term3488, args);
    }

};


