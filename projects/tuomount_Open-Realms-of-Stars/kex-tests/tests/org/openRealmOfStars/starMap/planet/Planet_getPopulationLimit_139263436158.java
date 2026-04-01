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

public class Planet_getPopulationLimit_139263436158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term661993;

    public Planet_getPopulationLimit_139263436158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term661993 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term661993, term661993.getClass(), "name", null);
        setIntField(term661993, term661993.getClass(), "orderNumber", 0);
        setField(term661993, term661993.getClass(), "radiationType", null);
        setField(term661993, term661993.getClass(), "gravityType", null);
        setField(term661993, term661993.getClass(), "temperatureType", null);
        setField(term661993, term661993.getClass(), "waterLevel", null);
        setBooleanField(term661993, term661993.getClass(), "gasGiant", false);
        setField(term661993, term661993.getClass(), "coordinate", null);
        setField(term661993, term661993.getClass(), "planetType", null);
        setIntField(term661993, term661993.getClass(), "groundSize", 0);
        setIntField(term661993, term661993.getClass(), "amountMetalInGround", 0);
        setIntField(term661993, term661993.getClass(), "metal", 0);
        setIntField(term661993, term661993.getClass(), "prodResource", 0);
        setIntField(term661993, term661993.getClass(), "extraFood", 0);
        setIntField(term661993, term661993.getClass(), "culture", 0);
        setIntField(term661993, term661993.getClass(), "planetOwner", 0);
        setField(term661993, term661993.getClass(), "planetOwnerInfo", null);
        setField(term661993, term661993.getClass(), "homeWorldId", null);
        setIntField(term661993, term661993.getClass(), "startRealmIndex", 0);
        setIntField(term661993, term661993.getClass(), "tax", 0);
        setField(term661993, term661993.getClass(), "statuses", null);
        setField(term661993, term661993.getClass(), "timedStatuses", null);
        setField(term661993, term661993.getClass(), "event", null);
        setBooleanField(term661993, term661993.getClass(), "eventFound", false);
        setField(term661993, term661993.getClass(), "happinessEffect", null);
        setField(term661993, term661993.getClass(), "happinessExplanation", null);
        setField(term661993, term661993.getClass(), "farmProdExplain", null);
        setField(term661993, term661993.getClass(), "metaProdExplain", null);
        setField(term661993, term661993.getClass(), "prodProdExplain", null);
        setField(term661993, term661993.getClass(), "reseProdExplain", null);
        setField(term661993, term661993.getClass(), "cultProdExplain", null);
        setField(term661993, term661993.getClass(), "credProdExplain", null);
        setField(term661993, term661993.getClass(), "governor", null);
        setIntField(term661993, term661993.getClass(), "governorGuide", 0);
        setField(term661993, term661993.getClass(), "orbital", null);
        setField(term661993, term661993.getClass(), "workers", null);
        setField(term661993, term661993.getClass(), "buildings", null);
        setField(term661993, term661993.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPopulationLimit", argTypes, term661993, args);
    }

};


