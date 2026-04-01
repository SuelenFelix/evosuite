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
import java.lang.Object;

public class PlanetaryStatus_getMineBonus_17592577578 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7299;

    public PlanetaryStatus_getMineBonus_17592577578() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7299 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus"));
        Object[] term7336 = (Object[]) newArray("java.lang.String", 1);
        setField(term7299, term7299.getClass(), "statusId", "sZdUNdggUW");
        setField(term7299, term7299.getClass(), "name", "OqbwYQfvAe");
        setField(term7299, term7299.getClass(), "description", "tRxZafjqIx");
        setElement(term7336, 0, "DhjNLmRMCu");
        setField(term7299, term7299.getClass(), "conflictingIds", term7336);
        setIntField(term7299, term7299.getClass(), "foodBonus", 158873461);
        setIntField(term7299, term7299.getClass(), "happinessBonus", -430151637);
        setIntField(term7299, term7299.getClass(), "mineBonus", -1697741339);
        setIntField(term7299, term7299.getClass(), "prodBonus", 98922530);
        setIntField(term7299, term7299.getClass(), "credBonus", -1388471422);
        setIntField(term7299, term7299.getClass(), "reseBonus", -1498296052);
        setBooleanField(term7299, term7299.getClass(), "hidden", false);
        setField(term7299, term7299.getClass(), "discoveryText", "PgPzMSEjjX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMineBonus", argTypes, term7299, args);
    }

};


