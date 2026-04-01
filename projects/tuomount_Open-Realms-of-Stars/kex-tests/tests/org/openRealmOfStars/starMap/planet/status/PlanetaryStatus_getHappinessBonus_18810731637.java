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

public class PlanetaryStatus_getHappinessBonus_18810731637 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7092;

    public PlanetaryStatus_getHappinessBonus_18810731637() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7092 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus"));
        Object[] term7129 = (Object[]) newArray("java.lang.String", 5);
        setField(term7092, term7092.getClass(), "statusId", "kVEZMHmRtR");
        setField(term7092, term7092.getClass(), "name", "ekxGuOYIwi");
        setField(term7092, term7092.getClass(), "description", "RbVQXSpxXy");
        setElement(term7129, 0, "YpJbIgJWWv");
        setElement(term7129, 1, "JppkknKVOw");
        setElement(term7129, 2, "iljANwuEjk");
        setElement(term7129, 3, "kNqaJKIATy");
        setElement(term7129, 4, "vKQukfbJUd");
        setField(term7092, term7092.getClass(), "conflictingIds", term7129);
        setIntField(term7092, term7092.getClass(), "foodBonus", -1565502840);
        setIntField(term7092, term7092.getClass(), "happinessBonus", 344323424);
        setIntField(term7092, term7092.getClass(), "mineBonus", 9726679);
        setIntField(term7092, term7092.getClass(), "prodBonus", -25637976);
        setIntField(term7092, term7092.getClass(), "credBonus", 1555897383);
        setIntField(term7092, term7092.getClass(), "reseBonus", 202001407);
        setBooleanField(term7092, term7092.getClass(), "hidden", true);
        setField(term7092, term7092.getClass(), "discoveryText", "lFRJFUMVbx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHappinessBonus", argTypes, term7092, args);
    }

};


