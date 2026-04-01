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

public class Planet_activateTimedStatus_1092239599303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3340678;

    public Planet_activateTimedStatus_1092239599303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3340678 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term3340678, term3340678.getClass(), "name", null);
        setIntField(term3340678, term3340678.getClass(), "orderNumber", 0);
        setField(term3340678, term3340678.getClass(), "radiationType", null);
        setField(term3340678, term3340678.getClass(), "gravityType", null);
        setField(term3340678, term3340678.getClass(), "temperatureType", null);
        setField(term3340678, term3340678.getClass(), "waterLevel", null);
        setBooleanField(term3340678, term3340678.getClass(), "gasGiant", false);
        setField(term3340678, term3340678.getClass(), "coordinate", null);
        setField(term3340678, term3340678.getClass(), "planetType", null);
        setIntField(term3340678, term3340678.getClass(), "groundSize", 0);
        setIntField(term3340678, term3340678.getClass(), "amountMetalInGround", 0);
        setIntField(term3340678, term3340678.getClass(), "metal", 0);
        setIntField(term3340678, term3340678.getClass(), "prodResource", 0);
        setIntField(term3340678, term3340678.getClass(), "extraFood", 0);
        setIntField(term3340678, term3340678.getClass(), "culture", 0);
        setIntField(term3340678, term3340678.getClass(), "planetOwner", 0);
        setField(term3340678, term3340678.getClass(), "planetOwnerInfo", null);
        setField(term3340678, term3340678.getClass(), "homeWorldId", null);
        setIntField(term3340678, term3340678.getClass(), "startRealmIndex", 0);
        setIntField(term3340678, term3340678.getClass(), "tax", 0);
        setField(term3340678, term3340678.getClass(), "statuses", null);
        setField(term3340678, term3340678.getClass(), "timedStatuses", null);
        setField(term3340678, term3340678.getClass(), "event", null);
        setBooleanField(term3340678, term3340678.getClass(), "eventFound", false);
        setField(term3340678, term3340678.getClass(), "happinessEffect", null);
        setField(term3340678, term3340678.getClass(), "happinessExplanation", null);
        setField(term3340678, term3340678.getClass(), "farmProdExplain", null);
        setField(term3340678, term3340678.getClass(), "metaProdExplain", null);
        setField(term3340678, term3340678.getClass(), "prodProdExplain", null);
        setField(term3340678, term3340678.getClass(), "reseProdExplain", null);
        setField(term3340678, term3340678.getClass(), "cultProdExplain", null);
        setField(term3340678, term3340678.getClass(), "credProdExplain", null);
        setField(term3340678, term3340678.getClass(), "governor", null);
        setIntField(term3340678, term3340678.getClass(), "governorGuide", 0);
        setField(term3340678, term3340678.getClass(), "orbital", null);
        setField(term3340678, term3340678.getClass(), "workers", null);
        setField(term3340678, term3340678.getClass(), "buildings", null);
        setField(term3340678, term3340678.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.StarMap");
        argTypes[1] = Class.forName("org.openRealmOfStars.starMap.planet.status.TimedStatus");
        argTypes[2] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[3] = Class.forName("org.openRealmOfStars.player.leader.Leader");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "activateTimedStatus", argTypes, term3340678, args);
    }

};


