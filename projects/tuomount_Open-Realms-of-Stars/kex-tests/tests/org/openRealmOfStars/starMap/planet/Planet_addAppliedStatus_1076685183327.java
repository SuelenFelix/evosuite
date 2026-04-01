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

public class Planet_addAppliedStatus_1076685183327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3373277;

    public Planet_addAppliedStatus_1076685183327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3373277 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term3373277, term3373277.getClass(), "name", null);
        setIntField(term3373277, term3373277.getClass(), "orderNumber", 0);
        setField(term3373277, term3373277.getClass(), "radiationType", null);
        setField(term3373277, term3373277.getClass(), "gravityType", null);
        setField(term3373277, term3373277.getClass(), "temperatureType", null);
        setField(term3373277, term3373277.getClass(), "waterLevel", null);
        setBooleanField(term3373277, term3373277.getClass(), "gasGiant", false);
        setField(term3373277, term3373277.getClass(), "coordinate", null);
        setField(term3373277, term3373277.getClass(), "planetType", null);
        setIntField(term3373277, term3373277.getClass(), "groundSize", 0);
        setIntField(term3373277, term3373277.getClass(), "amountMetalInGround", 0);
        setIntField(term3373277, term3373277.getClass(), "metal", 0);
        setIntField(term3373277, term3373277.getClass(), "prodResource", 0);
        setIntField(term3373277, term3373277.getClass(), "extraFood", 0);
        setIntField(term3373277, term3373277.getClass(), "culture", 0);
        setIntField(term3373277, term3373277.getClass(), "planetOwner", 0);
        setField(term3373277, term3373277.getClass(), "planetOwnerInfo", null);
        setField(term3373277, term3373277.getClass(), "homeWorldId", null);
        setIntField(term3373277, term3373277.getClass(), "startRealmIndex", 0);
        setIntField(term3373277, term3373277.getClass(), "tax", 0);
        setField(term3373277, term3373277.getClass(), "statuses", null);
        setField(term3373277, term3373277.getClass(), "timedStatuses", null);
        setField(term3373277, term3373277.getClass(), "event", null);
        setBooleanField(term3373277, term3373277.getClass(), "eventFound", false);
        setField(term3373277, term3373277.getClass(), "happinessEffect", null);
        setField(term3373277, term3373277.getClass(), "happinessExplanation", null);
        setField(term3373277, term3373277.getClass(), "farmProdExplain", null);
        setField(term3373277, term3373277.getClass(), "metaProdExplain", null);
        setField(term3373277, term3373277.getClass(), "prodProdExplain", null);
        setField(term3373277, term3373277.getClass(), "reseProdExplain", null);
        setField(term3373277, term3373277.getClass(), "cultProdExplain", null);
        setField(term3373277, term3373277.getClass(), "credProdExplain", null);
        setField(term3373277, term3373277.getClass(), "governor", null);
        setIntField(term3373277, term3373277.getClass(), "governorGuide", 0);
        setField(term3373277, term3373277.getClass(), "orbital", null);
        setField(term3373277, term3373277.getClass(), "workers", null);
        setField(term3373277, term3373277.getClass(), "buildings", null);
        setField(term3373277, term3373277.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.status.AppliedStatus");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addAppliedStatus", argTypes, term3373277, args);
    }

};


