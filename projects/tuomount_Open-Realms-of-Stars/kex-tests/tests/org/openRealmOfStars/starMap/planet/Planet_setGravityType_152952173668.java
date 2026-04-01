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

public class Planet_setGravityType_152952173668 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2321574;

    public Planet_setGravityType_152952173668() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2321574 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term2321574, term2321574.getClass(), "name", null);
        setIntField(term2321574, term2321574.getClass(), "orderNumber", 0);
        setField(term2321574, term2321574.getClass(), "radiationType", null);
        setField(term2321574, term2321574.getClass(), "gravityType", null);
        setField(term2321574, term2321574.getClass(), "temperatureType", null);
        setField(term2321574, term2321574.getClass(), "waterLevel", null);
        setBooleanField(term2321574, term2321574.getClass(), "gasGiant", false);
        setField(term2321574, term2321574.getClass(), "coordinate", null);
        setField(term2321574, term2321574.getClass(), "planetType", null);
        setIntField(term2321574, term2321574.getClass(), "groundSize", 0);
        setIntField(term2321574, term2321574.getClass(), "amountMetalInGround", 0);
        setIntField(term2321574, term2321574.getClass(), "metal", 0);
        setIntField(term2321574, term2321574.getClass(), "prodResource", 0);
        setIntField(term2321574, term2321574.getClass(), "extraFood", 0);
        setIntField(term2321574, term2321574.getClass(), "culture", 0);
        setIntField(term2321574, term2321574.getClass(), "planetOwner", 0);
        setField(term2321574, term2321574.getClass(), "planetOwnerInfo", null);
        setField(term2321574, term2321574.getClass(), "homeWorldId", null);
        setIntField(term2321574, term2321574.getClass(), "startRealmIndex", 0);
        setIntField(term2321574, term2321574.getClass(), "tax", 0);
        setField(term2321574, term2321574.getClass(), "statuses", null);
        setField(term2321574, term2321574.getClass(), "timedStatuses", null);
        setField(term2321574, term2321574.getClass(), "event", null);
        setBooleanField(term2321574, term2321574.getClass(), "eventFound", false);
        setField(term2321574, term2321574.getClass(), "happinessEffect", null);
        setField(term2321574, term2321574.getClass(), "happinessExplanation", null);
        setField(term2321574, term2321574.getClass(), "farmProdExplain", null);
        setField(term2321574, term2321574.getClass(), "metaProdExplain", null);
        setField(term2321574, term2321574.getClass(), "prodProdExplain", null);
        setField(term2321574, term2321574.getClass(), "reseProdExplain", null);
        setField(term2321574, term2321574.getClass(), "cultProdExplain", null);
        setField(term2321574, term2321574.getClass(), "credProdExplain", null);
        setField(term2321574, term2321574.getClass(), "governor", null);
        setIntField(term2321574, term2321574.getClass(), "governorGuide", 0);
        setField(term2321574, term2321574.getClass(), "orbital", null);
        setField(term2321574, term2321574.getClass(), "workers", null);
        setField(term2321574, term2321574.getClass(), "buildings", null);
        setField(term2321574, term2321574.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.enums.GravityType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setGravityType", argTypes, term2321574, args);
    }

};


