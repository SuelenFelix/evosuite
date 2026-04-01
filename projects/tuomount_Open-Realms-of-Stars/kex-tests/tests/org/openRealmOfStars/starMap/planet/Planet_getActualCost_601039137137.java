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

public class Planet_getActualCost_601039137137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term585686;
     Object term585700;

    public Planet_getActualCost_601039137137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term585686 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term585686, term585686.getClass(), "name", null);
        setIntField(term585686, term585686.getClass(), "orderNumber", 0);
        setField(term585686, term585686.getClass(), "radiationType", null);
        setField(term585686, term585686.getClass(), "gravityType", null);
        setField(term585686, term585686.getClass(), "temperatureType", null);
        setField(term585686, term585686.getClass(), "waterLevel", null);
        setBooleanField(term585686, term585686.getClass(), "gasGiant", false);
        setField(term585686, term585686.getClass(), "coordinate", null);
        setField(term585686, term585686.getClass(), "planetType", null);
        setIntField(term585686, term585686.getClass(), "groundSize", 0);
        setIntField(term585686, term585686.getClass(), "amountMetalInGround", 0);
        setIntField(term585686, term585686.getClass(), "metal", 0);
        setIntField(term585686, term585686.getClass(), "prodResource", 0);
        setIntField(term585686, term585686.getClass(), "extraFood", 0);
        setIntField(term585686, term585686.getClass(), "culture", 0);
        setIntField(term585686, term585686.getClass(), "planetOwner", 0);
        setField(term585686, term585686.getClass(), "planetOwnerInfo", null);
        setField(term585686, term585686.getClass(), "homeWorldId", null);
        setIntField(term585686, term585686.getClass(), "startRealmIndex", 0);
        setIntField(term585686, term585686.getClass(), "tax", 0);
        setField(term585686, term585686.getClass(), "statuses", null);
        setField(term585686, term585686.getClass(), "timedStatuses", null);
        setField(term585686, term585686.getClass(), "event", null);
        setBooleanField(term585686, term585686.getClass(), "eventFound", false);
        setField(term585686, term585686.getClass(), "happinessEffect", null);
        setField(term585686, term585686.getClass(), "happinessExplanation", null);
        setField(term585686, term585686.getClass(), "farmProdExplain", null);
        setField(term585686, term585686.getClass(), "metaProdExplain", null);
        setField(term585686, term585686.getClass(), "prodProdExplain", null);
        setField(term585686, term585686.getClass(), "reseProdExplain", null);
        setField(term585686, term585686.getClass(), "cultProdExplain", null);
        setField(term585686, term585686.getClass(), "credProdExplain", null);
        setField(term585686, term585686.getClass(), "governor", null);
        setIntField(term585686, term585686.getClass(), "governorGuide", 0);
        setField(term585686, term585686.getClass(), "orbital", null);
        setField(term585686, term585686.getClass(), "workers", null);
        setField(term585686, term585686.getClass(), "buildings", null);
        setField(term585686, term585686.getClass(), "underConstruction", null);
        term585700 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.construction.Construction");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term585700;
        callMethod(klass, "getActualCost", argTypes, term585686, args);
    }

};


