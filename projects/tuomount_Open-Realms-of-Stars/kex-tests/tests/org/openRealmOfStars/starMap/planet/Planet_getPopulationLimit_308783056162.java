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

public class Planet_getPopulationLimit_308783056162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term684644;

    public Planet_getPopulationLimit_308783056162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term684644 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term684644, term684644.getClass(), "name", null);
        setIntField(term684644, term684644.getClass(), "orderNumber", 0);
        setField(term684644, term684644.getClass(), "radiationType", null);
        setField(term684644, term684644.getClass(), "gravityType", null);
        setField(term684644, term684644.getClass(), "temperatureType", null);
        setField(term684644, term684644.getClass(), "waterLevel", null);
        setBooleanField(term684644, term684644.getClass(), "gasGiant", false);
        setField(term684644, term684644.getClass(), "coordinate", null);
        setField(term684644, term684644.getClass(), "planetType", null);
        setIntField(term684644, term684644.getClass(), "groundSize", 0);
        setIntField(term684644, term684644.getClass(), "amountMetalInGround", 0);
        setIntField(term684644, term684644.getClass(), "metal", 0);
        setIntField(term684644, term684644.getClass(), "prodResource", 0);
        setIntField(term684644, term684644.getClass(), "extraFood", 0);
        setIntField(term684644, term684644.getClass(), "culture", 0);
        setIntField(term684644, term684644.getClass(), "planetOwner", 0);
        setField(term684644, term684644.getClass(), "planetOwnerInfo", null);
        setField(term684644, term684644.getClass(), "homeWorldId", null);
        setIntField(term684644, term684644.getClass(), "startRealmIndex", 0);
        setIntField(term684644, term684644.getClass(), "tax", 0);
        setField(term684644, term684644.getClass(), "statuses", null);
        setField(term684644, term684644.getClass(), "timedStatuses", null);
        setField(term684644, term684644.getClass(), "event", null);
        setBooleanField(term684644, term684644.getClass(), "eventFound", false);
        setField(term684644, term684644.getClass(), "happinessEffect", null);
        setField(term684644, term684644.getClass(), "happinessExplanation", null);
        setField(term684644, term684644.getClass(), "farmProdExplain", null);
        setField(term684644, term684644.getClass(), "metaProdExplain", null);
        setField(term684644, term684644.getClass(), "prodProdExplain", null);
        setField(term684644, term684644.getClass(), "reseProdExplain", null);
        setField(term684644, term684644.getClass(), "cultProdExplain", null);
        setField(term684644, term684644.getClass(), "credProdExplain", null);
        setField(term684644, term684644.getClass(), "governor", null);
        setIntField(term684644, term684644.getClass(), "governorGuide", 0);
        setField(term684644, term684644.getClass(), "orbital", null);
        setField(term684644, term684644.getClass(), "workers", null);
        setField(term684644, term684644.getClass(), "buildings", null);
        setField(term684644, term684644.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getPopulationLimit", argTypes, term684644, args);
    }

};


