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

public class StarMap_saveGame_1227675287214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4198700;

    public StarMap_saveGame_1227675287214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4198700 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4198700, term4198700.getClass(), "maxX", 0);
        setIntField(term4198700, term4198700.getClass(), "maxY", 0);
        setField(term4198700, term4198700.getClass(), "tiles", null);
        setField(term4198700, term4198700.getClass(), "tileInfo", null);
        setField(term4198700, term4198700.getClass(), "culture", null);
        setIntField(term4198700, term4198700.getClass(), "cursorX", 0);
        setIntField(term4198700, term4198700.getClass(), "cursorY", 0);
        setIntField(term4198700, term4198700.getClass(), "drawX", 0);
        setIntField(term4198700, term4198700.getClass(), "drawY", 0);
        setField(term4198700, term4198700.getClass(), "sunList", null);
        setField(term4198700, term4198700.getClass(), "planetList", null);
        setField(term4198700, term4198700.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4198700, term4198700.getClass(), "players", null);
        setIntField(term4198700, term4198700.getClass(), "turn", 0);
        setField(term4198700, term4198700.getClass(), "fleetTiles", null);
        setIntField(term4198700, term4198700.getClass(), "aiTurnNumber", 0);
        setField(term4198700, term4198700.getClass(), "aiFleet", null);
        setField(term4198700, term4198700.getClass(), "newsCorpData", null);
        setBooleanField(term4198700, term4198700.getClass(), "debug", false);
        setIntField(term4198700, term4198700.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4198700, term4198700.getClass(), "scoreConquer", 0);
        setIntField(term4198700, term4198700.getClass(), "scoreCulture", 0);
        setIntField(term4198700, term4198700.getClass(), "scoreResearch", 0);
        setIntField(term4198700, term4198700.getClass(), "scoreDiplomacy", 0);
        setIntField(term4198700, term4198700.getClass(), "scorePopulation", 0);
        setField(term4198700, term4198700.getClass(), "history", null);
        setField(term4198700, term4198700.getClass(), "votes", null);
        setBooleanField(term4198700, term4198700.getClass(), "gameEnd", false);
        setBooleanField(term4198700, term4198700.getClass(), "humanLost", false);
        setField(term4198700, term4198700.getClass(), "pirateDifficulty", null);
        setField(term4198700, term4198700.getClass(), "karmaEvents", null);
        setField(term4198700, term4198700.getClass(), "ascensionEvents", null);
        setBooleanField(term4198700, term4198700.getClass(), "tutorialEnabled", false);
        setField(term4198700, term4198700.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4198700, term4198700.getClass(), "allNewsEnabled", false);
        setBooleanField(term4198700, term4198700.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4198700, term4198700.getClass(), "forceRedraw", false);
        setIntField(term4198700, term4198700.getClass(), "zoomLevel", 0);
        setBooleanField(term4198700, term4198700.getClass(), "generateFullGame", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataOutputStream");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "saveGame", argTypes, term4198700, args);
    }

};


