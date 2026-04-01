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
import java.lang.Integer;

public class GalaxyStat_getPosition_152259022210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term474;
     Object term495;

    public GalaxyStat_getPosition_152259022210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term474 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.GalaxyStat"));
        Object[] term488 = (Object[]) newArray("org.openRealmOfStars.starMap.newsCorp.DataModel", 2);
        Object term489 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term490 = (int[]) newIntArray(0);
        Object term492 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term493 = (int[]) newIntArray(0);
        setField(term474, term474.getClass(), "galaxyStatisticsName", "NRdvgJlhkX");
        setIntField(term474, term474.getClass(), "maxPlayers", 1596070772);
        setField(term489, term489.getClass(), "data", term490);
        setIntField(term489, term489.getClass(), "size", -1);
        setElement(term488, 0, term489);
        setField(term492, term492.getClass(), "data", term493);
        setIntField(term492, term492.getClass(), "size", -1);
        setElement(term488, 1, term492);
        setField(term474, term474.getClass(), "dataStat", term488);
        term495 = new Integer(97029295);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.newsCorp.GalaxyStat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term495;
        callMethod(klass, "getPosition", argTypes, term474, args);
    }

};


