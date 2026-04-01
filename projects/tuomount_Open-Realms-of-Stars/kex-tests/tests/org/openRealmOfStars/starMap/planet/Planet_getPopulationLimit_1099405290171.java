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

public class Planet_getPopulationLimit_1099405290171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2733306;
     Object term2733320;

    public Planet_getPopulationLimit_1099405290171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2733306 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term2733306, term2733306.getClass(), "name", null);
        setIntField(term2733306, term2733306.getClass(), "orderNumber", 0);
        setField(term2733306, term2733306.getClass(), "radiationType", null);
        setField(term2733306, term2733306.getClass(), "gravityType", null);
        setField(term2733306, term2733306.getClass(), "temperatureType", null);
        setField(term2733306, term2733306.getClass(), "waterLevel", null);
        setBooleanField(term2733306, term2733306.getClass(), "gasGiant", false);
        setField(term2733306, term2733306.getClass(), "coordinate", null);
        setField(term2733306, term2733306.getClass(), "planetType", null);
        setIntField(term2733306, term2733306.getClass(), "groundSize", 0);
        setIntField(term2733306, term2733306.getClass(), "amountMetalInGround", 0);
        setIntField(term2733306, term2733306.getClass(), "metal", 0);
        setIntField(term2733306, term2733306.getClass(), "prodResource", 0);
        setIntField(term2733306, term2733306.getClass(), "extraFood", 0);
        setIntField(term2733306, term2733306.getClass(), "culture", 0);
        setIntField(term2733306, term2733306.getClass(), "planetOwner", 0);
        setField(term2733306, term2733306.getClass(), "planetOwnerInfo", null);
        setField(term2733306, term2733306.getClass(), "homeWorldId", null);
        setIntField(term2733306, term2733306.getClass(), "startRealmIndex", 0);
        setIntField(term2733306, term2733306.getClass(), "tax", 0);
        setField(term2733306, term2733306.getClass(), "statuses", null);
        setField(term2733306, term2733306.getClass(), "timedStatuses", null);
        setField(term2733306, term2733306.getClass(), "event", null);
        setBooleanField(term2733306, term2733306.getClass(), "eventFound", false);
        setField(term2733306, term2733306.getClass(), "happinessEffect", null);
        setField(term2733306, term2733306.getClass(), "happinessExplanation", null);
        setField(term2733306, term2733306.getClass(), "farmProdExplain", null);
        setField(term2733306, term2733306.getClass(), "metaProdExplain", null);
        setField(term2733306, term2733306.getClass(), "prodProdExplain", null);
        setField(term2733306, term2733306.getClass(), "reseProdExplain", null);
        setField(term2733306, term2733306.getClass(), "cultProdExplain", null);
        setField(term2733306, term2733306.getClass(), "credProdExplain", null);
        setField(term2733306, term2733306.getClass(), "governor", null);
        setIntField(term2733306, term2733306.getClass(), "governorGuide", 0);
        setField(term2733306, term2733306.getClass(), "orbital", null);
        setField(term2733306, term2733306.getClass(), "workers", null);
        setField(term2733306, term2733306.getClass(), "buildings", null);
        setField(term2733306, term2733306.getClass(), "underConstruction", null);
        term2733320 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2733320;
        callMethod(klass, "getPopulationLimit", argTypes, term2733306, args);
    }

};


