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

public class JavbusStarInfoItem_setBirthday_1788412189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16217;

    public JavbusStarInfoItem_setBirthday_1788412189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16217 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarInfoItem"));
        setField(term16217, term16217.getClass(), "messageChatId", "XLOxkLyvMY");
        setField(term16217, term16217.getClass(), "allFilmNum", "pjUyKHjjKH");
        setField(term16217, term16217.getClass(), "hasMagNum", "JApuaiAykc");
        setField(term16217, term16217.getClass(), "headPhoto", "");
        setField(term16217, term16217.getClass(), "starName", "");
        setField(term16217, term16217.getClass(), "birthday", "");
        setField(term16217, term16217.getClass(), "age", "");
        setField(term16217, term16217.getClass(), "height", "");
        setField(term16217, term16217.getClass(), "cup", "");
        setField(term16217, term16217.getClass(), "chestCircumference", "");
        setField(term16217, term16217.getClass(), "waistline", "");
        setField(term16217, term16217.getClass(), "hips", "");
        setField(term16217, term16217.getClass(), "birthPlace", "");
        setField(term16217, term16217.getClass(), "hobby", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.JavbusStarInfoItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "NJWFosJfXl";
        callMethod(klass, "setBirthday", argTypes, term16217, args);
    }

};


