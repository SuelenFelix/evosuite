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

public class Planet_setGovernor_211487262279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1186736;

    public Planet_setGovernor_211487262279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1186736 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term1186736, term1186736.getClass(), "name", null);
        setIntField(term1186736, term1186736.getClass(), "orderNumber", 0);
        setField(term1186736, term1186736.getClass(), "radiationType", null);
        setField(term1186736, term1186736.getClass(), "gravityType", null);
        setField(term1186736, term1186736.getClass(), "temperatureType", null);
        setField(term1186736, term1186736.getClass(), "waterLevel", null);
        setBooleanField(term1186736, term1186736.getClass(), "gasGiant", false);
        setField(term1186736, term1186736.getClass(), "coordinate", null);
        setField(term1186736, term1186736.getClass(), "planetType", null);
        setIntField(term1186736, term1186736.getClass(), "groundSize", 0);
        setIntField(term1186736, term1186736.getClass(), "amountMetalInGround", 0);
        setIntField(term1186736, term1186736.getClass(), "metal", 0);
        setIntField(term1186736, term1186736.getClass(), "prodResource", 0);
        setIntField(term1186736, term1186736.getClass(), "extraFood", 0);
        setIntField(term1186736, term1186736.getClass(), "culture", 0);
        setIntField(term1186736, term1186736.getClass(), "planetOwner", 0);
        setField(term1186736, term1186736.getClass(), "planetOwnerInfo", null);
        setField(term1186736, term1186736.getClass(), "homeWorldId", null);
        setIntField(term1186736, term1186736.getClass(), "startRealmIndex", 0);
        setIntField(term1186736, term1186736.getClass(), "tax", 0);
        setField(term1186736, term1186736.getClass(), "statuses", null);
        setField(term1186736, term1186736.getClass(), "timedStatuses", null);
        setField(term1186736, term1186736.getClass(), "event", null);
        setBooleanField(term1186736, term1186736.getClass(), "eventFound", false);
        setField(term1186736, term1186736.getClass(), "happinessEffect", null);
        setField(term1186736, term1186736.getClass(), "happinessExplanation", null);
        setField(term1186736, term1186736.getClass(), "farmProdExplain", null);
        setField(term1186736, term1186736.getClass(), "metaProdExplain", null);
        setField(term1186736, term1186736.getClass(), "prodProdExplain", null);
        setField(term1186736, term1186736.getClass(), "reseProdExplain", null);
        setField(term1186736, term1186736.getClass(), "cultProdExplain", null);
        setField(term1186736, term1186736.getClass(), "credProdExplain", null);
        setField(term1186736, term1186736.getClass(), "governor", null);
        setIntField(term1186736, term1186736.getClass(), "governorGuide", 0);
        setField(term1186736, term1186736.getClass(), "orbital", null);
        setField(term1186736, term1186736.getClass(), "workers", null);
        setField(term1186736, term1186736.getClass(), "buildings", null);
        setField(term1186736, term1186736.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.leader.Leader");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setGovernor", argTypes, term1186736, args);
    }

};


