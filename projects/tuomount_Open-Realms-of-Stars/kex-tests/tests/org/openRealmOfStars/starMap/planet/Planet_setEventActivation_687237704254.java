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
import java.lang.Boolean;

public class Planet_setEventActivation_687237704254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3093314;
     Object term3093328;

    public Planet_setEventActivation_687237704254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3093314 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term3093314, term3093314.getClass(), "name", null);
        setIntField(term3093314, term3093314.getClass(), "orderNumber", 0);
        setField(term3093314, term3093314.getClass(), "radiationType", null);
        setField(term3093314, term3093314.getClass(), "gravityType", null);
        setField(term3093314, term3093314.getClass(), "temperatureType", null);
        setField(term3093314, term3093314.getClass(), "waterLevel", null);
        setBooleanField(term3093314, term3093314.getClass(), "gasGiant", false);
        setField(term3093314, term3093314.getClass(), "coordinate", null);
        setField(term3093314, term3093314.getClass(), "planetType", null);
        setIntField(term3093314, term3093314.getClass(), "groundSize", 0);
        setIntField(term3093314, term3093314.getClass(), "amountMetalInGround", 0);
        setIntField(term3093314, term3093314.getClass(), "metal", 0);
        setIntField(term3093314, term3093314.getClass(), "prodResource", 0);
        setIntField(term3093314, term3093314.getClass(), "extraFood", 0);
        setIntField(term3093314, term3093314.getClass(), "culture", 0);
        setIntField(term3093314, term3093314.getClass(), "planetOwner", 0);
        setField(term3093314, term3093314.getClass(), "planetOwnerInfo", null);
        setField(term3093314, term3093314.getClass(), "homeWorldId", null);
        setIntField(term3093314, term3093314.getClass(), "startRealmIndex", 0);
        setIntField(term3093314, term3093314.getClass(), "tax", 0);
        setField(term3093314, term3093314.getClass(), "statuses", null);
        setField(term3093314, term3093314.getClass(), "timedStatuses", null);
        setField(term3093314, term3093314.getClass(), "event", null);
        setBooleanField(term3093314, term3093314.getClass(), "eventFound", false);
        setField(term3093314, term3093314.getClass(), "happinessEffect", null);
        setField(term3093314, term3093314.getClass(), "happinessExplanation", null);
        setField(term3093314, term3093314.getClass(), "farmProdExplain", null);
        setField(term3093314, term3093314.getClass(), "metaProdExplain", null);
        setField(term3093314, term3093314.getClass(), "prodProdExplain", null);
        setField(term3093314, term3093314.getClass(), "reseProdExplain", null);
        setField(term3093314, term3093314.getClass(), "cultProdExplain", null);
        setField(term3093314, term3093314.getClass(), "credProdExplain", null);
        setField(term3093314, term3093314.getClass(), "governor", null);
        setIntField(term3093314, term3093314.getClass(), "governorGuide", 0);
        setField(term3093314, term3093314.getClass(), "orbital", null);
        setField(term3093314, term3093314.getClass(), "workers", null);
        setField(term3093314, term3093314.getClass(), "buildings", null);
        setField(term3093314, term3093314.getClass(), "underConstruction", null);
        term3093328 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term3093328;
        callMethod(klass, "setEventActivation", argTypes, term3093314, args);
    }

};


