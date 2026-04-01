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

public class JavbusStarInfoItem_getAge_145673497610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16328;

    public JavbusStarInfoItem_getAge_145673497610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16328 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarInfoItem"));
        setField(term16328, term16328.getClass(), "messageChatId", "JraVClZLWB");
        setField(term16328, term16328.getClass(), "allFilmNum", "PxscjEhxGk");
        setField(term16328, term16328.getClass(), "hasMagNum", "ePFnljQSHU");
        setField(term16328, term16328.getClass(), "headPhoto", "");
        setField(term16328, term16328.getClass(), "starName", "");
        setField(term16328, term16328.getClass(), "birthday", "");
        setField(term16328, term16328.getClass(), "age", "");
        setField(term16328, term16328.getClass(), "height", "");
        setField(term16328, term16328.getClass(), "cup", "");
        setField(term16328, term16328.getClass(), "chestCircumference", "");
        setField(term16328, term16328.getClass(), "waistline", "");
        setField(term16328, term16328.getClass(), "hips", "");
        setField(term16328, term16328.getClass(), "birthPlace", "");
        setField(term16328, term16328.getClass(), "hobby", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.JavbusStarInfoItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAge", argTypes, term16328, args);
    }

};


