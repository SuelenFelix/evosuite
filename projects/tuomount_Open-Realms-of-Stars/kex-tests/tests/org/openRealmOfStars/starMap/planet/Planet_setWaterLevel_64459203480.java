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

public class Planet_setWaterLevel_64459203480 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2367423;

    public Planet_setWaterLevel_64459203480() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2367423 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term2367423, term2367423.getClass(), "name", null);
        setIntField(term2367423, term2367423.getClass(), "orderNumber", 0);
        setField(term2367423, term2367423.getClass(), "radiationType", null);
        setField(term2367423, term2367423.getClass(), "gravityType", null);
        setField(term2367423, term2367423.getClass(), "temperatureType", null);
        setField(term2367423, term2367423.getClass(), "waterLevel", null);
        setBooleanField(term2367423, term2367423.getClass(), "gasGiant", false);
        setField(term2367423, term2367423.getClass(), "coordinate", null);
        setField(term2367423, term2367423.getClass(), "planetType", null);
        setIntField(term2367423, term2367423.getClass(), "groundSize", 0);
        setIntField(term2367423, term2367423.getClass(), "amountMetalInGround", 0);
        setIntField(term2367423, term2367423.getClass(), "metal", 0);
        setIntField(term2367423, term2367423.getClass(), "prodResource", 0);
        setIntField(term2367423, term2367423.getClass(), "extraFood", 0);
        setIntField(term2367423, term2367423.getClass(), "culture", 0);
        setIntField(term2367423, term2367423.getClass(), "planetOwner", 0);
        setField(term2367423, term2367423.getClass(), "planetOwnerInfo", null);
        setField(term2367423, term2367423.getClass(), "homeWorldId", null);
        setIntField(term2367423, term2367423.getClass(), "startRealmIndex", 0);
        setIntField(term2367423, term2367423.getClass(), "tax", 0);
        setField(term2367423, term2367423.getClass(), "statuses", null);
        setField(term2367423, term2367423.getClass(), "timedStatuses", null);
        setField(term2367423, term2367423.getClass(), "event", null);
        setBooleanField(term2367423, term2367423.getClass(), "eventFound", false);
        setField(term2367423, term2367423.getClass(), "happinessEffect", null);
        setField(term2367423, term2367423.getClass(), "happinessExplanation", null);
        setField(term2367423, term2367423.getClass(), "farmProdExplain", null);
        setField(term2367423, term2367423.getClass(), "metaProdExplain", null);
        setField(term2367423, term2367423.getClass(), "prodProdExplain", null);
        setField(term2367423, term2367423.getClass(), "reseProdExplain", null);
        setField(term2367423, term2367423.getClass(), "cultProdExplain", null);
        setField(term2367423, term2367423.getClass(), "credProdExplain", null);
        setField(term2367423, term2367423.getClass(), "governor", null);
        setIntField(term2367423, term2367423.getClass(), "governorGuide", 0);
        setField(term2367423, term2367423.getClass(), "orbital", null);
        setField(term2367423, term2367423.getClass(), "workers", null);
        setField(term2367423, term2367423.getClass(), "buildings", null);
        setField(term2367423, term2367423.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.enums.WaterLevelType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setWaterLevel", argTypes, term2367423, args);
    }

};


