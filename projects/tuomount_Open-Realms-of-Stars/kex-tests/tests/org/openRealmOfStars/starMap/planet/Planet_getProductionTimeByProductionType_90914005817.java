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

public class Planet_getProductionTimeByProductionType_90914005817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96454;
     Object term96468;
     Object term96470;

    public Planet_getProductionTimeByProductionType_90914005817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96454 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term96454, term96454.getClass(), "name", null);
        setIntField(term96454, term96454.getClass(), "orderNumber", 0);
        setField(term96454, term96454.getClass(), "radiationType", null);
        setField(term96454, term96454.getClass(), "gravityType", null);
        setField(term96454, term96454.getClass(), "temperatureType", null);
        setField(term96454, term96454.getClass(), "waterLevel", null);
        setBooleanField(term96454, term96454.getClass(), "gasGiant", false);
        setField(term96454, term96454.getClass(), "coordinate", null);
        setField(term96454, term96454.getClass(), "planetType", null);
        setIntField(term96454, term96454.getClass(), "groundSize", 0);
        setIntField(term96454, term96454.getClass(), "amountMetalInGround", 0);
        setIntField(term96454, term96454.getClass(), "metal", 0);
        setIntField(term96454, term96454.getClass(), "prodResource", 0);
        setIntField(term96454, term96454.getClass(), "extraFood", 0);
        setIntField(term96454, term96454.getClass(), "culture", 0);
        setIntField(term96454, term96454.getClass(), "planetOwner", 0);
        setField(term96454, term96454.getClass(), "planetOwnerInfo", null);
        setField(term96454, term96454.getClass(), "homeWorldId", null);
        setIntField(term96454, term96454.getClass(), "startRealmIndex", 0);
        setIntField(term96454, term96454.getClass(), "tax", 0);
        setField(term96454, term96454.getClass(), "statuses", null);
        setField(term96454, term96454.getClass(), "timedStatuses", null);
        setField(term96454, term96454.getClass(), "event", null);
        setBooleanField(term96454, term96454.getClass(), "eventFound", false);
        setField(term96454, term96454.getClass(), "happinessEffect", null);
        setField(term96454, term96454.getClass(), "happinessExplanation", null);
        setField(term96454, term96454.getClass(), "farmProdExplain", null);
        setField(term96454, term96454.getClass(), "metaProdExplain", null);
        setField(term96454, term96454.getClass(), "prodProdExplain", null);
        setField(term96454, term96454.getClass(), "reseProdExplain", null);
        setField(term96454, term96454.getClass(), "cultProdExplain", null);
        setField(term96454, term96454.getClass(), "credProdExplain", null);
        setField(term96454, term96454.getClass(), "governor", null);
        setIntField(term96454, term96454.getClass(), "governorGuide", 0);
        setField(term96454, term96454.getClass(), "orbital", null);
        setField(term96454, term96454.getClass(), "workers", null);
        setField(term96454, term96454.getClass(), "buildings", null);
        setField(term96454, term96454.getClass(), "underConstruction", null);
        term96468 = new Integer(0);
        term96470 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term96468;
        args[1] = term96470;
        callMethod(klass, "getProductionTimeByProductionType", argTypes, term96454, args);
    }

};


