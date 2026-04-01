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

public class PlanetaryStatus_getName_198954011525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10337;

    public PlanetaryStatus_getName_198954011525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10337 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus"));
        setField(term10337, term10337.getClass(), "statusId", null);
        setField(term10337, term10337.getClass(), "name", null);
        setField(term10337, term10337.getClass(), "description", null);
        setField(term10337, term10337.getClass(), "conflictingIds", null);
        setIntField(term10337, term10337.getClass(), "foodBonus", 0);
        setIntField(term10337, term10337.getClass(), "happinessBonus", 0);
        setIntField(term10337, term10337.getClass(), "mineBonus", 0);
        setIntField(term10337, term10337.getClass(), "prodBonus", 0);
        setIntField(term10337, term10337.getClass(), "credBonus", 0);
        setIntField(term10337, term10337.getClass(), "reseBonus", 0);
        setBooleanField(term10337, term10337.getClass(), "hidden", false);
        setField(term10337, term10337.getClass(), "discoveryText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term10337, args);
    }

};


