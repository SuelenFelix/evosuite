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

public class Planet_bombOneBuilding_275075412195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term818840;

    public Planet_bombOneBuilding_275075412195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term818840 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term818840, term818840.getClass(), "name", null);
        setIntField(term818840, term818840.getClass(), "orderNumber", 0);
        setField(term818840, term818840.getClass(), "radiationType", null);
        setField(term818840, term818840.getClass(), "gravityType", null);
        setField(term818840, term818840.getClass(), "temperatureType", null);
        setField(term818840, term818840.getClass(), "waterLevel", null);
        setBooleanField(term818840, term818840.getClass(), "gasGiant", false);
        setField(term818840, term818840.getClass(), "coordinate", null);
        setField(term818840, term818840.getClass(), "planetType", null);
        setIntField(term818840, term818840.getClass(), "groundSize", 0);
        setIntField(term818840, term818840.getClass(), "amountMetalInGround", 0);
        setIntField(term818840, term818840.getClass(), "metal", 0);
        setIntField(term818840, term818840.getClass(), "prodResource", 0);
        setIntField(term818840, term818840.getClass(), "extraFood", 0);
        setIntField(term818840, term818840.getClass(), "culture", 0);
        setIntField(term818840, term818840.getClass(), "planetOwner", 0);
        setField(term818840, term818840.getClass(), "planetOwnerInfo", null);
        setField(term818840, term818840.getClass(), "homeWorldId", null);
        setIntField(term818840, term818840.getClass(), "startRealmIndex", 0);
        setIntField(term818840, term818840.getClass(), "tax", 0);
        setField(term818840, term818840.getClass(), "statuses", null);
        setField(term818840, term818840.getClass(), "timedStatuses", null);
        setField(term818840, term818840.getClass(), "event", null);
        setBooleanField(term818840, term818840.getClass(), "eventFound", false);
        setField(term818840, term818840.getClass(), "happinessEffect", null);
        setField(term818840, term818840.getClass(), "happinessExplanation", null);
        setField(term818840, term818840.getClass(), "farmProdExplain", null);
        setField(term818840, term818840.getClass(), "metaProdExplain", null);
        setField(term818840, term818840.getClass(), "prodProdExplain", null);
        setField(term818840, term818840.getClass(), "reseProdExplain", null);
        setField(term818840, term818840.getClass(), "cultProdExplain", null);
        setField(term818840, term818840.getClass(), "credProdExplain", null);
        setField(term818840, term818840.getClass(), "governor", null);
        setIntField(term818840, term818840.getClass(), "governorGuide", 0);
        setField(term818840, term818840.getClass(), "orbital", null);
        setField(term818840, term818840.getClass(), "workers", null);
        setField(term818840, term818840.getClass(), "buildings", null);
        setField(term818840, term818840.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "bombOneBuilding", argTypes, term818840, args);
    }

};


