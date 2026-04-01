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

public class Planet_setGasGiant_662725656105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2457335;
     Object term2457349;

    public Planet_setGasGiant_662725656105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2457335 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term2457335, term2457335.getClass(), "name", null);
        setIntField(term2457335, term2457335.getClass(), "orderNumber", 0);
        setField(term2457335, term2457335.getClass(), "radiationType", null);
        setField(term2457335, term2457335.getClass(), "gravityType", null);
        setField(term2457335, term2457335.getClass(), "temperatureType", null);
        setField(term2457335, term2457335.getClass(), "waterLevel", null);
        setBooleanField(term2457335, term2457335.getClass(), "gasGiant", false);
        setField(term2457335, term2457335.getClass(), "coordinate", null);
        setField(term2457335, term2457335.getClass(), "planetType", null);
        setIntField(term2457335, term2457335.getClass(), "groundSize", 0);
        setIntField(term2457335, term2457335.getClass(), "amountMetalInGround", 0);
        setIntField(term2457335, term2457335.getClass(), "metal", 0);
        setIntField(term2457335, term2457335.getClass(), "prodResource", 0);
        setIntField(term2457335, term2457335.getClass(), "extraFood", 0);
        setIntField(term2457335, term2457335.getClass(), "culture", 0);
        setIntField(term2457335, term2457335.getClass(), "planetOwner", 0);
        setField(term2457335, term2457335.getClass(), "planetOwnerInfo", null);
        setField(term2457335, term2457335.getClass(), "homeWorldId", null);
        setIntField(term2457335, term2457335.getClass(), "startRealmIndex", 0);
        setIntField(term2457335, term2457335.getClass(), "tax", 0);
        setField(term2457335, term2457335.getClass(), "statuses", null);
        setField(term2457335, term2457335.getClass(), "timedStatuses", null);
        setField(term2457335, term2457335.getClass(), "event", null);
        setBooleanField(term2457335, term2457335.getClass(), "eventFound", false);
        setField(term2457335, term2457335.getClass(), "happinessEffect", null);
        setField(term2457335, term2457335.getClass(), "happinessExplanation", null);
        setField(term2457335, term2457335.getClass(), "farmProdExplain", null);
        setField(term2457335, term2457335.getClass(), "metaProdExplain", null);
        setField(term2457335, term2457335.getClass(), "prodProdExplain", null);
        setField(term2457335, term2457335.getClass(), "reseProdExplain", null);
        setField(term2457335, term2457335.getClass(), "cultProdExplain", null);
        setField(term2457335, term2457335.getClass(), "credProdExplain", null);
        setField(term2457335, term2457335.getClass(), "governor", null);
        setIntField(term2457335, term2457335.getClass(), "governorGuide", 0);
        setField(term2457335, term2457335.getClass(), "orbital", null);
        setField(term2457335, term2457335.getClass(), "workers", null);
        setField(term2457335, term2457335.getClass(), "buildings", null);
        setField(term2457335, term2457335.getClass(), "underConstruction", null);
        term2457349 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term2457349;
        callMethod(klass, "setGasGiant", argTypes, term2457335, args);
    }

};


