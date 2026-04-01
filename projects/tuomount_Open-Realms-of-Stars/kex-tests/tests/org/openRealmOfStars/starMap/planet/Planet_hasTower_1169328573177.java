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

public class Planet_hasTower_1169328573177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term747250;

    public Planet_hasTower_1169328573177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term747250 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term747250, term747250.getClass(), "name", null);
        setIntField(term747250, term747250.getClass(), "orderNumber", 0);
        setField(term747250, term747250.getClass(), "radiationType", null);
        setField(term747250, term747250.getClass(), "gravityType", null);
        setField(term747250, term747250.getClass(), "temperatureType", null);
        setField(term747250, term747250.getClass(), "waterLevel", null);
        setBooleanField(term747250, term747250.getClass(), "gasGiant", false);
        setField(term747250, term747250.getClass(), "coordinate", null);
        setField(term747250, term747250.getClass(), "planetType", null);
        setIntField(term747250, term747250.getClass(), "groundSize", 0);
        setIntField(term747250, term747250.getClass(), "amountMetalInGround", 0);
        setIntField(term747250, term747250.getClass(), "metal", 0);
        setIntField(term747250, term747250.getClass(), "prodResource", 0);
        setIntField(term747250, term747250.getClass(), "extraFood", 0);
        setIntField(term747250, term747250.getClass(), "culture", 0);
        setIntField(term747250, term747250.getClass(), "planetOwner", 0);
        setField(term747250, term747250.getClass(), "planetOwnerInfo", null);
        setField(term747250, term747250.getClass(), "homeWorldId", null);
        setIntField(term747250, term747250.getClass(), "startRealmIndex", 0);
        setIntField(term747250, term747250.getClass(), "tax", 0);
        setField(term747250, term747250.getClass(), "statuses", null);
        setField(term747250, term747250.getClass(), "timedStatuses", null);
        setField(term747250, term747250.getClass(), "event", null);
        setBooleanField(term747250, term747250.getClass(), "eventFound", false);
        setField(term747250, term747250.getClass(), "happinessEffect", null);
        setField(term747250, term747250.getClass(), "happinessExplanation", null);
        setField(term747250, term747250.getClass(), "farmProdExplain", null);
        setField(term747250, term747250.getClass(), "metaProdExplain", null);
        setField(term747250, term747250.getClass(), "prodProdExplain", null);
        setField(term747250, term747250.getClass(), "reseProdExplain", null);
        setField(term747250, term747250.getClass(), "cultProdExplain", null);
        setField(term747250, term747250.getClass(), "credProdExplain", null);
        setField(term747250, term747250.getClass(), "governor", null);
        setIntField(term747250, term747250.getClass(), "governorGuide", 0);
        setField(term747250, term747250.getClass(), "orbital", null);
        setField(term747250, term747250.getClass(), "workers", null);
        setField(term747250, term747250.getClass(), "buildings", null);
        setField(term747250, term747250.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasTower", argTypes, term747250, args);
    }

};


