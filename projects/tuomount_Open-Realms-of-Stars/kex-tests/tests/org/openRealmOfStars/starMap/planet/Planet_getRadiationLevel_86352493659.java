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

public class Planet_getRadiationLevel_86352493659 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term258331;

    public Planet_getRadiationLevel_86352493659() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term258331 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term258331, term258331.getClass(), "name", null);
        setIntField(term258331, term258331.getClass(), "orderNumber", 0);
        setField(term258331, term258331.getClass(), "radiationType", null);
        setField(term258331, term258331.getClass(), "gravityType", null);
        setField(term258331, term258331.getClass(), "temperatureType", null);
        setField(term258331, term258331.getClass(), "waterLevel", null);
        setBooleanField(term258331, term258331.getClass(), "gasGiant", false);
        setField(term258331, term258331.getClass(), "coordinate", null);
        setField(term258331, term258331.getClass(), "planetType", null);
        setIntField(term258331, term258331.getClass(), "groundSize", 0);
        setIntField(term258331, term258331.getClass(), "amountMetalInGround", 0);
        setIntField(term258331, term258331.getClass(), "metal", 0);
        setIntField(term258331, term258331.getClass(), "prodResource", 0);
        setIntField(term258331, term258331.getClass(), "extraFood", 0);
        setIntField(term258331, term258331.getClass(), "culture", 0);
        setIntField(term258331, term258331.getClass(), "planetOwner", 0);
        setField(term258331, term258331.getClass(), "planetOwnerInfo", null);
        setField(term258331, term258331.getClass(), "homeWorldId", null);
        setIntField(term258331, term258331.getClass(), "startRealmIndex", 0);
        setIntField(term258331, term258331.getClass(), "tax", 0);
        setField(term258331, term258331.getClass(), "statuses", null);
        setField(term258331, term258331.getClass(), "timedStatuses", null);
        setField(term258331, term258331.getClass(), "event", null);
        setBooleanField(term258331, term258331.getClass(), "eventFound", false);
        setField(term258331, term258331.getClass(), "happinessEffect", null);
        setField(term258331, term258331.getClass(), "happinessExplanation", null);
        setField(term258331, term258331.getClass(), "farmProdExplain", null);
        setField(term258331, term258331.getClass(), "metaProdExplain", null);
        setField(term258331, term258331.getClass(), "prodProdExplain", null);
        setField(term258331, term258331.getClass(), "reseProdExplain", null);
        setField(term258331, term258331.getClass(), "cultProdExplain", null);
        setField(term258331, term258331.getClass(), "credProdExplain", null);
        setField(term258331, term258331.getClass(), "governor", null);
        setIntField(term258331, term258331.getClass(), "governorGuide", 0);
        setField(term258331, term258331.getClass(), "orbital", null);
        setField(term258331, term258331.getClass(), "workers", null);
        setField(term258331, term258331.getClass(), "buildings", null);
        setField(term258331, term258331.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRadiationLevel", argTypes, term258331, args);
    }

};


