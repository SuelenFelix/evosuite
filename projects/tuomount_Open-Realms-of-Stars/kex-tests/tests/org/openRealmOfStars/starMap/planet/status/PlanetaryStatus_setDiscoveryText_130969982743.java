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

public class PlanetaryStatus_setDiscoveryText_130969982743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10495;

    public PlanetaryStatus_setDiscoveryText_130969982743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10495 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus"));
        setField(term10495, term10495.getClass(), "statusId", null);
        setField(term10495, term10495.getClass(), "name", null);
        setField(term10495, term10495.getClass(), "description", null);
        setField(term10495, term10495.getClass(), "conflictingIds", null);
        setIntField(term10495, term10495.getClass(), "foodBonus", 0);
        setIntField(term10495, term10495.getClass(), "happinessBonus", 0);
        setIntField(term10495, term10495.getClass(), "mineBonus", 0);
        setIntField(term10495, term10495.getClass(), "prodBonus", 0);
        setIntField(term10495, term10495.getClass(), "credBonus", 0);
        setIntField(term10495, term10495.getClass(), "reseBonus", 0);
        setBooleanField(term10495, term10495.getClass(), "hidden", false);
        setField(term10495, term10495.getClass(), "discoveryText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setDiscoveryText", argTypes, term10495, args);
    }

};


