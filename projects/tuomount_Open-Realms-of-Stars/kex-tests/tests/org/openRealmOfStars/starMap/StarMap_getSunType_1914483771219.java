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

public class StarMap_getSunType_1914483771219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4198832;

    public StarMap_getSunType_1914483771219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4198832 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4198832, term4198832.getClass(), "maxX", 0);
        setIntField(term4198832, term4198832.getClass(), "maxY", 0);
        setField(term4198832, term4198832.getClass(), "tiles", null);
        setField(term4198832, term4198832.getClass(), "tileInfo", null);
        setField(term4198832, term4198832.getClass(), "culture", null);
        setIntField(term4198832, term4198832.getClass(), "cursorX", 0);
        setIntField(term4198832, term4198832.getClass(), "cursorY", 0);
        setIntField(term4198832, term4198832.getClass(), "drawX", 0);
        setIntField(term4198832, term4198832.getClass(), "drawY", 0);
        setField(term4198832, term4198832.getClass(), "sunList", null);
        setField(term4198832, term4198832.getClass(), "planetList", null);
        setField(term4198832, term4198832.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4198832, term4198832.getClass(), "players", null);
        setIntField(term4198832, term4198832.getClass(), "turn", 0);
        setField(term4198832, term4198832.getClass(), "fleetTiles", null);
        setIntField(term4198832, term4198832.getClass(), "aiTurnNumber", 0);
        setField(term4198832, term4198832.getClass(), "aiFleet", null);
        setField(term4198832, term4198832.getClass(), "newsCorpData", null);
        setBooleanField(term4198832, term4198832.getClass(), "debug", false);
        setIntField(term4198832, term4198832.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4198832, term4198832.getClass(), "scoreConquer", 0);
        setIntField(term4198832, term4198832.getClass(), "scoreCulture", 0);
        setIntField(term4198832, term4198832.getClass(), "scoreResearch", 0);
        setIntField(term4198832, term4198832.getClass(), "scoreDiplomacy", 0);
        setIntField(term4198832, term4198832.getClass(), "scorePopulation", 0);
        setField(term4198832, term4198832.getClass(), "history", null);
        setField(term4198832, term4198832.getClass(), "votes", null);
        setBooleanField(term4198832, term4198832.getClass(), "gameEnd", false);
        setBooleanField(term4198832, term4198832.getClass(), "humanLost", false);
        setField(term4198832, term4198832.getClass(), "pirateDifficulty", null);
        setField(term4198832, term4198832.getClass(), "karmaEvents", null);
        setField(term4198832, term4198832.getClass(), "ascensionEvents", null);
        setBooleanField(term4198832, term4198832.getClass(), "tutorialEnabled", false);
        setField(term4198832, term4198832.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4198832, term4198832.getClass(), "allNewsEnabled", false);
        setBooleanField(term4198832, term4198832.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4198832, term4198832.getClass(), "forceRedraw", false);
        setIntField(term4198832, term4198832.getClass(), "zoomLevel", 0);
        setBooleanField(term4198832, term4198832.getClass(), "generateFullGame", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.Sun");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getSunType", argTypes, term4198832, args);
    }

};


