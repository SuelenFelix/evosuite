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

public class DanMuServiceBuilder_getDanMuExportPattern_145750388412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13008;

    public DanMuServiceBuilder_getDanMuExportPattern_145750388412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13121 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.WebsiteType");
        Field term13120 = ((Class) term13121).getDeclaredField((String) "Huya");
        ((Field) term13120).setAccessible(true);
        Object enum36 = ((Field) term13120).get((Object) null);
        Class<? extends Object> term13415 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.DanMuExportType");
        Field term13414 = ((Class) term13415).getDeclaredField((String) "JSON");
        ((Field) term13414).setAccessible(true);
        Object enum37 = ((Field) term13414).get((Object) null);
        Class<? extends Object> term13729 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.ExportPattern");
        Field term13728 = ((Class) term13729).getDeclaredField((String) "ALL_COLLECT");
        ((Field) term13728).setAccessible(true);
        Object enum38 = ((Field) term13728).get((Object) null);
        term13008 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.builder.DanMuServiceBuilder"));
        setField(term13008, term13008.getClass(), "websiteType", enum36);
        setField(term13008, term13008.getClass(), "danMuExportType", enum37);
        setField(term13008, term13008.getClass(), "danMuExportPattern", enum38);
        setField(term13008, term13008.getClass(), "liveUrl", "vrQLuWIDJX");
        setField(term13008, term13008.getClass(), "saveName", "flxyYxBRtu");
        setField(term13008, term13008.getClass(), "danMuClientEventManager", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.builder.DanMuServiceBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDanMuExportPattern", argTypes, term13008, args);
    }

};


