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

public class JavbusStarInfoItem_setAllFilmNum_10577799743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15617;

    public JavbusStarInfoItem_setAllFilmNum_10577799743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15617 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarInfoItem"));
        setField(term15617, term15617.getClass(), "messageChatId", "kdYeXJnJGG");
        setField(term15617, term15617.getClass(), "allFilmNum", "XEdoshuvxD");
        setField(term15617, term15617.getClass(), "hasMagNum", "ljtopXMcRl");
        setField(term15617, term15617.getClass(), "headPhoto", "");
        setField(term15617, term15617.getClass(), "starName", "");
        setField(term15617, term15617.getClass(), "birthday", "");
        setField(term15617, term15617.getClass(), "age", "");
        setField(term15617, term15617.getClass(), "height", "");
        setField(term15617, term15617.getClass(), "cup", "");
        setField(term15617, term15617.getClass(), "chestCircumference", "");
        setField(term15617, term15617.getClass(), "waistline", "");
        setField(term15617, term15617.getClass(), "hips", "");
        setField(term15617, term15617.getClass(), "birthPlace", "");
        setField(term15617, term15617.getClass(), "hobby", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.JavbusStarInfoItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HHtcAGkfuz";
        callMethod(klass, "setAllFilmNum", argTypes, term15617, args);
    }

};


