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

public class VideoPreviewUtils_MetaDataHelp_readUint32_7517612992 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61;
     Object term90;
     Object term94;

    public VideoPreviewUtils_MetaDataHelp_readUint32_7517612992() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61 = newInstance(Class.forName("com.sunrise.javbusbot.spider.VideoPreviewUtils$MetaDataHelp"));
        Object term62 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term63 = (Object[]) newArray("java.lang.String", 3);
        byte[] term83 = (byte[]) newByteArray(4);
        setElement(term63, 0, "moov");
        setElement(term63, 1, "mdia");
        setElement(term63, 2, "trak");
        setField(term62, term62.getClass(), "a", term63);
        setIntField(term62, term62.getClass(), "modCount", 0);
        setField(term61, term61.getClass(), "containers", term62);
        setByteElement(term83, 0, (byte) -58);
        setByteElement(term83, 1, (byte) -29);
        setByteElement(term83, 2, (byte) -54);
        setByteElement(term83, 3, (byte) -10);
        setField(term61, term61.getClass(), "lastTkhd", term83);
        setIntField(term61, term61.getClass(), "metaHeight", 1484323161);
        setIntField(term61, term61.getClass(), "metaWidth", 391863371);
        term90 = (byte[]) newByteArray(3);
        setByteElement(term90, 0, (byte) 79);
        setByteElement(term90, 1, (byte) -119);
        setByteElement(term90, 2, (byte) -66);
        term94 = new Integer(-1922583790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.VideoPreviewUtils$MetaDataHelp");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term90;
        args[1] = term94;
        callMethod(klass, "readUint32", argTypes, term61, args);
    }

};


