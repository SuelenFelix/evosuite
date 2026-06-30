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

public class JavbusStarInfoItem_getHasMagNum_12653820344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15728;

    public JavbusStarInfoItem_getHasMagNum_12653820344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15728 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarInfoItem"));
        setField(term15728, term15728.getClass(), "messageChatId", "QZCuYHcIBC");
        setField(term15728, term15728.getClass(), "allFilmNum", "hpvoFaAyIu");
        setField(term15728, term15728.getClass(), "hasMagNum", "dyqukIBJxC");
        setField(term15728, term15728.getClass(), "headPhoto", "");
        setField(term15728, term15728.getClass(), "starName", "");
        setField(term15728, term15728.getClass(), "birthday", "");
        setField(term15728, term15728.getClass(), "age", "");
        setField(term15728, term15728.getClass(), "height", "");
        setField(term15728, term15728.getClass(), "cup", "");
        setField(term15728, term15728.getClass(), "chestCircumference", "");
        setField(term15728, term15728.getClass(), "waistline", "");
        setField(term15728, term15728.getClass(), "hips", "");
        setField(term15728, term15728.getClass(), "birthPlace", "");
        setField(term15728, term15728.getClass(), "hobby", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.JavbusStarInfoItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHasMagNum", argTypes, term15728, args);
    }

};


