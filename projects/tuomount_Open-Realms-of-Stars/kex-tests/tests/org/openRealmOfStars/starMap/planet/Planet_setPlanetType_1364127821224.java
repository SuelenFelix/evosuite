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

public class Planet_setPlanetType_1364127821224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term952910;

    public Planet_setPlanetType_1364127821224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term952910 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term952910, term952910.getClass(), "name", null);
        setIntField(term952910, term952910.getClass(), "orderNumber", 0);
        setField(term952910, term952910.getClass(), "radiationType", null);
        setField(term952910, term952910.getClass(), "gravityType", null);
        setField(term952910, term952910.getClass(), "temperatureType", null);
        setField(term952910, term952910.getClass(), "waterLevel", null);
        setBooleanField(term952910, term952910.getClass(), "gasGiant", false);
        setField(term952910, term952910.getClass(), "coordinate", null);
        setField(term952910, term952910.getClass(), "planetType", null);
        setIntField(term952910, term952910.getClass(), "groundSize", 0);
        setIntField(term952910, term952910.getClass(), "amountMetalInGround", 0);
        setIntField(term952910, term952910.getClass(), "metal", 0);
        setIntField(term952910, term952910.getClass(), "prodResource", 0);
        setIntField(term952910, term952910.getClass(), "extraFood", 0);
        setIntField(term952910, term952910.getClass(), "culture", 0);
        setIntField(term952910, term952910.getClass(), "planetOwner", 0);
        setField(term952910, term952910.getClass(), "planetOwnerInfo", null);
        setField(term952910, term952910.getClass(), "homeWorldId", null);
        setIntField(term952910, term952910.getClass(), "startRealmIndex", 0);
        setIntField(term952910, term952910.getClass(), "tax", 0);
        setField(term952910, term952910.getClass(), "statuses", null);
        setField(term952910, term952910.getClass(), "timedStatuses", null);
        setField(term952910, term952910.getClass(), "event", null);
        setBooleanField(term952910, term952910.getClass(), "eventFound", false);
        setField(term952910, term952910.getClass(), "happinessEffect", null);
        setField(term952910, term952910.getClass(), "happinessExplanation", null);
        setField(term952910, term952910.getClass(), "farmProdExplain", null);
        setField(term952910, term952910.getClass(), "metaProdExplain", null);
        setField(term952910, term952910.getClass(), "prodProdExplain", null);
        setField(term952910, term952910.getClass(), "reseProdExplain", null);
        setField(term952910, term952910.getClass(), "cultProdExplain", null);
        setField(term952910, term952910.getClass(), "credProdExplain", null);
        setField(term952910, term952910.getClass(), "governor", null);
        setIntField(term952910, term952910.getClass(), "governorGuide", 0);
        setField(term952910, term952910.getClass(), "orbital", null);
        setField(term952910, term952910.getClass(), "workers", null);
        setField(term952910, term952910.getClass(), "buildings", null);
        setField(term952910, term952910.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.enums.PlanetTypes");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPlanetType", argTypes, term952910, args);
    }

};


