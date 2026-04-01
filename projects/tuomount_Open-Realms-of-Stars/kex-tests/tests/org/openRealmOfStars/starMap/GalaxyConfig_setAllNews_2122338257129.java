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

public class GalaxyConfig_setAllNews_2122338257129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1922340;
     Object term1922363;

    public GalaxyConfig_setAllNews_2122338257129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1922340 = newInstance(Class.forName("org.openRealmOfStars.starMap.GalaxyConfig"));
        setIntField(term1922340, term1922340.getClass(), "sizeX", 0);
        setIntField(term1922340, term1922340.getClass(), "sizeY", 0);
        setIntField(term1922340, term1922340.getClass(), "galaxySizeIndex", 0);
        setIntField(term1922340, term1922340.getClass(), "maxPlayers", 0);
        setIntField(term1922340, term1922340.getClass(), "solarSystemDistance", 0);
        setIntField(term1922340, term1922340.getClass(), "sunDensityIndex", 0);
        setIntField(term1922340, term1922340.getClass(), "startingPosition", 0);
        setField(term1922340, term1922340.getClass(), "playerRaces", null);
        setField(term1922340, term1922340.getClass(), "playerName", null);
        setField(term1922340, term1922340.getClass(), "playerGovernment", null);
        setField(term1922340, term1922340.getClass(), "playerColors", null);
        setField(term1922340, term1922340.getClass(), "playerDifficult", null);
        setField(term1922340, term1922340.getClass(), "playerElderRealm", null);
        setField(term1922340, term1922340.getClass(), "startingScenario", null);
        setIntField(term1922340, term1922340.getClass(), "chanceForPlanetaryEvent", 0);
        setIntField(term1922340, term1922340.getClass(), "numberOfRoguePlanets", 0);
        setIntField(term1922340, term1922340.getClass(), "scoringVictoryTurns", 0);
        setIntField(term1922340, term1922340.getClass(), "scoringCulture", 0);
        setIntField(term1922340, term1922340.getClass(), "scoringConquer", 0);
        setIntField(term1922340, term1922340.getClass(), "scoringResearch", 0);
        setIntField(term1922340, term1922340.getClass(), "scoringDiplomacy", 0);
        setIntField(term1922340, term1922340.getClass(), "scoringPopulation", 0);
        setIntField(term1922340, term1922340.getClass(), "spacePiratesLevel", 0);
        setField(term1922340, term1922340.getClass(), "spacePiratesDifficulty", null);
        setField(term1922340, term1922340.getClass(), "karmaType", null);
        setIntField(term1922340, term1922340.getClass(), "karmaSpeed", 0);
        setIntField(term1922340, term1922340.getClass(), "spaceAnomaliesLevel", 0);
        setIntField(term1922340, term1922340.getClass(), "elderHeadStart", 0);
        setBooleanField(term1922340, term1922340.getClass(), "enableTutorial", false);
        setBooleanField(term1922340, term1922340.getClass(), "aiOnly", false);
        setField(term1922340, term1922340.getClass(), "difficultyLevel", null);
        setBooleanField(term1922340, term1922340.getClass(), "allNews", false);
        term1922363 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.GalaxyConfig");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1922363;
        callMethod(klass, "setAllNews", argTypes, term1922340, args);
    }

};


