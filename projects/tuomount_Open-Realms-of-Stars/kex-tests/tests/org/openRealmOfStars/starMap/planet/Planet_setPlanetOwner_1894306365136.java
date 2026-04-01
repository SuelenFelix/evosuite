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

public class Planet_setPlanetOwner_1894306365136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2581865;
     Object term2581879;

    public Planet_setPlanetOwner_1894306365136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2581865 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term2581865, term2581865.getClass(), "name", null);
        setIntField(term2581865, term2581865.getClass(), "orderNumber", 0);
        setField(term2581865, term2581865.getClass(), "radiationType", null);
        setField(term2581865, term2581865.getClass(), "gravityType", null);
        setField(term2581865, term2581865.getClass(), "temperatureType", null);
        setField(term2581865, term2581865.getClass(), "waterLevel", null);
        setBooleanField(term2581865, term2581865.getClass(), "gasGiant", false);
        setField(term2581865, term2581865.getClass(), "coordinate", null);
        setField(term2581865, term2581865.getClass(), "planetType", null);
        setIntField(term2581865, term2581865.getClass(), "groundSize", 0);
        setIntField(term2581865, term2581865.getClass(), "amountMetalInGround", 0);
        setIntField(term2581865, term2581865.getClass(), "metal", 0);
        setIntField(term2581865, term2581865.getClass(), "prodResource", 0);
        setIntField(term2581865, term2581865.getClass(), "extraFood", 0);
        setIntField(term2581865, term2581865.getClass(), "culture", 0);
        setIntField(term2581865, term2581865.getClass(), "planetOwner", 0);
        setField(term2581865, term2581865.getClass(), "planetOwnerInfo", null);
        setField(term2581865, term2581865.getClass(), "homeWorldId", null);
        setIntField(term2581865, term2581865.getClass(), "startRealmIndex", 0);
        setIntField(term2581865, term2581865.getClass(), "tax", 0);
        setField(term2581865, term2581865.getClass(), "statuses", null);
        setField(term2581865, term2581865.getClass(), "timedStatuses", null);
        setField(term2581865, term2581865.getClass(), "event", null);
        setBooleanField(term2581865, term2581865.getClass(), "eventFound", false);
        setField(term2581865, term2581865.getClass(), "happinessEffect", null);
        setField(term2581865, term2581865.getClass(), "happinessExplanation", null);
        setField(term2581865, term2581865.getClass(), "farmProdExplain", null);
        setField(term2581865, term2581865.getClass(), "metaProdExplain", null);
        setField(term2581865, term2581865.getClass(), "prodProdExplain", null);
        setField(term2581865, term2581865.getClass(), "reseProdExplain", null);
        setField(term2581865, term2581865.getClass(), "cultProdExplain", null);
        setField(term2581865, term2581865.getClass(), "credProdExplain", null);
        setField(term2581865, term2581865.getClass(), "governor", null);
        setIntField(term2581865, term2581865.getClass(), "governorGuide", 0);
        setField(term2581865, term2581865.getClass(), "orbital", null);
        setField(term2581865, term2581865.getClass(), "workers", null);
        setField(term2581865, term2581865.getClass(), "buildings", null);
        setField(term2581865, term2581865.getClass(), "underConstruction", null);
        term2581879 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[2];
        args[0] = term2581879;
        args[1] = null;
        callMethod(klass, "setPlanetOwner", argTypes, term2581865, args);
    }

};


