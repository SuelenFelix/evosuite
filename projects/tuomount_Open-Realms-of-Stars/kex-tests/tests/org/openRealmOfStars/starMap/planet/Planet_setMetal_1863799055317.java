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

public class Planet_setMetal_1863799055317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1325886;
     Object term1325900;

    public Planet_setMetal_1863799055317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1325886 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term1325886, term1325886.getClass(), "name", null);
        setIntField(term1325886, term1325886.getClass(), "orderNumber", 0);
        setField(term1325886, term1325886.getClass(), "radiationType", null);
        setField(term1325886, term1325886.getClass(), "gravityType", null);
        setField(term1325886, term1325886.getClass(), "temperatureType", null);
        setField(term1325886, term1325886.getClass(), "waterLevel", null);
        setBooleanField(term1325886, term1325886.getClass(), "gasGiant", false);
        setField(term1325886, term1325886.getClass(), "coordinate", null);
        setField(term1325886, term1325886.getClass(), "planetType", null);
        setIntField(term1325886, term1325886.getClass(), "groundSize", 0);
        setIntField(term1325886, term1325886.getClass(), "amountMetalInGround", 0);
        setIntField(term1325886, term1325886.getClass(), "metal", 0);
        setIntField(term1325886, term1325886.getClass(), "prodResource", 0);
        setIntField(term1325886, term1325886.getClass(), "extraFood", 0);
        setIntField(term1325886, term1325886.getClass(), "culture", 0);
        setIntField(term1325886, term1325886.getClass(), "planetOwner", 0);
        setField(term1325886, term1325886.getClass(), "planetOwnerInfo", null);
        setField(term1325886, term1325886.getClass(), "homeWorldId", null);
        setIntField(term1325886, term1325886.getClass(), "startRealmIndex", 0);
        setIntField(term1325886, term1325886.getClass(), "tax", 0);
        setField(term1325886, term1325886.getClass(), "statuses", null);
        setField(term1325886, term1325886.getClass(), "timedStatuses", null);
        setField(term1325886, term1325886.getClass(), "event", null);
        setBooleanField(term1325886, term1325886.getClass(), "eventFound", false);
        setField(term1325886, term1325886.getClass(), "happinessEffect", null);
        setField(term1325886, term1325886.getClass(), "happinessExplanation", null);
        setField(term1325886, term1325886.getClass(), "farmProdExplain", null);
        setField(term1325886, term1325886.getClass(), "metaProdExplain", null);
        setField(term1325886, term1325886.getClass(), "prodProdExplain", null);
        setField(term1325886, term1325886.getClass(), "reseProdExplain", null);
        setField(term1325886, term1325886.getClass(), "cultProdExplain", null);
        setField(term1325886, term1325886.getClass(), "credProdExplain", null);
        setField(term1325886, term1325886.getClass(), "governor", null);
        setIntField(term1325886, term1325886.getClass(), "governorGuide", 0);
        setField(term1325886, term1325886.getClass(), "orbital", null);
        setField(term1325886, term1325886.getClass(), "workers", null);
        setField(term1325886, term1325886.getClass(), "buildings", null);
        setField(term1325886, term1325886.getClass(), "underConstruction", null);
        term1325900 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1325900;
        callMethod(klass, "setMetal", argTypes, term1325886, args);
    }

};


