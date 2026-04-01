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

public class Planet_getSizeAsInt_1321254970120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term509032;

    public Planet_getSizeAsInt_1321254970120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term509032 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term509032, term509032.getClass(), "name", null);
        setIntField(term509032, term509032.getClass(), "orderNumber", 0);
        setField(term509032, term509032.getClass(), "radiationType", null);
        setField(term509032, term509032.getClass(), "gravityType", null);
        setField(term509032, term509032.getClass(), "temperatureType", null);
        setField(term509032, term509032.getClass(), "waterLevel", null);
        setBooleanField(term509032, term509032.getClass(), "gasGiant", false);
        setField(term509032, term509032.getClass(), "coordinate", null);
        setField(term509032, term509032.getClass(), "planetType", null);
        setIntField(term509032, term509032.getClass(), "groundSize", 0);
        setIntField(term509032, term509032.getClass(), "amountMetalInGround", 0);
        setIntField(term509032, term509032.getClass(), "metal", 0);
        setIntField(term509032, term509032.getClass(), "prodResource", 0);
        setIntField(term509032, term509032.getClass(), "extraFood", 0);
        setIntField(term509032, term509032.getClass(), "culture", 0);
        setIntField(term509032, term509032.getClass(), "planetOwner", 0);
        setField(term509032, term509032.getClass(), "planetOwnerInfo", null);
        setField(term509032, term509032.getClass(), "homeWorldId", null);
        setIntField(term509032, term509032.getClass(), "startRealmIndex", 0);
        setIntField(term509032, term509032.getClass(), "tax", 0);
        setField(term509032, term509032.getClass(), "statuses", null);
        setField(term509032, term509032.getClass(), "timedStatuses", null);
        setField(term509032, term509032.getClass(), "event", null);
        setBooleanField(term509032, term509032.getClass(), "eventFound", false);
        setField(term509032, term509032.getClass(), "happinessEffect", null);
        setField(term509032, term509032.getClass(), "happinessExplanation", null);
        setField(term509032, term509032.getClass(), "farmProdExplain", null);
        setField(term509032, term509032.getClass(), "metaProdExplain", null);
        setField(term509032, term509032.getClass(), "prodProdExplain", null);
        setField(term509032, term509032.getClass(), "reseProdExplain", null);
        setField(term509032, term509032.getClass(), "cultProdExplain", null);
        setField(term509032, term509032.getClass(), "credProdExplain", null);
        setField(term509032, term509032.getClass(), "governor", null);
        setIntField(term509032, term509032.getClass(), "governorGuide", 0);
        setField(term509032, term509032.getClass(), "orbital", null);
        setField(term509032, term509032.getClass(), "workers", null);
        setField(term509032, term509032.getClass(), "buildings", null);
        setField(term509032, term509032.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSizeAsInt", argTypes, term509032, args);
    }

};


