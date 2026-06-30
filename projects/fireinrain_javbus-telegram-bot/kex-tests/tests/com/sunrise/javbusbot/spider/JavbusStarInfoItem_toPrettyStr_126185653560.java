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

public class JavbusStarInfoItem_toPrettyStr_126185653560 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18334;

    public JavbusStarInfoItem_toPrettyStr_126185653560() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18334 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarInfoItem"));
        setField(term18334, term18334.getClass(), "messageChatId", null);
        setField(term18334, term18334.getClass(), "allFilmNum", null);
        setField(term18334, term18334.getClass(), "hasMagNum", null);
        setField(term18334, term18334.getClass(), "headPhoto", null);
        setField(term18334, term18334.getClass(), "starName", null);
        setField(term18334, term18334.getClass(), "birthday", null);
        setField(term18334, term18334.getClass(), "age", null);
        setField(term18334, term18334.getClass(), "height", null);
        setField(term18334, term18334.getClass(), "cup", null);
        setField(term18334, term18334.getClass(), "chestCircumference", null);
        setField(term18334, term18334.getClass(), "waistline", null);
        setField(term18334, term18334.getClass(), "hips", null);
        setField(term18334, term18334.getClass(), "birthPlace", null);
        setField(term18334, term18334.getClass(), "hobby", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.JavbusStarInfoItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toPrettyStr", argTypes, term18334, args);
    }

};


