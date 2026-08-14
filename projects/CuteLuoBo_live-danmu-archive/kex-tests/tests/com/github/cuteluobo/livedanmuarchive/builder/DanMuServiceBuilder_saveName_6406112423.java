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

public class DanMuServiceBuilder_saveName_6406112423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21993;

    public DanMuServiceBuilder_saveName_6406112423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21993 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.builder.DanMuServiceBuilder"));
        setField(term21993, term21993.getClass(), "websiteType", null);
        setField(term21993, term21993.getClass(), "danMuExportType", null);
        setField(term21993, term21993.getClass(), "danMuExportPattern", null);
        setField(term21993, term21993.getClass(), "liveUrl", null);
        setField(term21993, term21993.getClass(), "saveName", null);
        setField(term21993, term21993.getClass(), "danMuClientEventManager", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.builder.DanMuServiceBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "saveName", argTypes, term21993, args);
    }

};


