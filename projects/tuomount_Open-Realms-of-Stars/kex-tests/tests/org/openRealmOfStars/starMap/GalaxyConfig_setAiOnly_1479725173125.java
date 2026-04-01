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

public class GalaxyConfig_setAiOnly_1479725173125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1922246;
     Object term1922269;

    public GalaxyConfig_setAiOnly_1479725173125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1922246 = newInstance(Class.forName("org.openRealmOfStars.starMap.GalaxyConfig"));
        setIntField(term1922246, term1922246.getClass(), "sizeX", 0);
        setIntField(term1922246, term1922246.getClass(), "sizeY", 0);
        setIntField(term1922246, term1922246.getClass(), "galaxySizeIndex", 0);
        setIntField(term1922246, term1922246.getClass(), "maxPlayers", 0);
        setIntField(term1922246, term1922246.getClass(), "solarSystemDistance", 0);
        setIntField(term1922246, term1922246.getClass(), "sunDensityIndex", 0);
        setIntField(term1922246, term1922246.getClass(), "startingPosition", 0);
        setField(term1922246, term1922246.getClass(), "playerRaces", null);
        setField(term1922246, term1922246.getClass(), "playerName", null);
        setField(term1922246, term1922246.getClass(), "playerGovernment", null);
        setField(term1922246, term1922246.getClass(), "playerColors", null);
        setField(term1922246, term1922246.getClass(), "playerDifficult", null);
        setField(term1922246, term1922246.getClass(), "playerElderRealm", null);
        setField(term1922246, term1922246.getClass(), "startingScenario", null);
        setIntField(term1922246, term1922246.getClass(), "chanceForPlanetaryEvent", 0);
        setIntField(term1922246, term1922246.getClass(), "numberOfRoguePlanets", 0);
        setIntField(term1922246, term1922246.getClass(), "scoringVictoryTurns", 0);
        setIntField(term1922246, term1922246.getClass(), "scoringCulture", 0);
        setIntField(term1922246, term1922246.getClass(), "scoringConquer", 0);
        setIntField(term1922246, term1922246.getClass(), "scoringResearch", 0);
        setIntField(term1922246, term1922246.getClass(), "scoringDiplomacy", 0);
        setIntField(term1922246, term1922246.getClass(), "scoringPopulation", 0);
        setIntField(term1922246, term1922246.getClass(), "spacePiratesLevel", 0);
        setField(term1922246, term1922246.getClass(), "spacePiratesDifficulty", null);
        setField(term1922246, term1922246.getClass(), "karmaType", null);
        setIntField(term1922246, term1922246.getClass(), "karmaSpeed", 0);
        setIntField(term1922246, term1922246.getClass(), "spaceAnomaliesLevel", 0);
        setIntField(term1922246, term1922246.getClass(), "elderHeadStart", 0);
        setBooleanField(term1922246, term1922246.getClass(), "enableTutorial", false);
        setBooleanField(term1922246, term1922246.getClass(), "aiOnly", false);
        setField(term1922246, term1922246.getClass(), "difficultyLevel", null);
        setBooleanField(term1922246, term1922246.getClass(), "allNews", false);
        term1922269 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.GalaxyConfig");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1922269;
        callMethod(klass, "setAiOnly", argTypes, term1922246, args);
    }

};


