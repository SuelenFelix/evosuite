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

public class Planet_setHappinessEffect_2073358875260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3141343;

    public Planet_setHappinessEffect_2073358875260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3141343 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term3141343, term3141343.getClass(), "name", null);
        setIntField(term3141343, term3141343.getClass(), "orderNumber", 0);
        setField(term3141343, term3141343.getClass(), "radiationType", null);
        setField(term3141343, term3141343.getClass(), "gravityType", null);
        setField(term3141343, term3141343.getClass(), "temperatureType", null);
        setField(term3141343, term3141343.getClass(), "waterLevel", null);
        setBooleanField(term3141343, term3141343.getClass(), "gasGiant", false);
        setField(term3141343, term3141343.getClass(), "coordinate", null);
        setField(term3141343, term3141343.getClass(), "planetType", null);
        setIntField(term3141343, term3141343.getClass(), "groundSize", 0);
        setIntField(term3141343, term3141343.getClass(), "amountMetalInGround", 0);
        setIntField(term3141343, term3141343.getClass(), "metal", 0);
        setIntField(term3141343, term3141343.getClass(), "prodResource", 0);
        setIntField(term3141343, term3141343.getClass(), "extraFood", 0);
        setIntField(term3141343, term3141343.getClass(), "culture", 0);
        setIntField(term3141343, term3141343.getClass(), "planetOwner", 0);
        setField(term3141343, term3141343.getClass(), "planetOwnerInfo", null);
        setField(term3141343, term3141343.getClass(), "homeWorldId", null);
        setIntField(term3141343, term3141343.getClass(), "startRealmIndex", 0);
        setIntField(term3141343, term3141343.getClass(), "tax", 0);
        setField(term3141343, term3141343.getClass(), "statuses", null);
        setField(term3141343, term3141343.getClass(), "timedStatuses", null);
        setField(term3141343, term3141343.getClass(), "event", null);
        setBooleanField(term3141343, term3141343.getClass(), "eventFound", false);
        setField(term3141343, term3141343.getClass(), "happinessEffect", null);
        setField(term3141343, term3141343.getClass(), "happinessExplanation", null);
        setField(term3141343, term3141343.getClass(), "farmProdExplain", null);
        setField(term3141343, term3141343.getClass(), "metaProdExplain", null);
        setField(term3141343, term3141343.getClass(), "prodProdExplain", null);
        setField(term3141343, term3141343.getClass(), "reseProdExplain", null);
        setField(term3141343, term3141343.getClass(), "cultProdExplain", null);
        setField(term3141343, term3141343.getClass(), "credProdExplain", null);
        setField(term3141343, term3141343.getClass(), "governor", null);
        setIntField(term3141343, term3141343.getClass(), "governorGuide", 0);
        setField(term3141343, term3141343.getClass(), "orbital", null);
        setField(term3141343, term3141343.getClass(), "workers", null);
        setField(term3141343, term3141343.getClass(), "buildings", null);
        setField(term3141343, term3141343.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.HappinessEffect");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setHappinessEffect", argTypes, term3141343, args);
    }

};


