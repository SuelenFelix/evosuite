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

public class Planet_getMaintenanceCost_188421897436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2210590;

    public Planet_getMaintenanceCost_188421897436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2210590 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term2210590, term2210590.getClass(), "name", null);
        setIntField(term2210590, term2210590.getClass(), "orderNumber", 0);
        setField(term2210590, term2210590.getClass(), "radiationType", null);
        setField(term2210590, term2210590.getClass(), "gravityType", null);
        setField(term2210590, term2210590.getClass(), "temperatureType", null);
        setField(term2210590, term2210590.getClass(), "waterLevel", null);
        setBooleanField(term2210590, term2210590.getClass(), "gasGiant", false);
        setField(term2210590, term2210590.getClass(), "coordinate", null);
        setField(term2210590, term2210590.getClass(), "planetType", null);
        setIntField(term2210590, term2210590.getClass(), "groundSize", 0);
        setIntField(term2210590, term2210590.getClass(), "amountMetalInGround", 0);
        setIntField(term2210590, term2210590.getClass(), "metal", 0);
        setIntField(term2210590, term2210590.getClass(), "prodResource", 0);
        setIntField(term2210590, term2210590.getClass(), "extraFood", 0);
        setIntField(term2210590, term2210590.getClass(), "culture", 0);
        setIntField(term2210590, term2210590.getClass(), "planetOwner", 0);
        setField(term2210590, term2210590.getClass(), "planetOwnerInfo", null);
        setField(term2210590, term2210590.getClass(), "homeWorldId", null);
        setIntField(term2210590, term2210590.getClass(), "startRealmIndex", 0);
        setIntField(term2210590, term2210590.getClass(), "tax", 0);
        setField(term2210590, term2210590.getClass(), "statuses", null);
        setField(term2210590, term2210590.getClass(), "timedStatuses", null);
        setField(term2210590, term2210590.getClass(), "event", null);
        setBooleanField(term2210590, term2210590.getClass(), "eventFound", false);
        setField(term2210590, term2210590.getClass(), "happinessEffect", null);
        setField(term2210590, term2210590.getClass(), "happinessExplanation", null);
        setField(term2210590, term2210590.getClass(), "farmProdExplain", null);
        setField(term2210590, term2210590.getClass(), "metaProdExplain", null);
        setField(term2210590, term2210590.getClass(), "prodProdExplain", null);
        setField(term2210590, term2210590.getClass(), "reseProdExplain", null);
        setField(term2210590, term2210590.getClass(), "cultProdExplain", null);
        setField(term2210590, term2210590.getClass(), "credProdExplain", null);
        setField(term2210590, term2210590.getClass(), "governor", null);
        setIntField(term2210590, term2210590.getClass(), "governorGuide", 0);
        setField(term2210590, term2210590.getClass(), "orbital", null);
        setField(term2210590, term2210590.getClass(), "workers", null);
        setField(term2210590, term2210590.getClass(), "buildings", null);
        setField(term2210590, term2210590.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaintenanceCost", argTypes, term2210590, args);
    }

};


