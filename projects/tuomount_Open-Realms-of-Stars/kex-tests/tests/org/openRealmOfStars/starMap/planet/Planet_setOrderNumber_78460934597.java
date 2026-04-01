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

public class Planet_setOrderNumber_78460934597 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term410399;
     Object term410413;

    public Planet_setOrderNumber_78460934597() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term410399 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term410399, term410399.getClass(), "name", null);
        setIntField(term410399, term410399.getClass(), "orderNumber", 0);
        setField(term410399, term410399.getClass(), "radiationType", null);
        setField(term410399, term410399.getClass(), "gravityType", null);
        setField(term410399, term410399.getClass(), "temperatureType", null);
        setField(term410399, term410399.getClass(), "waterLevel", null);
        setBooleanField(term410399, term410399.getClass(), "gasGiant", false);
        setField(term410399, term410399.getClass(), "coordinate", null);
        setField(term410399, term410399.getClass(), "planetType", null);
        setIntField(term410399, term410399.getClass(), "groundSize", 0);
        setIntField(term410399, term410399.getClass(), "amountMetalInGround", 0);
        setIntField(term410399, term410399.getClass(), "metal", 0);
        setIntField(term410399, term410399.getClass(), "prodResource", 0);
        setIntField(term410399, term410399.getClass(), "extraFood", 0);
        setIntField(term410399, term410399.getClass(), "culture", 0);
        setIntField(term410399, term410399.getClass(), "planetOwner", 0);
        setField(term410399, term410399.getClass(), "planetOwnerInfo", null);
        setField(term410399, term410399.getClass(), "homeWorldId", null);
        setIntField(term410399, term410399.getClass(), "startRealmIndex", 0);
        setIntField(term410399, term410399.getClass(), "tax", 0);
        setField(term410399, term410399.getClass(), "statuses", null);
        setField(term410399, term410399.getClass(), "timedStatuses", null);
        setField(term410399, term410399.getClass(), "event", null);
        setBooleanField(term410399, term410399.getClass(), "eventFound", false);
        setField(term410399, term410399.getClass(), "happinessEffect", null);
        setField(term410399, term410399.getClass(), "happinessExplanation", null);
        setField(term410399, term410399.getClass(), "farmProdExplain", null);
        setField(term410399, term410399.getClass(), "metaProdExplain", null);
        setField(term410399, term410399.getClass(), "prodProdExplain", null);
        setField(term410399, term410399.getClass(), "reseProdExplain", null);
        setField(term410399, term410399.getClass(), "cultProdExplain", null);
        setField(term410399, term410399.getClass(), "credProdExplain", null);
        setField(term410399, term410399.getClass(), "governor", null);
        setIntField(term410399, term410399.getClass(), "governorGuide", 0);
        setField(term410399, term410399.getClass(), "orbital", null);
        setField(term410399, term410399.getClass(), "workers", null);
        setField(term410399, term410399.getClass(), "buildings", null);
        setField(term410399, term410399.getClass(), "underConstruction", null);
        term410413 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term410413;
        callMethod(klass, "setOrderNumber", argTypes, term410399, args);
    }

};


