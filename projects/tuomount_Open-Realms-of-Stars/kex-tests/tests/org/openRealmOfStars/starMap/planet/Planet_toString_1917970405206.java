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

public class Planet_toString_1917970405206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term882438;

    public Planet_toString_1917970405206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term882438 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term882438, term882438.getClass(), "name", null);
        setIntField(term882438, term882438.getClass(), "orderNumber", 0);
        setField(term882438, term882438.getClass(), "radiationType", null);
        setField(term882438, term882438.getClass(), "gravityType", null);
        setField(term882438, term882438.getClass(), "temperatureType", null);
        setField(term882438, term882438.getClass(), "waterLevel", null);
        setBooleanField(term882438, term882438.getClass(), "gasGiant", false);
        setField(term882438, term882438.getClass(), "coordinate", null);
        setField(term882438, term882438.getClass(), "planetType", null);
        setIntField(term882438, term882438.getClass(), "groundSize", 0);
        setIntField(term882438, term882438.getClass(), "amountMetalInGround", 0);
        setIntField(term882438, term882438.getClass(), "metal", 0);
        setIntField(term882438, term882438.getClass(), "prodResource", 0);
        setIntField(term882438, term882438.getClass(), "extraFood", 0);
        setIntField(term882438, term882438.getClass(), "culture", 0);
        setIntField(term882438, term882438.getClass(), "planetOwner", 0);
        setField(term882438, term882438.getClass(), "planetOwnerInfo", null);
        setField(term882438, term882438.getClass(), "homeWorldId", null);
        setIntField(term882438, term882438.getClass(), "startRealmIndex", 0);
        setIntField(term882438, term882438.getClass(), "tax", 0);
        setField(term882438, term882438.getClass(), "statuses", null);
        setField(term882438, term882438.getClass(), "timedStatuses", null);
        setField(term882438, term882438.getClass(), "event", null);
        setBooleanField(term882438, term882438.getClass(), "eventFound", false);
        setField(term882438, term882438.getClass(), "happinessEffect", null);
        setField(term882438, term882438.getClass(), "happinessExplanation", null);
        setField(term882438, term882438.getClass(), "farmProdExplain", null);
        setField(term882438, term882438.getClass(), "metaProdExplain", null);
        setField(term882438, term882438.getClass(), "prodProdExplain", null);
        setField(term882438, term882438.getClass(), "reseProdExplain", null);
        setField(term882438, term882438.getClass(), "cultProdExplain", null);
        setField(term882438, term882438.getClass(), "credProdExplain", null);
        setField(term882438, term882438.getClass(), "governor", null);
        setIntField(term882438, term882438.getClass(), "governorGuide", 0);
        setField(term882438, term882438.getClass(), "orbital", null);
        setField(term882438, term882438.getClass(), "workers", null);
        setField(term882438, term882438.getClass(), "buildings", null);
        setField(term882438, term882438.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term882438, args);
    }

};


