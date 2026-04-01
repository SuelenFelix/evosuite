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

public class GalaxyStat_getMaxIndex_10361902232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term195;

    public GalaxyStat_getMaxIndex_10361902232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term195 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.GalaxyStat"));
        Object[] term209 = (Object[]) newArray("org.openRealmOfStars.starMap.newsCorp.DataModel", 1);
        Object term210 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term211 = (int[]) newIntArray(0);
        setField(term195, term195.getClass(), "galaxyStatisticsName", "MuLcgQHgqz");
        setIntField(term195, term195.getClass(), "maxPlayers", -1968847291);
        setField(term210, term210.getClass(), "data", term211);
        setIntField(term210, term210.getClass(), "size", -1);
        setElement(term209, 0, term210);
        setField(term195, term195.getClass(), "dataStat", term209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.newsCorp.GalaxyStat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxIndex", argTypes, term195, args);
    }

};


