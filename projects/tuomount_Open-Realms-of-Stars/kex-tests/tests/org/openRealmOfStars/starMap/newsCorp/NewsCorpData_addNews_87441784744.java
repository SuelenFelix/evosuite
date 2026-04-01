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

public class NewsCorpData_addNews_87441784744 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term746864;

    public NewsCorpData_addNews_87441784744() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term746864 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.NewsCorpData"));
        setField(term746864, term746864.getClass(), "planets", null);
        setField(term746864, term746864.getClass(), "population", null);
        setField(term746864, term746864.getClass(), "research", null);
        setField(term746864, term746864.getClass(), "military", null);
        setField(term746864, term746864.getClass(), "cultural", null);
        setField(term746864, term746864.getClass(), "credit", null);
        setField(term746864, term746864.getClass(), "newsData", null);
        setField(term746864, term746864.getClass(), "upComingNewsData", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.newsCorp.NewsCorpData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.newsCorp.NewsData");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addNews", argTypes, term746864, args);
    }

};


