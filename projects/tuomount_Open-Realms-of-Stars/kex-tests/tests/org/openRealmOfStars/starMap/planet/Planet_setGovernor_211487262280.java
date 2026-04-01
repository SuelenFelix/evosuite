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

public class Planet_setGovernor_211487262280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3232770;

    public Planet_setGovernor_211487262280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3232770 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term3232770, term3232770.getClass(), "name", null);
        setIntField(term3232770, term3232770.getClass(), "orderNumber", 0);
        setField(term3232770, term3232770.getClass(), "radiationType", null);
        setField(term3232770, term3232770.getClass(), "gravityType", null);
        setField(term3232770, term3232770.getClass(), "temperatureType", null);
        setField(term3232770, term3232770.getClass(), "waterLevel", null);
        setBooleanField(term3232770, term3232770.getClass(), "gasGiant", false);
        setField(term3232770, term3232770.getClass(), "coordinate", null);
        setField(term3232770, term3232770.getClass(), "planetType", null);
        setIntField(term3232770, term3232770.getClass(), "groundSize", 0);
        setIntField(term3232770, term3232770.getClass(), "amountMetalInGround", 0);
        setIntField(term3232770, term3232770.getClass(), "metal", 0);
        setIntField(term3232770, term3232770.getClass(), "prodResource", 0);
        setIntField(term3232770, term3232770.getClass(), "extraFood", 0);
        setIntField(term3232770, term3232770.getClass(), "culture", 0);
        setIntField(term3232770, term3232770.getClass(), "planetOwner", 0);
        setField(term3232770, term3232770.getClass(), "planetOwnerInfo", null);
        setField(term3232770, term3232770.getClass(), "homeWorldId", null);
        setIntField(term3232770, term3232770.getClass(), "startRealmIndex", 0);
        setIntField(term3232770, term3232770.getClass(), "tax", 0);
        setField(term3232770, term3232770.getClass(), "statuses", null);
        setField(term3232770, term3232770.getClass(), "timedStatuses", null);
        setField(term3232770, term3232770.getClass(), "event", null);
        setBooleanField(term3232770, term3232770.getClass(), "eventFound", false);
        setField(term3232770, term3232770.getClass(), "happinessEffect", null);
        setField(term3232770, term3232770.getClass(), "happinessExplanation", null);
        setField(term3232770, term3232770.getClass(), "farmProdExplain", null);
        setField(term3232770, term3232770.getClass(), "metaProdExplain", null);
        setField(term3232770, term3232770.getClass(), "prodProdExplain", null);
        setField(term3232770, term3232770.getClass(), "reseProdExplain", null);
        setField(term3232770, term3232770.getClass(), "cultProdExplain", null);
        setField(term3232770, term3232770.getClass(), "credProdExplain", null);
        setField(term3232770, term3232770.getClass(), "governor", null);
        setIntField(term3232770, term3232770.getClass(), "governorGuide", 0);
        setField(term3232770, term3232770.getClass(), "orbital", null);
        setField(term3232770, term3232770.getClass(), "workers", null);
        setField(term3232770, term3232770.getClass(), "buildings", null);
        setField(term3232770, term3232770.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.leader.Leader");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setGovernor", argTypes, term3232770, args);
    }

};


