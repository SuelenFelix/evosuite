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

public class DanMuServiceBuilder_getDanMuExportType_11046683110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10531;

    public DanMuServiceBuilder_getDanMuExportType_11046683110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10648 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.WebsiteType");
        Field term10647 = ((Class) term10648).getDeclaredField((String) "Huya");
        ((Field) term10647).setAccessible(true);
        Object enum29 = ((Field) term10647).get((Object) null);
        Class<? extends Object> term10942 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.DanMuExportType");
        Field term10941 = ((Class) term10942).getDeclaredField((String) "SQLITE");
        ((Field) term10941).setAccessible(true);
        Object enum30 = ((Field) term10941).get((Object) null);
        Class<? extends Object> term11262 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.ExportPattern");
        Field term11261 = ((Class) term11262).getDeclaredField((String) "ALL_COLLECT");
        ((Field) term11261).setAccessible(true);
        Object enum31 = ((Field) term11261).get((Object) null);
        term10531 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.builder.DanMuServiceBuilder"));
        setField(term10531, term10531.getClass(), "websiteType", enum29);
        setField(term10531, term10531.getClass(), "danMuExportType", enum30);
        setField(term10531, term10531.getClass(), "danMuExportPattern", enum31);
        setField(term10531, term10531.getClass(), "liveUrl", "RkybSrpybU");
        setField(term10531, term10531.getClass(), "saveName", "xOEqzGAmDU");
        setField(term10531, term10531.getClass(), "danMuClientEventManager", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.builder.DanMuServiceBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDanMuExportType", argTypes, term10531, args);
    }

};


