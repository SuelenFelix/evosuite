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
import java.lang.Object;

public class GalaxyStat_getMaxPlayers_122951006312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term556;

    public GalaxyStat_getMaxPlayers_122951006312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term556 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.GalaxyStat"));
        Object[] term570 = (Object[]) newArray("org.openRealmOfStars.starMap.newsCorp.DataModel", 6);
        Object term571 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term572 = (int[]) newIntArray(0);
        Object term574 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term575 = (int[]) newIntArray(0);
        Object term577 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term578 = (int[]) newIntArray(0);
        Object term580 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term581 = (int[]) newIntArray(0);
        Object term583 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term584 = (int[]) newIntArray(0);
        Object term586 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term587 = (int[]) newIntArray(0);
        setField(term556, term556.getClass(), "galaxyStatisticsName", "MxlszYVzRf");
        setIntField(term556, term556.getClass(), "maxPlayers", -2095575670);
        setField(term571, term571.getClass(), "data", term572);
        setIntField(term571, term571.getClass(), "size", -1);
        setElement(term570, 0, term571);
        setField(term574, term574.getClass(), "data", term575);
        setIntField(term574, term574.getClass(), "size", -1);
        setElement(term570, 1, term574);
        setField(term577, term577.getClass(), "data", term578);
        setIntField(term577, term577.getClass(), "size", -1);
        setElement(term570, 2, term577);
        setField(term580, term580.getClass(), "data", term581);
        setIntField(term580, term580.getClass(), "size", -1);
        setElement(term570, 3, term580);
        setField(term583, term583.getClass(), "data", term584);
        setIntField(term583, term583.getClass(), "size", -1);
        setElement(term570, 4, term583);
        setField(term586, term586.getClass(), "data", term587);
        setIntField(term586, term586.getClass(), "size", -1);
        setElement(term570, 5, term586);
        setField(term556, term556.getClass(), "dataStat", term570);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.newsCorp.GalaxyStat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxPlayers", argTypes, term556, args);
    }

};


