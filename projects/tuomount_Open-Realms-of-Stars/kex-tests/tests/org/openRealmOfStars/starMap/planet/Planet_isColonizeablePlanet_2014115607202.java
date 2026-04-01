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

public class Planet_isColonizeablePlanet_2014115607202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term868210;

    public Planet_isColonizeablePlanet_2014115607202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term868210 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term868210, term868210.getClass(), "name", null);
        setIntField(term868210, term868210.getClass(), "orderNumber", 0);
        setField(term868210, term868210.getClass(), "radiationType", null);
        setField(term868210, term868210.getClass(), "gravityType", null);
        setField(term868210, term868210.getClass(), "temperatureType", null);
        setField(term868210, term868210.getClass(), "waterLevel", null);
        setBooleanField(term868210, term868210.getClass(), "gasGiant", false);
        setField(term868210, term868210.getClass(), "coordinate", null);
        setField(term868210, term868210.getClass(), "planetType", null);
        setIntField(term868210, term868210.getClass(), "groundSize", 0);
        setIntField(term868210, term868210.getClass(), "amountMetalInGround", 0);
        setIntField(term868210, term868210.getClass(), "metal", 0);
        setIntField(term868210, term868210.getClass(), "prodResource", 0);
        setIntField(term868210, term868210.getClass(), "extraFood", 0);
        setIntField(term868210, term868210.getClass(), "culture", 0);
        setIntField(term868210, term868210.getClass(), "planetOwner", 0);
        setField(term868210, term868210.getClass(), "planetOwnerInfo", null);
        setField(term868210, term868210.getClass(), "homeWorldId", null);
        setIntField(term868210, term868210.getClass(), "startRealmIndex", 0);
        setIntField(term868210, term868210.getClass(), "tax", 0);
        setField(term868210, term868210.getClass(), "statuses", null);
        setField(term868210, term868210.getClass(), "timedStatuses", null);
        setField(term868210, term868210.getClass(), "event", null);
        setBooleanField(term868210, term868210.getClass(), "eventFound", false);
        setField(term868210, term868210.getClass(), "happinessEffect", null);
        setField(term868210, term868210.getClass(), "happinessExplanation", null);
        setField(term868210, term868210.getClass(), "farmProdExplain", null);
        setField(term868210, term868210.getClass(), "metaProdExplain", null);
        setField(term868210, term868210.getClass(), "prodProdExplain", null);
        setField(term868210, term868210.getClass(), "reseProdExplain", null);
        setField(term868210, term868210.getClass(), "cultProdExplain", null);
        setField(term868210, term868210.getClass(), "credProdExplain", null);
        setField(term868210, term868210.getClass(), "governor", null);
        setIntField(term868210, term868210.getClass(), "governorGuide", 0);
        setField(term868210, term868210.getClass(), "orbital", null);
        setField(term868210, term868210.getClass(), "workers", null);
        setField(term868210, term868210.getClass(), "buildings", null);
        setField(term868210, term868210.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "isColonizeablePlanet", argTypes, term868210, args);
    }

};


