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

public class Row_getAllianceRealm_120712792415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117;

    public Row_getAllianceRealm_120712792415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.scoreBoard.Row"));
        setIntField(term117, term117.getClass(), "score", 0);
        setField(term117, term117.getClass(), "realmIndexes", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.newsCorp.scoreBoard.Row");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAllianceRealm", argTypes, term117, args);
    }

};


