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

public class Planet_getTotalProductionWithoutTax_269131038162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2684445;

    public Planet_getTotalProductionWithoutTax_269131038162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2684445 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term2684445, term2684445.getClass(), "name", null);
        setIntField(term2684445, term2684445.getClass(), "orderNumber", 0);
        setField(term2684445, term2684445.getClass(), "radiationType", null);
        setField(term2684445, term2684445.getClass(), "gravityType", null);
        setField(term2684445, term2684445.getClass(), "temperatureType", null);
        setField(term2684445, term2684445.getClass(), "waterLevel", null);
        setBooleanField(term2684445, term2684445.getClass(), "gasGiant", false);
        setField(term2684445, term2684445.getClass(), "coordinate", null);
        setField(term2684445, term2684445.getClass(), "planetType", null);
        setIntField(term2684445, term2684445.getClass(), "groundSize", 0);
        setIntField(term2684445, term2684445.getClass(), "amountMetalInGround", 0);
        setIntField(term2684445, term2684445.getClass(), "metal", 0);
        setIntField(term2684445, term2684445.getClass(), "prodResource", 0);
        setIntField(term2684445, term2684445.getClass(), "extraFood", 0);
        setIntField(term2684445, term2684445.getClass(), "culture", 0);
        setIntField(term2684445, term2684445.getClass(), "planetOwner", 0);
        setField(term2684445, term2684445.getClass(), "planetOwnerInfo", null);
        setField(term2684445, term2684445.getClass(), "homeWorldId", null);
        setIntField(term2684445, term2684445.getClass(), "startRealmIndex", 0);
        setIntField(term2684445, term2684445.getClass(), "tax", 0);
        setField(term2684445, term2684445.getClass(), "statuses", null);
        setField(term2684445, term2684445.getClass(), "timedStatuses", null);
        setField(term2684445, term2684445.getClass(), "event", null);
        setBooleanField(term2684445, term2684445.getClass(), "eventFound", false);
        setField(term2684445, term2684445.getClass(), "happinessEffect", null);
        setField(term2684445, term2684445.getClass(), "happinessExplanation", null);
        setField(term2684445, term2684445.getClass(), "farmProdExplain", null);
        setField(term2684445, term2684445.getClass(), "metaProdExplain", null);
        setField(term2684445, term2684445.getClass(), "prodProdExplain", null);
        setField(term2684445, term2684445.getClass(), "reseProdExplain", null);
        setField(term2684445, term2684445.getClass(), "cultProdExplain", null);
        setField(term2684445, term2684445.getClass(), "credProdExplain", null);
        setField(term2684445, term2684445.getClass(), "governor", null);
        setIntField(term2684445, term2684445.getClass(), "governorGuide", 0);
        setField(term2684445, term2684445.getClass(), "orbital", null);
        setField(term2684445, term2684445.getClass(), "workers", null);
        setField(term2684445, term2684445.getClass(), "buildings", null);
        setField(term2684445, term2684445.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalProductionWithoutTax", argTypes, term2684445, args);
    }

};


