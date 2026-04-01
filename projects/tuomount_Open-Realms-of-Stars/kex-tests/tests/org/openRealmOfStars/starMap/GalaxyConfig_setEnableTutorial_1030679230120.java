package org.openRealmOfStars.starMap;

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
import static org.openRealmOfStars.starMap.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class GalaxyConfig_setEnableTutorial_1030679230120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1922127;
     Object term1922150;

    public GalaxyConfig_setEnableTutorial_1030679230120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1922127 = newInstance(Class.forName("org.openRealmOfStars.starMap.GalaxyConfig"));
        setIntField(term1922127, term1922127.getClass(), "sizeX", 0);
        setIntField(term1922127, term1922127.getClass(), "sizeY", 0);
        setIntField(term1922127, term1922127.getClass(), "galaxySizeIndex", 0);
        setIntField(term1922127, term1922127.getClass(), "maxPlayers", 0);
        setIntField(term1922127, term1922127.getClass(), "solarSystemDistance", 0);
        setIntField(term1922127, term1922127.getClass(), "sunDensityIndex", 0);
        setIntField(term1922127, term1922127.getClass(), "startingPosition", 0);
        setField(term1922127, term1922127.getClass(), "playerRaces", null);
        setField(term1922127, term1922127.getClass(), "playerName", null);
        setField(term1922127, term1922127.getClass(), "playerGovernment", null);
        setField(term1922127, term1922127.getClass(), "playerColors", null);
        setField(term1922127, term1922127.getClass(), "playerDifficult", null);
        setField(term1922127, term1922127.getClass(), "playerElderRealm", null);
        setField(term1922127, term1922127.getClass(), "startingScenario", null);
        setIntField(term1922127, term1922127.getClass(), "chanceForPlanetaryEvent", 0);
        setIntField(term1922127, term1922127.getClass(), "numberOfRoguePlanets", 0);
        setIntField(term1922127, term1922127.getClass(), "scoringVictoryTurns", 0);
        setIntField(term1922127, term1922127.getClass(), "scoringCulture", 0);
        setIntField(term1922127, term1922127.getClass(), "scoringConquer", 0);
        setIntField(term1922127, term1922127.getClass(), "scoringResearch", 0);
        setIntField(term1922127, term1922127.getClass(), "scoringDiplomacy", 0);
        setIntField(term1922127, term1922127.getClass(), "scoringPopulation", 0);
        setIntField(term1922127, term1922127.getClass(), "spacePiratesLevel", 0);
        setField(term1922127, term1922127.getClass(), "spacePiratesDifficulty", null);
        setField(term1922127, term1922127.getClass(), "karmaType", null);
        setIntField(term1922127, term1922127.getClass(), "karmaSpeed", 0);
        setIntField(term1922127, term1922127.getClass(), "spaceAnomaliesLevel", 0);
        setIntField(term1922127, term1922127.getClass(), "elderHeadStart", 0);
        setBooleanField(term1922127, term1922127.getClass(), "enableTutorial", false);
        setBooleanField(term1922127, term1922127.getClass(), "aiOnly", false);
        setField(term1922127, term1922127.getClass(), "difficultyLevel", null);
        setBooleanField(term1922127, term1922127.getClass(), "allNews", false);
        term1922150 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.GalaxyConfig");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1922150;
        callMethod(klass, "setEnableTutorial", argTypes, term1922127, args);
    }

};


