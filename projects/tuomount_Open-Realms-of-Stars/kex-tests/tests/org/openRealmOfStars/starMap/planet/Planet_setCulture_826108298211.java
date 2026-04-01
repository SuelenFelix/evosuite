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
import java.lang.Integer;

public class Planet_setCulture_826108298211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2914382;
     Object term2914396;

    public Planet_setCulture_826108298211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2914382 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term2914382, term2914382.getClass(), "name", null);
        setIntField(term2914382, term2914382.getClass(), "orderNumber", 0);
        setField(term2914382, term2914382.getClass(), "radiationType", null);
        setField(term2914382, term2914382.getClass(), "gravityType", null);
        setField(term2914382, term2914382.getClass(), "temperatureType", null);
        setField(term2914382, term2914382.getClass(), "waterLevel", null);
        setBooleanField(term2914382, term2914382.getClass(), "gasGiant", false);
        setField(term2914382, term2914382.getClass(), "coordinate", null);
        setField(term2914382, term2914382.getClass(), "planetType", null);
        setIntField(term2914382, term2914382.getClass(), "groundSize", 0);
        setIntField(term2914382, term2914382.getClass(), "amountMetalInGround", 0);
        setIntField(term2914382, term2914382.getClass(), "metal", 0);
        setIntField(term2914382, term2914382.getClass(), "prodResource", 0);
        setIntField(term2914382, term2914382.getClass(), "extraFood", 0);
        setIntField(term2914382, term2914382.getClass(), "culture", 0);
        setIntField(term2914382, term2914382.getClass(), "planetOwner", 0);
        setField(term2914382, term2914382.getClass(), "planetOwnerInfo", null);
        setField(term2914382, term2914382.getClass(), "homeWorldId", null);
        setIntField(term2914382, term2914382.getClass(), "startRealmIndex", 0);
        setIntField(term2914382, term2914382.getClass(), "tax", 0);
        setField(term2914382, term2914382.getClass(), "statuses", null);
        setField(term2914382, term2914382.getClass(), "timedStatuses", null);
        setField(term2914382, term2914382.getClass(), "event", null);
        setBooleanField(term2914382, term2914382.getClass(), "eventFound", false);
        setField(term2914382, term2914382.getClass(), "happinessEffect", null);
        setField(term2914382, term2914382.getClass(), "happinessExplanation", null);
        setField(term2914382, term2914382.getClass(), "farmProdExplain", null);
        setField(term2914382, term2914382.getClass(), "metaProdExplain", null);
        setField(term2914382, term2914382.getClass(), "prodProdExplain", null);
        setField(term2914382, term2914382.getClass(), "reseProdExplain", null);
        setField(term2914382, term2914382.getClass(), "cultProdExplain", null);
        setField(term2914382, term2914382.getClass(), "credProdExplain", null);
        setField(term2914382, term2914382.getClass(), "governor", null);
        setIntField(term2914382, term2914382.getClass(), "governorGuide", 0);
        setField(term2914382, term2914382.getClass(), "orbital", null);
        setField(term2914382, term2914382.getClass(), "workers", null);
        setField(term2914382, term2914382.getClass(), "buildings", null);
        setField(term2914382, term2914382.getClass(), "underConstruction", null);
        term2914396 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2914396;
        callMethod(klass, "setCulture", argTypes, term2914382, args);
    }

};


