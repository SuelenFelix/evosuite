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

public class Planet_setGasGiant_662725656100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term423810;
     Object term423824;

    public Planet_setGasGiant_662725656100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term423810 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term423810, term423810.getClass(), "name", null);
        setIntField(term423810, term423810.getClass(), "orderNumber", 0);
        setField(term423810, term423810.getClass(), "radiationType", null);
        setField(term423810, term423810.getClass(), "gravityType", null);
        setField(term423810, term423810.getClass(), "temperatureType", null);
        setField(term423810, term423810.getClass(), "waterLevel", null);
        setBooleanField(term423810, term423810.getClass(), "gasGiant", false);
        setField(term423810, term423810.getClass(), "coordinate", null);
        setField(term423810, term423810.getClass(), "planetType", null);
        setIntField(term423810, term423810.getClass(), "groundSize", 0);
        setIntField(term423810, term423810.getClass(), "amountMetalInGround", 0);
        setIntField(term423810, term423810.getClass(), "metal", 0);
        setIntField(term423810, term423810.getClass(), "prodResource", 0);
        setIntField(term423810, term423810.getClass(), "extraFood", 0);
        setIntField(term423810, term423810.getClass(), "culture", 0);
        setIntField(term423810, term423810.getClass(), "planetOwner", 0);
        setField(term423810, term423810.getClass(), "planetOwnerInfo", null);
        setField(term423810, term423810.getClass(), "homeWorldId", null);
        setIntField(term423810, term423810.getClass(), "startRealmIndex", 0);
        setIntField(term423810, term423810.getClass(), "tax", 0);
        setField(term423810, term423810.getClass(), "statuses", null);
        setField(term423810, term423810.getClass(), "timedStatuses", null);
        setField(term423810, term423810.getClass(), "event", null);
        setBooleanField(term423810, term423810.getClass(), "eventFound", false);
        setField(term423810, term423810.getClass(), "happinessEffect", null);
        setField(term423810, term423810.getClass(), "happinessExplanation", null);
        setField(term423810, term423810.getClass(), "farmProdExplain", null);
        setField(term423810, term423810.getClass(), "metaProdExplain", null);
        setField(term423810, term423810.getClass(), "prodProdExplain", null);
        setField(term423810, term423810.getClass(), "reseProdExplain", null);
        setField(term423810, term423810.getClass(), "cultProdExplain", null);
        setField(term423810, term423810.getClass(), "credProdExplain", null);
        setField(term423810, term423810.getClass(), "governor", null);
        setIntField(term423810, term423810.getClass(), "governorGuide", 0);
        setField(term423810, term423810.getClass(), "orbital", null);
        setField(term423810, term423810.getClass(), "workers", null);
        setField(term423810, term423810.getClass(), "buildings", null);
        setField(term423810, term423810.getClass(), "underConstruction", null);
        term423824 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term423824;
        callMethod(klass, "setGasGiant", argTypes, term423810, args);
    }

};


