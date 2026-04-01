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

public class GalaxyStat_getBiggest_19684899747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term387;

    public GalaxyStat_getBiggest_19684899747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term387 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.GalaxyStat"));
        Object[] term401 = (Object[]) newArray("org.openRealmOfStars.starMap.newsCorp.DataModel", 3);
        Object term402 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term403 = (int[]) newIntArray(0);
        Object term405 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term406 = (int[]) newIntArray(0);
        Object term408 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term409 = (int[]) newIntArray(0);
        setField(term387, term387.getClass(), "galaxyStatisticsName", "MjGYSRKTNF");
        setIntField(term387, term387.getClass(), "maxPlayers", -184153539);
        setField(term402, term402.getClass(), "data", term403);
        setIntField(term402, term402.getClass(), "size", -1);
        setElement(term401, 0, term402);
        setField(term405, term405.getClass(), "data", term406);
        setIntField(term405, term405.getClass(), "size", -1);
        setElement(term401, 1, term405);
        setField(term408, term408.getClass(), "data", term409);
        setIntField(term408, term408.getClass(), "size", -1);
        setElement(term401, 2, term408);
        setField(term387, term387.getClass(), "dataStat", term401);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.newsCorp.GalaxyStat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBiggest", argTypes, term387, args);
    }

};


