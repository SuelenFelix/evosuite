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

public class Planet_inccreaseTemperatureType_197901961174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term313112;

    public Planet_inccreaseTemperatureType_197901961174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term313112 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term313112, term313112.getClass(), "name", null);
        setIntField(term313112, term313112.getClass(), "orderNumber", 0);
        setField(term313112, term313112.getClass(), "radiationType", null);
        setField(term313112, term313112.getClass(), "gravityType", null);
        setField(term313112, term313112.getClass(), "temperatureType", null);
        setField(term313112, term313112.getClass(), "waterLevel", null);
        setBooleanField(term313112, term313112.getClass(), "gasGiant", false);
        setField(term313112, term313112.getClass(), "coordinate", null);
        setField(term313112, term313112.getClass(), "planetType", null);
        setIntField(term313112, term313112.getClass(), "groundSize", 0);
        setIntField(term313112, term313112.getClass(), "amountMetalInGround", 0);
        setIntField(term313112, term313112.getClass(), "metal", 0);
        setIntField(term313112, term313112.getClass(), "prodResource", 0);
        setIntField(term313112, term313112.getClass(), "extraFood", 0);
        setIntField(term313112, term313112.getClass(), "culture", 0);
        setIntField(term313112, term313112.getClass(), "planetOwner", 0);
        setField(term313112, term313112.getClass(), "planetOwnerInfo", null);
        setField(term313112, term313112.getClass(), "homeWorldId", null);
        setIntField(term313112, term313112.getClass(), "startRealmIndex", 0);
        setIntField(term313112, term313112.getClass(), "tax", 0);
        setField(term313112, term313112.getClass(), "statuses", null);
        setField(term313112, term313112.getClass(), "timedStatuses", null);
        setField(term313112, term313112.getClass(), "event", null);
        setBooleanField(term313112, term313112.getClass(), "eventFound", false);
        setField(term313112, term313112.getClass(), "happinessEffect", null);
        setField(term313112, term313112.getClass(), "happinessExplanation", null);
        setField(term313112, term313112.getClass(), "farmProdExplain", null);
        setField(term313112, term313112.getClass(), "metaProdExplain", null);
        setField(term313112, term313112.getClass(), "prodProdExplain", null);
        setField(term313112, term313112.getClass(), "reseProdExplain", null);
        setField(term313112, term313112.getClass(), "cultProdExplain", null);
        setField(term313112, term313112.getClass(), "credProdExplain", null);
        setField(term313112, term313112.getClass(), "governor", null);
        setIntField(term313112, term313112.getClass(), "governorGuide", 0);
        setField(term313112, term313112.getClass(), "orbital", null);
        setField(term313112, term313112.getClass(), "workers", null);
        setField(term313112, term313112.getClass(), "buildings", null);
        setField(term313112, term313112.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "inccreaseTemperatureType", argTypes, term313112, args);
    }

};


