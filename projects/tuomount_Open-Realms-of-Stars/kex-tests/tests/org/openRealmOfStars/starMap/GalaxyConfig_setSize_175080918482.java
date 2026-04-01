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

public class GalaxyConfig_setSize_175080918482 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1921219;
     Object term1921242;
     Object term1921244;

    public GalaxyConfig_setSize_175080918482() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1921219 = newInstance(Class.forName("org.openRealmOfStars.starMap.GalaxyConfig"));
        setIntField(term1921219, term1921219.getClass(), "sizeX", 0);
        setIntField(term1921219, term1921219.getClass(), "sizeY", 0);
        setIntField(term1921219, term1921219.getClass(), "galaxySizeIndex", 0);
        setIntField(term1921219, term1921219.getClass(), "maxPlayers", 0);
        setIntField(term1921219, term1921219.getClass(), "solarSystemDistance", 0);
        setIntField(term1921219, term1921219.getClass(), "sunDensityIndex", 0);
        setIntField(term1921219, term1921219.getClass(), "startingPosition", 0);
        setField(term1921219, term1921219.getClass(), "playerRaces", null);
        setField(term1921219, term1921219.getClass(), "playerName", null);
        setField(term1921219, term1921219.getClass(), "playerGovernment", null);
        setField(term1921219, term1921219.getClass(), "playerColors", null);
        setField(term1921219, term1921219.getClass(), "playerDifficult", null);
        setField(term1921219, term1921219.getClass(), "playerElderRealm", null);
        setField(term1921219, term1921219.getClass(), "startingScenario", null);
        setIntField(term1921219, term1921219.getClass(), "chanceForPlanetaryEvent", 0);
        setIntField(term1921219, term1921219.getClass(), "numberOfRoguePlanets", 0);
        setIntField(term1921219, term1921219.getClass(), "scoringVictoryTurns", 0);
        setIntField(term1921219, term1921219.getClass(), "scoringCulture", 0);
        setIntField(term1921219, term1921219.getClass(), "scoringConquer", 0);
        setIntField(term1921219, term1921219.getClass(), "scoringResearch", 0);
        setIntField(term1921219, term1921219.getClass(), "scoringDiplomacy", 0);
        setIntField(term1921219, term1921219.getClass(), "scoringPopulation", 0);
        setIntField(term1921219, term1921219.getClass(), "spacePiratesLevel", 0);
        setField(term1921219, term1921219.getClass(), "spacePiratesDifficulty", null);
        setField(term1921219, term1921219.getClass(), "karmaType", null);
        setIntField(term1921219, term1921219.getClass(), "karmaSpeed", 0);
        setIntField(term1921219, term1921219.getClass(), "spaceAnomaliesLevel", 0);
        setIntField(term1921219, term1921219.getClass(), "elderHeadStart", 0);
        setBooleanField(term1921219, term1921219.getClass(), "enableTutorial", false);
        setBooleanField(term1921219, term1921219.getClass(), "aiOnly", false);
        setField(term1921219, term1921219.getClass(), "difficultyLevel", null);
        setBooleanField(term1921219, term1921219.getClass(), "allNews", false);
        term1921242 = new Integer(0);
        term1921244 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.GalaxyConfig");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1921242;
        args[1] = term1921244;
        callMethod(klass, "setSize", argTypes, term1921219, args);
    }

};


