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

public class GalaxyConfig_getRace_36382629869 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1920892;
     Object term1920915;

    public GalaxyConfig_getRace_36382629869() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1920892 = newInstance(Class.forName("org.openRealmOfStars.starMap.GalaxyConfig"));
        setIntField(term1920892, term1920892.getClass(), "sizeX", 0);
        setIntField(term1920892, term1920892.getClass(), "sizeY", 0);
        setIntField(term1920892, term1920892.getClass(), "galaxySizeIndex", 0);
        setIntField(term1920892, term1920892.getClass(), "maxPlayers", 0);
        setIntField(term1920892, term1920892.getClass(), "solarSystemDistance", 0);
        setIntField(term1920892, term1920892.getClass(), "sunDensityIndex", 0);
        setIntField(term1920892, term1920892.getClass(), "startingPosition", 0);
        setField(term1920892, term1920892.getClass(), "playerRaces", null);
        setField(term1920892, term1920892.getClass(), "playerName", null);
        setField(term1920892, term1920892.getClass(), "playerGovernment", null);
        setField(term1920892, term1920892.getClass(), "playerColors", null);
        setField(term1920892, term1920892.getClass(), "playerDifficult", null);
        setField(term1920892, term1920892.getClass(), "playerElderRealm", null);
        setField(term1920892, term1920892.getClass(), "startingScenario", null);
        setIntField(term1920892, term1920892.getClass(), "chanceForPlanetaryEvent", 0);
        setIntField(term1920892, term1920892.getClass(), "numberOfRoguePlanets", 0);
        setIntField(term1920892, term1920892.getClass(), "scoringVictoryTurns", 0);
        setIntField(term1920892, term1920892.getClass(), "scoringCulture", 0);
        setIntField(term1920892, term1920892.getClass(), "scoringConquer", 0);
        setIntField(term1920892, term1920892.getClass(), "scoringResearch", 0);
        setIntField(term1920892, term1920892.getClass(), "scoringDiplomacy", 0);
        setIntField(term1920892, term1920892.getClass(), "scoringPopulation", 0);
        setIntField(term1920892, term1920892.getClass(), "spacePiratesLevel", 0);
        setField(term1920892, term1920892.getClass(), "spacePiratesDifficulty", null);
        setField(term1920892, term1920892.getClass(), "karmaType", null);
        setIntField(term1920892, term1920892.getClass(), "karmaSpeed", 0);
        setIntField(term1920892, term1920892.getClass(), "spaceAnomaliesLevel", 0);
        setIntField(term1920892, term1920892.getClass(), "elderHeadStart", 0);
        setBooleanField(term1920892, term1920892.getClass(), "enableTutorial", false);
        setBooleanField(term1920892, term1920892.getClass(), "aiOnly", false);
        setField(term1920892, term1920892.getClass(), "difficultyLevel", null);
        setBooleanField(term1920892, term1920892.getClass(), "allNews", false);
        term1920915 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.GalaxyConfig");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1920915;
        callMethod(klass, "getRace", argTypes, term1920892, args);
    }

};


