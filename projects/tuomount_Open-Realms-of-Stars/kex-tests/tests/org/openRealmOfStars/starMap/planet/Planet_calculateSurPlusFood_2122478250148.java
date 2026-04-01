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

public class Planet_calculateSurPlusFood_2122478250148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2630012;

    public Planet_calculateSurPlusFood_2122478250148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2630012 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term2630012, term2630012.getClass(), "name", null);
        setIntField(term2630012, term2630012.getClass(), "orderNumber", 0);
        setField(term2630012, term2630012.getClass(), "radiationType", null);
        setField(term2630012, term2630012.getClass(), "gravityType", null);
        setField(term2630012, term2630012.getClass(), "temperatureType", null);
        setField(term2630012, term2630012.getClass(), "waterLevel", null);
        setBooleanField(term2630012, term2630012.getClass(), "gasGiant", false);
        setField(term2630012, term2630012.getClass(), "coordinate", null);
        setField(term2630012, term2630012.getClass(), "planetType", null);
        setIntField(term2630012, term2630012.getClass(), "groundSize", 0);
        setIntField(term2630012, term2630012.getClass(), "amountMetalInGround", 0);
        setIntField(term2630012, term2630012.getClass(), "metal", 0);
        setIntField(term2630012, term2630012.getClass(), "prodResource", 0);
        setIntField(term2630012, term2630012.getClass(), "extraFood", 0);
        setIntField(term2630012, term2630012.getClass(), "culture", 0);
        setIntField(term2630012, term2630012.getClass(), "planetOwner", 0);
        setField(term2630012, term2630012.getClass(), "planetOwnerInfo", null);
        setField(term2630012, term2630012.getClass(), "homeWorldId", null);
        setIntField(term2630012, term2630012.getClass(), "startRealmIndex", 0);
        setIntField(term2630012, term2630012.getClass(), "tax", 0);
        setField(term2630012, term2630012.getClass(), "statuses", null);
        setField(term2630012, term2630012.getClass(), "timedStatuses", null);
        setField(term2630012, term2630012.getClass(), "event", null);
        setBooleanField(term2630012, term2630012.getClass(), "eventFound", false);
        setField(term2630012, term2630012.getClass(), "happinessEffect", null);
        setField(term2630012, term2630012.getClass(), "happinessExplanation", null);
        setField(term2630012, term2630012.getClass(), "farmProdExplain", null);
        setField(term2630012, term2630012.getClass(), "metaProdExplain", null);
        setField(term2630012, term2630012.getClass(), "prodProdExplain", null);
        setField(term2630012, term2630012.getClass(), "reseProdExplain", null);
        setField(term2630012, term2630012.getClass(), "cultProdExplain", null);
        setField(term2630012, term2630012.getClass(), "credProdExplain", null);
        setField(term2630012, term2630012.getClass(), "governor", null);
        setIntField(term2630012, term2630012.getClass(), "governorGuide", 0);
        setField(term2630012, term2630012.getClass(), "orbital", null);
        setField(term2630012, term2630012.getClass(), "workers", null);
        setField(term2630012, term2630012.getClass(), "buildings", null);
        setField(term2630012, term2630012.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "calculateSurPlusFood", argTypes, term2630012, args);
    }

};


