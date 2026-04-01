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

public class Planet_setCoordinate_1325614584113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2484914;

    public Planet_setCoordinate_1325614584113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2484914 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term2484914, term2484914.getClass(), "name", null);
        setIntField(term2484914, term2484914.getClass(), "orderNumber", 0);
        setField(term2484914, term2484914.getClass(), "radiationType", null);
        setField(term2484914, term2484914.getClass(), "gravityType", null);
        setField(term2484914, term2484914.getClass(), "temperatureType", null);
        setField(term2484914, term2484914.getClass(), "waterLevel", null);
        setBooleanField(term2484914, term2484914.getClass(), "gasGiant", false);
        setField(term2484914, term2484914.getClass(), "coordinate", null);
        setField(term2484914, term2484914.getClass(), "planetType", null);
        setIntField(term2484914, term2484914.getClass(), "groundSize", 0);
        setIntField(term2484914, term2484914.getClass(), "amountMetalInGround", 0);
        setIntField(term2484914, term2484914.getClass(), "metal", 0);
        setIntField(term2484914, term2484914.getClass(), "prodResource", 0);
        setIntField(term2484914, term2484914.getClass(), "extraFood", 0);
        setIntField(term2484914, term2484914.getClass(), "culture", 0);
        setIntField(term2484914, term2484914.getClass(), "planetOwner", 0);
        setField(term2484914, term2484914.getClass(), "planetOwnerInfo", null);
        setField(term2484914, term2484914.getClass(), "homeWorldId", null);
        setIntField(term2484914, term2484914.getClass(), "startRealmIndex", 0);
        setIntField(term2484914, term2484914.getClass(), "tax", 0);
        setField(term2484914, term2484914.getClass(), "statuses", null);
        setField(term2484914, term2484914.getClass(), "timedStatuses", null);
        setField(term2484914, term2484914.getClass(), "event", null);
        setBooleanField(term2484914, term2484914.getClass(), "eventFound", false);
        setField(term2484914, term2484914.getClass(), "happinessEffect", null);
        setField(term2484914, term2484914.getClass(), "happinessExplanation", null);
        setField(term2484914, term2484914.getClass(), "farmProdExplain", null);
        setField(term2484914, term2484914.getClass(), "metaProdExplain", null);
        setField(term2484914, term2484914.getClass(), "prodProdExplain", null);
        setField(term2484914, term2484914.getClass(), "reseProdExplain", null);
        setField(term2484914, term2484914.getClass(), "cultProdExplain", null);
        setField(term2484914, term2484914.getClass(), "credProdExplain", null);
        setField(term2484914, term2484914.getClass(), "governor", null);
        setIntField(term2484914, term2484914.getClass(), "governorGuide", 0);
        setField(term2484914, term2484914.getClass(), "orbital", null);
        setField(term2484914, term2484914.getClass(), "workers", null);
        setField(term2484914, term2484914.getClass(), "buildings", null);
        setField(term2484914, term2484914.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.Coordinate");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCoordinate", argTypes, term2484914, args);
    }

};


