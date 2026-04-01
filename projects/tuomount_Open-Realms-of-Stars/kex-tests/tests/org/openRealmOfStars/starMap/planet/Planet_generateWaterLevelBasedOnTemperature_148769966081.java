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

public class Planet_generateWaterLevelBasedOnTemperature_148769966081 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term343624;

    public Planet_generateWaterLevelBasedOnTemperature_148769966081() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term343624 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term343624, term343624.getClass(), "name", null);
        setIntField(term343624, term343624.getClass(), "orderNumber", 0);
        setField(term343624, term343624.getClass(), "radiationType", null);
        setField(term343624, term343624.getClass(), "gravityType", null);
        setField(term343624, term343624.getClass(), "temperatureType", null);
        setField(term343624, term343624.getClass(), "waterLevel", null);
        setBooleanField(term343624, term343624.getClass(), "gasGiant", false);
        setField(term343624, term343624.getClass(), "coordinate", null);
        setField(term343624, term343624.getClass(), "planetType", null);
        setIntField(term343624, term343624.getClass(), "groundSize", 0);
        setIntField(term343624, term343624.getClass(), "amountMetalInGround", 0);
        setIntField(term343624, term343624.getClass(), "metal", 0);
        setIntField(term343624, term343624.getClass(), "prodResource", 0);
        setIntField(term343624, term343624.getClass(), "extraFood", 0);
        setIntField(term343624, term343624.getClass(), "culture", 0);
        setIntField(term343624, term343624.getClass(), "planetOwner", 0);
        setField(term343624, term343624.getClass(), "planetOwnerInfo", null);
        setField(term343624, term343624.getClass(), "homeWorldId", null);
        setIntField(term343624, term343624.getClass(), "startRealmIndex", 0);
        setIntField(term343624, term343624.getClass(), "tax", 0);
        setField(term343624, term343624.getClass(), "statuses", null);
        setField(term343624, term343624.getClass(), "timedStatuses", null);
        setField(term343624, term343624.getClass(), "event", null);
        setBooleanField(term343624, term343624.getClass(), "eventFound", false);
        setField(term343624, term343624.getClass(), "happinessEffect", null);
        setField(term343624, term343624.getClass(), "happinessExplanation", null);
        setField(term343624, term343624.getClass(), "farmProdExplain", null);
        setField(term343624, term343624.getClass(), "metaProdExplain", null);
        setField(term343624, term343624.getClass(), "prodProdExplain", null);
        setField(term343624, term343624.getClass(), "reseProdExplain", null);
        setField(term343624, term343624.getClass(), "cultProdExplain", null);
        setField(term343624, term343624.getClass(), "credProdExplain", null);
        setField(term343624, term343624.getClass(), "governor", null);
        setIntField(term343624, term343624.getClass(), "governorGuide", 0);
        setField(term343624, term343624.getClass(), "orbital", null);
        setField(term343624, term343624.getClass(), "workers", null);
        setField(term343624, term343624.getClass(), "buildings", null);
        setField(term343624, term343624.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "generateWaterLevelBasedOnTemperature", argTypes, term343624, args);
    }

};


