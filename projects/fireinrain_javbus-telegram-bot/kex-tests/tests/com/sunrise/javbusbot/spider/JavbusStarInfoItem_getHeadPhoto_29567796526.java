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

public class JavbusStarInfoItem_getHeadPhoto_29567796526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17928;

    public JavbusStarInfoItem_getHeadPhoto_29567796526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17928 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarInfoItem"));
        setField(term17928, term17928.getClass(), "messageChatId", "nDzlNeexNi");
        setField(term17928, term17928.getClass(), "allFilmNum", "XhILAYdtGS");
        setField(term17928, term17928.getClass(), "hasMagNum", "ZRWORAfStn");
        setField(term17928, term17928.getClass(), "headPhoto", "");
        setField(term17928, term17928.getClass(), "starName", "");
        setField(term17928, term17928.getClass(), "birthday", "");
        setField(term17928, term17928.getClass(), "age", "");
        setField(term17928, term17928.getClass(), "height", "");
        setField(term17928, term17928.getClass(), "cup", "");
        setField(term17928, term17928.getClass(), "chestCircumference", "");
        setField(term17928, term17928.getClass(), "waistline", "");
        setField(term17928, term17928.getClass(), "hips", "");
        setField(term17928, term17928.getClass(), "birthPlace", "");
        setField(term17928, term17928.getClass(), "hobby", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.JavbusStarInfoItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHeadPhoto", argTypes, term17928, args);
    }

};


