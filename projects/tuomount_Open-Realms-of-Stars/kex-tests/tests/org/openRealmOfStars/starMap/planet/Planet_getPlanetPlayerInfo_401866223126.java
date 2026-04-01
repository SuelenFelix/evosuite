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

public class Planet_getPlanetPlayerInfo_401866223126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term536577;

    public Planet_getPlanetPlayerInfo_401866223126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term536577 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term536577, term536577.getClass(), "name", null);
        setIntField(term536577, term536577.getClass(), "orderNumber", 0);
        setField(term536577, term536577.getClass(), "radiationType", null);
        setField(term536577, term536577.getClass(), "gravityType", null);
        setField(term536577, term536577.getClass(), "temperatureType", null);
        setField(term536577, term536577.getClass(), "waterLevel", null);
        setBooleanField(term536577, term536577.getClass(), "gasGiant", false);
        setField(term536577, term536577.getClass(), "coordinate", null);
        setField(term536577, term536577.getClass(), "planetType", null);
        setIntField(term536577, term536577.getClass(), "groundSize", 0);
        setIntField(term536577, term536577.getClass(), "amountMetalInGround", 0);
        setIntField(term536577, term536577.getClass(), "metal", 0);
        setIntField(term536577, term536577.getClass(), "prodResource", 0);
        setIntField(term536577, term536577.getClass(), "extraFood", 0);
        setIntField(term536577, term536577.getClass(), "culture", 0);
        setIntField(term536577, term536577.getClass(), "planetOwner", 0);
        setField(term536577, term536577.getClass(), "planetOwnerInfo", null);
        setField(term536577, term536577.getClass(), "homeWorldId", null);
        setIntField(term536577, term536577.getClass(), "startRealmIndex", 0);
        setIntField(term536577, term536577.getClass(), "tax", 0);
        setField(term536577, term536577.getClass(), "statuses", null);
        setField(term536577, term536577.getClass(), "timedStatuses", null);
        setField(term536577, term536577.getClass(), "event", null);
        setBooleanField(term536577, term536577.getClass(), "eventFound", false);
        setField(term536577, term536577.getClass(), "happinessEffect", null);
        setField(term536577, term536577.getClass(), "happinessExplanation", null);
        setField(term536577, term536577.getClass(), "farmProdExplain", null);
        setField(term536577, term536577.getClass(), "metaProdExplain", null);
        setField(term536577, term536577.getClass(), "prodProdExplain", null);
        setField(term536577, term536577.getClass(), "reseProdExplain", null);
        setField(term536577, term536577.getClass(), "cultProdExplain", null);
        setField(term536577, term536577.getClass(), "credProdExplain", null);
        setField(term536577, term536577.getClass(), "governor", null);
        setIntField(term536577, term536577.getClass(), "governorGuide", 0);
        setField(term536577, term536577.getClass(), "orbital", null);
        setField(term536577, term536577.getClass(), "workers", null);
        setField(term536577, term536577.getClass(), "buildings", null);
        setField(term536577, term536577.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlanetPlayerInfo", argTypes, term536577, args);
    }

};


