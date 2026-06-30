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

public class JavbusStarInfoItem_toString_163036956530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18217;

    public JavbusStarInfoItem_toString_163036956530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18217 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarInfoItem"));
        setField(term18217, term18217.getClass(), "messageChatId", "vinKDMUJMl");
        setField(term18217, term18217.getClass(), "allFilmNum", "MgjVPQNbcu");
        setField(term18217, term18217.getClass(), "hasMagNum", "QNYLGZGxNy");
        setField(term18217, term18217.getClass(), "headPhoto", "");
        setField(term18217, term18217.getClass(), "starName", "");
        setField(term18217, term18217.getClass(), "birthday", "");
        setField(term18217, term18217.getClass(), "age", "");
        setField(term18217, term18217.getClass(), "height", "");
        setField(term18217, term18217.getClass(), "cup", "");
        setField(term18217, term18217.getClass(), "chestCircumference", "");
        setField(term18217, term18217.getClass(), "waistline", "");
        setField(term18217, term18217.getClass(), "hips", "");
        setField(term18217, term18217.getClass(), "birthPlace", "");
        setField(term18217, term18217.getClass(), "hobby", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.JavbusStarInfoItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term18217, args);
    }

};


