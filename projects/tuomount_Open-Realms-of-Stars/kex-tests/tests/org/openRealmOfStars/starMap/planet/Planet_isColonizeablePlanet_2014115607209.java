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

public class Planet_isColonizeablePlanet_2014115607209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2907230;

    public Planet_isColonizeablePlanet_2014115607209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2907230 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term2907230, term2907230.getClass(), "name", null);
        setIntField(term2907230, term2907230.getClass(), "orderNumber", 0);
        setField(term2907230, term2907230.getClass(), "radiationType", null);
        setField(term2907230, term2907230.getClass(), "gravityType", null);
        setField(term2907230, term2907230.getClass(), "temperatureType", null);
        setField(term2907230, term2907230.getClass(), "waterLevel", null);
        setBooleanField(term2907230, term2907230.getClass(), "gasGiant", false);
        setField(term2907230, term2907230.getClass(), "coordinate", null);
        setField(term2907230, term2907230.getClass(), "planetType", null);
        setIntField(term2907230, term2907230.getClass(), "groundSize", 0);
        setIntField(term2907230, term2907230.getClass(), "amountMetalInGround", 0);
        setIntField(term2907230, term2907230.getClass(), "metal", 0);
        setIntField(term2907230, term2907230.getClass(), "prodResource", 0);
        setIntField(term2907230, term2907230.getClass(), "extraFood", 0);
        setIntField(term2907230, term2907230.getClass(), "culture", 0);
        setIntField(term2907230, term2907230.getClass(), "planetOwner", 0);
        setField(term2907230, term2907230.getClass(), "planetOwnerInfo", null);
        setField(term2907230, term2907230.getClass(), "homeWorldId", null);
        setIntField(term2907230, term2907230.getClass(), "startRealmIndex", 0);
        setIntField(term2907230, term2907230.getClass(), "tax", 0);
        setField(term2907230, term2907230.getClass(), "statuses", null);
        setField(term2907230, term2907230.getClass(), "timedStatuses", null);
        setField(term2907230, term2907230.getClass(), "event", null);
        setBooleanField(term2907230, term2907230.getClass(), "eventFound", false);
        setField(term2907230, term2907230.getClass(), "happinessEffect", null);
        setField(term2907230, term2907230.getClass(), "happinessExplanation", null);
        setField(term2907230, term2907230.getClass(), "farmProdExplain", null);
        setField(term2907230, term2907230.getClass(), "metaProdExplain", null);
        setField(term2907230, term2907230.getClass(), "prodProdExplain", null);
        setField(term2907230, term2907230.getClass(), "reseProdExplain", null);
        setField(term2907230, term2907230.getClass(), "cultProdExplain", null);
        setField(term2907230, term2907230.getClass(), "credProdExplain", null);
        setField(term2907230, term2907230.getClass(), "governor", null);
        setIntField(term2907230, term2907230.getClass(), "governorGuide", 0);
        setField(term2907230, term2907230.getClass(), "orbital", null);
        setField(term2907230, term2907230.getClass(), "workers", null);
        setField(term2907230, term2907230.getClass(), "buildings", null);
        setField(term2907230, term2907230.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "isColonizeablePlanet", argTypes, term2907230, args);
    }

};


