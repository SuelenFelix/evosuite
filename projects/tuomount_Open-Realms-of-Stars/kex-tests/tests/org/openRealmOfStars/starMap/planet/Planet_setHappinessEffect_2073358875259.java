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

public class Planet_setHappinessEffect_2073358875259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1099558;

    public Planet_setHappinessEffect_2073358875259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1099558 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term1099558, term1099558.getClass(), "name", null);
        setIntField(term1099558, term1099558.getClass(), "orderNumber", 0);
        setField(term1099558, term1099558.getClass(), "radiationType", null);
        setField(term1099558, term1099558.getClass(), "gravityType", null);
        setField(term1099558, term1099558.getClass(), "temperatureType", null);
        setField(term1099558, term1099558.getClass(), "waterLevel", null);
        setBooleanField(term1099558, term1099558.getClass(), "gasGiant", false);
        setField(term1099558, term1099558.getClass(), "coordinate", null);
        setField(term1099558, term1099558.getClass(), "planetType", null);
        setIntField(term1099558, term1099558.getClass(), "groundSize", 0);
        setIntField(term1099558, term1099558.getClass(), "amountMetalInGround", 0);
        setIntField(term1099558, term1099558.getClass(), "metal", 0);
        setIntField(term1099558, term1099558.getClass(), "prodResource", 0);
        setIntField(term1099558, term1099558.getClass(), "extraFood", 0);
        setIntField(term1099558, term1099558.getClass(), "culture", 0);
        setIntField(term1099558, term1099558.getClass(), "planetOwner", 0);
        setField(term1099558, term1099558.getClass(), "planetOwnerInfo", null);
        setField(term1099558, term1099558.getClass(), "homeWorldId", null);
        setIntField(term1099558, term1099558.getClass(), "startRealmIndex", 0);
        setIntField(term1099558, term1099558.getClass(), "tax", 0);
        setField(term1099558, term1099558.getClass(), "statuses", null);
        setField(term1099558, term1099558.getClass(), "timedStatuses", null);
        setField(term1099558, term1099558.getClass(), "event", null);
        setBooleanField(term1099558, term1099558.getClass(), "eventFound", false);
        setField(term1099558, term1099558.getClass(), "happinessEffect", null);
        setField(term1099558, term1099558.getClass(), "happinessExplanation", null);
        setField(term1099558, term1099558.getClass(), "farmProdExplain", null);
        setField(term1099558, term1099558.getClass(), "metaProdExplain", null);
        setField(term1099558, term1099558.getClass(), "prodProdExplain", null);
        setField(term1099558, term1099558.getClass(), "reseProdExplain", null);
        setField(term1099558, term1099558.getClass(), "cultProdExplain", null);
        setField(term1099558, term1099558.getClass(), "credProdExplain", null);
        setField(term1099558, term1099558.getClass(), "governor", null);
        setIntField(term1099558, term1099558.getClass(), "governorGuide", 0);
        setField(term1099558, term1099558.getClass(), "orbital", null);
        setField(term1099558, term1099558.getClass(), "workers", null);
        setField(term1099558, term1099558.getClass(), "buildings", null);
        setField(term1099558, term1099558.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.HappinessEffect");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setHappinessEffect", argTypes, term1099558, args);
    }

};


