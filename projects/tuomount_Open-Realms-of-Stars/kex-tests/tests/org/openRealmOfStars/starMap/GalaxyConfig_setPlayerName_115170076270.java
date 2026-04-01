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

public class GalaxyConfig_setPlayerName_115170076270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1920917;
     Object term1920940;

    public GalaxyConfig_setPlayerName_115170076270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1920917 = newInstance(Class.forName("org.openRealmOfStars.starMap.GalaxyConfig"));
        setIntField(term1920917, term1920917.getClass(), "sizeX", 0);
        setIntField(term1920917, term1920917.getClass(), "sizeY", 0);
        setIntField(term1920917, term1920917.getClass(), "galaxySizeIndex", 0);
        setIntField(term1920917, term1920917.getClass(), "maxPlayers", 0);
        setIntField(term1920917, term1920917.getClass(), "solarSystemDistance", 0);
        setIntField(term1920917, term1920917.getClass(), "sunDensityIndex", 0);
        setIntField(term1920917, term1920917.getClass(), "startingPosition", 0);
        setField(term1920917, term1920917.getClass(), "playerRaces", null);
        setField(term1920917, term1920917.getClass(), "playerName", null);
        setField(term1920917, term1920917.getClass(), "playerGovernment", null);
        setField(term1920917, term1920917.getClass(), "playerColors", null);
        setField(term1920917, term1920917.getClass(), "playerDifficult", null);
        setField(term1920917, term1920917.getClass(), "playerElderRealm", null);
        setField(term1920917, term1920917.getClass(), "startingScenario", null);
        setIntField(term1920917, term1920917.getClass(), "chanceForPlanetaryEvent", 0);
        setIntField(term1920917, term1920917.getClass(), "numberOfRoguePlanets", 0);
        setIntField(term1920917, term1920917.getClass(), "scoringVictoryTurns", 0);
        setIntField(term1920917, term1920917.getClass(), "scoringCulture", 0);
        setIntField(term1920917, term1920917.getClass(), "scoringConquer", 0);
        setIntField(term1920917, term1920917.getClass(), "scoringResearch", 0);
        setIntField(term1920917, term1920917.getClass(), "scoringDiplomacy", 0);
        setIntField(term1920917, term1920917.getClass(), "scoringPopulation", 0);
        setIntField(term1920917, term1920917.getClass(), "spacePiratesLevel", 0);
        setField(term1920917, term1920917.getClass(), "spacePiratesDifficulty", null);
        setField(term1920917, term1920917.getClass(), "karmaType", null);
        setIntField(term1920917, term1920917.getClass(), "karmaSpeed", 0);
        setIntField(term1920917, term1920917.getClass(), "spaceAnomaliesLevel", 0);
        setIntField(term1920917, term1920917.getClass(), "elderHeadStart", 0);
        setBooleanField(term1920917, term1920917.getClass(), "enableTutorial", false);
        setBooleanField(term1920917, term1920917.getClass(), "aiOnly", false);
        setField(term1920917, term1920917.getClass(), "difficultyLevel", null);
        setBooleanField(term1920917, term1920917.getClass(), "allNews", false);
        term1920940 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.GalaxyConfig");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term1920940;
        args[1] = null;
        callMethod(klass, "setPlayerName", argTypes, term1920917, args);
    }

};


