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

public class JavbusStarInfoItem_toPrettyStr_126185653529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18128;

    public JavbusStarInfoItem_toPrettyStr_126185653529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18128 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarInfoItem"));
        setField(term18128, term18128.getClass(), "messageChatId", "bLKLlXYEeh");
        setField(term18128, term18128.getClass(), "allFilmNum", "amltyOnIBK");
        setField(term18128, term18128.getClass(), "hasMagNum", "hjGlJibBAS");
        setField(term18128, term18128.getClass(), "headPhoto", "");
        setField(term18128, term18128.getClass(), "starName", "");
        setField(term18128, term18128.getClass(), "birthday", "");
        setField(term18128, term18128.getClass(), "age", "");
        setField(term18128, term18128.getClass(), "height", "");
        setField(term18128, term18128.getClass(), "cup", "");
        setField(term18128, term18128.getClass(), "chestCircumference", "");
        setField(term18128, term18128.getClass(), "waistline", "");
        setField(term18128, term18128.getClass(), "hips", "");
        setField(term18128, term18128.getClass(), "birthPlace", "");
        setField(term18128, term18128.getClass(), "hobby", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.JavbusStarInfoItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toPrettyStr", argTypes, term18128, args);
    }

};


