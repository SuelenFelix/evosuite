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
import java.lang.Integer;

public class NewsCorpData_getMilitaryDifference_57290113041 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term746857;
     Object term746858;
     Object term746860;

    public NewsCorpData_getMilitaryDifference_57290113041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term746857 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.NewsCorpData"));
        setField(term746857, term746857.getClass(), "planets", null);
        setField(term746857, term746857.getClass(), "population", null);
        setField(term746857, term746857.getClass(), "research", null);
        setField(term746857, term746857.getClass(), "military", null);
        setField(term746857, term746857.getClass(), "cultural", null);
        setField(term746857, term746857.getClass(), "credit", null);
        setField(term746857, term746857.getClass(), "newsData", null);
        setField(term746857, term746857.getClass(), "upComingNewsData", null);
        term746858 = new Integer(0);
        term746860 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.newsCorp.NewsCorpData");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term746858;
        args[1] = term746860;
        callMethod(klass, "getMilitaryDifference", argTypes, term746857, args);
    }

};


