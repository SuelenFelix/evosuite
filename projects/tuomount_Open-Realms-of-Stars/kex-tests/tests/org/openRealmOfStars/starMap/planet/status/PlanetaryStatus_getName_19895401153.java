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

public class PlanetaryStatus_getName_19895401153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6374;

    public PlanetaryStatus_getName_19895401153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6374 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus"));
        Object[] term6411 = (Object[]) newArray("java.lang.String", 2);
        setField(term6374, term6374.getClass(), "statusId", "ZfdXfCCFDf");
        setField(term6374, term6374.getClass(), "name", "MwwjNtdOFT");
        setField(term6374, term6374.getClass(), "description", "VYkqXKVlAJ");
        setElement(term6411, 0, "XkIoWJRNwN");
        setElement(term6411, 1, "aNWLJdrZMq");
        setField(term6374, term6374.getClass(), "conflictingIds", term6411);
        setIntField(term6374, term6374.getClass(), "foodBonus", 906181092);
        setIntField(term6374, term6374.getClass(), "happinessBonus", 1045657203);
        setIntField(term6374, term6374.getClass(), "mineBonus", 1386130016);
        setIntField(term6374, term6374.getClass(), "prodBonus", 1072005683);
        setIntField(term6374, term6374.getClass(), "credBonus", 1861318859);
        setIntField(term6374, term6374.getClass(), "reseBonus", 1474524152);
        setBooleanField(term6374, term6374.getClass(), "hidden", true);
        setField(term6374, term6374.getClass(), "discoveryText", "HHmNoYxIGj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term6374, args);
    }

};


