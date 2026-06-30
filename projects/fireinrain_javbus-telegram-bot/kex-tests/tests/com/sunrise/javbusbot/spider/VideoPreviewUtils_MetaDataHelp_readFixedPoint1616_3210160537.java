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

public class VideoPreviewUtils_MetaDataHelp_readFixedPoint1616_3210160537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173;
     Object term176;

    public VideoPreviewUtils_MetaDataHelp_readFixedPoint1616_3210160537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173 = newInstance(Class.forName("com.sunrise.javbusbot.spider.VideoPreviewUtils$MetaDataHelp"));
        setField(term173, term173.getClass(), "containers", null);
        setField(term173, term173.getClass(), "lastTkhd", null);
        setIntField(term173, term173.getClass(), "metaHeight", 0);
        setIntField(term173, term173.getClass(), "metaWidth", 0);
        term176 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.VideoPreviewUtils$MetaDataHelp");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term176;
        callMethod(klass, "readFixedPoint1616", argTypes, term173, args);
    }

};


