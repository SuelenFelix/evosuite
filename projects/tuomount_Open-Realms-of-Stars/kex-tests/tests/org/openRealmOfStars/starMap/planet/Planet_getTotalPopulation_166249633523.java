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

public class Planet_getTotalPopulation_166249633523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119066;

    public Planet_getTotalPopulation_166249633523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119066 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term119066, term119066.getClass(), "name", null);
        setIntField(term119066, term119066.getClass(), "orderNumber", 0);
        setField(term119066, term119066.getClass(), "radiationType", null);
        setField(term119066, term119066.getClass(), "gravityType", null);
        setField(term119066, term119066.getClass(), "temperatureType", null);
        setField(term119066, term119066.getClass(), "waterLevel", null);
        setBooleanField(term119066, term119066.getClass(), "gasGiant", false);
        setField(term119066, term119066.getClass(), "coordinate", null);
        setField(term119066, term119066.getClass(), "planetType", null);
        setIntField(term119066, term119066.getClass(), "groundSize", 0);
        setIntField(term119066, term119066.getClass(), "amountMetalInGround", 0);
        setIntField(term119066, term119066.getClass(), "metal", 0);
        setIntField(term119066, term119066.getClass(), "prodResource", 0);
        setIntField(term119066, term119066.getClass(), "extraFood", 0);
        setIntField(term119066, term119066.getClass(), "culture", 0);
        setIntField(term119066, term119066.getClass(), "planetOwner", 0);
        setField(term119066, term119066.getClass(), "planetOwnerInfo", null);
        setField(term119066, term119066.getClass(), "homeWorldId", null);
        setIntField(term119066, term119066.getClass(), "startRealmIndex", 0);
        setIntField(term119066, term119066.getClass(), "tax", 0);
        setField(term119066, term119066.getClass(), "statuses", null);
        setField(term119066, term119066.getClass(), "timedStatuses", null);
        setField(term119066, term119066.getClass(), "event", null);
        setBooleanField(term119066, term119066.getClass(), "eventFound", false);
        setField(term119066, term119066.getClass(), "happinessEffect", null);
        setField(term119066, term119066.getClass(), "happinessExplanation", null);
        setField(term119066, term119066.getClass(), "farmProdExplain", null);
        setField(term119066, term119066.getClass(), "metaProdExplain", null);
        setField(term119066, term119066.getClass(), "prodProdExplain", null);
        setField(term119066, term119066.getClass(), "reseProdExplain", null);
        setField(term119066, term119066.getClass(), "cultProdExplain", null);
        setField(term119066, term119066.getClass(), "credProdExplain", null);
        setField(term119066, term119066.getClass(), "governor", null);
        setIntField(term119066, term119066.getClass(), "governorGuide", 0);
        setField(term119066, term119066.getClass(), "orbital", null);
        setField(term119066, term119066.getClass(), "workers", null);
        setField(term119066, term119066.getClass(), "buildings", null);
        setField(term119066, term119066.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalPopulation", argTypes, term119066, args);
    }

};


