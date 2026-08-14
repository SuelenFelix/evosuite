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

public class DanMuServiceBuilder_checkLiveWebsiteType_191090115526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21996;

    public DanMuServiceBuilder_checkLiveWebsiteType_191090115526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21996 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.builder.DanMuServiceBuilder"));
        setField(term21996, term21996.getClass(), "websiteType", null);
        setField(term21996, term21996.getClass(), "danMuExportType", null);
        setField(term21996, term21996.getClass(), "danMuExportPattern", null);
        setField(term21996, term21996.getClass(), "liveUrl", null);
        setField(term21996, term21996.getClass(), "saveName", null);
        setField(term21996, term21996.getClass(), "danMuClientEventManager", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.builder.DanMuServiceBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "checkLiveWebsiteType", argTypes, term21996, args);
    }

};


