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

public class PlanetaryStatus_getHappinessBonus_188107316329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10369;

    public PlanetaryStatus_getHappinessBonus_188107316329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10369 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus"));
        setField(term10369, term10369.getClass(), "statusId", null);
        setField(term10369, term10369.getClass(), "name", null);
        setField(term10369, term10369.getClass(), "description", null);
        setField(term10369, term10369.getClass(), "conflictingIds", null);
        setIntField(term10369, term10369.getClass(), "foodBonus", 0);
        setIntField(term10369, term10369.getClass(), "happinessBonus", 0);
        setIntField(term10369, term10369.getClass(), "mineBonus", 0);
        setIntField(term10369, term10369.getClass(), "prodBonus", 0);
        setIntField(term10369, term10369.getClass(), "credBonus", 0);
        setIntField(term10369, term10369.getClass(), "reseBonus", 0);
        setBooleanField(term10369, term10369.getClass(), "hidden", false);
        setField(term10369, term10369.getClass(), "discoveryText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHappinessBonus", argTypes, term10369, args);
    }

};


