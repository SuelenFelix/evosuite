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

public class Planet_getPlanetTypeIndex_34256930330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1326074;

    public Planet_getPlanetTypeIndex_34256930330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1326074 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term1326074, term1326074.getClass(), "name", null);
        setIntField(term1326074, term1326074.getClass(), "orderNumber", 0);
        setField(term1326074, term1326074.getClass(), "radiationType", null);
        setField(term1326074, term1326074.getClass(), "gravityType", null);
        setField(term1326074, term1326074.getClass(), "temperatureType", null);
        setField(term1326074, term1326074.getClass(), "waterLevel", null);
        setBooleanField(term1326074, term1326074.getClass(), "gasGiant", false);
        setField(term1326074, term1326074.getClass(), "coordinate", null);
        setField(term1326074, term1326074.getClass(), "planetType", null);
        setIntField(term1326074, term1326074.getClass(), "groundSize", 0);
        setIntField(term1326074, term1326074.getClass(), "amountMetalInGround", 0);
        setIntField(term1326074, term1326074.getClass(), "metal", 0);
        setIntField(term1326074, term1326074.getClass(), "prodResource", 0);
        setIntField(term1326074, term1326074.getClass(), "extraFood", 0);
        setIntField(term1326074, term1326074.getClass(), "culture", 0);
        setIntField(term1326074, term1326074.getClass(), "planetOwner", 0);
        setField(term1326074, term1326074.getClass(), "planetOwnerInfo", null);
        setField(term1326074, term1326074.getClass(), "homeWorldId", null);
        setIntField(term1326074, term1326074.getClass(), "startRealmIndex", 0);
        setIntField(term1326074, term1326074.getClass(), "tax", 0);
        setField(term1326074, term1326074.getClass(), "statuses", null);
        setField(term1326074, term1326074.getClass(), "timedStatuses", null);
        setField(term1326074, term1326074.getClass(), "event", null);
        setBooleanField(term1326074, term1326074.getClass(), "eventFound", false);
        setField(term1326074, term1326074.getClass(), "happinessEffect", null);
        setField(term1326074, term1326074.getClass(), "happinessExplanation", null);
        setField(term1326074, term1326074.getClass(), "farmProdExplain", null);
        setField(term1326074, term1326074.getClass(), "metaProdExplain", null);
        setField(term1326074, term1326074.getClass(), "prodProdExplain", null);
        setField(term1326074, term1326074.getClass(), "reseProdExplain", null);
        setField(term1326074, term1326074.getClass(), "cultProdExplain", null);
        setField(term1326074, term1326074.getClass(), "credProdExplain", null);
        setField(term1326074, term1326074.getClass(), "governor", null);
        setIntField(term1326074, term1326074.getClass(), "governorGuide", 0);
        setField(term1326074, term1326074.getClass(), "orbital", null);
        setField(term1326074, term1326074.getClass(), "workers", null);
        setField(term1326074, term1326074.getClass(), "buildings", null);
        setField(term1326074, term1326074.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlanetTypeIndex", argTypes, term1326074, args);
    }

};


