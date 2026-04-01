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

public class Planet_calculateSurPlusFood_2122478250139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term591155;

    public Planet_calculateSurPlusFood_2122478250139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term591155 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term591155, term591155.getClass(), "name", null);
        setIntField(term591155, term591155.getClass(), "orderNumber", 0);
        setField(term591155, term591155.getClass(), "radiationType", null);
        setField(term591155, term591155.getClass(), "gravityType", null);
        setField(term591155, term591155.getClass(), "temperatureType", null);
        setField(term591155, term591155.getClass(), "waterLevel", null);
        setBooleanField(term591155, term591155.getClass(), "gasGiant", false);
        setField(term591155, term591155.getClass(), "coordinate", null);
        setField(term591155, term591155.getClass(), "planetType", null);
        setIntField(term591155, term591155.getClass(), "groundSize", 0);
        setIntField(term591155, term591155.getClass(), "amountMetalInGround", 0);
        setIntField(term591155, term591155.getClass(), "metal", 0);
        setIntField(term591155, term591155.getClass(), "prodResource", 0);
        setIntField(term591155, term591155.getClass(), "extraFood", 0);
        setIntField(term591155, term591155.getClass(), "culture", 0);
        setIntField(term591155, term591155.getClass(), "planetOwner", 0);
        setField(term591155, term591155.getClass(), "planetOwnerInfo", null);
        setField(term591155, term591155.getClass(), "homeWorldId", null);
        setIntField(term591155, term591155.getClass(), "startRealmIndex", 0);
        setIntField(term591155, term591155.getClass(), "tax", 0);
        setField(term591155, term591155.getClass(), "statuses", null);
        setField(term591155, term591155.getClass(), "timedStatuses", null);
        setField(term591155, term591155.getClass(), "event", null);
        setBooleanField(term591155, term591155.getClass(), "eventFound", false);
        setField(term591155, term591155.getClass(), "happinessEffect", null);
        setField(term591155, term591155.getClass(), "happinessExplanation", null);
        setField(term591155, term591155.getClass(), "farmProdExplain", null);
        setField(term591155, term591155.getClass(), "metaProdExplain", null);
        setField(term591155, term591155.getClass(), "prodProdExplain", null);
        setField(term591155, term591155.getClass(), "reseProdExplain", null);
        setField(term591155, term591155.getClass(), "cultProdExplain", null);
        setField(term591155, term591155.getClass(), "credProdExplain", null);
        setField(term591155, term591155.getClass(), "governor", null);
        setIntField(term591155, term591155.getClass(), "governorGuide", 0);
        setField(term591155, term591155.getClass(), "orbital", null);
        setField(term591155, term591155.getClass(), "workers", null);
        setField(term591155, term591155.getClass(), "buildings", null);
        setField(term591155, term591155.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "calculateSurPlusFood", argTypes, term591155, args);
    }

};


