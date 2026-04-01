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

public class Planet_getPopulationLimitIgnoreRadiation_1390813877160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term669215;

    public Planet_getPopulationLimitIgnoreRadiation_1390813877160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term669215 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term669215, term669215.getClass(), "name", null);
        setIntField(term669215, term669215.getClass(), "orderNumber", 0);
        setField(term669215, term669215.getClass(), "radiationType", null);
        setField(term669215, term669215.getClass(), "gravityType", null);
        setField(term669215, term669215.getClass(), "temperatureType", null);
        setField(term669215, term669215.getClass(), "waterLevel", null);
        setBooleanField(term669215, term669215.getClass(), "gasGiant", false);
        setField(term669215, term669215.getClass(), "coordinate", null);
        setField(term669215, term669215.getClass(), "planetType", null);
        setIntField(term669215, term669215.getClass(), "groundSize", 0);
        setIntField(term669215, term669215.getClass(), "amountMetalInGround", 0);
        setIntField(term669215, term669215.getClass(), "metal", 0);
        setIntField(term669215, term669215.getClass(), "prodResource", 0);
        setIntField(term669215, term669215.getClass(), "extraFood", 0);
        setIntField(term669215, term669215.getClass(), "culture", 0);
        setIntField(term669215, term669215.getClass(), "planetOwner", 0);
        setField(term669215, term669215.getClass(), "planetOwnerInfo", null);
        setField(term669215, term669215.getClass(), "homeWorldId", null);
        setIntField(term669215, term669215.getClass(), "startRealmIndex", 0);
        setIntField(term669215, term669215.getClass(), "tax", 0);
        setField(term669215, term669215.getClass(), "statuses", null);
        setField(term669215, term669215.getClass(), "timedStatuses", null);
        setField(term669215, term669215.getClass(), "event", null);
        setBooleanField(term669215, term669215.getClass(), "eventFound", false);
        setField(term669215, term669215.getClass(), "happinessEffect", null);
        setField(term669215, term669215.getClass(), "happinessExplanation", null);
        setField(term669215, term669215.getClass(), "farmProdExplain", null);
        setField(term669215, term669215.getClass(), "metaProdExplain", null);
        setField(term669215, term669215.getClass(), "prodProdExplain", null);
        setField(term669215, term669215.getClass(), "reseProdExplain", null);
        setField(term669215, term669215.getClass(), "cultProdExplain", null);
        setField(term669215, term669215.getClass(), "credProdExplain", null);
        setField(term669215, term669215.getClass(), "governor", null);
        setIntField(term669215, term669215.getClass(), "governorGuide", 0);
        setField(term669215, term669215.getClass(), "orbital", null);
        setField(term669215, term669215.getClass(), "workers", null);
        setField(term669215, term669215.getClass(), "buildings", null);
        setField(term669215, term669215.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPopulationLimitIgnoreRadiation", argTypes, term669215, args);
    }

};


