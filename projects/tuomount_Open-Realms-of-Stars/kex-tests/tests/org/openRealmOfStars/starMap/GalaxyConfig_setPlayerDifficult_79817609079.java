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

public class GalaxyConfig_setPlayerDifficult_79817609079 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1921142;
     Object term1921165;

    public GalaxyConfig_setPlayerDifficult_79817609079() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1921142 = newInstance(Class.forName("org.openRealmOfStars.starMap.GalaxyConfig"));
        setIntField(term1921142, term1921142.getClass(), "sizeX", 0);
        setIntField(term1921142, term1921142.getClass(), "sizeY", 0);
        setIntField(term1921142, term1921142.getClass(), "galaxySizeIndex", 0);
        setIntField(term1921142, term1921142.getClass(), "maxPlayers", 0);
        setIntField(term1921142, term1921142.getClass(), "solarSystemDistance", 0);
        setIntField(term1921142, term1921142.getClass(), "sunDensityIndex", 0);
        setIntField(term1921142, term1921142.getClass(), "startingPosition", 0);
        setField(term1921142, term1921142.getClass(), "playerRaces", null);
        setField(term1921142, term1921142.getClass(), "playerName", null);
        setField(term1921142, term1921142.getClass(), "playerGovernment", null);
        setField(term1921142, term1921142.getClass(), "playerColors", null);
        setField(term1921142, term1921142.getClass(), "playerDifficult", null);
        setField(term1921142, term1921142.getClass(), "playerElderRealm", null);
        setField(term1921142, term1921142.getClass(), "startingScenario", null);
        setIntField(term1921142, term1921142.getClass(), "chanceForPlanetaryEvent", 0);
        setIntField(term1921142, term1921142.getClass(), "numberOfRoguePlanets", 0);
        setIntField(term1921142, term1921142.getClass(), "scoringVictoryTurns", 0);
        setIntField(term1921142, term1921142.getClass(), "scoringCulture", 0);
        setIntField(term1921142, term1921142.getClass(), "scoringConquer", 0);
        setIntField(term1921142, term1921142.getClass(), "scoringResearch", 0);
        setIntField(term1921142, term1921142.getClass(), "scoringDiplomacy", 0);
        setIntField(term1921142, term1921142.getClass(), "scoringPopulation", 0);
        setIntField(term1921142, term1921142.getClass(), "spacePiratesLevel", 0);
        setField(term1921142, term1921142.getClass(), "spacePiratesDifficulty", null);
        setField(term1921142, term1921142.getClass(), "karmaType", null);
        setIntField(term1921142, term1921142.getClass(), "karmaSpeed", 0);
        setIntField(term1921142, term1921142.getClass(), "spaceAnomaliesLevel", 0);
        setIntField(term1921142, term1921142.getClass(), "elderHeadStart", 0);
        setBooleanField(term1921142, term1921142.getClass(), "enableTutorial", false);
        setBooleanField(term1921142, term1921142.getClass(), "aiOnly", false);
        setField(term1921142, term1921142.getClass(), "difficultyLevel", null);
        setBooleanField(term1921142, term1921142.getClass(), "allNews", false);
        term1921165 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.GalaxyConfig");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("org.openRealmOfStars.player.AiDifficulty");
        Object[] args = new Object[2];
        args[0] = term1921165;
        args[1] = null;
        callMethod(klass, "setPlayerDifficult", argTypes, term1921142, args);
    }

};


