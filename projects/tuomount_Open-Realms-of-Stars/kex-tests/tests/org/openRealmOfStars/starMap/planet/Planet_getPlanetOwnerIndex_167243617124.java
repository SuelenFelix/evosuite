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

public class Planet_getPlanetOwnerIndex_167243617124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term529525;

    public Planet_getPlanetOwnerIndex_167243617124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term529525 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term529525, term529525.getClass(), "name", null);
        setIntField(term529525, term529525.getClass(), "orderNumber", 0);
        setField(term529525, term529525.getClass(), "radiationType", null);
        setField(term529525, term529525.getClass(), "gravityType", null);
        setField(term529525, term529525.getClass(), "temperatureType", null);
        setField(term529525, term529525.getClass(), "waterLevel", null);
        setBooleanField(term529525, term529525.getClass(), "gasGiant", false);
        setField(term529525, term529525.getClass(), "coordinate", null);
        setField(term529525, term529525.getClass(), "planetType", null);
        setIntField(term529525, term529525.getClass(), "groundSize", 0);
        setIntField(term529525, term529525.getClass(), "amountMetalInGround", 0);
        setIntField(term529525, term529525.getClass(), "metal", 0);
        setIntField(term529525, term529525.getClass(), "prodResource", 0);
        setIntField(term529525, term529525.getClass(), "extraFood", 0);
        setIntField(term529525, term529525.getClass(), "culture", 0);
        setIntField(term529525, term529525.getClass(), "planetOwner", 0);
        setField(term529525, term529525.getClass(), "planetOwnerInfo", null);
        setField(term529525, term529525.getClass(), "homeWorldId", null);
        setIntField(term529525, term529525.getClass(), "startRealmIndex", 0);
        setIntField(term529525, term529525.getClass(), "tax", 0);
        setField(term529525, term529525.getClass(), "statuses", null);
        setField(term529525, term529525.getClass(), "timedStatuses", null);
        setField(term529525, term529525.getClass(), "event", null);
        setBooleanField(term529525, term529525.getClass(), "eventFound", false);
        setField(term529525, term529525.getClass(), "happinessEffect", null);
        setField(term529525, term529525.getClass(), "happinessExplanation", null);
        setField(term529525, term529525.getClass(), "farmProdExplain", null);
        setField(term529525, term529525.getClass(), "metaProdExplain", null);
        setField(term529525, term529525.getClass(), "prodProdExplain", null);
        setField(term529525, term529525.getClass(), "reseProdExplain", null);
        setField(term529525, term529525.getClass(), "cultProdExplain", null);
        setField(term529525, term529525.getClass(), "credProdExplain", null);
        setField(term529525, term529525.getClass(), "governor", null);
        setIntField(term529525, term529525.getClass(), "governorGuide", 0);
        setField(term529525, term529525.getClass(), "orbital", null);
        setField(term529525, term529525.getClass(), "workers", null);
        setField(term529525, term529525.getClass(), "buildings", null);
        setField(term529525, term529525.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlanetOwnerIndex", argTypes, term529525, args);
    }

};


