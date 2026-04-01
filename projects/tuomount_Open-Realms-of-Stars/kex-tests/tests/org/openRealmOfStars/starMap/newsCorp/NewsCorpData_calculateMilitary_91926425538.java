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
import java.lang.Boolean;

public class NewsCorpData_calculateMilitary_91926425538 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term746852;
     Object term746853;

    public NewsCorpData_calculateMilitary_91926425538() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term746852 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.NewsCorpData"));
        setField(term746852, term746852.getClass(), "planets", null);
        setField(term746852, term746852.getClass(), "population", null);
        setField(term746852, term746852.getClass(), "research", null);
        setField(term746852, term746852.getClass(), "military", null);
        setField(term746852, term746852.getClass(), "cultural", null);
        setField(term746852, term746852.getClass(), "credit", null);
        setField(term746852, term746852.getClass(), "newsData", null);
        setField(term746852, term746852.getClass(), "upComingNewsData", null);
        term746853 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.newsCorp.NewsCorpData");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerList");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term746853;
        callMethod(klass, "calculateMilitary", argTypes, term746852, args);
    }

};


