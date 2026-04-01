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

public class NewsCorpData_getCredit_3415540332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2053242;

    public NewsCorpData_getCredit_3415540332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2053242 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.NewsCorpData"));
        setField(term2053242, term2053242.getClass(), "planets", null);
        setField(term2053242, term2053242.getClass(), "population", null);
        setField(term2053242, term2053242.getClass(), "research", null);
        setField(term2053242, term2053242.getClass(), "military", null);
        setField(term2053242, term2053242.getClass(), "cultural", null);
        setField(term2053242, term2053242.getClass(), "credit", null);
        setField(term2053242, term2053242.getClass(), "newsData", null);
        setField(term2053242, term2053242.getClass(), "upComingNewsData", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.newsCorp.NewsCorpData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCredit", argTypes, term2053242, args);
    }

};


