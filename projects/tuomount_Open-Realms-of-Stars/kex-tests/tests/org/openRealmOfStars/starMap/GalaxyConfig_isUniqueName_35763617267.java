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

public class GalaxyConfig_isUniqueName_35763617267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1920844;

    public GalaxyConfig_isUniqueName_35763617267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1920844 = newInstance(Class.forName("org.openRealmOfStars.starMap.GalaxyConfig"));
        setIntField(term1920844, term1920844.getClass(), "sizeX", 0);
        setIntField(term1920844, term1920844.getClass(), "sizeY", 0);
        setIntField(term1920844, term1920844.getClass(), "galaxySizeIndex", 0);
        setIntField(term1920844, term1920844.getClass(), "maxPlayers", 0);
        setIntField(term1920844, term1920844.getClass(), "solarSystemDistance", 0);
        setIntField(term1920844, term1920844.getClass(), "sunDensityIndex", 0);
        setIntField(term1920844, term1920844.getClass(), "startingPosition", 0);
        setField(term1920844, term1920844.getClass(), "playerRaces", null);
        setField(term1920844, term1920844.getClass(), "playerName", null);
        setField(term1920844, term1920844.getClass(), "playerGovernment", null);
        setField(term1920844, term1920844.getClass(), "playerColors", null);
        setField(term1920844, term1920844.getClass(), "playerDifficult", null);
        setField(term1920844, term1920844.getClass(), "playerElderRealm", null);
        setField(term1920844, term1920844.getClass(), "startingScenario", null);
        setIntField(term1920844, term1920844.getClass(), "chanceForPlanetaryEvent", 0);
        setIntField(term1920844, term1920844.getClass(), "numberOfRoguePlanets", 0);
        setIntField(term1920844, term1920844.getClass(), "scoringVictoryTurns", 0);
        setIntField(term1920844, term1920844.getClass(), "scoringCulture", 0);
        setIntField(term1920844, term1920844.getClass(), "scoringConquer", 0);
        setIntField(term1920844, term1920844.getClass(), "scoringResearch", 0);
        setIntField(term1920844, term1920844.getClass(), "scoringDiplomacy", 0);
        setIntField(term1920844, term1920844.getClass(), "scoringPopulation", 0);
        setIntField(term1920844, term1920844.getClass(), "spacePiratesLevel", 0);
        setField(term1920844, term1920844.getClass(), "spacePiratesDifficulty", null);
        setField(term1920844, term1920844.getClass(), "karmaType", null);
        setIntField(term1920844, term1920844.getClass(), "karmaSpeed", 0);
        setIntField(term1920844, term1920844.getClass(), "spaceAnomaliesLevel", 0);
        setIntField(term1920844, term1920844.getClass(), "elderHeadStart", 0);
        setBooleanField(term1920844, term1920844.getClass(), "enableTutorial", false);
        setBooleanField(term1920844, term1920844.getClass(), "aiOnly", false);
        setField(term1920844, term1920844.getClass(), "difficultyLevel", null);
        setBooleanField(term1920844, term1920844.getClass(), "allNews", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.GalaxyConfig");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "isUniqueName", argTypes, term1920844, args);
    }

};


