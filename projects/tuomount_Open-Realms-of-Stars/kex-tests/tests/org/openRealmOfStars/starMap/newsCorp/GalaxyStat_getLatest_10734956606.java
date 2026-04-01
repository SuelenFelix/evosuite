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

public class GalaxyStat_getLatest_10734956606 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term354;
     Object term375;

    public GalaxyStat_getLatest_10734956606() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term354 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.GalaxyStat"));
        Object[] term368 = (Object[]) newArray("org.openRealmOfStars.starMap.newsCorp.DataModel", 2);
        Object term369 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term370 = (int[]) newIntArray(0);
        Object term372 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term373 = (int[]) newIntArray(0);
        setField(term354, term354.getClass(), "galaxyStatisticsName", "SzjVpOQTyS");
        setIntField(term354, term354.getClass(), "maxPlayers", 292681826);
        setField(term369, term369.getClass(), "data", term370);
        setIntField(term369, term369.getClass(), "size", -1);
        setElement(term368, 0, term369);
        setField(term372, term372.getClass(), "data", term373);
        setIntField(term372, term372.getClass(), "size", -1);
        setElement(term368, 1, term372);
        setField(term354, term354.getClass(), "dataStat", term368);
        term375 = new Integer(458147407);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.newsCorp.GalaxyStat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term375;
        callMethod(klass, "getLatest", argTypes, term354, args);
    }

};


