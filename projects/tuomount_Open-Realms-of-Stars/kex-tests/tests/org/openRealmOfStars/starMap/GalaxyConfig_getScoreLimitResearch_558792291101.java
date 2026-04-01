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

public class GalaxyConfig_getScoreLimitResearch_558792291101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1921676;

    public GalaxyConfig_getScoreLimitResearch_558792291101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1921676 = newInstance(Class.forName("org.openRealmOfStars.starMap.GalaxyConfig"));
        setIntField(term1921676, term1921676.getClass(), "sizeX", 0);
        setIntField(term1921676, term1921676.getClass(), "sizeY", 0);
        setIntField(term1921676, term1921676.getClass(), "galaxySizeIndex", 0);
        setIntField(term1921676, term1921676.getClass(), "maxPlayers", 0);
        setIntField(term1921676, term1921676.getClass(), "solarSystemDistance", 0);
        setIntField(term1921676, term1921676.getClass(), "sunDensityIndex", 0);
        setIntField(term1921676, term1921676.getClass(), "startingPosition", 0);
        setField(term1921676, term1921676.getClass(), "playerRaces", null);
        setField(term1921676, term1921676.getClass(), "playerName", null);
        setField(term1921676, term1921676.getClass(), "playerGovernment", null);
        setField(term1921676, term1921676.getClass(), "playerColors", null);
        setField(term1921676, term1921676.getClass(), "playerDifficult", null);
        setField(term1921676, term1921676.getClass(), "playerElderRealm", null);
        setField(term1921676, term1921676.getClass(), "startingScenario", null);
        setIntField(term1921676, term1921676.getClass(), "chanceForPlanetaryEvent", 0);
        setIntField(term1921676, term1921676.getClass(), "numberOfRoguePlanets", 0);
        setIntField(term1921676, term1921676.getClass(), "scoringVictoryTurns", 0);
        setIntField(term1921676, term1921676.getClass(), "scoringCulture", 0);
        setIntField(term1921676, term1921676.getClass(), "scoringConquer", 0);
        setIntField(term1921676, term1921676.getClass(), "scoringResearch", 0);
        setIntField(term1921676, term1921676.getClass(), "scoringDiplomacy", 0);
        setIntField(term1921676, term1921676.getClass(), "scoringPopulation", 0);
        setIntField(term1921676, term1921676.getClass(), "spacePiratesLevel", 0);
        setField(term1921676, term1921676.getClass(), "spacePiratesDifficulty", null);
        setField(term1921676, term1921676.getClass(), "karmaType", null);
        setIntField(term1921676, term1921676.getClass(), "karmaSpeed", 0);
        setIntField(term1921676, term1921676.getClass(), "spaceAnomaliesLevel", 0);
        setIntField(term1921676, term1921676.getClass(), "elderHeadStart", 0);
        setBooleanField(term1921676, term1921676.getClass(), "enableTutorial", false);
        setBooleanField(term1921676, term1921676.getClass(), "aiOnly", false);
        setField(term1921676, term1921676.getClass(), "difficultyLevel", null);
        setBooleanField(term1921676, term1921676.getClass(), "allNews", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.GalaxyConfig");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScoreLimitResearch", argTypes, term1921676, args);
    }

};


