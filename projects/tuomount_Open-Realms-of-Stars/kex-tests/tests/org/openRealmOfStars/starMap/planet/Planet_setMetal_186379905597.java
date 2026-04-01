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

public class Planet_setMetal_186379905597 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2429575;
     Object term2429589;

    public Planet_setMetal_186379905597() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2429575 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term2429575, term2429575.getClass(), "name", null);
        setIntField(term2429575, term2429575.getClass(), "orderNumber", 0);
        setField(term2429575, term2429575.getClass(), "radiationType", null);
        setField(term2429575, term2429575.getClass(), "gravityType", null);
        setField(term2429575, term2429575.getClass(), "temperatureType", null);
        setField(term2429575, term2429575.getClass(), "waterLevel", null);
        setBooleanField(term2429575, term2429575.getClass(), "gasGiant", false);
        setField(term2429575, term2429575.getClass(), "coordinate", null);
        setField(term2429575, term2429575.getClass(), "planetType", null);
        setIntField(term2429575, term2429575.getClass(), "groundSize", 0);
        setIntField(term2429575, term2429575.getClass(), "amountMetalInGround", 0);
        setIntField(term2429575, term2429575.getClass(), "metal", 0);
        setIntField(term2429575, term2429575.getClass(), "prodResource", 0);
        setIntField(term2429575, term2429575.getClass(), "extraFood", 0);
        setIntField(term2429575, term2429575.getClass(), "culture", 0);
        setIntField(term2429575, term2429575.getClass(), "planetOwner", 0);
        setField(term2429575, term2429575.getClass(), "planetOwnerInfo", null);
        setField(term2429575, term2429575.getClass(), "homeWorldId", null);
        setIntField(term2429575, term2429575.getClass(), "startRealmIndex", 0);
        setIntField(term2429575, term2429575.getClass(), "tax", 0);
        setField(term2429575, term2429575.getClass(), "statuses", null);
        setField(term2429575, term2429575.getClass(), "timedStatuses", null);
        setField(term2429575, term2429575.getClass(), "event", null);
        setBooleanField(term2429575, term2429575.getClass(), "eventFound", false);
        setField(term2429575, term2429575.getClass(), "happinessEffect", null);
        setField(term2429575, term2429575.getClass(), "happinessExplanation", null);
        setField(term2429575, term2429575.getClass(), "farmProdExplain", null);
        setField(term2429575, term2429575.getClass(), "metaProdExplain", null);
        setField(term2429575, term2429575.getClass(), "prodProdExplain", null);
        setField(term2429575, term2429575.getClass(), "reseProdExplain", null);
        setField(term2429575, term2429575.getClass(), "cultProdExplain", null);
        setField(term2429575, term2429575.getClass(), "credProdExplain", null);
        setField(term2429575, term2429575.getClass(), "governor", null);
        setIntField(term2429575, term2429575.getClass(), "governorGuide", 0);
        setField(term2429575, term2429575.getClass(), "orbital", null);
        setField(term2429575, term2429575.getClass(), "workers", null);
        setField(term2429575, term2429575.getClass(), "buildings", null);
        setField(term2429575, term2429575.getClass(), "underConstruction", null);
        term2429589 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2429589;
        callMethod(klass, "setMetal", argTypes, term2429575, args);
    }

};


