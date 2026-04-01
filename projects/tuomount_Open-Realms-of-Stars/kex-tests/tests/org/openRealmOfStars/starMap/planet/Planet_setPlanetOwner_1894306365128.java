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
import java.lang.Integer;

public class Planet_setPlanetOwner_1894306365128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term548993;
     Object term549007;

    public Planet_setPlanetOwner_1894306365128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term548993 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term548993, term548993.getClass(), "name", null);
        setIntField(term548993, term548993.getClass(), "orderNumber", 0);
        setField(term548993, term548993.getClass(), "radiationType", null);
        setField(term548993, term548993.getClass(), "gravityType", null);
        setField(term548993, term548993.getClass(), "temperatureType", null);
        setField(term548993, term548993.getClass(), "waterLevel", null);
        setBooleanField(term548993, term548993.getClass(), "gasGiant", false);
        setField(term548993, term548993.getClass(), "coordinate", null);
        setField(term548993, term548993.getClass(), "planetType", null);
        setIntField(term548993, term548993.getClass(), "groundSize", 0);
        setIntField(term548993, term548993.getClass(), "amountMetalInGround", 0);
        setIntField(term548993, term548993.getClass(), "metal", 0);
        setIntField(term548993, term548993.getClass(), "prodResource", 0);
        setIntField(term548993, term548993.getClass(), "extraFood", 0);
        setIntField(term548993, term548993.getClass(), "culture", 0);
        setIntField(term548993, term548993.getClass(), "planetOwner", 0);
        setField(term548993, term548993.getClass(), "planetOwnerInfo", null);
        setField(term548993, term548993.getClass(), "homeWorldId", null);
        setIntField(term548993, term548993.getClass(), "startRealmIndex", 0);
        setIntField(term548993, term548993.getClass(), "tax", 0);
        setField(term548993, term548993.getClass(), "statuses", null);
        setField(term548993, term548993.getClass(), "timedStatuses", null);
        setField(term548993, term548993.getClass(), "event", null);
        setBooleanField(term548993, term548993.getClass(), "eventFound", false);
        setField(term548993, term548993.getClass(), "happinessEffect", null);
        setField(term548993, term548993.getClass(), "happinessExplanation", null);
        setField(term548993, term548993.getClass(), "farmProdExplain", null);
        setField(term548993, term548993.getClass(), "metaProdExplain", null);
        setField(term548993, term548993.getClass(), "prodProdExplain", null);
        setField(term548993, term548993.getClass(), "reseProdExplain", null);
        setField(term548993, term548993.getClass(), "cultProdExplain", null);
        setField(term548993, term548993.getClass(), "credProdExplain", null);
        setField(term548993, term548993.getClass(), "governor", null);
        setIntField(term548993, term548993.getClass(), "governorGuide", 0);
        setField(term548993, term548993.getClass(), "orbital", null);
        setField(term548993, term548993.getClass(), "workers", null);
        setField(term548993, term548993.getClass(), "buildings", null);
        setField(term548993, term548993.getClass(), "underConstruction", null);
        term549007 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[2];
        args[0] = term549007;
        args[1] = null;
        callMethod(klass, "setPlanetOwner", argTypes, term548993, args);
    }

};


