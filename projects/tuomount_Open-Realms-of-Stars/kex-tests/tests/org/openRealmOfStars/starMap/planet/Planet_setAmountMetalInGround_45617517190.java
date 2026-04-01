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

public class Planet_setAmountMetalInGround_45617517190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term380653;
     Object term380667;

    public Planet_setAmountMetalInGround_45617517190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term380653 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term380653, term380653.getClass(), "name", null);
        setIntField(term380653, term380653.getClass(), "orderNumber", 0);
        setField(term380653, term380653.getClass(), "radiationType", null);
        setField(term380653, term380653.getClass(), "gravityType", null);
        setField(term380653, term380653.getClass(), "temperatureType", null);
        setField(term380653, term380653.getClass(), "waterLevel", null);
        setBooleanField(term380653, term380653.getClass(), "gasGiant", false);
        setField(term380653, term380653.getClass(), "coordinate", null);
        setField(term380653, term380653.getClass(), "planetType", null);
        setIntField(term380653, term380653.getClass(), "groundSize", 0);
        setIntField(term380653, term380653.getClass(), "amountMetalInGround", 0);
        setIntField(term380653, term380653.getClass(), "metal", 0);
        setIntField(term380653, term380653.getClass(), "prodResource", 0);
        setIntField(term380653, term380653.getClass(), "extraFood", 0);
        setIntField(term380653, term380653.getClass(), "culture", 0);
        setIntField(term380653, term380653.getClass(), "planetOwner", 0);
        setField(term380653, term380653.getClass(), "planetOwnerInfo", null);
        setField(term380653, term380653.getClass(), "homeWorldId", null);
        setIntField(term380653, term380653.getClass(), "startRealmIndex", 0);
        setIntField(term380653, term380653.getClass(), "tax", 0);
        setField(term380653, term380653.getClass(), "statuses", null);
        setField(term380653, term380653.getClass(), "timedStatuses", null);
        setField(term380653, term380653.getClass(), "event", null);
        setBooleanField(term380653, term380653.getClass(), "eventFound", false);
        setField(term380653, term380653.getClass(), "happinessEffect", null);
        setField(term380653, term380653.getClass(), "happinessExplanation", null);
        setField(term380653, term380653.getClass(), "farmProdExplain", null);
        setField(term380653, term380653.getClass(), "metaProdExplain", null);
        setField(term380653, term380653.getClass(), "prodProdExplain", null);
        setField(term380653, term380653.getClass(), "reseProdExplain", null);
        setField(term380653, term380653.getClass(), "cultProdExplain", null);
        setField(term380653, term380653.getClass(), "credProdExplain", null);
        setField(term380653, term380653.getClass(), "governor", null);
        setIntField(term380653, term380653.getClass(), "governorGuide", 0);
        setField(term380653, term380653.getClass(), "orbital", null);
        setField(term380653, term380653.getClass(), "workers", null);
        setField(term380653, term380653.getClass(), "buildings", null);
        setField(term380653, term380653.getClass(), "underConstruction", null);
        term380667 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term380667;
        callMethod(klass, "setAmountMetalInGround", argTypes, term380653, args);
    }

};


