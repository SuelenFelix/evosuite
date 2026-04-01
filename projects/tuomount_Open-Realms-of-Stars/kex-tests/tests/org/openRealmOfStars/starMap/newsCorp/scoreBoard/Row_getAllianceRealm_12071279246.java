package org.openRealmOfStars.starMap.newsCorp.scoreBoard;

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
import static org.openRealmOfStars.starMap.newsCorp.scoreBoard.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Row_getAllianceRealm_12071279246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60;

    public Row_getAllianceRealm_12071279246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.scoreBoard.Row"));
        int[] term62 = (int[]) newIntArray(6);
        setIntField(term60, term60.getClass(), "score", 865208305);
        setIntElement(term62, 0, -1275173084);
        setIntElement(term62, 1, -244121226);
        setIntElement(term62, 2, -203030934);
        setIntElement(term62, 3, -1179120542);
        setIntElement(term62, 4, -73683645);
        setIntElement(term62, 5, -226514366);
        setField(term60, term60.getClass(), "realmIndexes", term62);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.newsCorp.scoreBoard.Row");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAllianceRealm", argTypes, term60, args);
    }

};


