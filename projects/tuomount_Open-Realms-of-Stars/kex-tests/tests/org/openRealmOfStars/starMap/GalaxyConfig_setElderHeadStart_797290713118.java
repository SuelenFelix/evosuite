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

public class GalaxyConfig_setElderHeadStart_797290713118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1922079;
     Object term1922102;

    public GalaxyConfig_setElderHeadStart_797290713118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1922079 = newInstance(Class.forName("org.openRealmOfStars.starMap.GalaxyConfig"));
        setIntField(term1922079, term1922079.getClass(), "sizeX", 0);
        setIntField(term1922079, term1922079.getClass(), "sizeY", 0);
        setIntField(term1922079, term1922079.getClass(), "galaxySizeIndex", 0);
        setIntField(term1922079, term1922079.getClass(), "maxPlayers", 0);
        setIntField(term1922079, term1922079.getClass(), "solarSystemDistance", 0);
        setIntField(term1922079, term1922079.getClass(), "sunDensityIndex", 0);
        setIntField(term1922079, term1922079.getClass(), "startingPosition", 0);
        setField(term1922079, term1922079.getClass(), "playerRaces", null);
        setField(term1922079, term1922079.getClass(), "playerName", null);
        setField(term1922079, term1922079.getClass(), "playerGovernment", null);
        setField(term1922079, term1922079.getClass(), "playerColors", null);
        setField(term1922079, term1922079.getClass(), "playerDifficult", null);
        setField(term1922079, term1922079.getClass(), "playerElderRealm", null);
        setField(term1922079, term1922079.getClass(), "startingScenario", null);
        setIntField(term1922079, term1922079.getClass(), "chanceForPlanetaryEvent", 0);
        setIntField(term1922079, term1922079.getClass(), "numberOfRoguePlanets", 0);
        setIntField(term1922079, term1922079.getClass(), "scoringVictoryTurns", 0);
        setIntField(term1922079, term1922079.getClass(), "scoringCulture", 0);
        setIntField(term1922079, term1922079.getClass(), "scoringConquer", 0);
        setIntField(term1922079, term1922079.getClass(), "scoringResearch", 0);
        setIntField(term1922079, term1922079.getClass(), "scoringDiplomacy", 0);
        setIntField(term1922079, term1922079.getClass(), "scoringPopulation", 0);
        setIntField(term1922079, term1922079.getClass(), "spacePiratesLevel", 0);
        setField(term1922079, term1922079.getClass(), "spacePiratesDifficulty", null);
        setField(term1922079, term1922079.getClass(), "karmaType", null);
        setIntField(term1922079, term1922079.getClass(), "karmaSpeed", 0);
        setIntField(term1922079, term1922079.getClass(), "spaceAnomaliesLevel", 0);
        setIntField(term1922079, term1922079.getClass(), "elderHeadStart", 0);
        setBooleanField(term1922079, term1922079.getClass(), "enableTutorial", false);
        setBooleanField(term1922079, term1922079.getClass(), "aiOnly", false);
        setField(term1922079, term1922079.getClass(), "difficultyLevel", null);
        setBooleanField(term1922079, term1922079.getClass(), "allNews", false);
        term1922102 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.GalaxyConfig");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1922102;
        callMethod(klass, "setElderHeadStart", argTypes, term1922079, args);
    }

};


