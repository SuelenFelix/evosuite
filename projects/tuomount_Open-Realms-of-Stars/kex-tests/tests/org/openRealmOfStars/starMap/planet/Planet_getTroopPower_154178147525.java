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

public class Planet_getTroopPower_154178147525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125219;

    public Planet_getTroopPower_154178147525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term125219 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term125219, term125219.getClass(), "name", null);
        setIntField(term125219, term125219.getClass(), "orderNumber", 0);
        setField(term125219, term125219.getClass(), "radiationType", null);
        setField(term125219, term125219.getClass(), "gravityType", null);
        setField(term125219, term125219.getClass(), "temperatureType", null);
        setField(term125219, term125219.getClass(), "waterLevel", null);
        setBooleanField(term125219, term125219.getClass(), "gasGiant", false);
        setField(term125219, term125219.getClass(), "coordinate", null);
        setField(term125219, term125219.getClass(), "planetType", null);
        setIntField(term125219, term125219.getClass(), "groundSize", 0);
        setIntField(term125219, term125219.getClass(), "amountMetalInGround", 0);
        setIntField(term125219, term125219.getClass(), "metal", 0);
        setIntField(term125219, term125219.getClass(), "prodResource", 0);
        setIntField(term125219, term125219.getClass(), "extraFood", 0);
        setIntField(term125219, term125219.getClass(), "culture", 0);
        setIntField(term125219, term125219.getClass(), "planetOwner", 0);
        setField(term125219, term125219.getClass(), "planetOwnerInfo", null);
        setField(term125219, term125219.getClass(), "homeWorldId", null);
        setIntField(term125219, term125219.getClass(), "startRealmIndex", 0);
        setIntField(term125219, term125219.getClass(), "tax", 0);
        setField(term125219, term125219.getClass(), "statuses", null);
        setField(term125219, term125219.getClass(), "timedStatuses", null);
        setField(term125219, term125219.getClass(), "event", null);
        setBooleanField(term125219, term125219.getClass(), "eventFound", false);
        setField(term125219, term125219.getClass(), "happinessEffect", null);
        setField(term125219, term125219.getClass(), "happinessExplanation", null);
        setField(term125219, term125219.getClass(), "farmProdExplain", null);
        setField(term125219, term125219.getClass(), "metaProdExplain", null);
        setField(term125219, term125219.getClass(), "prodProdExplain", null);
        setField(term125219, term125219.getClass(), "reseProdExplain", null);
        setField(term125219, term125219.getClass(), "cultProdExplain", null);
        setField(term125219, term125219.getClass(), "credProdExplain", null);
        setField(term125219, term125219.getClass(), "governor", null);
        setIntField(term125219, term125219.getClass(), "governorGuide", 0);
        setField(term125219, term125219.getClass(), "orbital", null);
        setField(term125219, term125219.getClass(), "workers", null);
        setField(term125219, term125219.getClass(), "buildings", null);
        setField(term125219, term125219.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTroopPower", argTypes, term125219, args);
    }

};


