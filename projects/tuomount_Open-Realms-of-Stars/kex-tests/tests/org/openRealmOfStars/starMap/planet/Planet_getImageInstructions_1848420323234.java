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

public class Planet_getImageInstructions_1848420323234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3002415;

    public Planet_getImageInstructions_1848420323234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3002415 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term3002415, term3002415.getClass(), "name", null);
        setIntField(term3002415, term3002415.getClass(), "orderNumber", 0);
        setField(term3002415, term3002415.getClass(), "radiationType", null);
        setField(term3002415, term3002415.getClass(), "gravityType", null);
        setField(term3002415, term3002415.getClass(), "temperatureType", null);
        setField(term3002415, term3002415.getClass(), "waterLevel", null);
        setBooleanField(term3002415, term3002415.getClass(), "gasGiant", false);
        setField(term3002415, term3002415.getClass(), "coordinate", null);
        setField(term3002415, term3002415.getClass(), "planetType", null);
        setIntField(term3002415, term3002415.getClass(), "groundSize", 0);
        setIntField(term3002415, term3002415.getClass(), "amountMetalInGround", 0);
        setIntField(term3002415, term3002415.getClass(), "metal", 0);
        setIntField(term3002415, term3002415.getClass(), "prodResource", 0);
        setIntField(term3002415, term3002415.getClass(), "extraFood", 0);
        setIntField(term3002415, term3002415.getClass(), "culture", 0);
        setIntField(term3002415, term3002415.getClass(), "planetOwner", 0);
        setField(term3002415, term3002415.getClass(), "planetOwnerInfo", null);
        setField(term3002415, term3002415.getClass(), "homeWorldId", null);
        setIntField(term3002415, term3002415.getClass(), "startRealmIndex", 0);
        setIntField(term3002415, term3002415.getClass(), "tax", 0);
        setField(term3002415, term3002415.getClass(), "statuses", null);
        setField(term3002415, term3002415.getClass(), "timedStatuses", null);
        setField(term3002415, term3002415.getClass(), "event", null);
        setBooleanField(term3002415, term3002415.getClass(), "eventFound", false);
        setField(term3002415, term3002415.getClass(), "happinessEffect", null);
        setField(term3002415, term3002415.getClass(), "happinessExplanation", null);
        setField(term3002415, term3002415.getClass(), "farmProdExplain", null);
        setField(term3002415, term3002415.getClass(), "metaProdExplain", null);
        setField(term3002415, term3002415.getClass(), "prodProdExplain", null);
        setField(term3002415, term3002415.getClass(), "reseProdExplain", null);
        setField(term3002415, term3002415.getClass(), "cultProdExplain", null);
        setField(term3002415, term3002415.getClass(), "credProdExplain", null);
        setField(term3002415, term3002415.getClass(), "governor", null);
        setIntField(term3002415, term3002415.getClass(), "governorGuide", 0);
        setField(term3002415, term3002415.getClass(), "orbital", null);
        setField(term3002415, term3002415.getClass(), "workers", null);
        setField(term3002415, term3002415.getClass(), "buildings", null);
        setField(term3002415, term3002415.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getImageInstructions", argTypes, term3002415, args);
    }

};


