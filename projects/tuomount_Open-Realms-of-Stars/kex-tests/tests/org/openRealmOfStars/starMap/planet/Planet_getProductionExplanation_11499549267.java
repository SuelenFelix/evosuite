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

public class Planet_getProductionExplanation_11499549267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3167895;

    public Planet_getProductionExplanation_11499549267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3167895 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term3167895, term3167895.getClass(), "name", null);
        setIntField(term3167895, term3167895.getClass(), "orderNumber", 0);
        setField(term3167895, term3167895.getClass(), "radiationType", null);
        setField(term3167895, term3167895.getClass(), "gravityType", null);
        setField(term3167895, term3167895.getClass(), "temperatureType", null);
        setField(term3167895, term3167895.getClass(), "waterLevel", null);
        setBooleanField(term3167895, term3167895.getClass(), "gasGiant", false);
        setField(term3167895, term3167895.getClass(), "coordinate", null);
        setField(term3167895, term3167895.getClass(), "planetType", null);
        setIntField(term3167895, term3167895.getClass(), "groundSize", 0);
        setIntField(term3167895, term3167895.getClass(), "amountMetalInGround", 0);
        setIntField(term3167895, term3167895.getClass(), "metal", 0);
        setIntField(term3167895, term3167895.getClass(), "prodResource", 0);
        setIntField(term3167895, term3167895.getClass(), "extraFood", 0);
        setIntField(term3167895, term3167895.getClass(), "culture", 0);
        setIntField(term3167895, term3167895.getClass(), "planetOwner", 0);
        setField(term3167895, term3167895.getClass(), "planetOwnerInfo", null);
        setField(term3167895, term3167895.getClass(), "homeWorldId", null);
        setIntField(term3167895, term3167895.getClass(), "startRealmIndex", 0);
        setIntField(term3167895, term3167895.getClass(), "tax", 0);
        setField(term3167895, term3167895.getClass(), "statuses", null);
        setField(term3167895, term3167895.getClass(), "timedStatuses", null);
        setField(term3167895, term3167895.getClass(), "event", null);
        setBooleanField(term3167895, term3167895.getClass(), "eventFound", false);
        setField(term3167895, term3167895.getClass(), "happinessEffect", null);
        setField(term3167895, term3167895.getClass(), "happinessExplanation", null);
        setField(term3167895, term3167895.getClass(), "farmProdExplain", null);
        setField(term3167895, term3167895.getClass(), "metaProdExplain", null);
        setField(term3167895, term3167895.getClass(), "prodProdExplain", null);
        setField(term3167895, term3167895.getClass(), "reseProdExplain", null);
        setField(term3167895, term3167895.getClass(), "cultProdExplain", null);
        setField(term3167895, term3167895.getClass(), "credProdExplain", null);
        setField(term3167895, term3167895.getClass(), "governor", null);
        setIntField(term3167895, term3167895.getClass(), "governorGuide", 0);
        setField(term3167895, term3167895.getClass(), "orbital", null);
        setField(term3167895, term3167895.getClass(), "workers", null);
        setField(term3167895, term3167895.getClass(), "buildings", null);
        setField(term3167895, term3167895.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProductionExplanation", argTypes, term3167895, args);
    }

};


