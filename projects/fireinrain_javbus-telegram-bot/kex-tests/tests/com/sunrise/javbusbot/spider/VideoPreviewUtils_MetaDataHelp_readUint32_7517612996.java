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
import java.lang.Integer;

public class VideoPreviewUtils_MetaDataHelp_readUint32_7517612996 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168;
     Object term171;

    public VideoPreviewUtils_MetaDataHelp_readUint32_7517612996() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term168 = newInstance(Class.forName("com.sunrise.javbusbot.spider.VideoPreviewUtils$MetaDataHelp"));
        setField(term168, term168.getClass(), "containers", null);
        setField(term168, term168.getClass(), "lastTkhd", null);
        setIntField(term168, term168.getClass(), "metaHeight", 0);
        setIntField(term168, term168.getClass(), "metaWidth", 0);
        term171 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.VideoPreviewUtils$MetaDataHelp");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term171;
        callMethod(klass, "readUint32", argTypes, term168, args);
    }

};


