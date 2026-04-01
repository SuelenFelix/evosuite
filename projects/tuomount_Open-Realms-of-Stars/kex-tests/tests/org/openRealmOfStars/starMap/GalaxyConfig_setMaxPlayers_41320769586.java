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

public class GalaxyConfig_setMaxPlayers_41320769586 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1921315;
     Object term1921338;

    public GalaxyConfig_setMaxPlayers_41320769586() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1921315 = newInstance(Class.forName("org.openRealmOfStars.starMap.GalaxyConfig"));
        setIntField(term1921315, term1921315.getClass(), "sizeX", 0);
        setIntField(term1921315, term1921315.getClass(), "sizeY", 0);
        setIntField(term1921315, term1921315.getClass(), "galaxySizeIndex", 0);
        setIntField(term1921315, term1921315.getClass(), "maxPlayers", 0);
        setIntField(term1921315, term1921315.getClass(), "solarSystemDistance", 0);
        setIntField(term1921315, term1921315.getClass(), "sunDensityIndex", 0);
        setIntField(term1921315, term1921315.getClass(), "startingPosition", 0);
        setField(term1921315, term1921315.getClass(), "playerRaces", null);
        setField(term1921315, term1921315.getClass(), "playerName", null);
        setField(term1921315, term1921315.getClass(), "playerGovernment", null);
        setField(term1921315, term1921315.getClass(), "playerColors", null);
        setField(term1921315, term1921315.getClass(), "playerDifficult", null);
        setField(term1921315, term1921315.getClass(), "playerElderRealm", null);
        setField(term1921315, term1921315.getClass(), "startingScenario", null);
        setIntField(term1921315, term1921315.getClass(), "chanceForPlanetaryEvent", 0);
        setIntField(term1921315, term1921315.getClass(), "numberOfRoguePlanets", 0);
        setIntField(term1921315, term1921315.getClass(), "scoringVictoryTurns", 0);
        setIntField(term1921315, term1921315.getClass(), "scoringCulture", 0);
        setIntField(term1921315, term1921315.getClass(), "scoringConquer", 0);
        setIntField(term1921315, term1921315.getClass(), "scoringResearch", 0);
        setIntField(term1921315, term1921315.getClass(), "scoringDiplomacy", 0);
        setIntField(term1921315, term1921315.getClass(), "scoringPopulation", 0);
        setIntField(term1921315, term1921315.getClass(), "spacePiratesLevel", 0);
        setField(term1921315, term1921315.getClass(), "spacePiratesDifficulty", null);
        setField(term1921315, term1921315.getClass(), "karmaType", null);
        setIntField(term1921315, term1921315.getClass(), "karmaSpeed", 0);
        setIntField(term1921315, term1921315.getClass(), "spaceAnomaliesLevel", 0);
        setIntField(term1921315, term1921315.getClass(), "elderHeadStart", 0);
        setBooleanField(term1921315, term1921315.getClass(), "enableTutorial", false);
        setBooleanField(term1921315, term1921315.getClass(), "aiOnly", false);
        setField(term1921315, term1921315.getClass(), "difficultyLevel", null);
        setBooleanField(term1921315, term1921315.getClass(), "allNews", false);
        term1921338 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.GalaxyConfig");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1921338;
        callMethod(klass, "setMaxPlayers", argTypes, term1921315, args);
    }

};


