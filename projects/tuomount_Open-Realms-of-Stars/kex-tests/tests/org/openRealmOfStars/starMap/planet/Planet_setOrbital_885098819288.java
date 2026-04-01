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

public class Planet_setOrbital_885098819288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1228106;

    public Planet_setOrbital_885098819288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1228106 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term1228106, term1228106.getClass(), "name", null);
        setIntField(term1228106, term1228106.getClass(), "orderNumber", 0);
        setField(term1228106, term1228106.getClass(), "radiationType", null);
        setField(term1228106, term1228106.getClass(), "gravityType", null);
        setField(term1228106, term1228106.getClass(), "temperatureType", null);
        setField(term1228106, term1228106.getClass(), "waterLevel", null);
        setBooleanField(term1228106, term1228106.getClass(), "gasGiant", false);
        setField(term1228106, term1228106.getClass(), "coordinate", null);
        setField(term1228106, term1228106.getClass(), "planetType", null);
        setIntField(term1228106, term1228106.getClass(), "groundSize", 0);
        setIntField(term1228106, term1228106.getClass(), "amountMetalInGround", 0);
        setIntField(term1228106, term1228106.getClass(), "metal", 0);
        setIntField(term1228106, term1228106.getClass(), "prodResource", 0);
        setIntField(term1228106, term1228106.getClass(), "extraFood", 0);
        setIntField(term1228106, term1228106.getClass(), "culture", 0);
        setIntField(term1228106, term1228106.getClass(), "planetOwner", 0);
        setField(term1228106, term1228106.getClass(), "planetOwnerInfo", null);
        setField(term1228106, term1228106.getClass(), "homeWorldId", null);
        setIntField(term1228106, term1228106.getClass(), "startRealmIndex", 0);
        setIntField(term1228106, term1228106.getClass(), "tax", 0);
        setField(term1228106, term1228106.getClass(), "statuses", null);
        setField(term1228106, term1228106.getClass(), "timedStatuses", null);
        setField(term1228106, term1228106.getClass(), "event", null);
        setBooleanField(term1228106, term1228106.getClass(), "eventFound", false);
        setField(term1228106, term1228106.getClass(), "happinessEffect", null);
        setField(term1228106, term1228106.getClass(), "happinessExplanation", null);
        setField(term1228106, term1228106.getClass(), "farmProdExplain", null);
        setField(term1228106, term1228106.getClass(), "metaProdExplain", null);
        setField(term1228106, term1228106.getClass(), "prodProdExplain", null);
        setField(term1228106, term1228106.getClass(), "reseProdExplain", null);
        setField(term1228106, term1228106.getClass(), "cultProdExplain", null);
        setField(term1228106, term1228106.getClass(), "credProdExplain", null);
        setField(term1228106, term1228106.getClass(), "governor", null);
        setIntField(term1228106, term1228106.getClass(), "governorGuide", 0);
        setField(term1228106, term1228106.getClass(), "orbital", null);
        setField(term1228106, term1228106.getClass(), "workers", null);
        setField(term1228106, term1228106.getClass(), "buildings", null);
        setField(term1228106, term1228106.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.ship.Ship");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setOrbital", argTypes, term1228106, args);
    }

};


