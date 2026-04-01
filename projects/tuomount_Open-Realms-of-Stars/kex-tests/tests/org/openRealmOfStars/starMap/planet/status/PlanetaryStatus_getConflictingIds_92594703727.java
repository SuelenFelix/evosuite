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

public class PlanetaryStatus_getConflictingIds_92594703727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10353;

    public PlanetaryStatus_getConflictingIds_92594703727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10353 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus"));
        setField(term10353, term10353.getClass(), "statusId", null);
        setField(term10353, term10353.getClass(), "name", null);
        setField(term10353, term10353.getClass(), "description", null);
        setField(term10353, term10353.getClass(), "conflictingIds", null);
        setIntField(term10353, term10353.getClass(), "foodBonus", 0);
        setIntField(term10353, term10353.getClass(), "happinessBonus", 0);
        setIntField(term10353, term10353.getClass(), "mineBonus", 0);
        setIntField(term10353, term10353.getClass(), "prodBonus", 0);
        setIntField(term10353, term10353.getClass(), "credBonus", 0);
        setIntField(term10353, term10353.getClass(), "reseBonus", 0);
        setBooleanField(term10353, term10353.getClass(), "hidden", false);
        setField(term10353, term10353.getClass(), "discoveryText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getConflictingIds", argTypes, term10353, args);
    }

};


