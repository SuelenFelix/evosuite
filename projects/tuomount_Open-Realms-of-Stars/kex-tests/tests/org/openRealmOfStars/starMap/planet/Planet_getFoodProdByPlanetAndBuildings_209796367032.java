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

public class Planet_getFoodProdByPlanetAndBuildings_209796367032 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156548;

    public Planet_getFoodProdByPlanetAndBuildings_209796367032() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term156548 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term156548, term156548.getClass(), "name", null);
        setIntField(term156548, term156548.getClass(), "orderNumber", 0);
        setField(term156548, term156548.getClass(), "radiationType", null);
        setField(term156548, term156548.getClass(), "gravityType", null);
        setField(term156548, term156548.getClass(), "temperatureType", null);
        setField(term156548, term156548.getClass(), "waterLevel", null);
        setBooleanField(term156548, term156548.getClass(), "gasGiant", false);
        setField(term156548, term156548.getClass(), "coordinate", null);
        setField(term156548, term156548.getClass(), "planetType", null);
        setIntField(term156548, term156548.getClass(), "groundSize", 0);
        setIntField(term156548, term156548.getClass(), "amountMetalInGround", 0);
        setIntField(term156548, term156548.getClass(), "metal", 0);
        setIntField(term156548, term156548.getClass(), "prodResource", 0);
        setIntField(term156548, term156548.getClass(), "extraFood", 0);
        setIntField(term156548, term156548.getClass(), "culture", 0);
        setIntField(term156548, term156548.getClass(), "planetOwner", 0);
        setField(term156548, term156548.getClass(), "planetOwnerInfo", null);
        setField(term156548, term156548.getClass(), "homeWorldId", null);
        setIntField(term156548, term156548.getClass(), "startRealmIndex", 0);
        setIntField(term156548, term156548.getClass(), "tax", 0);
        setField(term156548, term156548.getClass(), "statuses", null);
        setField(term156548, term156548.getClass(), "timedStatuses", null);
        setField(term156548, term156548.getClass(), "event", null);
        setBooleanField(term156548, term156548.getClass(), "eventFound", false);
        setField(term156548, term156548.getClass(), "happinessEffect", null);
        setField(term156548, term156548.getClass(), "happinessExplanation", null);
        setField(term156548, term156548.getClass(), "farmProdExplain", null);
        setField(term156548, term156548.getClass(), "metaProdExplain", null);
        setField(term156548, term156548.getClass(), "prodProdExplain", null);
        setField(term156548, term156548.getClass(), "reseProdExplain", null);
        setField(term156548, term156548.getClass(), "cultProdExplain", null);
        setField(term156548, term156548.getClass(), "credProdExplain", null);
        setField(term156548, term156548.getClass(), "governor", null);
        setIntField(term156548, term156548.getClass(), "governorGuide", 0);
        setField(term156548, term156548.getClass(), "orbital", null);
        setField(term156548, term156548.getClass(), "workers", null);
        setField(term156548, term156548.getClass(), "buildings", null);
        setField(term156548, term156548.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFoodProdByPlanetAndBuildings", argTypes, term156548, args);
    }

};


