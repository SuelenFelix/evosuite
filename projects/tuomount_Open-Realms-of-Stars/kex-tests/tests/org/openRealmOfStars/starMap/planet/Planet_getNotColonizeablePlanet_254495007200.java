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

public class Planet_getNotColonizeablePlanet_254495007200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term854882;

    public Planet_getNotColonizeablePlanet_254495007200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term854882 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term854882, term854882.getClass(), "name", null);
        setIntField(term854882, term854882.getClass(), "orderNumber", 0);
        setField(term854882, term854882.getClass(), "radiationType", null);
        setField(term854882, term854882.getClass(), "gravityType", null);
        setField(term854882, term854882.getClass(), "temperatureType", null);
        setField(term854882, term854882.getClass(), "waterLevel", null);
        setBooleanField(term854882, term854882.getClass(), "gasGiant", false);
        setField(term854882, term854882.getClass(), "coordinate", null);
        setField(term854882, term854882.getClass(), "planetType", null);
        setIntField(term854882, term854882.getClass(), "groundSize", 0);
        setIntField(term854882, term854882.getClass(), "amountMetalInGround", 0);
        setIntField(term854882, term854882.getClass(), "metal", 0);
        setIntField(term854882, term854882.getClass(), "prodResource", 0);
        setIntField(term854882, term854882.getClass(), "extraFood", 0);
        setIntField(term854882, term854882.getClass(), "culture", 0);
        setIntField(term854882, term854882.getClass(), "planetOwner", 0);
        setField(term854882, term854882.getClass(), "planetOwnerInfo", null);
        setField(term854882, term854882.getClass(), "homeWorldId", null);
        setIntField(term854882, term854882.getClass(), "startRealmIndex", 0);
        setIntField(term854882, term854882.getClass(), "tax", 0);
        setField(term854882, term854882.getClass(), "statuses", null);
        setField(term854882, term854882.getClass(), "timedStatuses", null);
        setField(term854882, term854882.getClass(), "event", null);
        setBooleanField(term854882, term854882.getClass(), "eventFound", false);
        setField(term854882, term854882.getClass(), "happinessEffect", null);
        setField(term854882, term854882.getClass(), "happinessExplanation", null);
        setField(term854882, term854882.getClass(), "farmProdExplain", null);
        setField(term854882, term854882.getClass(), "metaProdExplain", null);
        setField(term854882, term854882.getClass(), "prodProdExplain", null);
        setField(term854882, term854882.getClass(), "reseProdExplain", null);
        setField(term854882, term854882.getClass(), "cultProdExplain", null);
        setField(term854882, term854882.getClass(), "credProdExplain", null);
        setField(term854882, term854882.getClass(), "governor", null);
        setIntField(term854882, term854882.getClass(), "governorGuide", 0);
        setField(term854882, term854882.getClass(), "orbital", null);
        setField(term854882, term854882.getClass(), "workers", null);
        setField(term854882, term854882.getClass(), "buildings", null);
        setField(term854882, term854882.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getNotColonizeablePlanet", argTypes, term854882, args);
    }

};


