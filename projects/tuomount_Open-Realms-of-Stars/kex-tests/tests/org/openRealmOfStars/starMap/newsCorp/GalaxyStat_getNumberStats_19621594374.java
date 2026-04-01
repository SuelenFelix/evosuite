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

public class GalaxyStat_getNumberStats_19621594374 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term270;

    public GalaxyStat_getNumberStats_19621594374() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term270 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.GalaxyStat"));
        Object[] term284 = (Object[]) newArray("org.openRealmOfStars.starMap.newsCorp.DataModel", 5);
        Object term285 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term286 = (int[]) newIntArray(0);
        Object term288 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term289 = (int[]) newIntArray(0);
        Object term291 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term292 = (int[]) newIntArray(0);
        Object term294 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term295 = (int[]) newIntArray(0);
        Object term297 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term298 = (int[]) newIntArray(0);
        setField(term270, term270.getClass(), "galaxyStatisticsName", "jJCZpVmanW");
        setIntField(term270, term270.getClass(), "maxPlayers", 454281060);
        setField(term285, term285.getClass(), "data", term286);
        setIntField(term285, term285.getClass(), "size", -1);
        setElement(term284, 0, term285);
        setField(term288, term288.getClass(), "data", term289);
        setIntField(term288, term288.getClass(), "size", -1);
        setElement(term284, 1, term288);
        setField(term291, term291.getClass(), "data", term292);
        setIntField(term291, term291.getClass(), "size", -1);
        setElement(term284, 2, term291);
        setField(term294, term294.getClass(), "data", term295);
        setIntField(term294, term294.getClass(), "size", -1);
        setElement(term284, 3, term294);
        setField(term297, term297.getClass(), "data", term298);
        setIntField(term297, term297.getClass(), "size", -1);
        setElement(term284, 4, term297);
        setField(term270, term270.getClass(), "dataStat", term284);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.newsCorp.GalaxyStat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNumberStats", argTypes, term270, args);
    }

};


