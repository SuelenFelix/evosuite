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

public class Planet_generateGravityBasedOnSize_144528492679 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term336549;

    public Planet_generateGravityBasedOnSize_144528492679() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term336549 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term336549, term336549.getClass(), "name", null);
        setIntField(term336549, term336549.getClass(), "orderNumber", 0);
        setField(term336549, term336549.getClass(), "radiationType", null);
        setField(term336549, term336549.getClass(), "gravityType", null);
        setField(term336549, term336549.getClass(), "temperatureType", null);
        setField(term336549, term336549.getClass(), "waterLevel", null);
        setBooleanField(term336549, term336549.getClass(), "gasGiant", false);
        setField(term336549, term336549.getClass(), "coordinate", null);
        setField(term336549, term336549.getClass(), "planetType", null);
        setIntField(term336549, term336549.getClass(), "groundSize", 0);
        setIntField(term336549, term336549.getClass(), "amountMetalInGround", 0);
        setIntField(term336549, term336549.getClass(), "metal", 0);
        setIntField(term336549, term336549.getClass(), "prodResource", 0);
        setIntField(term336549, term336549.getClass(), "extraFood", 0);
        setIntField(term336549, term336549.getClass(), "culture", 0);
        setIntField(term336549, term336549.getClass(), "planetOwner", 0);
        setField(term336549, term336549.getClass(), "planetOwnerInfo", null);
        setField(term336549, term336549.getClass(), "homeWorldId", null);
        setIntField(term336549, term336549.getClass(), "startRealmIndex", 0);
        setIntField(term336549, term336549.getClass(), "tax", 0);
        setField(term336549, term336549.getClass(), "statuses", null);
        setField(term336549, term336549.getClass(), "timedStatuses", null);
        setField(term336549, term336549.getClass(), "event", null);
        setBooleanField(term336549, term336549.getClass(), "eventFound", false);
        setField(term336549, term336549.getClass(), "happinessEffect", null);
        setField(term336549, term336549.getClass(), "happinessExplanation", null);
        setField(term336549, term336549.getClass(), "farmProdExplain", null);
        setField(term336549, term336549.getClass(), "metaProdExplain", null);
        setField(term336549, term336549.getClass(), "prodProdExplain", null);
        setField(term336549, term336549.getClass(), "reseProdExplain", null);
        setField(term336549, term336549.getClass(), "cultProdExplain", null);
        setField(term336549, term336549.getClass(), "credProdExplain", null);
        setField(term336549, term336549.getClass(), "governor", null);
        setIntField(term336549, term336549.getClass(), "governorGuide", 0);
        setField(term336549, term336549.getClass(), "orbital", null);
        setField(term336549, term336549.getClass(), "workers", null);
        setField(term336549, term336549.getClass(), "buildings", null);
        setField(term336549, term336549.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "generateGravityBasedOnSize", argTypes, term336549, args);
    }

};


