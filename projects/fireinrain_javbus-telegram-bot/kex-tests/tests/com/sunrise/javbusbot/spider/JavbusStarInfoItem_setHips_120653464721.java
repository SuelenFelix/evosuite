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

public class JavbusStarInfoItem_setHips_120653464721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17417;

    public JavbusStarInfoItem_setHips_120653464721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17417 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarInfoItem"));
        setField(term17417, term17417.getClass(), "messageChatId", "PjZoebHrvq");
        setField(term17417, term17417.getClass(), "allFilmNum", "VwpicfUdWr");
        setField(term17417, term17417.getClass(), "hasMagNum", "UDKBkeWilS");
        setField(term17417, term17417.getClass(), "headPhoto", "");
        setField(term17417, term17417.getClass(), "starName", "");
        setField(term17417, term17417.getClass(), "birthday", "");
        setField(term17417, term17417.getClass(), "age", "");
        setField(term17417, term17417.getClass(), "height", "");
        setField(term17417, term17417.getClass(), "cup", "");
        setField(term17417, term17417.getClass(), "chestCircumference", "");
        setField(term17417, term17417.getClass(), "waistline", "");
        setField(term17417, term17417.getClass(), "hips", "");
        setField(term17417, term17417.getClass(), "birthPlace", "");
        setField(term17417, term17417.getClass(), "hobby", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.JavbusStarInfoItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "bNeNAYRdqb";
        callMethod(klass, "setHips", argTypes, term17417, args);
    }

};


