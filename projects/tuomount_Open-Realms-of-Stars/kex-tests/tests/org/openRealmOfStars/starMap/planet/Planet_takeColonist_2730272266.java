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

public class Planet_takeColonist_2730272266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39827;

    public Planet_takeColonist_2730272266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39827 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term39827, term39827.getClass(), "name", null);
        setIntField(term39827, term39827.getClass(), "orderNumber", 0);
        setField(term39827, term39827.getClass(), "radiationType", null);
        setField(term39827, term39827.getClass(), "gravityType", null);
        setField(term39827, term39827.getClass(), "temperatureType", null);
        setField(term39827, term39827.getClass(), "waterLevel", null);
        setBooleanField(term39827, term39827.getClass(), "gasGiant", false);
        setField(term39827, term39827.getClass(), "coordinate", null);
        setField(term39827, term39827.getClass(), "planetType", null);
        setIntField(term39827, term39827.getClass(), "groundSize", 0);
        setIntField(term39827, term39827.getClass(), "amountMetalInGround", 0);
        setIntField(term39827, term39827.getClass(), "metal", 0);
        setIntField(term39827, term39827.getClass(), "prodResource", 0);
        setIntField(term39827, term39827.getClass(), "extraFood", 0);
        setIntField(term39827, term39827.getClass(), "culture", 0);
        setIntField(term39827, term39827.getClass(), "planetOwner", 0);
        setField(term39827, term39827.getClass(), "planetOwnerInfo", null);
        setField(term39827, term39827.getClass(), "homeWorldId", null);
        setIntField(term39827, term39827.getClass(), "startRealmIndex", 0);
        setIntField(term39827, term39827.getClass(), "tax", 0);
        setField(term39827, term39827.getClass(), "statuses", null);
        setField(term39827, term39827.getClass(), "timedStatuses", null);
        setField(term39827, term39827.getClass(), "event", null);
        setBooleanField(term39827, term39827.getClass(), "eventFound", false);
        setField(term39827, term39827.getClass(), "happinessEffect", null);
        setField(term39827, term39827.getClass(), "happinessExplanation", null);
        setField(term39827, term39827.getClass(), "farmProdExplain", null);
        setField(term39827, term39827.getClass(), "metaProdExplain", null);
        setField(term39827, term39827.getClass(), "prodProdExplain", null);
        setField(term39827, term39827.getClass(), "reseProdExplain", null);
        setField(term39827, term39827.getClass(), "cultProdExplain", null);
        setField(term39827, term39827.getClass(), "credProdExplain", null);
        setField(term39827, term39827.getClass(), "governor", null);
        setIntField(term39827, term39827.getClass(), "governorGuide", 0);
        setField(term39827, term39827.getClass(), "orbital", null);
        setField(term39827, term39827.getClass(), "workers", null);
        setField(term39827, term39827.getClass(), "buildings", null);
        setField(term39827, term39827.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "takeColonist", argTypes, term39827, args);
    }

};


