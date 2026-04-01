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

public class Planet_generateInfoText_759414101122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term522271;
     Object term522285;

    public Planet_generateInfoText_759414101122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term522271 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term522271, term522271.getClass(), "name", null);
        setIntField(term522271, term522271.getClass(), "orderNumber", 0);
        setField(term522271, term522271.getClass(), "radiationType", null);
        setField(term522271, term522271.getClass(), "gravityType", null);
        setField(term522271, term522271.getClass(), "temperatureType", null);
        setField(term522271, term522271.getClass(), "waterLevel", null);
        setBooleanField(term522271, term522271.getClass(), "gasGiant", false);
        setField(term522271, term522271.getClass(), "coordinate", null);
        setField(term522271, term522271.getClass(), "planetType", null);
        setIntField(term522271, term522271.getClass(), "groundSize", 0);
        setIntField(term522271, term522271.getClass(), "amountMetalInGround", 0);
        setIntField(term522271, term522271.getClass(), "metal", 0);
        setIntField(term522271, term522271.getClass(), "prodResource", 0);
        setIntField(term522271, term522271.getClass(), "extraFood", 0);
        setIntField(term522271, term522271.getClass(), "culture", 0);
        setIntField(term522271, term522271.getClass(), "planetOwner", 0);
        setField(term522271, term522271.getClass(), "planetOwnerInfo", null);
        setField(term522271, term522271.getClass(), "homeWorldId", null);
        setIntField(term522271, term522271.getClass(), "startRealmIndex", 0);
        setIntField(term522271, term522271.getClass(), "tax", 0);
        setField(term522271, term522271.getClass(), "statuses", null);
        setField(term522271, term522271.getClass(), "timedStatuses", null);
        setField(term522271, term522271.getClass(), "event", null);
        setBooleanField(term522271, term522271.getClass(), "eventFound", false);
        setField(term522271, term522271.getClass(), "happinessEffect", null);
        setField(term522271, term522271.getClass(), "happinessExplanation", null);
        setField(term522271, term522271.getClass(), "farmProdExplain", null);
        setField(term522271, term522271.getClass(), "metaProdExplain", null);
        setField(term522271, term522271.getClass(), "prodProdExplain", null);
        setField(term522271, term522271.getClass(), "reseProdExplain", null);
        setField(term522271, term522271.getClass(), "cultProdExplain", null);
        setField(term522271, term522271.getClass(), "credProdExplain", null);
        setField(term522271, term522271.getClass(), "governor", null);
        setIntField(term522271, term522271.getClass(), "governorGuide", 0);
        setField(term522271, term522271.getClass(), "orbital", null);
        setField(term522271, term522271.getClass(), "workers", null);
        setField(term522271, term522271.getClass(), "buildings", null);
        setField(term522271, term522271.getClass(), "underConstruction", null);
        term522285 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = boolean.class;
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[2];
        args[0] = term522285;
        args[1] = null;
        callMethod(klass, "generateInfoText", argTypes, term522271, args);
    }

};


