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

public class GalaxyStat_getGalaxyData_17303107811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149;

    public GalaxyStat_getGalaxyData_17303107811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.GalaxyStat"));
        Object[] term163 = (Object[]) newArray("org.openRealmOfStars.starMap.newsCorp.DataModel", 7);
        Object term164 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term165 = (int[]) newIntArray(0);
        Object term167 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term168 = (int[]) newIntArray(0);
        Object term170 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term171 = (int[]) newIntArray(0);
        Object term173 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term174 = (int[]) newIntArray(0);
        Object term176 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term177 = (int[]) newIntArray(0);
        Object term179 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term180 = (int[]) newIntArray(0);
        Object term182 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term183 = (int[]) newIntArray(0);
        setField(term149, term149.getClass(), "galaxyStatisticsName", "sjlJAEtRrb");
        setIntField(term149, term149.getClass(), "maxPlayers", -1016503459);
        setField(term164, term164.getClass(), "data", term165);
        setIntField(term164, term164.getClass(), "size", -1);
        setElement(term163, 0, term164);
        setField(term167, term167.getClass(), "data", term168);
        setIntField(term167, term167.getClass(), "size", -1);
        setElement(term163, 1, term167);
        setField(term170, term170.getClass(), "data", term171);
        setIntField(term170, term170.getClass(), "size", -1);
        setElement(term163, 2, term170);
        setField(term173, term173.getClass(), "data", term174);
        setIntField(term173, term173.getClass(), "size", -1);
        setElement(term163, 3, term173);
        setField(term176, term176.getClass(), "data", term177);
        setIntField(term176, term176.getClass(), "size", -1);
        setElement(term163, 4, term176);
        setField(term179, term179.getClass(), "data", term180);
        setIntField(term179, term179.getClass(), "size", -1);
        setElement(term163, 5, term179);
        setField(term182, term182.getClass(), "data", term183);
        setIntField(term182, term182.getClass(), "size", -1);
        setElement(term163, 6, term182);
        setField(term149, term149.getClass(), "dataStat", term163);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.newsCorp.GalaxyStat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGalaxyData", argTypes, term149, args);
    }

};


