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

public class GalaxyConfig_generateUniqueName_41768859266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1920819;
     Object term1920842;

    public GalaxyConfig_generateUniqueName_41768859266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1920819 = newInstance(Class.forName("org.openRealmOfStars.starMap.GalaxyConfig"));
        setIntField(term1920819, term1920819.getClass(), "sizeX", 0);
        setIntField(term1920819, term1920819.getClass(), "sizeY", 0);
        setIntField(term1920819, term1920819.getClass(), "galaxySizeIndex", 0);
        setIntField(term1920819, term1920819.getClass(), "maxPlayers", 0);
        setIntField(term1920819, term1920819.getClass(), "solarSystemDistance", 0);
        setIntField(term1920819, term1920819.getClass(), "sunDensityIndex", 0);
        setIntField(term1920819, term1920819.getClass(), "startingPosition", 0);
        setField(term1920819, term1920819.getClass(), "playerRaces", null);
        setField(term1920819, term1920819.getClass(), "playerName", null);
        setField(term1920819, term1920819.getClass(), "playerGovernment", null);
        setField(term1920819, term1920819.getClass(), "playerColors", null);
        setField(term1920819, term1920819.getClass(), "playerDifficult", null);
        setField(term1920819, term1920819.getClass(), "playerElderRealm", null);
        setField(term1920819, term1920819.getClass(), "startingScenario", null);
        setIntField(term1920819, term1920819.getClass(), "chanceForPlanetaryEvent", 0);
        setIntField(term1920819, term1920819.getClass(), "numberOfRoguePlanets", 0);
        setIntField(term1920819, term1920819.getClass(), "scoringVictoryTurns", 0);
        setIntField(term1920819, term1920819.getClass(), "scoringCulture", 0);
        setIntField(term1920819, term1920819.getClass(), "scoringConquer", 0);
        setIntField(term1920819, term1920819.getClass(), "scoringResearch", 0);
        setIntField(term1920819, term1920819.getClass(), "scoringDiplomacy", 0);
        setIntField(term1920819, term1920819.getClass(), "scoringPopulation", 0);
        setIntField(term1920819, term1920819.getClass(), "spacePiratesLevel", 0);
        setField(term1920819, term1920819.getClass(), "spacePiratesDifficulty", null);
        setField(term1920819, term1920819.getClass(), "karmaType", null);
        setIntField(term1920819, term1920819.getClass(), "karmaSpeed", 0);
        setIntField(term1920819, term1920819.getClass(), "spaceAnomaliesLevel", 0);
        setIntField(term1920819, term1920819.getClass(), "elderHeadStart", 0);
        setBooleanField(term1920819, term1920819.getClass(), "enableTutorial", false);
        setBooleanField(term1920819, term1920819.getClass(), "aiOnly", false);
        setField(term1920819, term1920819.getClass(), "difficultyLevel", null);
        setBooleanField(term1920819, term1920819.getClass(), "allNews", false);
        term1920842 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.GalaxyConfig");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1920842;
        callMethod(klass, "generateUniqueName", argTypes, term1920819, args);
    }

};


