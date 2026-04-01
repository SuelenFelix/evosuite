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

public class Planet_setEventActivation_687237704251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1051431;
     Object term1051445;

    public Planet_setEventActivation_687237704251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1051431 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term1051431, term1051431.getClass(), "name", null);
        setIntField(term1051431, term1051431.getClass(), "orderNumber", 0);
        setField(term1051431, term1051431.getClass(), "radiationType", null);
        setField(term1051431, term1051431.getClass(), "gravityType", null);
        setField(term1051431, term1051431.getClass(), "temperatureType", null);
        setField(term1051431, term1051431.getClass(), "waterLevel", null);
        setBooleanField(term1051431, term1051431.getClass(), "gasGiant", false);
        setField(term1051431, term1051431.getClass(), "coordinate", null);
        setField(term1051431, term1051431.getClass(), "planetType", null);
        setIntField(term1051431, term1051431.getClass(), "groundSize", 0);
        setIntField(term1051431, term1051431.getClass(), "amountMetalInGround", 0);
        setIntField(term1051431, term1051431.getClass(), "metal", 0);
        setIntField(term1051431, term1051431.getClass(), "prodResource", 0);
        setIntField(term1051431, term1051431.getClass(), "extraFood", 0);
        setIntField(term1051431, term1051431.getClass(), "culture", 0);
        setIntField(term1051431, term1051431.getClass(), "planetOwner", 0);
        setField(term1051431, term1051431.getClass(), "planetOwnerInfo", null);
        setField(term1051431, term1051431.getClass(), "homeWorldId", null);
        setIntField(term1051431, term1051431.getClass(), "startRealmIndex", 0);
        setIntField(term1051431, term1051431.getClass(), "tax", 0);
        setField(term1051431, term1051431.getClass(), "statuses", null);
        setField(term1051431, term1051431.getClass(), "timedStatuses", null);
        setField(term1051431, term1051431.getClass(), "event", null);
        setBooleanField(term1051431, term1051431.getClass(), "eventFound", false);
        setField(term1051431, term1051431.getClass(), "happinessEffect", null);
        setField(term1051431, term1051431.getClass(), "happinessExplanation", null);
        setField(term1051431, term1051431.getClass(), "farmProdExplain", null);
        setField(term1051431, term1051431.getClass(), "metaProdExplain", null);
        setField(term1051431, term1051431.getClass(), "prodProdExplain", null);
        setField(term1051431, term1051431.getClass(), "reseProdExplain", null);
        setField(term1051431, term1051431.getClass(), "cultProdExplain", null);
        setField(term1051431, term1051431.getClass(), "credProdExplain", null);
        setField(term1051431, term1051431.getClass(), "governor", null);
        setIntField(term1051431, term1051431.getClass(), "governorGuide", 0);
        setField(term1051431, term1051431.getClass(), "orbital", null);
        setField(term1051431, term1051431.getClass(), "workers", null);
        setField(term1051431, term1051431.getClass(), "buildings", null);
        setField(term1051431, term1051431.getClass(), "underConstruction", null);
        term1051445 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1051445;
        callMethod(klass, "setEventActivation", argTypes, term1051431, args);
    }

};


