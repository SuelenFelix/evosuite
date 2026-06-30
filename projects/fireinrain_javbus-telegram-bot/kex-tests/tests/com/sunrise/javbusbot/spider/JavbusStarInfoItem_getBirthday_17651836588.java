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

public class JavbusStarInfoItem_getBirthday_17651836588 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16128;

    public JavbusStarInfoItem_getBirthday_17651836588() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16128 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarInfoItem"));
        setField(term16128, term16128.getClass(), "messageChatId", "KKHQCvKTvF");
        setField(term16128, term16128.getClass(), "allFilmNum", "XBhNIIxiNP");
        setField(term16128, term16128.getClass(), "hasMagNum", "JljyXnwkuC");
        setField(term16128, term16128.getClass(), "headPhoto", "");
        setField(term16128, term16128.getClass(), "starName", "");
        setField(term16128, term16128.getClass(), "birthday", "");
        setField(term16128, term16128.getClass(), "age", "");
        setField(term16128, term16128.getClass(), "height", "");
        setField(term16128, term16128.getClass(), "cup", "");
        setField(term16128, term16128.getClass(), "chestCircumference", "");
        setField(term16128, term16128.getClass(), "waistline", "");
        setField(term16128, term16128.getClass(), "hips", "");
        setField(term16128, term16128.getClass(), "birthPlace", "");
        setField(term16128, term16128.getClass(), "hobby", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.JavbusStarInfoItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBirthday", argTypes, term16128, args);
    }

};


