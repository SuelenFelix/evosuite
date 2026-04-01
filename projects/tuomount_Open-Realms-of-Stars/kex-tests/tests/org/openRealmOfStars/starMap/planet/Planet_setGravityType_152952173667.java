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

public class Planet_setGravityType_152952173667 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term285425;

    public Planet_setGravityType_152952173667() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term285425 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term285425, term285425.getClass(), "name", null);
        setIntField(term285425, term285425.getClass(), "orderNumber", 0);
        setField(term285425, term285425.getClass(), "radiationType", null);
        setField(term285425, term285425.getClass(), "gravityType", null);
        setField(term285425, term285425.getClass(), "temperatureType", null);
        setField(term285425, term285425.getClass(), "waterLevel", null);
        setBooleanField(term285425, term285425.getClass(), "gasGiant", false);
        setField(term285425, term285425.getClass(), "coordinate", null);
        setField(term285425, term285425.getClass(), "planetType", null);
        setIntField(term285425, term285425.getClass(), "groundSize", 0);
        setIntField(term285425, term285425.getClass(), "amountMetalInGround", 0);
        setIntField(term285425, term285425.getClass(), "metal", 0);
        setIntField(term285425, term285425.getClass(), "prodResource", 0);
        setIntField(term285425, term285425.getClass(), "extraFood", 0);
        setIntField(term285425, term285425.getClass(), "culture", 0);
        setIntField(term285425, term285425.getClass(), "planetOwner", 0);
        setField(term285425, term285425.getClass(), "planetOwnerInfo", null);
        setField(term285425, term285425.getClass(), "homeWorldId", null);
        setIntField(term285425, term285425.getClass(), "startRealmIndex", 0);
        setIntField(term285425, term285425.getClass(), "tax", 0);
        setField(term285425, term285425.getClass(), "statuses", null);
        setField(term285425, term285425.getClass(), "timedStatuses", null);
        setField(term285425, term285425.getClass(), "event", null);
        setBooleanField(term285425, term285425.getClass(), "eventFound", false);
        setField(term285425, term285425.getClass(), "happinessEffect", null);
        setField(term285425, term285425.getClass(), "happinessExplanation", null);
        setField(term285425, term285425.getClass(), "farmProdExplain", null);
        setField(term285425, term285425.getClass(), "metaProdExplain", null);
        setField(term285425, term285425.getClass(), "prodProdExplain", null);
        setField(term285425, term285425.getClass(), "reseProdExplain", null);
        setField(term285425, term285425.getClass(), "cultProdExplain", null);
        setField(term285425, term285425.getClass(), "credProdExplain", null);
        setField(term285425, term285425.getClass(), "governor", null);
        setIntField(term285425, term285425.getClass(), "governorGuide", 0);
        setField(term285425, term285425.getClass(), "orbital", null);
        setField(term285425, term285425.getClass(), "workers", null);
        setField(term285425, term285425.getClass(), "buildings", null);
        setField(term285425, term285425.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.enums.GravityType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setGravityType", argTypes, term285425, args);
    }

};


