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

public class JavbusStarInfoItem_setHasMagNum_110262459436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18311;

    public JavbusStarInfoItem_setHasMagNum_110262459436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18311 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarInfoItem"));
        setField(term18311, term18311.getClass(), "messageChatId", null);
        setField(term18311, term18311.getClass(), "allFilmNum", null);
        setField(term18311, term18311.getClass(), "hasMagNum", null);
        setField(term18311, term18311.getClass(), "headPhoto", null);
        setField(term18311, term18311.getClass(), "starName", null);
        setField(term18311, term18311.getClass(), "birthday", null);
        setField(term18311, term18311.getClass(), "age", null);
        setField(term18311, term18311.getClass(), "height", null);
        setField(term18311, term18311.getClass(), "cup", null);
        setField(term18311, term18311.getClass(), "chestCircumference", null);
        setField(term18311, term18311.getClass(), "waistline", null);
        setField(term18311, term18311.getClass(), "hips", null);
        setField(term18311, term18311.getClass(), "birthPlace", null);
        setField(term18311, term18311.getClass(), "hobby", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.JavbusStarInfoItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setHasMagNum", argTypes, term18311, args);
    }

};


