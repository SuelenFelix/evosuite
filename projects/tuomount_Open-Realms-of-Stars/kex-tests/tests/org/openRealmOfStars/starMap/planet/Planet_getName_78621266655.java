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

public class Planet_getName_78621266655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term244794;

    public Planet_getName_78621266655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term244794 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term244794, term244794.getClass(), "name", null);
        setIntField(term244794, term244794.getClass(), "orderNumber", 0);
        setField(term244794, term244794.getClass(), "radiationType", null);
        setField(term244794, term244794.getClass(), "gravityType", null);
        setField(term244794, term244794.getClass(), "temperatureType", null);
        setField(term244794, term244794.getClass(), "waterLevel", null);
        setBooleanField(term244794, term244794.getClass(), "gasGiant", false);
        setField(term244794, term244794.getClass(), "coordinate", null);
        setField(term244794, term244794.getClass(), "planetType", null);
        setIntField(term244794, term244794.getClass(), "groundSize", 0);
        setIntField(term244794, term244794.getClass(), "amountMetalInGround", 0);
        setIntField(term244794, term244794.getClass(), "metal", 0);
        setIntField(term244794, term244794.getClass(), "prodResource", 0);
        setIntField(term244794, term244794.getClass(), "extraFood", 0);
        setIntField(term244794, term244794.getClass(), "culture", 0);
        setIntField(term244794, term244794.getClass(), "planetOwner", 0);
        setField(term244794, term244794.getClass(), "planetOwnerInfo", null);
        setField(term244794, term244794.getClass(), "homeWorldId", null);
        setIntField(term244794, term244794.getClass(), "startRealmIndex", 0);
        setIntField(term244794, term244794.getClass(), "tax", 0);
        setField(term244794, term244794.getClass(), "statuses", null);
        setField(term244794, term244794.getClass(), "timedStatuses", null);
        setField(term244794, term244794.getClass(), "event", null);
        setBooleanField(term244794, term244794.getClass(), "eventFound", false);
        setField(term244794, term244794.getClass(), "happinessEffect", null);
        setField(term244794, term244794.getClass(), "happinessExplanation", null);
        setField(term244794, term244794.getClass(), "farmProdExplain", null);
        setField(term244794, term244794.getClass(), "metaProdExplain", null);
        setField(term244794, term244794.getClass(), "prodProdExplain", null);
        setField(term244794, term244794.getClass(), "reseProdExplain", null);
        setField(term244794, term244794.getClass(), "cultProdExplain", null);
        setField(term244794, term244794.getClass(), "credProdExplain", null);
        setField(term244794, term244794.getClass(), "governor", null);
        setIntField(term244794, term244794.getClass(), "governorGuide", 0);
        setField(term244794, term244794.getClass(), "orbital", null);
        setField(term244794, term244794.getClass(), "workers", null);
        setField(term244794, term244794.getClass(), "buildings", null);
        setField(term244794, term244794.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term244794, args);
    }

};


