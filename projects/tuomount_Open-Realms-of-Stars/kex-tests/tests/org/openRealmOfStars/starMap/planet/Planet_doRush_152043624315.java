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

public class Planet_doRush_152043624315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89879;
     Object term89893;

    public Planet_doRush_152043624315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89879 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term89879, term89879.getClass(), "name", null);
        setIntField(term89879, term89879.getClass(), "orderNumber", 0);
        setField(term89879, term89879.getClass(), "radiationType", null);
        setField(term89879, term89879.getClass(), "gravityType", null);
        setField(term89879, term89879.getClass(), "temperatureType", null);
        setField(term89879, term89879.getClass(), "waterLevel", null);
        setBooleanField(term89879, term89879.getClass(), "gasGiant", false);
        setField(term89879, term89879.getClass(), "coordinate", null);
        setField(term89879, term89879.getClass(), "planetType", null);
        setIntField(term89879, term89879.getClass(), "groundSize", 0);
        setIntField(term89879, term89879.getClass(), "amountMetalInGround", 0);
        setIntField(term89879, term89879.getClass(), "metal", 0);
        setIntField(term89879, term89879.getClass(), "prodResource", 0);
        setIntField(term89879, term89879.getClass(), "extraFood", 0);
        setIntField(term89879, term89879.getClass(), "culture", 0);
        setIntField(term89879, term89879.getClass(), "planetOwner", 0);
        setField(term89879, term89879.getClass(), "planetOwnerInfo", null);
        setField(term89879, term89879.getClass(), "homeWorldId", null);
        setIntField(term89879, term89879.getClass(), "startRealmIndex", 0);
        setIntField(term89879, term89879.getClass(), "tax", 0);
        setField(term89879, term89879.getClass(), "statuses", null);
        setField(term89879, term89879.getClass(), "timedStatuses", null);
        setField(term89879, term89879.getClass(), "event", null);
        setBooleanField(term89879, term89879.getClass(), "eventFound", false);
        setField(term89879, term89879.getClass(), "happinessEffect", null);
        setField(term89879, term89879.getClass(), "happinessExplanation", null);
        setField(term89879, term89879.getClass(), "farmProdExplain", null);
        setField(term89879, term89879.getClass(), "metaProdExplain", null);
        setField(term89879, term89879.getClass(), "prodProdExplain", null);
        setField(term89879, term89879.getClass(), "reseProdExplain", null);
        setField(term89879, term89879.getClass(), "cultProdExplain", null);
        setField(term89879, term89879.getClass(), "credProdExplain", null);
        setField(term89879, term89879.getClass(), "governor", null);
        setIntField(term89879, term89879.getClass(), "governorGuide", 0);
        setField(term89879, term89879.getClass(), "orbital", null);
        setField(term89879, term89879.getClass(), "workers", null);
        setField(term89879, term89879.getClass(), "buildings", null);
        setField(term89879, term89879.getClass(), "underConstruction", null);
        term89893 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = boolean.class;
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[2];
        args[0] = term89893;
        args[1] = null;
        callMethod(klass, "doRush", argTypes, term89879, args);
    }

};


