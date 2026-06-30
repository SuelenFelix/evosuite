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

public class JavbusStarInfoItem_setHeight_36486062813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16617;

    public JavbusStarInfoItem_setHeight_36486062813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16617 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarInfoItem"));
        setField(term16617, term16617.getClass(), "messageChatId", "QybezBkmJu");
        setField(term16617, term16617.getClass(), "allFilmNum", "uWIrREgpjs");
        setField(term16617, term16617.getClass(), "hasMagNum", "TmEdDFXkTZ");
        setField(term16617, term16617.getClass(), "headPhoto", "");
        setField(term16617, term16617.getClass(), "starName", "");
        setField(term16617, term16617.getClass(), "birthday", "");
        setField(term16617, term16617.getClass(), "age", "");
        setField(term16617, term16617.getClass(), "height", "");
        setField(term16617, term16617.getClass(), "cup", "");
        setField(term16617, term16617.getClass(), "chestCircumference", "");
        setField(term16617, term16617.getClass(), "waistline", "");
        setField(term16617, term16617.getClass(), "hips", "");
        setField(term16617, term16617.getClass(), "birthPlace", "");
        setField(term16617, term16617.getClass(), "hobby", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.JavbusStarInfoItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DjjdYbIhNY";
        callMethod(klass, "setHeight", argTypes, term16617, args);
    }

};


