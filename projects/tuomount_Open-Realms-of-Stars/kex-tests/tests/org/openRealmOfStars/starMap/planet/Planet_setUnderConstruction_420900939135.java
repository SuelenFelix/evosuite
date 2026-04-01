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

public class Planet_setUnderConstruction_420900939135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term578803;

    public Planet_setUnderConstruction_420900939135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term578803 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term578803, term578803.getClass(), "name", null);
        setIntField(term578803, term578803.getClass(), "orderNumber", 0);
        setField(term578803, term578803.getClass(), "radiationType", null);
        setField(term578803, term578803.getClass(), "gravityType", null);
        setField(term578803, term578803.getClass(), "temperatureType", null);
        setField(term578803, term578803.getClass(), "waterLevel", null);
        setBooleanField(term578803, term578803.getClass(), "gasGiant", false);
        setField(term578803, term578803.getClass(), "coordinate", null);
        setField(term578803, term578803.getClass(), "planetType", null);
        setIntField(term578803, term578803.getClass(), "groundSize", 0);
        setIntField(term578803, term578803.getClass(), "amountMetalInGround", 0);
        setIntField(term578803, term578803.getClass(), "metal", 0);
        setIntField(term578803, term578803.getClass(), "prodResource", 0);
        setIntField(term578803, term578803.getClass(), "extraFood", 0);
        setIntField(term578803, term578803.getClass(), "culture", 0);
        setIntField(term578803, term578803.getClass(), "planetOwner", 0);
        setField(term578803, term578803.getClass(), "planetOwnerInfo", null);
        setField(term578803, term578803.getClass(), "homeWorldId", null);
        setIntField(term578803, term578803.getClass(), "startRealmIndex", 0);
        setIntField(term578803, term578803.getClass(), "tax", 0);
        setField(term578803, term578803.getClass(), "statuses", null);
        setField(term578803, term578803.getClass(), "timedStatuses", null);
        setField(term578803, term578803.getClass(), "event", null);
        setBooleanField(term578803, term578803.getClass(), "eventFound", false);
        setField(term578803, term578803.getClass(), "happinessEffect", null);
        setField(term578803, term578803.getClass(), "happinessExplanation", null);
        setField(term578803, term578803.getClass(), "farmProdExplain", null);
        setField(term578803, term578803.getClass(), "metaProdExplain", null);
        setField(term578803, term578803.getClass(), "prodProdExplain", null);
        setField(term578803, term578803.getClass(), "reseProdExplain", null);
        setField(term578803, term578803.getClass(), "cultProdExplain", null);
        setField(term578803, term578803.getClass(), "credProdExplain", null);
        setField(term578803, term578803.getClass(), "governor", null);
        setIntField(term578803, term578803.getClass(), "governorGuide", 0);
        setField(term578803, term578803.getClass(), "orbital", null);
        setField(term578803, term578803.getClass(), "workers", null);
        setField(term578803, term578803.getClass(), "buildings", null);
        setField(term578803, term578803.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.construction.Construction");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUnderConstruction", argTypes, term578803, args);
    }

};


