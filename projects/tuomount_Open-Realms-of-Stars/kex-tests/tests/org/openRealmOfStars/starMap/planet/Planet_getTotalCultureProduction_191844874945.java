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

public class Planet_getTotalCultureProduction_191844874945 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term208094;

    public Planet_getTotalCultureProduction_191844874945() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term208094 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term208094, term208094.getClass(), "name", null);
        setIntField(term208094, term208094.getClass(), "orderNumber", 0);
        setField(term208094, term208094.getClass(), "radiationType", null);
        setField(term208094, term208094.getClass(), "gravityType", null);
        setField(term208094, term208094.getClass(), "temperatureType", null);
        setField(term208094, term208094.getClass(), "waterLevel", null);
        setBooleanField(term208094, term208094.getClass(), "gasGiant", false);
        setField(term208094, term208094.getClass(), "coordinate", null);
        setField(term208094, term208094.getClass(), "planetType", null);
        setIntField(term208094, term208094.getClass(), "groundSize", 0);
        setIntField(term208094, term208094.getClass(), "amountMetalInGround", 0);
        setIntField(term208094, term208094.getClass(), "metal", 0);
        setIntField(term208094, term208094.getClass(), "prodResource", 0);
        setIntField(term208094, term208094.getClass(), "extraFood", 0);
        setIntField(term208094, term208094.getClass(), "culture", 0);
        setIntField(term208094, term208094.getClass(), "planetOwner", 0);
        setField(term208094, term208094.getClass(), "planetOwnerInfo", null);
        setField(term208094, term208094.getClass(), "homeWorldId", null);
        setIntField(term208094, term208094.getClass(), "startRealmIndex", 0);
        setIntField(term208094, term208094.getClass(), "tax", 0);
        setField(term208094, term208094.getClass(), "statuses", null);
        setField(term208094, term208094.getClass(), "timedStatuses", null);
        setField(term208094, term208094.getClass(), "event", null);
        setBooleanField(term208094, term208094.getClass(), "eventFound", false);
        setField(term208094, term208094.getClass(), "happinessEffect", null);
        setField(term208094, term208094.getClass(), "happinessExplanation", null);
        setField(term208094, term208094.getClass(), "farmProdExplain", null);
        setField(term208094, term208094.getClass(), "metaProdExplain", null);
        setField(term208094, term208094.getClass(), "prodProdExplain", null);
        setField(term208094, term208094.getClass(), "reseProdExplain", null);
        setField(term208094, term208094.getClass(), "cultProdExplain", null);
        setField(term208094, term208094.getClass(), "credProdExplain", null);
        setField(term208094, term208094.getClass(), "governor", null);
        setIntField(term208094, term208094.getClass(), "governorGuide", 0);
        setField(term208094, term208094.getClass(), "orbital", null);
        setField(term208094, term208094.getClass(), "workers", null);
        setField(term208094, term208094.getClass(), "buildings", null);
        setField(term208094, term208094.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalCultureProduction", argTypes, term208094, args);
    }

};


