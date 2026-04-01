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

public class Planet_handleTimedStatusForAwayTeam_1815607065303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1318662;

    public Planet_handleTimedStatusForAwayTeam_1815607065303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1318662 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term1318662, term1318662.getClass(), "name", null);
        setIntField(term1318662, term1318662.getClass(), "orderNumber", 0);
        setField(term1318662, term1318662.getClass(), "radiationType", null);
        setField(term1318662, term1318662.getClass(), "gravityType", null);
        setField(term1318662, term1318662.getClass(), "temperatureType", null);
        setField(term1318662, term1318662.getClass(), "waterLevel", null);
        setBooleanField(term1318662, term1318662.getClass(), "gasGiant", false);
        setField(term1318662, term1318662.getClass(), "coordinate", null);
        setField(term1318662, term1318662.getClass(), "planetType", null);
        setIntField(term1318662, term1318662.getClass(), "groundSize", 0);
        setIntField(term1318662, term1318662.getClass(), "amountMetalInGround", 0);
        setIntField(term1318662, term1318662.getClass(), "metal", 0);
        setIntField(term1318662, term1318662.getClass(), "prodResource", 0);
        setIntField(term1318662, term1318662.getClass(), "extraFood", 0);
        setIntField(term1318662, term1318662.getClass(), "culture", 0);
        setIntField(term1318662, term1318662.getClass(), "planetOwner", 0);
        setField(term1318662, term1318662.getClass(), "planetOwnerInfo", null);
        setField(term1318662, term1318662.getClass(), "homeWorldId", null);
        setIntField(term1318662, term1318662.getClass(), "startRealmIndex", 0);
        setIntField(term1318662, term1318662.getClass(), "tax", 0);
        setField(term1318662, term1318662.getClass(), "statuses", null);
        setField(term1318662, term1318662.getClass(), "timedStatuses", null);
        setField(term1318662, term1318662.getClass(), "event", null);
        setBooleanField(term1318662, term1318662.getClass(), "eventFound", false);
        setField(term1318662, term1318662.getClass(), "happinessEffect", null);
        setField(term1318662, term1318662.getClass(), "happinessExplanation", null);
        setField(term1318662, term1318662.getClass(), "farmProdExplain", null);
        setField(term1318662, term1318662.getClass(), "metaProdExplain", null);
        setField(term1318662, term1318662.getClass(), "prodProdExplain", null);
        setField(term1318662, term1318662.getClass(), "reseProdExplain", null);
        setField(term1318662, term1318662.getClass(), "cultProdExplain", null);
        setField(term1318662, term1318662.getClass(), "credProdExplain", null);
        setField(term1318662, term1318662.getClass(), "governor", null);
        setIntField(term1318662, term1318662.getClass(), "governorGuide", 0);
        setField(term1318662, term1318662.getClass(), "orbital", null);
        setField(term1318662, term1318662.getClass(), "workers", null);
        setField(term1318662, term1318662.getClass(), "buildings", null);
        setField(term1318662, term1318662.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.StarMap");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.leader.Leader");
        argTypes[2] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "handleTimedStatusForAwayTeam", argTypes, term1318662, args);
    }

};


