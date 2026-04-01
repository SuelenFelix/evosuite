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

public class Planet_calculateHappiness_189685173255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1086346;

    public Planet_calculateHappiness_189685173255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1086346 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term1086346, term1086346.getClass(), "name", null);
        setIntField(term1086346, term1086346.getClass(), "orderNumber", 0);
        setField(term1086346, term1086346.getClass(), "radiationType", null);
        setField(term1086346, term1086346.getClass(), "gravityType", null);
        setField(term1086346, term1086346.getClass(), "temperatureType", null);
        setField(term1086346, term1086346.getClass(), "waterLevel", null);
        setBooleanField(term1086346, term1086346.getClass(), "gasGiant", false);
        setField(term1086346, term1086346.getClass(), "coordinate", null);
        setField(term1086346, term1086346.getClass(), "planetType", null);
        setIntField(term1086346, term1086346.getClass(), "groundSize", 0);
        setIntField(term1086346, term1086346.getClass(), "amountMetalInGround", 0);
        setIntField(term1086346, term1086346.getClass(), "metal", 0);
        setIntField(term1086346, term1086346.getClass(), "prodResource", 0);
        setIntField(term1086346, term1086346.getClass(), "extraFood", 0);
        setIntField(term1086346, term1086346.getClass(), "culture", 0);
        setIntField(term1086346, term1086346.getClass(), "planetOwner", 0);
        setField(term1086346, term1086346.getClass(), "planetOwnerInfo", null);
        setField(term1086346, term1086346.getClass(), "homeWorldId", null);
        setIntField(term1086346, term1086346.getClass(), "startRealmIndex", 0);
        setIntField(term1086346, term1086346.getClass(), "tax", 0);
        setField(term1086346, term1086346.getClass(), "statuses", null);
        setField(term1086346, term1086346.getClass(), "timedStatuses", null);
        setField(term1086346, term1086346.getClass(), "event", null);
        setBooleanField(term1086346, term1086346.getClass(), "eventFound", false);
        setField(term1086346, term1086346.getClass(), "happinessEffect", null);
        setField(term1086346, term1086346.getClass(), "happinessExplanation", null);
        setField(term1086346, term1086346.getClass(), "farmProdExplain", null);
        setField(term1086346, term1086346.getClass(), "metaProdExplain", null);
        setField(term1086346, term1086346.getClass(), "prodProdExplain", null);
        setField(term1086346, term1086346.getClass(), "reseProdExplain", null);
        setField(term1086346, term1086346.getClass(), "cultProdExplain", null);
        setField(term1086346, term1086346.getClass(), "credProdExplain", null);
        setField(term1086346, term1086346.getClass(), "governor", null);
        setIntField(term1086346, term1086346.getClass(), "governorGuide", 0);
        setField(term1086346, term1086346.getClass(), "orbital", null);
        setField(term1086346, term1086346.getClass(), "workers", null);
        setField(term1086346, term1086346.getClass(), "buildings", null);
        setField(term1086346, term1086346.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "calculateHappiness", argTypes, term1086346, args);
    }

};


