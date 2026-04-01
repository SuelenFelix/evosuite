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

public class Planet_getMetal_7663343592 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term388744;

    public Planet_getMetal_7663343592() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term388744 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term388744, term388744.getClass(), "name", null);
        setIntField(term388744, term388744.getClass(), "orderNumber", 0);
        setField(term388744, term388744.getClass(), "radiationType", null);
        setField(term388744, term388744.getClass(), "gravityType", null);
        setField(term388744, term388744.getClass(), "temperatureType", null);
        setField(term388744, term388744.getClass(), "waterLevel", null);
        setBooleanField(term388744, term388744.getClass(), "gasGiant", false);
        setField(term388744, term388744.getClass(), "coordinate", null);
        setField(term388744, term388744.getClass(), "planetType", null);
        setIntField(term388744, term388744.getClass(), "groundSize", 0);
        setIntField(term388744, term388744.getClass(), "amountMetalInGround", 0);
        setIntField(term388744, term388744.getClass(), "metal", 0);
        setIntField(term388744, term388744.getClass(), "prodResource", 0);
        setIntField(term388744, term388744.getClass(), "extraFood", 0);
        setIntField(term388744, term388744.getClass(), "culture", 0);
        setIntField(term388744, term388744.getClass(), "planetOwner", 0);
        setField(term388744, term388744.getClass(), "planetOwnerInfo", null);
        setField(term388744, term388744.getClass(), "homeWorldId", null);
        setIntField(term388744, term388744.getClass(), "startRealmIndex", 0);
        setIntField(term388744, term388744.getClass(), "tax", 0);
        setField(term388744, term388744.getClass(), "statuses", null);
        setField(term388744, term388744.getClass(), "timedStatuses", null);
        setField(term388744, term388744.getClass(), "event", null);
        setBooleanField(term388744, term388744.getClass(), "eventFound", false);
        setField(term388744, term388744.getClass(), "happinessEffect", null);
        setField(term388744, term388744.getClass(), "happinessExplanation", null);
        setField(term388744, term388744.getClass(), "farmProdExplain", null);
        setField(term388744, term388744.getClass(), "metaProdExplain", null);
        setField(term388744, term388744.getClass(), "prodProdExplain", null);
        setField(term388744, term388744.getClass(), "reseProdExplain", null);
        setField(term388744, term388744.getClass(), "cultProdExplain", null);
        setField(term388744, term388744.getClass(), "credProdExplain", null);
        setField(term388744, term388744.getClass(), "governor", null);
        setIntField(term388744, term388744.getClass(), "governorGuide", 0);
        setField(term388744, term388744.getClass(), "orbital", null);
        setField(term388744, term388744.getClass(), "workers", null);
        setField(term388744, term388744.getClass(), "buildings", null);
        setField(term388744, term388744.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMetal", argTypes, term388744, args);
    }

};


