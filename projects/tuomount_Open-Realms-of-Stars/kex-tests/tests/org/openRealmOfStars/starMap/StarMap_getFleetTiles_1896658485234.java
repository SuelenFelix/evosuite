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
import java.lang.Boolean;

public class StarMap_getFleetTiles_1896658485234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4199232;
     Object term4199256;

    public StarMap_getFleetTiles_1896658485234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4199232 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4199232, term4199232.getClass(), "maxX", 0);
        setIntField(term4199232, term4199232.getClass(), "maxY", 0);
        setField(term4199232, term4199232.getClass(), "tiles", null);
        setField(term4199232, term4199232.getClass(), "tileInfo", null);
        setField(term4199232, term4199232.getClass(), "culture", null);
        setIntField(term4199232, term4199232.getClass(), "cursorX", 0);
        setIntField(term4199232, term4199232.getClass(), "cursorY", 0);
        setIntField(term4199232, term4199232.getClass(), "drawX", 0);
        setIntField(term4199232, term4199232.getClass(), "drawY", 0);
        setField(term4199232, term4199232.getClass(), "sunList", null);
        setField(term4199232, term4199232.getClass(), "planetList", null);
        setField(term4199232, term4199232.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4199232, term4199232.getClass(), "players", null);
        setIntField(term4199232, term4199232.getClass(), "turn", 0);
        setField(term4199232, term4199232.getClass(), "fleetTiles", null);
        setIntField(term4199232, term4199232.getClass(), "aiTurnNumber", 0);
        setField(term4199232, term4199232.getClass(), "aiFleet", null);
        setField(term4199232, term4199232.getClass(), "newsCorpData", null);
        setBooleanField(term4199232, term4199232.getClass(), "debug", false);
        setIntField(term4199232, term4199232.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4199232, term4199232.getClass(), "scoreConquer", 0);
        setIntField(term4199232, term4199232.getClass(), "scoreCulture", 0);
        setIntField(term4199232, term4199232.getClass(), "scoreResearch", 0);
        setIntField(term4199232, term4199232.getClass(), "scoreDiplomacy", 0);
        setIntField(term4199232, term4199232.getClass(), "scorePopulation", 0);
        setField(term4199232, term4199232.getClass(), "history", null);
        setField(term4199232, term4199232.getClass(), "votes", null);
        setBooleanField(term4199232, term4199232.getClass(), "gameEnd", false);
        setBooleanField(term4199232, term4199232.getClass(), "humanLost", false);
        setField(term4199232, term4199232.getClass(), "pirateDifficulty", null);
        setField(term4199232, term4199232.getClass(), "karmaEvents", null);
        setField(term4199232, term4199232.getClass(), "ascensionEvents", null);
        setBooleanField(term4199232, term4199232.getClass(), "tutorialEnabled", false);
        setField(term4199232, term4199232.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4199232, term4199232.getClass(), "allNewsEnabled", false);
        setBooleanField(term4199232, term4199232.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4199232, term4199232.getClass(), "forceRedraw", false);
        setIntField(term4199232, term4199232.getClass(), "zoomLevel", 0);
        setBooleanField(term4199232, term4199232.getClass(), "generateFullGame", false);
        term4199256 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term4199256;
        callMethod(klass, "getFleetTiles", argTypes, term4199232, args);
    }

};


