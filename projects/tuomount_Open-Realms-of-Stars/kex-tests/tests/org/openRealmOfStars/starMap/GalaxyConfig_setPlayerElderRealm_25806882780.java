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
import java.lang.Boolean;

public class GalaxyConfig_setPlayerElderRealm_25806882780 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1921167;
     Object term1921190;
     Object term1921192;

    public GalaxyConfig_setPlayerElderRealm_25806882780() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1921167 = newInstance(Class.forName("org.openRealmOfStars.starMap.GalaxyConfig"));
        setIntField(term1921167, term1921167.getClass(), "sizeX", 0);
        setIntField(term1921167, term1921167.getClass(), "sizeY", 0);
        setIntField(term1921167, term1921167.getClass(), "galaxySizeIndex", 0);
        setIntField(term1921167, term1921167.getClass(), "maxPlayers", 0);
        setIntField(term1921167, term1921167.getClass(), "solarSystemDistance", 0);
        setIntField(term1921167, term1921167.getClass(), "sunDensityIndex", 0);
        setIntField(term1921167, term1921167.getClass(), "startingPosition", 0);
        setField(term1921167, term1921167.getClass(), "playerRaces", null);
        setField(term1921167, term1921167.getClass(), "playerName", null);
        setField(term1921167, term1921167.getClass(), "playerGovernment", null);
        setField(term1921167, term1921167.getClass(), "playerColors", null);
        setField(term1921167, term1921167.getClass(), "playerDifficult", null);
        setField(term1921167, term1921167.getClass(), "playerElderRealm", null);
        setField(term1921167, term1921167.getClass(), "startingScenario", null);
        setIntField(term1921167, term1921167.getClass(), "chanceForPlanetaryEvent", 0);
        setIntField(term1921167, term1921167.getClass(), "numberOfRoguePlanets", 0);
        setIntField(term1921167, term1921167.getClass(), "scoringVictoryTurns", 0);
        setIntField(term1921167, term1921167.getClass(), "scoringCulture", 0);
        setIntField(term1921167, term1921167.getClass(), "scoringConquer", 0);
        setIntField(term1921167, term1921167.getClass(), "scoringResearch", 0);
        setIntField(term1921167, term1921167.getClass(), "scoringDiplomacy", 0);
        setIntField(term1921167, term1921167.getClass(), "scoringPopulation", 0);
        setIntField(term1921167, term1921167.getClass(), "spacePiratesLevel", 0);
        setField(term1921167, term1921167.getClass(), "spacePiratesDifficulty", null);
        setField(term1921167, term1921167.getClass(), "karmaType", null);
        setIntField(term1921167, term1921167.getClass(), "karmaSpeed", 0);
        setIntField(term1921167, term1921167.getClass(), "spaceAnomaliesLevel", 0);
        setIntField(term1921167, term1921167.getClass(), "elderHeadStart", 0);
        setBooleanField(term1921167, term1921167.getClass(), "enableTutorial", false);
        setBooleanField(term1921167, term1921167.getClass(), "aiOnly", false);
        setField(term1921167, term1921167.getClass(), "difficultyLevel", null);
        setBooleanField(term1921167, term1921167.getClass(), "allNews", false);
        term1921190 = new Integer(0);
        term1921192 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.GalaxyConfig");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term1921190;
        args[1] = term1921192;
        callMethod(klass, "setPlayerElderRealm", argTypes, term1921167, args);
    }

};


