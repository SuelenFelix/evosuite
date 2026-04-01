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

public class Planet_eventActivation_730620060253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1078963;
     Object term1078977;

    public Planet_eventActivation_730620060253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1078963 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term1078963, term1078963.getClass(), "name", null);
        setIntField(term1078963, term1078963.getClass(), "orderNumber", 0);
        setField(term1078963, term1078963.getClass(), "radiationType", null);
        setField(term1078963, term1078963.getClass(), "gravityType", null);
        setField(term1078963, term1078963.getClass(), "temperatureType", null);
        setField(term1078963, term1078963.getClass(), "waterLevel", null);
        setBooleanField(term1078963, term1078963.getClass(), "gasGiant", false);
        setField(term1078963, term1078963.getClass(), "coordinate", null);
        setField(term1078963, term1078963.getClass(), "planetType", null);
        setIntField(term1078963, term1078963.getClass(), "groundSize", 0);
        setIntField(term1078963, term1078963.getClass(), "amountMetalInGround", 0);
        setIntField(term1078963, term1078963.getClass(), "metal", 0);
        setIntField(term1078963, term1078963.getClass(), "prodResource", 0);
        setIntField(term1078963, term1078963.getClass(), "extraFood", 0);
        setIntField(term1078963, term1078963.getClass(), "culture", 0);
        setIntField(term1078963, term1078963.getClass(), "planetOwner", 0);
        setField(term1078963, term1078963.getClass(), "planetOwnerInfo", null);
        setField(term1078963, term1078963.getClass(), "homeWorldId", null);
        setIntField(term1078963, term1078963.getClass(), "startRealmIndex", 0);
        setIntField(term1078963, term1078963.getClass(), "tax", 0);
        setField(term1078963, term1078963.getClass(), "statuses", null);
        setField(term1078963, term1078963.getClass(), "timedStatuses", null);
        setField(term1078963, term1078963.getClass(), "event", null);
        setBooleanField(term1078963, term1078963.getClass(), "eventFound", false);
        setField(term1078963, term1078963.getClass(), "happinessEffect", null);
        setField(term1078963, term1078963.getClass(), "happinessExplanation", null);
        setField(term1078963, term1078963.getClass(), "farmProdExplain", null);
        setField(term1078963, term1078963.getClass(), "metaProdExplain", null);
        setField(term1078963, term1078963.getClass(), "prodProdExplain", null);
        setField(term1078963, term1078963.getClass(), "reseProdExplain", null);
        setField(term1078963, term1078963.getClass(), "cultProdExplain", null);
        setField(term1078963, term1078963.getClass(), "credProdExplain", null);
        setField(term1078963, term1078963.getClass(), "governor", null);
        setIntField(term1078963, term1078963.getClass(), "governorGuide", 0);
        setField(term1078963, term1078963.getClass(), "orbital", null);
        setField(term1078963, term1078963.getClass(), "workers", null);
        setField(term1078963, term1078963.getClass(), "buildings", null);
        setField(term1078963, term1078963.getClass(), "underConstruction", null);
        term1078977 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = boolean.class;
        argTypes[1] = Class.forName("org.openRealmOfStars.player.leader.Leader");
        argTypes[2] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[3];
        args[0] = term1078977;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "eventActivation", argTypes, term1078963, args);
    }

};


