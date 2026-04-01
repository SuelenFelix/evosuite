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

public class Row_compareTo_9969818173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24;
     Object term31;

    public Row_compareTo_9969818173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.scoreBoard.Row"));
        int[] term26 = (int[]) newIntArray(4);
        setIntField(term24, term24.getClass(), "score", -522618178);
        setIntElement(term26, 0, 1134449235);
        setIntElement(term26, 1, -883034806);
        setIntElement(term26, 2, 1585847225);
        setIntElement(term26, 3, 597278769);
        setField(term24, term24.getClass(), "realmIndexes", term26);
        term31 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.scoreBoard.Row"));
        int[] term33 = (int[]) newIntArray(3);
        setIntField(term31, term31.getClass(), "score", -1685132342);
        setIntElement(term33, 0, -1456670397);
        setIntElement(term33, 1, 1622346318);
        setIntElement(term33, 2, 1048535127);
        setField(term31, term31.getClass(), "realmIndexes", term33);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.newsCorp.scoreBoard.Row");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.newsCorp.scoreBoard.Row");
        Object[] args = new Object[1];
        args[0] = term31;
        callMethod(klass, "compareTo", argTypes, term24, args);
    }

};


