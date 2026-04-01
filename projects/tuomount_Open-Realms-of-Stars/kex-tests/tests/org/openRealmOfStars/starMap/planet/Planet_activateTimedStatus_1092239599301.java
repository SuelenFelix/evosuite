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

public class Planet_activateTimedStatus_1092239599301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1293821;

    public Planet_activateTimedStatus_1092239599301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1293821 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term1293821, term1293821.getClass(), "name", null);
        setIntField(term1293821, term1293821.getClass(), "orderNumber", 0);
        setField(term1293821, term1293821.getClass(), "radiationType", null);
        setField(term1293821, term1293821.getClass(), "gravityType", null);
        setField(term1293821, term1293821.getClass(), "temperatureType", null);
        setField(term1293821, term1293821.getClass(), "waterLevel", null);
        setBooleanField(term1293821, term1293821.getClass(), "gasGiant", false);
        setField(term1293821, term1293821.getClass(), "coordinate", null);
        setField(term1293821, term1293821.getClass(), "planetType", null);
        setIntField(term1293821, term1293821.getClass(), "groundSize", 0);
        setIntField(term1293821, term1293821.getClass(), "amountMetalInGround", 0);
        setIntField(term1293821, term1293821.getClass(), "metal", 0);
        setIntField(term1293821, term1293821.getClass(), "prodResource", 0);
        setIntField(term1293821, term1293821.getClass(), "extraFood", 0);
        setIntField(term1293821, term1293821.getClass(), "culture", 0);
        setIntField(term1293821, term1293821.getClass(), "planetOwner", 0);
        setField(term1293821, term1293821.getClass(), "planetOwnerInfo", null);
        setField(term1293821, term1293821.getClass(), "homeWorldId", null);
        setIntField(term1293821, term1293821.getClass(), "startRealmIndex", 0);
        setIntField(term1293821, term1293821.getClass(), "tax", 0);
        setField(term1293821, term1293821.getClass(), "statuses", null);
        setField(term1293821, term1293821.getClass(), "timedStatuses", null);
        setField(term1293821, term1293821.getClass(), "event", null);
        setBooleanField(term1293821, term1293821.getClass(), "eventFound", false);
        setField(term1293821, term1293821.getClass(), "happinessEffect", null);
        setField(term1293821, term1293821.getClass(), "happinessExplanation", null);
        setField(term1293821, term1293821.getClass(), "farmProdExplain", null);
        setField(term1293821, term1293821.getClass(), "metaProdExplain", null);
        setField(term1293821, term1293821.getClass(), "prodProdExplain", null);
        setField(term1293821, term1293821.getClass(), "reseProdExplain", null);
        setField(term1293821, term1293821.getClass(), "cultProdExplain", null);
        setField(term1293821, term1293821.getClass(), "credProdExplain", null);
        setField(term1293821, term1293821.getClass(), "governor", null);
        setIntField(term1293821, term1293821.getClass(), "governorGuide", 0);
        setField(term1293821, term1293821.getClass(), "orbital", null);
        setField(term1293821, term1293821.getClass(), "workers", null);
        setField(term1293821, term1293821.getClass(), "buildings", null);
        setField(term1293821, term1293821.getClass(), "underConstruction", null);
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
        callMethod(klass, "activateTimedStatus", argTypes, term1293821, args);
    }

};


