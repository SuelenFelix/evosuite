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

public class Planet_getPlanetPlayerInfo_401866223134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2568004;

    public Planet_getPlanetPlayerInfo_401866223134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2568004 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term2568004, term2568004.getClass(), "name", null);
        setIntField(term2568004, term2568004.getClass(), "orderNumber", 0);
        setField(term2568004, term2568004.getClass(), "radiationType", null);
        setField(term2568004, term2568004.getClass(), "gravityType", null);
        setField(term2568004, term2568004.getClass(), "temperatureType", null);
        setField(term2568004, term2568004.getClass(), "waterLevel", null);
        setBooleanField(term2568004, term2568004.getClass(), "gasGiant", false);
        setField(term2568004, term2568004.getClass(), "coordinate", null);
        setField(term2568004, term2568004.getClass(), "planetType", null);
        setIntField(term2568004, term2568004.getClass(), "groundSize", 0);
        setIntField(term2568004, term2568004.getClass(), "amountMetalInGround", 0);
        setIntField(term2568004, term2568004.getClass(), "metal", 0);
        setIntField(term2568004, term2568004.getClass(), "prodResource", 0);
        setIntField(term2568004, term2568004.getClass(), "extraFood", 0);
        setIntField(term2568004, term2568004.getClass(), "culture", 0);
        setIntField(term2568004, term2568004.getClass(), "planetOwner", 0);
        setField(term2568004, term2568004.getClass(), "planetOwnerInfo", null);
        setField(term2568004, term2568004.getClass(), "homeWorldId", null);
        setIntField(term2568004, term2568004.getClass(), "startRealmIndex", 0);
        setIntField(term2568004, term2568004.getClass(), "tax", 0);
        setField(term2568004, term2568004.getClass(), "statuses", null);
        setField(term2568004, term2568004.getClass(), "timedStatuses", null);
        setField(term2568004, term2568004.getClass(), "event", null);
        setBooleanField(term2568004, term2568004.getClass(), "eventFound", false);
        setField(term2568004, term2568004.getClass(), "happinessEffect", null);
        setField(term2568004, term2568004.getClass(), "happinessExplanation", null);
        setField(term2568004, term2568004.getClass(), "farmProdExplain", null);
        setField(term2568004, term2568004.getClass(), "metaProdExplain", null);
        setField(term2568004, term2568004.getClass(), "prodProdExplain", null);
        setField(term2568004, term2568004.getClass(), "reseProdExplain", null);
        setField(term2568004, term2568004.getClass(), "cultProdExplain", null);
        setField(term2568004, term2568004.getClass(), "credProdExplain", null);
        setField(term2568004, term2568004.getClass(), "governor", null);
        setIntField(term2568004, term2568004.getClass(), "governorGuide", 0);
        setField(term2568004, term2568004.getClass(), "orbital", null);
        setField(term2568004, term2568004.getClass(), "workers", null);
        setField(term2568004, term2568004.getClass(), "buildings", null);
        setField(term2568004, term2568004.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlanetPlayerInfo", argTypes, term2568004, args);
    }

};


