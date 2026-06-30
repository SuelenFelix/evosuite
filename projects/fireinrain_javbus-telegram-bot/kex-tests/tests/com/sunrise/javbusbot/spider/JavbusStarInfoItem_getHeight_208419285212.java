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

public class JavbusStarInfoItem_getHeight_208419285212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16528;

    public JavbusStarInfoItem_getHeight_208419285212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16528 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarInfoItem"));
        setField(term16528, term16528.getClass(), "messageChatId", "IWCccrYFQd");
        setField(term16528, term16528.getClass(), "allFilmNum", "zpkdYKWkCa");
        setField(term16528, term16528.getClass(), "hasMagNum", "mvOJAtEcWR");
        setField(term16528, term16528.getClass(), "headPhoto", "");
        setField(term16528, term16528.getClass(), "starName", "");
        setField(term16528, term16528.getClass(), "birthday", "");
        setField(term16528, term16528.getClass(), "age", "");
        setField(term16528, term16528.getClass(), "height", "");
        setField(term16528, term16528.getClass(), "cup", "");
        setField(term16528, term16528.getClass(), "chestCircumference", "");
        setField(term16528, term16528.getClass(), "waistline", "");
        setField(term16528, term16528.getClass(), "hips", "");
        setField(term16528, term16528.getClass(), "birthPlace", "");
        setField(term16528, term16528.getClass(), "hobby", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.JavbusStarInfoItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHeight", argTypes, term16528, args);
    }

};


