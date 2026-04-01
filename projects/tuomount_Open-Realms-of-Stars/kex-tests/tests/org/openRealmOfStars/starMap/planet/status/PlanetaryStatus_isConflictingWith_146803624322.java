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

public class PlanetaryStatus_isConflictingWith_146803624322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10321;

    public PlanetaryStatus_isConflictingWith_146803624322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10321 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus"));
        setField(term10321, term10321.getClass(), "statusId", null);
        setField(term10321, term10321.getClass(), "name", null);
        setField(term10321, term10321.getClass(), "description", null);
        setField(term10321, term10321.getClass(), "conflictingIds", null);
        setIntField(term10321, term10321.getClass(), "foodBonus", 0);
        setIntField(term10321, term10321.getClass(), "happinessBonus", 0);
        setIntField(term10321, term10321.getClass(), "mineBonus", 0);
        setIntField(term10321, term10321.getClass(), "prodBonus", 0);
        setIntField(term10321, term10321.getClass(), "credBonus", 0);
        setIntField(term10321, term10321.getClass(), "reseBonus", 0);
        setBooleanField(term10321, term10321.getClass(), "hidden", false);
        setField(term10321, term10321.getClass(), "discoveryText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus");
        argTypes[1] = Array.newInstance(Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "isConflictingWith", argTypes, term10321, args);
    }

};


