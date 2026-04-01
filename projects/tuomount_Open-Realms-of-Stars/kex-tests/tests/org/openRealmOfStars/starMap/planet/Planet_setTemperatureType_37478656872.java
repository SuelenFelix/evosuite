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

public class Planet_setTemperatureType_37478656872 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2335525;

    public Planet_setTemperatureType_37478656872() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2335525 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term2335525, term2335525.getClass(), "name", null);
        setIntField(term2335525, term2335525.getClass(), "orderNumber", 0);
        setField(term2335525, term2335525.getClass(), "radiationType", null);
        setField(term2335525, term2335525.getClass(), "gravityType", null);
        setField(term2335525, term2335525.getClass(), "temperatureType", null);
        setField(term2335525, term2335525.getClass(), "waterLevel", null);
        setBooleanField(term2335525, term2335525.getClass(), "gasGiant", false);
        setField(term2335525, term2335525.getClass(), "coordinate", null);
        setField(term2335525, term2335525.getClass(), "planetType", null);
        setIntField(term2335525, term2335525.getClass(), "groundSize", 0);
        setIntField(term2335525, term2335525.getClass(), "amountMetalInGround", 0);
        setIntField(term2335525, term2335525.getClass(), "metal", 0);
        setIntField(term2335525, term2335525.getClass(), "prodResource", 0);
        setIntField(term2335525, term2335525.getClass(), "extraFood", 0);
        setIntField(term2335525, term2335525.getClass(), "culture", 0);
        setIntField(term2335525, term2335525.getClass(), "planetOwner", 0);
        setField(term2335525, term2335525.getClass(), "planetOwnerInfo", null);
        setField(term2335525, term2335525.getClass(), "homeWorldId", null);
        setIntField(term2335525, term2335525.getClass(), "startRealmIndex", 0);
        setIntField(term2335525, term2335525.getClass(), "tax", 0);
        setField(term2335525, term2335525.getClass(), "statuses", null);
        setField(term2335525, term2335525.getClass(), "timedStatuses", null);
        setField(term2335525, term2335525.getClass(), "event", null);
        setBooleanField(term2335525, term2335525.getClass(), "eventFound", false);
        setField(term2335525, term2335525.getClass(), "happinessEffect", null);
        setField(term2335525, term2335525.getClass(), "happinessExplanation", null);
        setField(term2335525, term2335525.getClass(), "farmProdExplain", null);
        setField(term2335525, term2335525.getClass(), "metaProdExplain", null);
        setField(term2335525, term2335525.getClass(), "prodProdExplain", null);
        setField(term2335525, term2335525.getClass(), "reseProdExplain", null);
        setField(term2335525, term2335525.getClass(), "cultProdExplain", null);
        setField(term2335525, term2335525.getClass(), "credProdExplain", null);
        setField(term2335525, term2335525.getClass(), "governor", null);
        setIntField(term2335525, term2335525.getClass(), "governorGuide", 0);
        setField(term2335525, term2335525.getClass(), "orbital", null);
        setField(term2335525, term2335525.getClass(), "workers", null);
        setField(term2335525, term2335525.getClass(), "buildings", null);
        setField(term2335525, term2335525.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.enums.TemperatureType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setTemperatureType", argTypes, term2335525, args);
    }

};


