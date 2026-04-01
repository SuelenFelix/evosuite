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

public class Planet_getTotalCultureProduction_191844874946 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2246727;

    public Planet_getTotalCultureProduction_191844874946() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2246727 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term2246727, term2246727.getClass(), "name", null);
        setIntField(term2246727, term2246727.getClass(), "orderNumber", 0);
        setField(term2246727, term2246727.getClass(), "radiationType", null);
        setField(term2246727, term2246727.getClass(), "gravityType", null);
        setField(term2246727, term2246727.getClass(), "temperatureType", null);
        setField(term2246727, term2246727.getClass(), "waterLevel", null);
        setBooleanField(term2246727, term2246727.getClass(), "gasGiant", false);
        setField(term2246727, term2246727.getClass(), "coordinate", null);
        setField(term2246727, term2246727.getClass(), "planetType", null);
        setIntField(term2246727, term2246727.getClass(), "groundSize", 0);
        setIntField(term2246727, term2246727.getClass(), "amountMetalInGround", 0);
        setIntField(term2246727, term2246727.getClass(), "metal", 0);
        setIntField(term2246727, term2246727.getClass(), "prodResource", 0);
        setIntField(term2246727, term2246727.getClass(), "extraFood", 0);
        setIntField(term2246727, term2246727.getClass(), "culture", 0);
        setIntField(term2246727, term2246727.getClass(), "planetOwner", 0);
        setField(term2246727, term2246727.getClass(), "planetOwnerInfo", null);
        setField(term2246727, term2246727.getClass(), "homeWorldId", null);
        setIntField(term2246727, term2246727.getClass(), "startRealmIndex", 0);
        setIntField(term2246727, term2246727.getClass(), "tax", 0);
        setField(term2246727, term2246727.getClass(), "statuses", null);
        setField(term2246727, term2246727.getClass(), "timedStatuses", null);
        setField(term2246727, term2246727.getClass(), "event", null);
        setBooleanField(term2246727, term2246727.getClass(), "eventFound", false);
        setField(term2246727, term2246727.getClass(), "happinessEffect", null);
        setField(term2246727, term2246727.getClass(), "happinessExplanation", null);
        setField(term2246727, term2246727.getClass(), "farmProdExplain", null);
        setField(term2246727, term2246727.getClass(), "metaProdExplain", null);
        setField(term2246727, term2246727.getClass(), "prodProdExplain", null);
        setField(term2246727, term2246727.getClass(), "reseProdExplain", null);
        setField(term2246727, term2246727.getClass(), "cultProdExplain", null);
        setField(term2246727, term2246727.getClass(), "credProdExplain", null);
        setField(term2246727, term2246727.getClass(), "governor", null);
        setIntField(term2246727, term2246727.getClass(), "governorGuide", 0);
        setField(term2246727, term2246727.getClass(), "orbital", null);
        setField(term2246727, term2246727.getClass(), "workers", null);
        setField(term2246727, term2246727.getClass(), "buildings", null);
        setField(term2246727, term2246727.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalCultureProduction", argTypes, term2246727, args);
    }

};


