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

public class Planet_getHappinessEffect_569630501332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3373349;

    public Planet_getHappinessEffect_569630501332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3373349 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term3373349, term3373349.getClass(), "name", null);
        setIntField(term3373349, term3373349.getClass(), "orderNumber", 0);
        setField(term3373349, term3373349.getClass(), "radiationType", null);
        setField(term3373349, term3373349.getClass(), "gravityType", null);
        setField(term3373349, term3373349.getClass(), "temperatureType", null);
        setField(term3373349, term3373349.getClass(), "waterLevel", null);
        setBooleanField(term3373349, term3373349.getClass(), "gasGiant", false);
        setField(term3373349, term3373349.getClass(), "coordinate", null);
        setField(term3373349, term3373349.getClass(), "planetType", null);
        setIntField(term3373349, term3373349.getClass(), "groundSize", 0);
        setIntField(term3373349, term3373349.getClass(), "amountMetalInGround", 0);
        setIntField(term3373349, term3373349.getClass(), "metal", 0);
        setIntField(term3373349, term3373349.getClass(), "prodResource", 0);
        setIntField(term3373349, term3373349.getClass(), "extraFood", 0);
        setIntField(term3373349, term3373349.getClass(), "culture", 0);
        setIntField(term3373349, term3373349.getClass(), "planetOwner", 0);
        setField(term3373349, term3373349.getClass(), "planetOwnerInfo", null);
        setField(term3373349, term3373349.getClass(), "homeWorldId", null);
        setIntField(term3373349, term3373349.getClass(), "startRealmIndex", 0);
        setIntField(term3373349, term3373349.getClass(), "tax", 0);
        setField(term3373349, term3373349.getClass(), "statuses", null);
        setField(term3373349, term3373349.getClass(), "timedStatuses", null);
        setField(term3373349, term3373349.getClass(), "event", null);
        setBooleanField(term3373349, term3373349.getClass(), "eventFound", false);
        setField(term3373349, term3373349.getClass(), "happinessEffect", null);
        setField(term3373349, term3373349.getClass(), "happinessExplanation", null);
        setField(term3373349, term3373349.getClass(), "farmProdExplain", null);
        setField(term3373349, term3373349.getClass(), "metaProdExplain", null);
        setField(term3373349, term3373349.getClass(), "prodProdExplain", null);
        setField(term3373349, term3373349.getClass(), "reseProdExplain", null);
        setField(term3373349, term3373349.getClass(), "cultProdExplain", null);
        setField(term3373349, term3373349.getClass(), "credProdExplain", null);
        setField(term3373349, term3373349.getClass(), "governor", null);
        setIntField(term3373349, term3373349.getClass(), "governorGuide", 0);
        setField(term3373349, term3373349.getClass(), "orbital", null);
        setField(term3373349, term3373349.getClass(), "workers", null);
        setField(term3373349, term3373349.getClass(), "buildings", null);
        setField(term3373349, term3373349.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHappinessEffect", argTypes, term3373349, args);
    }

};


