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

public class Planet_getProductionTimeAsString_1454246590311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3373047;

    public Planet_getProductionTimeAsString_1454246590311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3373047 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term3373047, term3373047.getClass(), "name", null);
        setIntField(term3373047, term3373047.getClass(), "orderNumber", 0);
        setField(term3373047, term3373047.getClass(), "radiationType", null);
        setField(term3373047, term3373047.getClass(), "gravityType", null);
        setField(term3373047, term3373047.getClass(), "temperatureType", null);
        setField(term3373047, term3373047.getClass(), "waterLevel", null);
        setBooleanField(term3373047, term3373047.getClass(), "gasGiant", false);
        setField(term3373047, term3373047.getClass(), "coordinate", null);
        setField(term3373047, term3373047.getClass(), "planetType", null);
        setIntField(term3373047, term3373047.getClass(), "groundSize", 0);
        setIntField(term3373047, term3373047.getClass(), "amountMetalInGround", 0);
        setIntField(term3373047, term3373047.getClass(), "metal", 0);
        setIntField(term3373047, term3373047.getClass(), "prodResource", 0);
        setIntField(term3373047, term3373047.getClass(), "extraFood", 0);
        setIntField(term3373047, term3373047.getClass(), "culture", 0);
        setIntField(term3373047, term3373047.getClass(), "planetOwner", 0);
        setField(term3373047, term3373047.getClass(), "planetOwnerInfo", null);
        setField(term3373047, term3373047.getClass(), "homeWorldId", null);
        setIntField(term3373047, term3373047.getClass(), "startRealmIndex", 0);
        setIntField(term3373047, term3373047.getClass(), "tax", 0);
        setField(term3373047, term3373047.getClass(), "statuses", null);
        setField(term3373047, term3373047.getClass(), "timedStatuses", null);
        setField(term3373047, term3373047.getClass(), "event", null);
        setBooleanField(term3373047, term3373047.getClass(), "eventFound", false);
        setField(term3373047, term3373047.getClass(), "happinessEffect", null);
        setField(term3373047, term3373047.getClass(), "happinessExplanation", null);
        setField(term3373047, term3373047.getClass(), "farmProdExplain", null);
        setField(term3373047, term3373047.getClass(), "metaProdExplain", null);
        setField(term3373047, term3373047.getClass(), "prodProdExplain", null);
        setField(term3373047, term3373047.getClass(), "reseProdExplain", null);
        setField(term3373047, term3373047.getClass(), "cultProdExplain", null);
        setField(term3373047, term3373047.getClass(), "credProdExplain", null);
        setField(term3373047, term3373047.getClass(), "governor", null);
        setIntField(term3373047, term3373047.getClass(), "governorGuide", 0);
        setField(term3373047, term3373047.getClass(), "orbital", null);
        setField(term3373047, term3373047.getClass(), "workers", null);
        setField(term3373047, term3373047.getClass(), "buildings", null);
        setField(term3373047, term3373047.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.construction.Construction");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getProductionTimeAsString", argTypes, term3373047, args);
    }

};


