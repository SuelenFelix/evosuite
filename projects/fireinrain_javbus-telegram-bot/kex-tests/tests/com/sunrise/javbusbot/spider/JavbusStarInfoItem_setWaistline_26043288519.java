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

public class JavbusStarInfoItem_setWaistline_26043288519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17217;

    public JavbusStarInfoItem_setWaistline_26043288519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17217 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarInfoItem"));
        setField(term17217, term17217.getClass(), "messageChatId", "csnhUIxUaP");
        setField(term17217, term17217.getClass(), "allFilmNum", "fmWYICGnwt");
        setField(term17217, term17217.getClass(), "hasMagNum", "FlZbOFNISk");
        setField(term17217, term17217.getClass(), "headPhoto", "");
        setField(term17217, term17217.getClass(), "starName", "");
        setField(term17217, term17217.getClass(), "birthday", "");
        setField(term17217, term17217.getClass(), "age", "");
        setField(term17217, term17217.getClass(), "height", "");
        setField(term17217, term17217.getClass(), "cup", "");
        setField(term17217, term17217.getClass(), "chestCircumference", "");
        setField(term17217, term17217.getClass(), "waistline", "");
        setField(term17217, term17217.getClass(), "hips", "");
        setField(term17217, term17217.getClass(), "birthPlace", "");
        setField(term17217, term17217.getClass(), "hobby", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.JavbusStarInfoItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "zDtePZrZQH";
        callMethod(klass, "setWaistline", argTypes, term17217, args);
    }

};


