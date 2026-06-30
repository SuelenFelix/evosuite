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

public class JavbusStarInfoItem_getHobby_128596823724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17728;

    public JavbusStarInfoItem_getHobby_128596823724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17728 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarInfoItem"));
        setField(term17728, term17728.getClass(), "messageChatId", "ekTUXbqVGx");
        setField(term17728, term17728.getClass(), "allFilmNum", "ECPFDcnHIT");
        setField(term17728, term17728.getClass(), "hasMagNum", "cgHejOgcDW");
        setField(term17728, term17728.getClass(), "headPhoto", "");
        setField(term17728, term17728.getClass(), "starName", "");
        setField(term17728, term17728.getClass(), "birthday", "");
        setField(term17728, term17728.getClass(), "age", "");
        setField(term17728, term17728.getClass(), "height", "");
        setField(term17728, term17728.getClass(), "cup", "");
        setField(term17728, term17728.getClass(), "chestCircumference", "");
        setField(term17728, term17728.getClass(), "waistline", "");
        setField(term17728, term17728.getClass(), "hips", "");
        setField(term17728, term17728.getClass(), "birthPlace", "");
        setField(term17728, term17728.getClass(), "hobby", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.JavbusStarInfoItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHobby", argTypes, term17728, args);
    }

};


