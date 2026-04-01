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

public class GalaxyConfig_setChanceForPlanetaryEvent_69285782094 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1921507;
     Object term1921530;

    public GalaxyConfig_setChanceForPlanetaryEvent_69285782094() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1921507 = newInstance(Class.forName("org.openRealmOfStars.starMap.GalaxyConfig"));
        setIntField(term1921507, term1921507.getClass(), "sizeX", 0);
        setIntField(term1921507, term1921507.getClass(), "sizeY", 0);
        setIntField(term1921507, term1921507.getClass(), "galaxySizeIndex", 0);
        setIntField(term1921507, term1921507.getClass(), "maxPlayers", 0);
        setIntField(term1921507, term1921507.getClass(), "solarSystemDistance", 0);
        setIntField(term1921507, term1921507.getClass(), "sunDensityIndex", 0);
        setIntField(term1921507, term1921507.getClass(), "startingPosition", 0);
        setField(term1921507, term1921507.getClass(), "playerRaces", null);
        setField(term1921507, term1921507.getClass(), "playerName", null);
        setField(term1921507, term1921507.getClass(), "playerGovernment", null);
        setField(term1921507, term1921507.getClass(), "playerColors", null);
        setField(term1921507, term1921507.getClass(), "playerDifficult", null);
        setField(term1921507, term1921507.getClass(), "playerElderRealm", null);
        setField(term1921507, term1921507.getClass(), "startingScenario", null);
        setIntField(term1921507, term1921507.getClass(), "chanceForPlanetaryEvent", 0);
        setIntField(term1921507, term1921507.getClass(), "numberOfRoguePlanets", 0);
        setIntField(term1921507, term1921507.getClass(), "scoringVictoryTurns", 0);
        setIntField(term1921507, term1921507.getClass(), "scoringCulture", 0);
        setIntField(term1921507, term1921507.getClass(), "scoringConquer", 0);
        setIntField(term1921507, term1921507.getClass(), "scoringResearch", 0);
        setIntField(term1921507, term1921507.getClass(), "scoringDiplomacy", 0);
        setIntField(term1921507, term1921507.getClass(), "scoringPopulation", 0);
        setIntField(term1921507, term1921507.getClass(), "spacePiratesLevel", 0);
        setField(term1921507, term1921507.getClass(), "spacePiratesDifficulty", null);
        setField(term1921507, term1921507.getClass(), "karmaType", null);
        setIntField(term1921507, term1921507.getClass(), "karmaSpeed", 0);
        setIntField(term1921507, term1921507.getClass(), "spaceAnomaliesLevel", 0);
        setIntField(term1921507, term1921507.getClass(), "elderHeadStart", 0);
        setBooleanField(term1921507, term1921507.getClass(), "enableTutorial", false);
        setBooleanField(term1921507, term1921507.getClass(), "aiOnly", false);
        setField(term1921507, term1921507.getClass(), "difficultyLevel", null);
        setBooleanField(term1921507, term1921507.getClass(), "allNews", false);
        term1921530 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.GalaxyConfig");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1921530;
        callMethod(klass, "setChanceForPlanetaryEvent", argTypes, term1921507, args);
    }

};


