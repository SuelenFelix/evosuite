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

public class Planet_setName_178887806257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term252030;

    public Planet_setName_178887806257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term252030 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term252030, term252030.getClass(), "name", null);
        setIntField(term252030, term252030.getClass(), "orderNumber", 0);
        setField(term252030, term252030.getClass(), "radiationType", null);
        setField(term252030, term252030.getClass(), "gravityType", null);
        setField(term252030, term252030.getClass(), "temperatureType", null);
        setField(term252030, term252030.getClass(), "waterLevel", null);
        setBooleanField(term252030, term252030.getClass(), "gasGiant", false);
        setField(term252030, term252030.getClass(), "coordinate", null);
        setField(term252030, term252030.getClass(), "planetType", null);
        setIntField(term252030, term252030.getClass(), "groundSize", 0);
        setIntField(term252030, term252030.getClass(), "amountMetalInGround", 0);
        setIntField(term252030, term252030.getClass(), "metal", 0);
        setIntField(term252030, term252030.getClass(), "prodResource", 0);
        setIntField(term252030, term252030.getClass(), "extraFood", 0);
        setIntField(term252030, term252030.getClass(), "culture", 0);
        setIntField(term252030, term252030.getClass(), "planetOwner", 0);
        setField(term252030, term252030.getClass(), "planetOwnerInfo", null);
        setField(term252030, term252030.getClass(), "homeWorldId", null);
        setIntField(term252030, term252030.getClass(), "startRealmIndex", 0);
        setIntField(term252030, term252030.getClass(), "tax", 0);
        setField(term252030, term252030.getClass(), "statuses", null);
        setField(term252030, term252030.getClass(), "timedStatuses", null);
        setField(term252030, term252030.getClass(), "event", null);
        setBooleanField(term252030, term252030.getClass(), "eventFound", false);
        setField(term252030, term252030.getClass(), "happinessEffect", null);
        setField(term252030, term252030.getClass(), "happinessExplanation", null);
        setField(term252030, term252030.getClass(), "farmProdExplain", null);
        setField(term252030, term252030.getClass(), "metaProdExplain", null);
        setField(term252030, term252030.getClass(), "prodProdExplain", null);
        setField(term252030, term252030.getClass(), "reseProdExplain", null);
        setField(term252030, term252030.getClass(), "cultProdExplain", null);
        setField(term252030, term252030.getClass(), "credProdExplain", null);
        setField(term252030, term252030.getClass(), "governor", null);
        setIntField(term252030, term252030.getClass(), "governorGuide", 0);
        setField(term252030, term252030.getClass(), "orbital", null);
        setField(term252030, term252030.getClass(), "workers", null);
        setField(term252030, term252030.getClass(), "buildings", null);
        setField(term252030, term252030.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setName", argTypes, term252030, args);
    }

};


