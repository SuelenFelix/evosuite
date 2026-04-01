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

public class Planet_getSizeAsInt_1321254970128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2540190;

    public Planet_getSizeAsInt_1321254970128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2540190 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term2540190, term2540190.getClass(), "name", null);
        setIntField(term2540190, term2540190.getClass(), "orderNumber", 0);
        setField(term2540190, term2540190.getClass(), "radiationType", null);
        setField(term2540190, term2540190.getClass(), "gravityType", null);
        setField(term2540190, term2540190.getClass(), "temperatureType", null);
        setField(term2540190, term2540190.getClass(), "waterLevel", null);
        setBooleanField(term2540190, term2540190.getClass(), "gasGiant", false);
        setField(term2540190, term2540190.getClass(), "coordinate", null);
        setField(term2540190, term2540190.getClass(), "planetType", null);
        setIntField(term2540190, term2540190.getClass(), "groundSize", 0);
        setIntField(term2540190, term2540190.getClass(), "amountMetalInGround", 0);
        setIntField(term2540190, term2540190.getClass(), "metal", 0);
        setIntField(term2540190, term2540190.getClass(), "prodResource", 0);
        setIntField(term2540190, term2540190.getClass(), "extraFood", 0);
        setIntField(term2540190, term2540190.getClass(), "culture", 0);
        setIntField(term2540190, term2540190.getClass(), "planetOwner", 0);
        setField(term2540190, term2540190.getClass(), "planetOwnerInfo", null);
        setField(term2540190, term2540190.getClass(), "homeWorldId", null);
        setIntField(term2540190, term2540190.getClass(), "startRealmIndex", 0);
        setIntField(term2540190, term2540190.getClass(), "tax", 0);
        setField(term2540190, term2540190.getClass(), "statuses", null);
        setField(term2540190, term2540190.getClass(), "timedStatuses", null);
        setField(term2540190, term2540190.getClass(), "event", null);
        setBooleanField(term2540190, term2540190.getClass(), "eventFound", false);
        setField(term2540190, term2540190.getClass(), "happinessEffect", null);
        setField(term2540190, term2540190.getClass(), "happinessExplanation", null);
        setField(term2540190, term2540190.getClass(), "farmProdExplain", null);
        setField(term2540190, term2540190.getClass(), "metaProdExplain", null);
        setField(term2540190, term2540190.getClass(), "prodProdExplain", null);
        setField(term2540190, term2540190.getClass(), "reseProdExplain", null);
        setField(term2540190, term2540190.getClass(), "cultProdExplain", null);
        setField(term2540190, term2540190.getClass(), "credProdExplain", null);
        setField(term2540190, term2540190.getClass(), "governor", null);
        setIntField(term2540190, term2540190.getClass(), "governorGuide", 0);
        setField(term2540190, term2540190.getClass(), "orbital", null);
        setField(term2540190, term2540190.getClass(), "workers", null);
        setField(term2540190, term2540190.getClass(), "buildings", null);
        setField(term2540190, term2540190.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSizeAsInt", argTypes, term2540190, args);
    }

};


