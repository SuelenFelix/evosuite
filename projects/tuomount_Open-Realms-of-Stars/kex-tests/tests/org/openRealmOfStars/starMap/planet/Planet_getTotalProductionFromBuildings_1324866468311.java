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

public class Planet_getTotalProductionFromBuildings_1324866468311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1325798;
     Object term1325812;

    public Planet_getTotalProductionFromBuildings_1324866468311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1325798 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term1325798, term1325798.getClass(), "name", null);
        setIntField(term1325798, term1325798.getClass(), "orderNumber", 0);
        setField(term1325798, term1325798.getClass(), "radiationType", null);
        setField(term1325798, term1325798.getClass(), "gravityType", null);
        setField(term1325798, term1325798.getClass(), "temperatureType", null);
        setField(term1325798, term1325798.getClass(), "waterLevel", null);
        setBooleanField(term1325798, term1325798.getClass(), "gasGiant", false);
        setField(term1325798, term1325798.getClass(), "coordinate", null);
        setField(term1325798, term1325798.getClass(), "planetType", null);
        setIntField(term1325798, term1325798.getClass(), "groundSize", 0);
        setIntField(term1325798, term1325798.getClass(), "amountMetalInGround", 0);
        setIntField(term1325798, term1325798.getClass(), "metal", 0);
        setIntField(term1325798, term1325798.getClass(), "prodResource", 0);
        setIntField(term1325798, term1325798.getClass(), "extraFood", 0);
        setIntField(term1325798, term1325798.getClass(), "culture", 0);
        setIntField(term1325798, term1325798.getClass(), "planetOwner", 0);
        setField(term1325798, term1325798.getClass(), "planetOwnerInfo", null);
        setField(term1325798, term1325798.getClass(), "homeWorldId", null);
        setIntField(term1325798, term1325798.getClass(), "startRealmIndex", 0);
        setIntField(term1325798, term1325798.getClass(), "tax", 0);
        setField(term1325798, term1325798.getClass(), "statuses", null);
        setField(term1325798, term1325798.getClass(), "timedStatuses", null);
        setField(term1325798, term1325798.getClass(), "event", null);
        setBooleanField(term1325798, term1325798.getClass(), "eventFound", false);
        setField(term1325798, term1325798.getClass(), "happinessEffect", null);
        setField(term1325798, term1325798.getClass(), "happinessExplanation", null);
        setField(term1325798, term1325798.getClass(), "farmProdExplain", null);
        setField(term1325798, term1325798.getClass(), "metaProdExplain", null);
        setField(term1325798, term1325798.getClass(), "prodProdExplain", null);
        setField(term1325798, term1325798.getClass(), "reseProdExplain", null);
        setField(term1325798, term1325798.getClass(), "cultProdExplain", null);
        setField(term1325798, term1325798.getClass(), "credProdExplain", null);
        setField(term1325798, term1325798.getClass(), "governor", null);
        setIntField(term1325798, term1325798.getClass(), "governorGuide", 0);
        setField(term1325798, term1325798.getClass(), "orbital", null);
        setField(term1325798, term1325798.getClass(), "workers", null);
        setField(term1325798, term1325798.getClass(), "buildings", null);
        setField(term1325798, term1325798.getClass(), "underConstruction", null);
        term1325812 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1325812;
        callMethod(klass, "getTotalProductionFromBuildings", argTypes, term1325798, args);
    }

};


