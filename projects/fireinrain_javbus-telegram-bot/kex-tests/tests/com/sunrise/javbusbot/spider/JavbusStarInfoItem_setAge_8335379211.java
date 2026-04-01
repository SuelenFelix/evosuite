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

public class JavbusStarInfoItem_setAge_8335379211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16417;

    public JavbusStarInfoItem_setAge_8335379211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16417 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarInfoItem"));
        setField(term16417, term16417.getClass(), "messageChatId", "wedLWAuOOY");
        setField(term16417, term16417.getClass(), "allFilmNum", "oZDNpnQlCv");
        setField(term16417, term16417.getClass(), "hasMagNum", "NdPeQAHWKN");
        setField(term16417, term16417.getClass(), "headPhoto", "");
        setField(term16417, term16417.getClass(), "starName", "");
        setField(term16417, term16417.getClass(), "birthday", "");
        setField(term16417, term16417.getClass(), "age", "");
        setField(term16417, term16417.getClass(), "height", "");
        setField(term16417, term16417.getClass(), "cup", "");
        setField(term16417, term16417.getClass(), "chestCircumference", "");
        setField(term16417, term16417.getClass(), "waistline", "");
        setField(term16417, term16417.getClass(), "hips", "");
        setField(term16417, term16417.getClass(), "birthPlace", "");
        setField(term16417, term16417.getClass(), "hobby", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.JavbusStarInfoItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "giGQTpcQuV";
        callMethod(klass, "setAge", argTypes, term16417, args);
    }

};


