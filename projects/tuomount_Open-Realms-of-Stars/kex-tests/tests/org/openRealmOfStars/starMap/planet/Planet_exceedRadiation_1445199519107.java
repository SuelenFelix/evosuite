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

public class Planet_exceedRadiation_1445199519107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term459147;

    public Planet_exceedRadiation_1445199519107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term459147 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term459147, term459147.getClass(), "name", null);
        setIntField(term459147, term459147.getClass(), "orderNumber", 0);
        setField(term459147, term459147.getClass(), "radiationType", null);
        setField(term459147, term459147.getClass(), "gravityType", null);
        setField(term459147, term459147.getClass(), "temperatureType", null);
        setField(term459147, term459147.getClass(), "waterLevel", null);
        setBooleanField(term459147, term459147.getClass(), "gasGiant", false);
        setField(term459147, term459147.getClass(), "coordinate", null);
        setField(term459147, term459147.getClass(), "planetType", null);
        setIntField(term459147, term459147.getClass(), "groundSize", 0);
        setIntField(term459147, term459147.getClass(), "amountMetalInGround", 0);
        setIntField(term459147, term459147.getClass(), "metal", 0);
        setIntField(term459147, term459147.getClass(), "prodResource", 0);
        setIntField(term459147, term459147.getClass(), "extraFood", 0);
        setIntField(term459147, term459147.getClass(), "culture", 0);
        setIntField(term459147, term459147.getClass(), "planetOwner", 0);
        setField(term459147, term459147.getClass(), "planetOwnerInfo", null);
        setField(term459147, term459147.getClass(), "homeWorldId", null);
        setIntField(term459147, term459147.getClass(), "startRealmIndex", 0);
        setIntField(term459147, term459147.getClass(), "tax", 0);
        setField(term459147, term459147.getClass(), "statuses", null);
        setField(term459147, term459147.getClass(), "timedStatuses", null);
        setField(term459147, term459147.getClass(), "event", null);
        setBooleanField(term459147, term459147.getClass(), "eventFound", false);
        setField(term459147, term459147.getClass(), "happinessEffect", null);
        setField(term459147, term459147.getClass(), "happinessExplanation", null);
        setField(term459147, term459147.getClass(), "farmProdExplain", null);
        setField(term459147, term459147.getClass(), "metaProdExplain", null);
        setField(term459147, term459147.getClass(), "prodProdExplain", null);
        setField(term459147, term459147.getClass(), "reseProdExplain", null);
        setField(term459147, term459147.getClass(), "cultProdExplain", null);
        setField(term459147, term459147.getClass(), "credProdExplain", null);
        setField(term459147, term459147.getClass(), "governor", null);
        setIntField(term459147, term459147.getClass(), "governorGuide", 0);
        setField(term459147, term459147.getClass(), "orbital", null);
        setField(term459147, term459147.getClass(), "workers", null);
        setField(term459147, term459147.getClass(), "buildings", null);
        setField(term459147, term459147.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "exceedRadiation", argTypes, term459147, args);
    }

};


