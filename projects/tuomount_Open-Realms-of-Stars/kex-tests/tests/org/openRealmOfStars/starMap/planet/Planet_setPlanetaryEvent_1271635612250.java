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

public class Planet_setPlanetaryEvent_1271635612250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3069590;

    public Planet_setPlanetaryEvent_1271635612250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3069590 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term3069590, term3069590.getClass(), "name", null);
        setIntField(term3069590, term3069590.getClass(), "orderNumber", 0);
        setField(term3069590, term3069590.getClass(), "radiationType", null);
        setField(term3069590, term3069590.getClass(), "gravityType", null);
        setField(term3069590, term3069590.getClass(), "temperatureType", null);
        setField(term3069590, term3069590.getClass(), "waterLevel", null);
        setBooleanField(term3069590, term3069590.getClass(), "gasGiant", false);
        setField(term3069590, term3069590.getClass(), "coordinate", null);
        setField(term3069590, term3069590.getClass(), "planetType", null);
        setIntField(term3069590, term3069590.getClass(), "groundSize", 0);
        setIntField(term3069590, term3069590.getClass(), "amountMetalInGround", 0);
        setIntField(term3069590, term3069590.getClass(), "metal", 0);
        setIntField(term3069590, term3069590.getClass(), "prodResource", 0);
        setIntField(term3069590, term3069590.getClass(), "extraFood", 0);
        setIntField(term3069590, term3069590.getClass(), "culture", 0);
        setIntField(term3069590, term3069590.getClass(), "planetOwner", 0);
        setField(term3069590, term3069590.getClass(), "planetOwnerInfo", null);
        setField(term3069590, term3069590.getClass(), "homeWorldId", null);
        setIntField(term3069590, term3069590.getClass(), "startRealmIndex", 0);
        setIntField(term3069590, term3069590.getClass(), "tax", 0);
        setField(term3069590, term3069590.getClass(), "statuses", null);
        setField(term3069590, term3069590.getClass(), "timedStatuses", null);
        setField(term3069590, term3069590.getClass(), "event", null);
        setBooleanField(term3069590, term3069590.getClass(), "eventFound", false);
        setField(term3069590, term3069590.getClass(), "happinessEffect", null);
        setField(term3069590, term3069590.getClass(), "happinessExplanation", null);
        setField(term3069590, term3069590.getClass(), "farmProdExplain", null);
        setField(term3069590, term3069590.getClass(), "metaProdExplain", null);
        setField(term3069590, term3069590.getClass(), "prodProdExplain", null);
        setField(term3069590, term3069590.getClass(), "reseProdExplain", null);
        setField(term3069590, term3069590.getClass(), "cultProdExplain", null);
        setField(term3069590, term3069590.getClass(), "credProdExplain", null);
        setField(term3069590, term3069590.getClass(), "governor", null);
        setIntField(term3069590, term3069590.getClass(), "governorGuide", 0);
        setField(term3069590, term3069590.getClass(), "orbital", null);
        setField(term3069590, term3069590.getClass(), "workers", null);
        setField(term3069590, term3069590.getClass(), "buildings", null);
        setField(term3069590, term3069590.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.enums.PlanetaryEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPlanetaryEvent", argTypes, term3069590, args);
    }

};


