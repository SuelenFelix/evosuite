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

public class JavbusStarInfoItem_setHasMagNum_11026245945 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15817;

    public JavbusStarInfoItem_setHasMagNum_11026245945() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15817 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarInfoItem"));
        setField(term15817, term15817.getClass(), "messageChatId", "MVMiGQdgnX");
        setField(term15817, term15817.getClass(), "allFilmNum", "cQnJIENJHe");
        setField(term15817, term15817.getClass(), "hasMagNum", "ExjdCvAxlG");
        setField(term15817, term15817.getClass(), "headPhoto", "");
        setField(term15817, term15817.getClass(), "starName", "");
        setField(term15817, term15817.getClass(), "birthday", "");
        setField(term15817, term15817.getClass(), "age", "");
        setField(term15817, term15817.getClass(), "height", "");
        setField(term15817, term15817.getClass(), "cup", "");
        setField(term15817, term15817.getClass(), "chestCircumference", "");
        setField(term15817, term15817.getClass(), "waistline", "");
        setField(term15817, term15817.getClass(), "hips", "");
        setField(term15817, term15817.getClass(), "birthPlace", "");
        setField(term15817, term15817.getClass(), "hobby", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.JavbusStarInfoItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "moMySSiBuB";
        callMethod(klass, "setHasMagNum", argTypes, term15817, args);
    }

};


