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

public class Row_getRealm_18251954355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55;

    public Row_getRealm_18251954355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.scoreBoard.Row"));
        int[] term57 = (int[]) newIntArray(1);
        setIntField(term55, term55.getClass(), "score", 1135664017);
        setIntElement(term57, 0, 590364439);
        setField(term55, term55.getClass(), "realmIndexes", term57);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.newsCorp.scoreBoard.Row");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRealm", argTypes, term55, args);
    }

};


