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

public class Planet_destroyOneBuilding_1984737293193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term812619;

    public Planet_destroyOneBuilding_1984737293193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term812619 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term812619, term812619.getClass(), "name", null);
        setIntField(term812619, term812619.getClass(), "orderNumber", 0);
        setField(term812619, term812619.getClass(), "radiationType", null);
        setField(term812619, term812619.getClass(), "gravityType", null);
        setField(term812619, term812619.getClass(), "temperatureType", null);
        setField(term812619, term812619.getClass(), "waterLevel", null);
        setBooleanField(term812619, term812619.getClass(), "gasGiant", false);
        setField(term812619, term812619.getClass(), "coordinate", null);
        setField(term812619, term812619.getClass(), "planetType", null);
        setIntField(term812619, term812619.getClass(), "groundSize", 0);
        setIntField(term812619, term812619.getClass(), "amountMetalInGround", 0);
        setIntField(term812619, term812619.getClass(), "metal", 0);
        setIntField(term812619, term812619.getClass(), "prodResource", 0);
        setIntField(term812619, term812619.getClass(), "extraFood", 0);
        setIntField(term812619, term812619.getClass(), "culture", 0);
        setIntField(term812619, term812619.getClass(), "planetOwner", 0);
        setField(term812619, term812619.getClass(), "planetOwnerInfo", null);
        setField(term812619, term812619.getClass(), "homeWorldId", null);
        setIntField(term812619, term812619.getClass(), "startRealmIndex", 0);
        setIntField(term812619, term812619.getClass(), "tax", 0);
        setField(term812619, term812619.getClass(), "statuses", null);
        setField(term812619, term812619.getClass(), "timedStatuses", null);
        setField(term812619, term812619.getClass(), "event", null);
        setBooleanField(term812619, term812619.getClass(), "eventFound", false);
        setField(term812619, term812619.getClass(), "happinessEffect", null);
        setField(term812619, term812619.getClass(), "happinessExplanation", null);
        setField(term812619, term812619.getClass(), "farmProdExplain", null);
        setField(term812619, term812619.getClass(), "metaProdExplain", null);
        setField(term812619, term812619.getClass(), "prodProdExplain", null);
        setField(term812619, term812619.getClass(), "reseProdExplain", null);
        setField(term812619, term812619.getClass(), "cultProdExplain", null);
        setField(term812619, term812619.getClass(), "credProdExplain", null);
        setField(term812619, term812619.getClass(), "governor", null);
        setIntField(term812619, term812619.getClass(), "governorGuide", 0);
        setField(term812619, term812619.getClass(), "orbital", null);
        setField(term812619, term812619.getClass(), "workers", null);
        setField(term812619, term812619.getClass(), "buildings", null);
        setField(term812619, term812619.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "destroyOneBuilding", argTypes, term812619, args);
    }

};


