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

public class Planet_getImageInstructions_1848420323228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term967462;

    public Planet_getImageInstructions_1848420323228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term967462 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term967462, term967462.getClass(), "name", null);
        setIntField(term967462, term967462.getClass(), "orderNumber", 0);
        setField(term967462, term967462.getClass(), "radiationType", null);
        setField(term967462, term967462.getClass(), "gravityType", null);
        setField(term967462, term967462.getClass(), "temperatureType", null);
        setField(term967462, term967462.getClass(), "waterLevel", null);
        setBooleanField(term967462, term967462.getClass(), "gasGiant", false);
        setField(term967462, term967462.getClass(), "coordinate", null);
        setField(term967462, term967462.getClass(), "planetType", null);
        setIntField(term967462, term967462.getClass(), "groundSize", 0);
        setIntField(term967462, term967462.getClass(), "amountMetalInGround", 0);
        setIntField(term967462, term967462.getClass(), "metal", 0);
        setIntField(term967462, term967462.getClass(), "prodResource", 0);
        setIntField(term967462, term967462.getClass(), "extraFood", 0);
        setIntField(term967462, term967462.getClass(), "culture", 0);
        setIntField(term967462, term967462.getClass(), "planetOwner", 0);
        setField(term967462, term967462.getClass(), "planetOwnerInfo", null);
        setField(term967462, term967462.getClass(), "homeWorldId", null);
        setIntField(term967462, term967462.getClass(), "startRealmIndex", 0);
        setIntField(term967462, term967462.getClass(), "tax", 0);
        setField(term967462, term967462.getClass(), "statuses", null);
        setField(term967462, term967462.getClass(), "timedStatuses", null);
        setField(term967462, term967462.getClass(), "event", null);
        setBooleanField(term967462, term967462.getClass(), "eventFound", false);
        setField(term967462, term967462.getClass(), "happinessEffect", null);
        setField(term967462, term967462.getClass(), "happinessExplanation", null);
        setField(term967462, term967462.getClass(), "farmProdExplain", null);
        setField(term967462, term967462.getClass(), "metaProdExplain", null);
        setField(term967462, term967462.getClass(), "prodProdExplain", null);
        setField(term967462, term967462.getClass(), "reseProdExplain", null);
        setField(term967462, term967462.getClass(), "cultProdExplain", null);
        setField(term967462, term967462.getClass(), "credProdExplain", null);
        setField(term967462, term967462.getClass(), "governor", null);
        setIntField(term967462, term967462.getClass(), "governorGuide", 0);
        setField(term967462, term967462.getClass(), "orbital", null);
        setField(term967462, term967462.getClass(), "workers", null);
        setField(term967462, term967462.getClass(), "buildings", null);
        setField(term967462, term967462.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getImageInstructions", argTypes, term967462, args);
    }

};


