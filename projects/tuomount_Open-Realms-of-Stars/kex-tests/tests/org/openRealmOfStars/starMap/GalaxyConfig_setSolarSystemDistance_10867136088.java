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

public class GalaxyConfig_setSolarSystemDistance_10867136088 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1921363;
     Object term1921386;
     Object term1921388;

    public GalaxyConfig_setSolarSystemDistance_10867136088() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1921363 = newInstance(Class.forName("org.openRealmOfStars.starMap.GalaxyConfig"));
        setIntField(term1921363, term1921363.getClass(), "sizeX", 0);
        setIntField(term1921363, term1921363.getClass(), "sizeY", 0);
        setIntField(term1921363, term1921363.getClass(), "galaxySizeIndex", 0);
        setIntField(term1921363, term1921363.getClass(), "maxPlayers", 0);
        setIntField(term1921363, term1921363.getClass(), "solarSystemDistance", 0);
        setIntField(term1921363, term1921363.getClass(), "sunDensityIndex", 0);
        setIntField(term1921363, term1921363.getClass(), "startingPosition", 0);
        setField(term1921363, term1921363.getClass(), "playerRaces", null);
        setField(term1921363, term1921363.getClass(), "playerName", null);
        setField(term1921363, term1921363.getClass(), "playerGovernment", null);
        setField(term1921363, term1921363.getClass(), "playerColors", null);
        setField(term1921363, term1921363.getClass(), "playerDifficult", null);
        setField(term1921363, term1921363.getClass(), "playerElderRealm", null);
        setField(term1921363, term1921363.getClass(), "startingScenario", null);
        setIntField(term1921363, term1921363.getClass(), "chanceForPlanetaryEvent", 0);
        setIntField(term1921363, term1921363.getClass(), "numberOfRoguePlanets", 0);
        setIntField(term1921363, term1921363.getClass(), "scoringVictoryTurns", 0);
        setIntField(term1921363, term1921363.getClass(), "scoringCulture", 0);
        setIntField(term1921363, term1921363.getClass(), "scoringConquer", 0);
        setIntField(term1921363, term1921363.getClass(), "scoringResearch", 0);
        setIntField(term1921363, term1921363.getClass(), "scoringDiplomacy", 0);
        setIntField(term1921363, term1921363.getClass(), "scoringPopulation", 0);
        setIntField(term1921363, term1921363.getClass(), "spacePiratesLevel", 0);
        setField(term1921363, term1921363.getClass(), "spacePiratesDifficulty", null);
        setField(term1921363, term1921363.getClass(), "karmaType", null);
        setIntField(term1921363, term1921363.getClass(), "karmaSpeed", 0);
        setIntField(term1921363, term1921363.getClass(), "spaceAnomaliesLevel", 0);
        setIntField(term1921363, term1921363.getClass(), "elderHeadStart", 0);
        setBooleanField(term1921363, term1921363.getClass(), "enableTutorial", false);
        setBooleanField(term1921363, term1921363.getClass(), "aiOnly", false);
        setField(term1921363, term1921363.getClass(), "difficultyLevel", null);
        setBooleanField(term1921363, term1921363.getClass(), "allNews", false);
        term1921386 = new Integer(0);
        term1921388 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.GalaxyConfig");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1921386;
        args[1] = term1921388;
        callMethod(klass, "setSolarSystemDistance", argTypes, term1921363, args);
    }

};


