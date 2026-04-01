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
import java.lang.Integer;

public class GalaxyConfig_setScoreLimitPopulation_1996035287123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1922198;
     Object term1922221;

    public GalaxyConfig_setScoreLimitPopulation_1996035287123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1922198 = newInstance(Class.forName("org.openRealmOfStars.starMap.GalaxyConfig"));
        setIntField(term1922198, term1922198.getClass(), "sizeX", 0);
        setIntField(term1922198, term1922198.getClass(), "sizeY", 0);
        setIntField(term1922198, term1922198.getClass(), "galaxySizeIndex", 0);
        setIntField(term1922198, term1922198.getClass(), "maxPlayers", 0);
        setIntField(term1922198, term1922198.getClass(), "solarSystemDistance", 0);
        setIntField(term1922198, term1922198.getClass(), "sunDensityIndex", 0);
        setIntField(term1922198, term1922198.getClass(), "startingPosition", 0);
        setField(term1922198, term1922198.getClass(), "playerRaces", null);
        setField(term1922198, term1922198.getClass(), "playerName", null);
        setField(term1922198, term1922198.getClass(), "playerGovernment", null);
        setField(term1922198, term1922198.getClass(), "playerColors", null);
        setField(term1922198, term1922198.getClass(), "playerDifficult", null);
        setField(term1922198, term1922198.getClass(), "playerElderRealm", null);
        setField(term1922198, term1922198.getClass(), "startingScenario", null);
        setIntField(term1922198, term1922198.getClass(), "chanceForPlanetaryEvent", 0);
        setIntField(term1922198, term1922198.getClass(), "numberOfRoguePlanets", 0);
        setIntField(term1922198, term1922198.getClass(), "scoringVictoryTurns", 0);
        setIntField(term1922198, term1922198.getClass(), "scoringCulture", 0);
        setIntField(term1922198, term1922198.getClass(), "scoringConquer", 0);
        setIntField(term1922198, term1922198.getClass(), "scoringResearch", 0);
        setIntField(term1922198, term1922198.getClass(), "scoringDiplomacy", 0);
        setIntField(term1922198, term1922198.getClass(), "scoringPopulation", 0);
        setIntField(term1922198, term1922198.getClass(), "spacePiratesLevel", 0);
        setField(term1922198, term1922198.getClass(), "spacePiratesDifficulty", null);
        setField(term1922198, term1922198.getClass(), "karmaType", null);
        setIntField(term1922198, term1922198.getClass(), "karmaSpeed", 0);
        setIntField(term1922198, term1922198.getClass(), "spaceAnomaliesLevel", 0);
        setIntField(term1922198, term1922198.getClass(), "elderHeadStart", 0);
        setBooleanField(term1922198, term1922198.getClass(), "enableTutorial", false);
        setBooleanField(term1922198, term1922198.getClass(), "aiOnly", false);
        setField(term1922198, term1922198.getClass(), "difficultyLevel", null);
        setBooleanField(term1922198, term1922198.getClass(), "allNews", false);
        term1922221 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.GalaxyConfig");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1922221;
        callMethod(klass, "setScoreLimitPopulation", argTypes, term1922198, args);
    }

};


