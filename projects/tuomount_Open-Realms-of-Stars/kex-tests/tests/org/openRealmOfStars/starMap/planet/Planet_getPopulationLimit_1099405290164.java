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
import java.lang.Boolean;

public class Planet_getPopulationLimit_1099405290164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term697585;
     Object term697599;

    public Planet_getPopulationLimit_1099405290164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term697585 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term697585, term697585.getClass(), "name", null);
        setIntField(term697585, term697585.getClass(), "orderNumber", 0);
        setField(term697585, term697585.getClass(), "radiationType", null);
        setField(term697585, term697585.getClass(), "gravityType", null);
        setField(term697585, term697585.getClass(), "temperatureType", null);
        setField(term697585, term697585.getClass(), "waterLevel", null);
        setBooleanField(term697585, term697585.getClass(), "gasGiant", false);
        setField(term697585, term697585.getClass(), "coordinate", null);
        setField(term697585, term697585.getClass(), "planetType", null);
        setIntField(term697585, term697585.getClass(), "groundSize", 0);
        setIntField(term697585, term697585.getClass(), "amountMetalInGround", 0);
        setIntField(term697585, term697585.getClass(), "metal", 0);
        setIntField(term697585, term697585.getClass(), "prodResource", 0);
        setIntField(term697585, term697585.getClass(), "extraFood", 0);
        setIntField(term697585, term697585.getClass(), "culture", 0);
        setIntField(term697585, term697585.getClass(), "planetOwner", 0);
        setField(term697585, term697585.getClass(), "planetOwnerInfo", null);
        setField(term697585, term697585.getClass(), "homeWorldId", null);
        setIntField(term697585, term697585.getClass(), "startRealmIndex", 0);
        setIntField(term697585, term697585.getClass(), "tax", 0);
        setField(term697585, term697585.getClass(), "statuses", null);
        setField(term697585, term697585.getClass(), "timedStatuses", null);
        setField(term697585, term697585.getClass(), "event", null);
        setBooleanField(term697585, term697585.getClass(), "eventFound", false);
        setField(term697585, term697585.getClass(), "happinessEffect", null);
        setField(term697585, term697585.getClass(), "happinessExplanation", null);
        setField(term697585, term697585.getClass(), "farmProdExplain", null);
        setField(term697585, term697585.getClass(), "metaProdExplain", null);
        setField(term697585, term697585.getClass(), "prodProdExplain", null);
        setField(term697585, term697585.getClass(), "reseProdExplain", null);
        setField(term697585, term697585.getClass(), "cultProdExplain", null);
        setField(term697585, term697585.getClass(), "credProdExplain", null);
        setField(term697585, term697585.getClass(), "governor", null);
        setIntField(term697585, term697585.getClass(), "governorGuide", 0);
        setField(term697585, term697585.getClass(), "orbital", null);
        setField(term697585, term697585.getClass(), "workers", null);
        setField(term697585, term697585.getClass(), "buildings", null);
        setField(term697585, term697585.getClass(), "underConstruction", null);
        term697599 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term697599;
        callMethod(klass, "getPopulationLimit", argTypes, term697585, args);
    }

};


