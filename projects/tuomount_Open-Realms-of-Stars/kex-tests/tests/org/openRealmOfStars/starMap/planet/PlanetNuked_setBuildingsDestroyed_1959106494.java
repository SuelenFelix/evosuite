package org.openRealmOfStars.starMap.planet;

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
import static org.openRealmOfStars.starMap.planet.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class PlanetNuked_setBuildingsDestroyed_1959106494 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81;
     Object term97;

    public PlanetNuked_setBuildingsDestroyed_1959106494() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.PlanetNuked"));
        setIntField(term81, term81.getClass(), "populationKilled", -2038273078);
        setIntField(term81, term81.getClass(), "buildingsDestroyed", 1227103734);
        setField(term81, term81.getClass(), "text", "xxtlPwDYFs");
        setBooleanField(term81, term81.getClass(), "nuked", false);
        term97 = new Integer(-1339778481);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.PlanetNuked");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term97;
        callMethod(klass, "setBuildingsDestroyed", argTypes, term81, args);
    }

};


