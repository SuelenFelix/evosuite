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

public class Planet_getPopulationLimitIgnoreRadiation_1390813877167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2704659;

    public Planet_getPopulationLimitIgnoreRadiation_1390813877167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2704659 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term2704659, term2704659.getClass(), "name", null);
        setIntField(term2704659, term2704659.getClass(), "orderNumber", 0);
        setField(term2704659, term2704659.getClass(), "radiationType", null);
        setField(term2704659, term2704659.getClass(), "gravityType", null);
        setField(term2704659, term2704659.getClass(), "temperatureType", null);
        setField(term2704659, term2704659.getClass(), "waterLevel", null);
        setBooleanField(term2704659, term2704659.getClass(), "gasGiant", false);
        setField(term2704659, term2704659.getClass(), "coordinate", null);
        setField(term2704659, term2704659.getClass(), "planetType", null);
        setIntField(term2704659, term2704659.getClass(), "groundSize", 0);
        setIntField(term2704659, term2704659.getClass(), "amountMetalInGround", 0);
        setIntField(term2704659, term2704659.getClass(), "metal", 0);
        setIntField(term2704659, term2704659.getClass(), "prodResource", 0);
        setIntField(term2704659, term2704659.getClass(), "extraFood", 0);
        setIntField(term2704659, term2704659.getClass(), "culture", 0);
        setIntField(term2704659, term2704659.getClass(), "planetOwner", 0);
        setField(term2704659, term2704659.getClass(), "planetOwnerInfo", null);
        setField(term2704659, term2704659.getClass(), "homeWorldId", null);
        setIntField(term2704659, term2704659.getClass(), "startRealmIndex", 0);
        setIntField(term2704659, term2704659.getClass(), "tax", 0);
        setField(term2704659, term2704659.getClass(), "statuses", null);
        setField(term2704659, term2704659.getClass(), "timedStatuses", null);
        setField(term2704659, term2704659.getClass(), "event", null);
        setBooleanField(term2704659, term2704659.getClass(), "eventFound", false);
        setField(term2704659, term2704659.getClass(), "happinessEffect", null);
        setField(term2704659, term2704659.getClass(), "happinessExplanation", null);
        setField(term2704659, term2704659.getClass(), "farmProdExplain", null);
        setField(term2704659, term2704659.getClass(), "metaProdExplain", null);
        setField(term2704659, term2704659.getClass(), "prodProdExplain", null);
        setField(term2704659, term2704659.getClass(), "reseProdExplain", null);
        setField(term2704659, term2704659.getClass(), "cultProdExplain", null);
        setField(term2704659, term2704659.getClass(), "credProdExplain", null);
        setField(term2704659, term2704659.getClass(), "governor", null);
        setIntField(term2704659, term2704659.getClass(), "governorGuide", 0);
        setField(term2704659, term2704659.getClass(), "orbital", null);
        setField(term2704659, term2704659.getClass(), "workers", null);
        setField(term2704659, term2704659.getClass(), "buildings", null);
        setField(term2704659, term2704659.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPopulationLimitIgnoreRadiation", argTypes, term2704659, args);
    }

};


