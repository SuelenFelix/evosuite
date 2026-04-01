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

public class Planet_checkGlobalWarming_1249936875301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3314605;

    public Planet_checkGlobalWarming_1249936875301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3314605 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term3314605, term3314605.getClass(), "name", null);
        setIntField(term3314605, term3314605.getClass(), "orderNumber", 0);
        setField(term3314605, term3314605.getClass(), "radiationType", null);
        setField(term3314605, term3314605.getClass(), "gravityType", null);
        setField(term3314605, term3314605.getClass(), "temperatureType", null);
        setField(term3314605, term3314605.getClass(), "waterLevel", null);
        setBooleanField(term3314605, term3314605.getClass(), "gasGiant", false);
        setField(term3314605, term3314605.getClass(), "coordinate", null);
        setField(term3314605, term3314605.getClass(), "planetType", null);
        setIntField(term3314605, term3314605.getClass(), "groundSize", 0);
        setIntField(term3314605, term3314605.getClass(), "amountMetalInGround", 0);
        setIntField(term3314605, term3314605.getClass(), "metal", 0);
        setIntField(term3314605, term3314605.getClass(), "prodResource", 0);
        setIntField(term3314605, term3314605.getClass(), "extraFood", 0);
        setIntField(term3314605, term3314605.getClass(), "culture", 0);
        setIntField(term3314605, term3314605.getClass(), "planetOwner", 0);
        setField(term3314605, term3314605.getClass(), "planetOwnerInfo", null);
        setField(term3314605, term3314605.getClass(), "homeWorldId", null);
        setIntField(term3314605, term3314605.getClass(), "startRealmIndex", 0);
        setIntField(term3314605, term3314605.getClass(), "tax", 0);
        setField(term3314605, term3314605.getClass(), "statuses", null);
        setField(term3314605, term3314605.getClass(), "timedStatuses", null);
        setField(term3314605, term3314605.getClass(), "event", null);
        setBooleanField(term3314605, term3314605.getClass(), "eventFound", false);
        setField(term3314605, term3314605.getClass(), "happinessEffect", null);
        setField(term3314605, term3314605.getClass(), "happinessExplanation", null);
        setField(term3314605, term3314605.getClass(), "farmProdExplain", null);
        setField(term3314605, term3314605.getClass(), "metaProdExplain", null);
        setField(term3314605, term3314605.getClass(), "prodProdExplain", null);
        setField(term3314605, term3314605.getClass(), "reseProdExplain", null);
        setField(term3314605, term3314605.getClass(), "cultProdExplain", null);
        setField(term3314605, term3314605.getClass(), "credProdExplain", null);
        setField(term3314605, term3314605.getClass(), "governor", null);
        setIntField(term3314605, term3314605.getClass(), "governorGuide", 0);
        setField(term3314605, term3314605.getClass(), "orbital", null);
        setField(term3314605, term3314605.getClass(), "workers", null);
        setField(term3314605, term3314605.getClass(), "buildings", null);
        setField(term3314605, term3314605.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "checkGlobalWarming", argTypes, term3314605, args);
    }

};


