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

public class NewsCorpData_getStatNumbers_196960532243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term746863;

    public NewsCorpData_getStatNumbers_196960532243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term746863 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.NewsCorpData"));
        setField(term746863, term746863.getClass(), "planets", null);
        setField(term746863, term746863.getClass(), "population", null);
        setField(term746863, term746863.getClass(), "research", null);
        setField(term746863, term746863.getClass(), "military", null);
        setField(term746863, term746863.getClass(), "cultural", null);
        setField(term746863, term746863.getClass(), "credit", null);
        setField(term746863, term746863.getClass(), "newsData", null);
        setField(term746863, term746863.getClass(), "upComingNewsData", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.newsCorp.NewsCorpData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatNumbers", argTypes, term746863, args);
    }

};


