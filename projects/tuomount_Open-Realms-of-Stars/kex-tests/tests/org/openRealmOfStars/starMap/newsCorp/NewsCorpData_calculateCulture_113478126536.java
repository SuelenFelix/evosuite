package org.openRealmOfStars.starMap.newsCorp;

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
import static org.openRealmOfStars.starMap.newsCorp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class NewsCorpData_calculateCulture_113478126536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2053246;

    public NewsCorpData_calculateCulture_113478126536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2053246 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.NewsCorpData"));
        setField(term2053246, term2053246.getClass(), "planets", null);
        setField(term2053246, term2053246.getClass(), "population", null);
        setField(term2053246, term2053246.getClass(), "research", null);
        setField(term2053246, term2053246.getClass(), "military", null);
        setField(term2053246, term2053246.getClass(), "cultural", null);
        setField(term2053246, term2053246.getClass(), "credit", null);
        setField(term2053246, term2053246.getClass(), "newsData", null);
        setField(term2053246, term2053246.getClass(), "upComingNewsData", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.newsCorp.NewsCorpData");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.ArrayList");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerList");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "calculateCulture", argTypes, term2053246, args);
    }

};


