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

public class Planet_getPopulationLimit_308783056169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2718329;

    public Planet_getPopulationLimit_308783056169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2718329 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term2718329, term2718329.getClass(), "name", null);
        setIntField(term2718329, term2718329.getClass(), "orderNumber", 0);
        setField(term2718329, term2718329.getClass(), "radiationType", null);
        setField(term2718329, term2718329.getClass(), "gravityType", null);
        setField(term2718329, term2718329.getClass(), "temperatureType", null);
        setField(term2718329, term2718329.getClass(), "waterLevel", null);
        setBooleanField(term2718329, term2718329.getClass(), "gasGiant", false);
        setField(term2718329, term2718329.getClass(), "coordinate", null);
        setField(term2718329, term2718329.getClass(), "planetType", null);
        setIntField(term2718329, term2718329.getClass(), "groundSize", 0);
        setIntField(term2718329, term2718329.getClass(), "amountMetalInGround", 0);
        setIntField(term2718329, term2718329.getClass(), "metal", 0);
        setIntField(term2718329, term2718329.getClass(), "prodResource", 0);
        setIntField(term2718329, term2718329.getClass(), "extraFood", 0);
        setIntField(term2718329, term2718329.getClass(), "culture", 0);
        setIntField(term2718329, term2718329.getClass(), "planetOwner", 0);
        setField(term2718329, term2718329.getClass(), "planetOwnerInfo", null);
        setField(term2718329, term2718329.getClass(), "homeWorldId", null);
        setIntField(term2718329, term2718329.getClass(), "startRealmIndex", 0);
        setIntField(term2718329, term2718329.getClass(), "tax", 0);
        setField(term2718329, term2718329.getClass(), "statuses", null);
        setField(term2718329, term2718329.getClass(), "timedStatuses", null);
        setField(term2718329, term2718329.getClass(), "event", null);
        setBooleanField(term2718329, term2718329.getClass(), "eventFound", false);
        setField(term2718329, term2718329.getClass(), "happinessEffect", null);
        setField(term2718329, term2718329.getClass(), "happinessExplanation", null);
        setField(term2718329, term2718329.getClass(), "farmProdExplain", null);
        setField(term2718329, term2718329.getClass(), "metaProdExplain", null);
        setField(term2718329, term2718329.getClass(), "prodProdExplain", null);
        setField(term2718329, term2718329.getClass(), "reseProdExplain", null);
        setField(term2718329, term2718329.getClass(), "cultProdExplain", null);
        setField(term2718329, term2718329.getClass(), "credProdExplain", null);
        setField(term2718329, term2718329.getClass(), "governor", null);
        setIntField(term2718329, term2718329.getClass(), "governorGuide", 0);
        setField(term2718329, term2718329.getClass(), "orbital", null);
        setField(term2718329, term2718329.getClass(), "workers", null);
        setField(term2718329, term2718329.getClass(), "buildings", null);
        setField(term2718329, term2718329.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getPopulationLimit", argTypes, term2718329, args);
    }

};


