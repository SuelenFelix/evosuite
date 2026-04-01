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
import java.lang.Integer;

public class Planet_setStartRealmIndex_1042331277215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term918597;
     Object term918611;

    public Planet_setStartRealmIndex_1042331277215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term918597 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term918597, term918597.getClass(), "name", null);
        setIntField(term918597, term918597.getClass(), "orderNumber", 0);
        setField(term918597, term918597.getClass(), "radiationType", null);
        setField(term918597, term918597.getClass(), "gravityType", null);
        setField(term918597, term918597.getClass(), "temperatureType", null);
        setField(term918597, term918597.getClass(), "waterLevel", null);
        setBooleanField(term918597, term918597.getClass(), "gasGiant", false);
        setField(term918597, term918597.getClass(), "coordinate", null);
        setField(term918597, term918597.getClass(), "planetType", null);
        setIntField(term918597, term918597.getClass(), "groundSize", 0);
        setIntField(term918597, term918597.getClass(), "amountMetalInGround", 0);
        setIntField(term918597, term918597.getClass(), "metal", 0);
        setIntField(term918597, term918597.getClass(), "prodResource", 0);
        setIntField(term918597, term918597.getClass(), "extraFood", 0);
        setIntField(term918597, term918597.getClass(), "culture", 0);
        setIntField(term918597, term918597.getClass(), "planetOwner", 0);
        setField(term918597, term918597.getClass(), "planetOwnerInfo", null);
        setField(term918597, term918597.getClass(), "homeWorldId", null);
        setIntField(term918597, term918597.getClass(), "startRealmIndex", 0);
        setIntField(term918597, term918597.getClass(), "tax", 0);
        setField(term918597, term918597.getClass(), "statuses", null);
        setField(term918597, term918597.getClass(), "timedStatuses", null);
        setField(term918597, term918597.getClass(), "event", null);
        setBooleanField(term918597, term918597.getClass(), "eventFound", false);
        setField(term918597, term918597.getClass(), "happinessEffect", null);
        setField(term918597, term918597.getClass(), "happinessExplanation", null);
        setField(term918597, term918597.getClass(), "farmProdExplain", null);
        setField(term918597, term918597.getClass(), "metaProdExplain", null);
        setField(term918597, term918597.getClass(), "prodProdExplain", null);
        setField(term918597, term918597.getClass(), "reseProdExplain", null);
        setField(term918597, term918597.getClass(), "cultProdExplain", null);
        setField(term918597, term918597.getClass(), "credProdExplain", null);
        setField(term918597, term918597.getClass(), "governor", null);
        setIntField(term918597, term918597.getClass(), "governorGuide", 0);
        setField(term918597, term918597.getClass(), "orbital", null);
        setField(term918597, term918597.getClass(), "workers", null);
        setField(term918597, term918597.getClass(), "buildings", null);
        setField(term918597, term918597.getClass(), "underConstruction", null);
        term918611 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term918611;
        callMethod(klass, "setStartRealmIndex", argTypes, term918597, args);
    }

};


