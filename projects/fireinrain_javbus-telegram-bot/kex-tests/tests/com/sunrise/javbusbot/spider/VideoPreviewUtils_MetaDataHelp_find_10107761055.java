package com.sunrise.javbusbot.spider;

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
import static com.sunrise.javbusbot.spider.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class VideoPreviewUtils_MetaDataHelp_find_10107761055 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165;

    public VideoPreviewUtils_MetaDataHelp_find_10107761055() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term165 = newInstance(Class.forName("com.sunrise.javbusbot.spider.VideoPreviewUtils$MetaDataHelp"));
        setField(term165, term165.getClass(), "containers", null);
        setField(term165, term165.getClass(), "lastTkhd", null);
        setIntField(term165, term165.getClass(), "metaHeight", 0);
        setIntField(term165, term165.getClass(), "metaWidth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.VideoPreviewUtils$MetaDataHelp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.InputStream");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "find", argTypes, term165, args);
    }

};


