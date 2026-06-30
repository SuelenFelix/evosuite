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

public class VideoPreviewUtils_MetaDataHelp_find_10107761051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14;

    public VideoPreviewUtils_MetaDataHelp_find_10107761051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14 = newInstance(Class.forName("com.sunrise.javbusbot.spider.VideoPreviewUtils$MetaDataHelp"));
        Object term15 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term16 = (Object[]) newArray("java.lang.String", 3);
        byte[] term36 = (byte[]) newByteArray(5);
        setElement(term16, 0, "moov");
        setElement(term16, 1, "mdia");
        setElement(term16, 2, "trak");
        setField(term15, term15.getClass(), "a", term16);
        setIntField(term15, term15.getClass(), "modCount", 0);
        setField(term14, term14.getClass(), "containers", term15);
        setByteElement(term36, 0, (byte) 47);
        setByteElement(term36, 1, (byte) 48);
        setByteElement(term36, 2, (byte) 89);
        setByteElement(term36, 3, (byte) 75);
        setByteElement(term36, 4, (byte) 18);
        setField(term14, term14.getClass(), "lastTkhd", term36);
        setIntField(term14, term14.getClass(), "metaHeight", 568599855);
        setIntField(term14, term14.getClass(), "metaWidth", 1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.VideoPreviewUtils$MetaDataHelp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.InputStream");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "find", argTypes, term14, args);
    }

};


