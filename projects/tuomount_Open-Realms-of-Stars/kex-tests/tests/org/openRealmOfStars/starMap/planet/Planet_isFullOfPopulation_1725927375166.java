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

public class Planet_isFullOfPopulation_1725927375166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term704184;

    public Planet_isFullOfPopulation_1725927375166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term704184 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term704184, term704184.getClass(), "name", null);
        setIntField(term704184, term704184.getClass(), "orderNumber", 0);
        setField(term704184, term704184.getClass(), "radiationType", null);
        setField(term704184, term704184.getClass(), "gravityType", null);
        setField(term704184, term704184.getClass(), "temperatureType", null);
        setField(term704184, term704184.getClass(), "waterLevel", null);
        setBooleanField(term704184, term704184.getClass(), "gasGiant", false);
        setField(term704184, term704184.getClass(), "coordinate", null);
        setField(term704184, term704184.getClass(), "planetType", null);
        setIntField(term704184, term704184.getClass(), "groundSize", 0);
        setIntField(term704184, term704184.getClass(), "amountMetalInGround", 0);
        setIntField(term704184, term704184.getClass(), "metal", 0);
        setIntField(term704184, term704184.getClass(), "prodResource", 0);
        setIntField(term704184, term704184.getClass(), "extraFood", 0);
        setIntField(term704184, term704184.getClass(), "culture", 0);
        setIntField(term704184, term704184.getClass(), "planetOwner", 0);
        setField(term704184, term704184.getClass(), "planetOwnerInfo", null);
        setField(term704184, term704184.getClass(), "homeWorldId", null);
        setIntField(term704184, term704184.getClass(), "startRealmIndex", 0);
        setIntField(term704184, term704184.getClass(), "tax", 0);
        setField(term704184, term704184.getClass(), "statuses", null);
        setField(term704184, term704184.getClass(), "timedStatuses", null);
        setField(term704184, term704184.getClass(), "event", null);
        setBooleanField(term704184, term704184.getClass(), "eventFound", false);
        setField(term704184, term704184.getClass(), "happinessEffect", null);
        setField(term704184, term704184.getClass(), "happinessExplanation", null);
        setField(term704184, term704184.getClass(), "farmProdExplain", null);
        setField(term704184, term704184.getClass(), "metaProdExplain", null);
        setField(term704184, term704184.getClass(), "prodProdExplain", null);
        setField(term704184, term704184.getClass(), "reseProdExplain", null);
        setField(term704184, term704184.getClass(), "cultProdExplain", null);
        setField(term704184, term704184.getClass(), "credProdExplain", null);
        setField(term704184, term704184.getClass(), "governor", null);
        setIntField(term704184, term704184.getClass(), "governorGuide", 0);
        setField(term704184, term704184.getClass(), "orbital", null);
        setField(term704184, term704184.getClass(), "workers", null);
        setField(term704184, term704184.getClass(), "buildings", null);
        setField(term704184, term704184.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isFullOfPopulation", argTypes, term704184, args);
    }

};


