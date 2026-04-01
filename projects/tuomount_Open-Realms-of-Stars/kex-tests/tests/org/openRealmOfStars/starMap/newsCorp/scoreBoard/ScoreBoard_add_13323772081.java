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
import java.util.ArrayList;

public class ScoreBoard_add_13323772081 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125;
     Object term130;

    public ScoreBoard_add_13323772081() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term126 = new ArrayList();
        term125 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.scoreBoard.ScoreBoard"));
        setField(term125, term125.getClass(), "board", term126);
        term130 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.scoreBoard.Row"));
        int[] term132 = (int[]) newIntArray(7);
        setIntField(term130, term130.getClass(), "score", -817164822);
        setIntElement(term132, 0, -1016503459);
        setIntElement(term132, 1, -1968847291);
        setIntElement(term132, 2, 579005622);
        setIntElement(term132, 3, -14890619);
        setIntElement(term132, 4, 1632125673);
        setIntElement(term132, 5, 454281060);
        setIntElement(term132, 6, -1786399638);
        setField(term130, term130.getClass(), "realmIndexes", term132);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.newsCorp.scoreBoard.ScoreBoard");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.newsCorp.scoreBoard.Row");
        Object[] args = new Object[1];
        args[0] = term130;
        callMethod(klass, "add", argTypes, term125, args);
    }

};


