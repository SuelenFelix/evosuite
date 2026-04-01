package org.openRealmOfStars.starMap.planet.status;

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
import static org.openRealmOfStars.starMap.planet.status.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class PlanetaryStatus_setMineBonus_885119336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10429;
     Object term10437;

    public PlanetaryStatus_setMineBonus_885119336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10429 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus"));
        setField(term10429, term10429.getClass(), "statusId", null);
        setField(term10429, term10429.getClass(), "name", null);
        setField(term10429, term10429.getClass(), "description", null);
        setField(term10429, term10429.getClass(), "conflictingIds", null);
        setIntField(term10429, term10429.getClass(), "foodBonus", 0);
        setIntField(term10429, term10429.getClass(), "happinessBonus", 0);
        setIntField(term10429, term10429.getClass(), "mineBonus", 0);
        setIntField(term10429, term10429.getClass(), "prodBonus", 0);
        setIntField(term10429, term10429.getClass(), "credBonus", 0);
        setIntField(term10429, term10429.getClass(), "reseBonus", 0);
        setBooleanField(term10429, term10429.getClass(), "hidden", false);
        setField(term10429, term10429.getClass(), "discoveryText", null);
        term10437 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term10437;
        callMethod(klass, "setMineBonus", argTypes, term10429, args);
    }

};


