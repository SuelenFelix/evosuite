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

public class DanMuServiceBuilder_checkLiveWebsiteType_19109011556 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5931;

    public DanMuServiceBuilder_checkLiveWebsiteType_19109011556() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6056 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.WebsiteType");
        Field term6055 = ((Class) term6056).getDeclaredField((String) "Douyu");
        ((Field) term6055).setAccessible(true);
        Object enum16 = ((Field) term6055).get((Object) null);
        Class<? extends Object> term6353 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.DanMuExportType");
        Field term6352 = ((Class) term6353).getDeclaredField((String) "JSON");
        ((Field) term6352).setAccessible(true);
        Object enum17 = ((Field) term6352).get((Object) null);
        Class<? extends Object> term6667 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.ExportPattern");
        Field term6666 = ((Class) term6667).getDeclaredField((String) "DAY_FOLDER");
        ((Field) term6666).setAccessible(true);
        Object enum18 = ((Field) term6666).get((Object) null);
        term5931 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.builder.DanMuServiceBuilder"));
        setField(term5931, term5931.getClass(), "websiteType", enum16);
        setField(term5931, term5931.getClass(), "danMuExportType", enum17);
        setField(term5931, term5931.getClass(), "danMuExportPattern", enum18);
        setField(term5931, term5931.getClass(), "liveUrl", "MxlszYVzRf");
        setField(term5931, term5931.getClass(), "saveName", "LQFpaHEwXR");
        setField(term5931, term5931.getClass(), "danMuClientEventManager", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.builder.DanMuServiceBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "oVcInYnLWB";
        callMethod(klass, "checkLiveWebsiteType", argTypes, term5931, args);
    }

};


