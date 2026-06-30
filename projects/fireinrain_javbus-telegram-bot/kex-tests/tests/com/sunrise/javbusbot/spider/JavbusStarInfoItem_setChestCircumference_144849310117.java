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

public class JavbusStarInfoItem_setChestCircumference_144849310117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17017;

    public JavbusStarInfoItem_setChestCircumference_144849310117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17017 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarInfoItem"));
        setField(term17017, term17017.getClass(), "messageChatId", "ZwcevQDgzv");
        setField(term17017, term17017.getClass(), "allFilmNum", "rzkENrHYBI");
        setField(term17017, term17017.getClass(), "hasMagNum", "ylJjmNVzzt");
        setField(term17017, term17017.getClass(), "headPhoto", "");
        setField(term17017, term17017.getClass(), "starName", "");
        setField(term17017, term17017.getClass(), "birthday", "");
        setField(term17017, term17017.getClass(), "age", "");
        setField(term17017, term17017.getClass(), "height", "");
        setField(term17017, term17017.getClass(), "cup", "");
        setField(term17017, term17017.getClass(), "chestCircumference", "");
        setField(term17017, term17017.getClass(), "waistline", "");
        setField(term17017, term17017.getClass(), "hips", "");
        setField(term17017, term17017.getClass(), "birthPlace", "");
        setField(term17017, term17017.getClass(), "hobby", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.JavbusStarInfoItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "nwKTRDmHWk";
        callMethod(klass, "setChestCircumference", argTypes, term17017, args);
    }

};


