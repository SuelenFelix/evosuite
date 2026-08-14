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

public class DanMuServiceBuilder_danMuExportPattern_20775887982 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1307;
     Object enum5;

    public DanMuServiceBuilder_danMuExportPattern_20775887982() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1426 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.WebsiteType");
        Field term1425 = ((Class) term1426).getDeclaredField((String) "Douyu");
        ((Field) term1425).setAccessible(true);
        Object enum3 = ((Field) term1425).get((Object) null);
        Class<? extends Object> term1723 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.DanMuExportType");
        Field term1722 = ((Class) term1723).getDeclaredField((String) "SQLITE");
        ((Field) term1722).setAccessible(true);
        Object enum4 = ((Field) term1722).get((Object) null);
        Class<? extends Object> term2043 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.ExportPattern");
        Field term2042 = ((Class) term2043).getDeclaredField((String) "ALL_COLLECT");
        ((Field) term2042).setAccessible(true);
        enum5 = ((Field) term2042).get((Object) null);
        term1307 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.builder.DanMuServiceBuilder"));
        setField(term1307, term1307.getClass(), "websiteType", enum3);
        setField(term1307, term1307.getClass(), "danMuExportType", enum4);
        setField(term1307, term1307.getClass(), "danMuExportPattern", enum5);
        setField(term1307, term1307.getClass(), "liveUrl", "xxtlPwDYFs");
        setField(term1307, term1307.getClass(), "saveName", "jJCZpVmanW");
        setField(term1307, term1307.getClass(), "danMuClientEventManager", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.builder.DanMuServiceBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.cuteluobo.livedanmuarchive.enums.ExportPattern");
        Object[] args = new Object[1];
        args[0] = enum5;
        callMethod(klass, "danMuExportPattern", argTypes, term1307, args);
    }

};


