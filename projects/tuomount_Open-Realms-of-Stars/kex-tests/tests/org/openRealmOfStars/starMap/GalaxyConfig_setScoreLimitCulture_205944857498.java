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

public class GalaxyConfig_setScoreLimitCulture_205944857498 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1921603;
     Object term1921626;

    public GalaxyConfig_setScoreLimitCulture_205944857498() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1921603 = newInstance(Class.forName("org.openRealmOfStars.starMap.GalaxyConfig"));
        setIntField(term1921603, term1921603.getClass(), "sizeX", 0);
        setIntField(term1921603, term1921603.getClass(), "sizeY", 0);
        setIntField(term1921603, term1921603.getClass(), "galaxySizeIndex", 0);
        setIntField(term1921603, term1921603.getClass(), "maxPlayers", 0);
        setIntField(term1921603, term1921603.getClass(), "solarSystemDistance", 0);
        setIntField(term1921603, term1921603.getClass(), "sunDensityIndex", 0);
        setIntField(term1921603, term1921603.getClass(), "startingPosition", 0);
        setField(term1921603, term1921603.getClass(), "playerRaces", null);
        setField(term1921603, term1921603.getClass(), "playerName", null);
        setField(term1921603, term1921603.getClass(), "playerGovernment", null);
        setField(term1921603, term1921603.getClass(), "playerColors", null);
        setField(term1921603, term1921603.getClass(), "playerDifficult", null);
        setField(term1921603, term1921603.getClass(), "playerElderRealm", null);
        setField(term1921603, term1921603.getClass(), "startingScenario", null);
        setIntField(term1921603, term1921603.getClass(), "chanceForPlanetaryEvent", 0);
        setIntField(term1921603, term1921603.getClass(), "numberOfRoguePlanets", 0);
        setIntField(term1921603, term1921603.getClass(), "scoringVictoryTurns", 0);
        setIntField(term1921603, term1921603.getClass(), "scoringCulture", 0);
        setIntField(term1921603, term1921603.getClass(), "scoringConquer", 0);
        setIntField(term1921603, term1921603.getClass(), "scoringResearch", 0);
        setIntField(term1921603, term1921603.getClass(), "scoringDiplomacy", 0);
        setIntField(term1921603, term1921603.getClass(), "scoringPopulation", 0);
        setIntField(term1921603, term1921603.getClass(), "spacePiratesLevel", 0);
        setField(term1921603, term1921603.getClass(), "spacePiratesDifficulty", null);
        setField(term1921603, term1921603.getClass(), "karmaType", null);
        setIntField(term1921603, term1921603.getClass(), "karmaSpeed", 0);
        setIntField(term1921603, term1921603.getClass(), "spaceAnomaliesLevel", 0);
        setIntField(term1921603, term1921603.getClass(), "elderHeadStart", 0);
        setBooleanField(term1921603, term1921603.getClass(), "enableTutorial", false);
        setBooleanField(term1921603, term1921603.getClass(), "aiOnly", false);
        setField(term1921603, term1921603.getClass(), "difficultyLevel", null);
        setBooleanField(term1921603, term1921603.getClass(), "allNews", false);
        term1921626 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.GalaxyConfig");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1921626;
        callMethod(klass, "setScoreLimitCulture", argTypes, term1921603, args);
    }

};


