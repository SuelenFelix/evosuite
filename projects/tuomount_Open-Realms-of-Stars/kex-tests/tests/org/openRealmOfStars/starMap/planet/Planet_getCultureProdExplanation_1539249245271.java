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

public class Planet_getCultureProdExplanation_1539249245271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3180990;

    public Planet_getCultureProdExplanation_1539249245271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3180990 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term3180990, term3180990.getClass(), "name", null);
        setIntField(term3180990, term3180990.getClass(), "orderNumber", 0);
        setField(term3180990, term3180990.getClass(), "radiationType", null);
        setField(term3180990, term3180990.getClass(), "gravityType", null);
        setField(term3180990, term3180990.getClass(), "temperatureType", null);
        setField(term3180990, term3180990.getClass(), "waterLevel", null);
        setBooleanField(term3180990, term3180990.getClass(), "gasGiant", false);
        setField(term3180990, term3180990.getClass(), "coordinate", null);
        setField(term3180990, term3180990.getClass(), "planetType", null);
        setIntField(term3180990, term3180990.getClass(), "groundSize", 0);
        setIntField(term3180990, term3180990.getClass(), "amountMetalInGround", 0);
        setIntField(term3180990, term3180990.getClass(), "metal", 0);
        setIntField(term3180990, term3180990.getClass(), "prodResource", 0);
        setIntField(term3180990, term3180990.getClass(), "extraFood", 0);
        setIntField(term3180990, term3180990.getClass(), "culture", 0);
        setIntField(term3180990, term3180990.getClass(), "planetOwner", 0);
        setField(term3180990, term3180990.getClass(), "planetOwnerInfo", null);
        setField(term3180990, term3180990.getClass(), "homeWorldId", null);
        setIntField(term3180990, term3180990.getClass(), "startRealmIndex", 0);
        setIntField(term3180990, term3180990.getClass(), "tax", 0);
        setField(term3180990, term3180990.getClass(), "statuses", null);
        setField(term3180990, term3180990.getClass(), "timedStatuses", null);
        setField(term3180990, term3180990.getClass(), "event", null);
        setBooleanField(term3180990, term3180990.getClass(), "eventFound", false);
        setField(term3180990, term3180990.getClass(), "happinessEffect", null);
        setField(term3180990, term3180990.getClass(), "happinessExplanation", null);
        setField(term3180990, term3180990.getClass(), "farmProdExplain", null);
        setField(term3180990, term3180990.getClass(), "metaProdExplain", null);
        setField(term3180990, term3180990.getClass(), "prodProdExplain", null);
        setField(term3180990, term3180990.getClass(), "reseProdExplain", null);
        setField(term3180990, term3180990.getClass(), "cultProdExplain", null);
        setField(term3180990, term3180990.getClass(), "credProdExplain", null);
        setField(term3180990, term3180990.getClass(), "governor", null);
        setIntField(term3180990, term3180990.getClass(), "governorGuide", 0);
        setField(term3180990, term3180990.getClass(), "orbital", null);
        setField(term3180990, term3180990.getClass(), "workers", null);
        setField(term3180990, term3180990.getClass(), "buildings", null);
        setField(term3180990, term3180990.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCultureProdExplanation", argTypes, term3180990, args);
    }

};


