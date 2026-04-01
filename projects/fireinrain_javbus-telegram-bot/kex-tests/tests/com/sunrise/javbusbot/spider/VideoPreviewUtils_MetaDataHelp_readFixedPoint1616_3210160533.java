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
import java.lang.Object;
import java.lang.Integer;

public class VideoPreviewUtils_MetaDataHelp_readFixedPoint1616_3210160533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115;
     Object term144;
     Object term146;

    public VideoPreviewUtils_MetaDataHelp_readFixedPoint1616_3210160533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115 = newInstance(Class.forName("com.sunrise.javbusbot.spider.VideoPreviewUtils$MetaDataHelp"));
        Object term116 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term117 = (Object[]) newArray("java.lang.String", 3);
        byte[] term137 = (byte[]) newByteArray(4);
        setElement(term117, 0, "moov");
        setElement(term117, 1, "mdia");
        setElement(term117, 2, "trak");
        setField(term116, term116.getClass(), "a", term117);
        setIntField(term116, term116.getClass(), "modCount", 0);
        setField(term115, term115.getClass(), "containers", term116);
        setByteElement(term137, 0, (byte) 83);
        setByteElement(term137, 1, (byte) 74);
        setByteElement(term137, 2, (byte) -71);
        setByteElement(term137, 3, (byte) 49);
        setField(term115, term115.getClass(), "lastTkhd", term137);
        setIntField(term115, term115.getClass(), "metaHeight", -616727354);
        setIntField(term115, term115.getClass(), "metaWidth", -1955890973);
        term144 = (byte[]) newByteArray(1);
        setByteElement(term144, 0, (byte) -54);
        term146 = new Integer(-2038273078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.VideoPreviewUtils$MetaDataHelp");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term144;
        args[1] = term146;
        callMethod(klass, "readFixedPoint1616", argTypes, term115, args);
    }

};


