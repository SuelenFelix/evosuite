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

public class Planet_eventActivation_730620060331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3373333;
     Object term3373347;

    public Planet_eventActivation_730620060331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3373333 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term3373333, term3373333.getClass(), "name", null);
        setIntField(term3373333, term3373333.getClass(), "orderNumber", 0);
        setField(term3373333, term3373333.getClass(), "radiationType", null);
        setField(term3373333, term3373333.getClass(), "gravityType", null);
        setField(term3373333, term3373333.getClass(), "temperatureType", null);
        setField(term3373333, term3373333.getClass(), "waterLevel", null);
        setBooleanField(term3373333, term3373333.getClass(), "gasGiant", false);
        setField(term3373333, term3373333.getClass(), "coordinate", null);
        setField(term3373333, term3373333.getClass(), "planetType", null);
        setIntField(term3373333, term3373333.getClass(), "groundSize", 0);
        setIntField(term3373333, term3373333.getClass(), "amountMetalInGround", 0);
        setIntField(term3373333, term3373333.getClass(), "metal", 0);
        setIntField(term3373333, term3373333.getClass(), "prodResource", 0);
        setIntField(term3373333, term3373333.getClass(), "extraFood", 0);
        setIntField(term3373333, term3373333.getClass(), "culture", 0);
        setIntField(term3373333, term3373333.getClass(), "planetOwner", 0);
        setField(term3373333, term3373333.getClass(), "planetOwnerInfo", null);
        setField(term3373333, term3373333.getClass(), "homeWorldId", null);
        setIntField(term3373333, term3373333.getClass(), "startRealmIndex", 0);
        setIntField(term3373333, term3373333.getClass(), "tax", 0);
        setField(term3373333, term3373333.getClass(), "statuses", null);
        setField(term3373333, term3373333.getClass(), "timedStatuses", null);
        setField(term3373333, term3373333.getClass(), "event", null);
        setBooleanField(term3373333, term3373333.getClass(), "eventFound", false);
        setField(term3373333, term3373333.getClass(), "happinessEffect", null);
        setField(term3373333, term3373333.getClass(), "happinessExplanation", null);
        setField(term3373333, term3373333.getClass(), "farmProdExplain", null);
        setField(term3373333, term3373333.getClass(), "metaProdExplain", null);
        setField(term3373333, term3373333.getClass(), "prodProdExplain", null);
        setField(term3373333, term3373333.getClass(), "reseProdExplain", null);
        setField(term3373333, term3373333.getClass(), "cultProdExplain", null);
        setField(term3373333, term3373333.getClass(), "credProdExplain", null);
        setField(term3373333, term3373333.getClass(), "governor", null);
        setIntField(term3373333, term3373333.getClass(), "governorGuide", 0);
        setField(term3373333, term3373333.getClass(), "orbital", null);
        setField(term3373333, term3373333.getClass(), "workers", null);
        setField(term3373333, term3373333.getClass(), "buildings", null);
        setField(term3373333, term3373333.getClass(), "underConstruction", null);
        term3373347 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = boolean.class;
        argTypes[1] = Class.forName("org.openRealmOfStars.player.leader.Leader");
        argTypes[2] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[3];
        args[0] = term3373347;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "eventActivation", argTypes, term3373333, args);
    }

};


