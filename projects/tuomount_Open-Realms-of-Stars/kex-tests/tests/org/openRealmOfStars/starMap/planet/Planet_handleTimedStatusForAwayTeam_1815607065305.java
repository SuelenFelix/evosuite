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

public class Planet_handleTimedStatusForAwayTeam_1815607065305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3365364;

    public Planet_handleTimedStatusForAwayTeam_1815607065305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3365364 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term3365364, term3365364.getClass(), "name", null);
        setIntField(term3365364, term3365364.getClass(), "orderNumber", 0);
        setField(term3365364, term3365364.getClass(), "radiationType", null);
        setField(term3365364, term3365364.getClass(), "gravityType", null);
        setField(term3365364, term3365364.getClass(), "temperatureType", null);
        setField(term3365364, term3365364.getClass(), "waterLevel", null);
        setBooleanField(term3365364, term3365364.getClass(), "gasGiant", false);
        setField(term3365364, term3365364.getClass(), "coordinate", null);
        setField(term3365364, term3365364.getClass(), "planetType", null);
        setIntField(term3365364, term3365364.getClass(), "groundSize", 0);
        setIntField(term3365364, term3365364.getClass(), "amountMetalInGround", 0);
        setIntField(term3365364, term3365364.getClass(), "metal", 0);
        setIntField(term3365364, term3365364.getClass(), "prodResource", 0);
        setIntField(term3365364, term3365364.getClass(), "extraFood", 0);
        setIntField(term3365364, term3365364.getClass(), "culture", 0);
        setIntField(term3365364, term3365364.getClass(), "planetOwner", 0);
        setField(term3365364, term3365364.getClass(), "planetOwnerInfo", null);
        setField(term3365364, term3365364.getClass(), "homeWorldId", null);
        setIntField(term3365364, term3365364.getClass(), "startRealmIndex", 0);
        setIntField(term3365364, term3365364.getClass(), "tax", 0);
        setField(term3365364, term3365364.getClass(), "statuses", null);
        setField(term3365364, term3365364.getClass(), "timedStatuses", null);
        setField(term3365364, term3365364.getClass(), "event", null);
        setBooleanField(term3365364, term3365364.getClass(), "eventFound", false);
        setField(term3365364, term3365364.getClass(), "happinessEffect", null);
        setField(term3365364, term3365364.getClass(), "happinessExplanation", null);
        setField(term3365364, term3365364.getClass(), "farmProdExplain", null);
        setField(term3365364, term3365364.getClass(), "metaProdExplain", null);
        setField(term3365364, term3365364.getClass(), "prodProdExplain", null);
        setField(term3365364, term3365364.getClass(), "reseProdExplain", null);
        setField(term3365364, term3365364.getClass(), "cultProdExplain", null);
        setField(term3365364, term3365364.getClass(), "credProdExplain", null);
        setField(term3365364, term3365364.getClass(), "governor", null);
        setIntField(term3365364, term3365364.getClass(), "governorGuide", 0);
        setField(term3365364, term3365364.getClass(), "orbital", null);
        setField(term3365364, term3365364.getClass(), "workers", null);
        setField(term3365364, term3365364.getClass(), "buildings", null);
        setField(term3365364, term3365364.getClass(), "underConstruction", null);
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
        callMethod(klass, "handleTimedStatusForAwayTeam", argTypes, term3365364, args);
    }

};


