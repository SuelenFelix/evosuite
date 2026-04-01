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

public class GalaxyStat_getGalaxyStatisticsName_161575719024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term633;

    public GalaxyStat_getGalaxyStatisticsName_161575719024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term633 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.GalaxyStat"));
        setField(term633, term633.getClass(), "galaxyStatisticsName", null);
        setIntField(term633, term633.getClass(), "maxPlayers", 0);
        setField(term633, term633.getClass(), "dataStat", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.newsCorp.GalaxyStat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGalaxyStatisticsName", argTypes, term633, args);
    }

};


