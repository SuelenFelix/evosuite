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

public class StarMap_setDebug_1036286880300 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4200934;
     Object term4200958;

    public StarMap_setDebug_1036286880300() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4200934 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4200934, term4200934.getClass(), "maxX", 0);
        setIntField(term4200934, term4200934.getClass(), "maxY", 0);
        setField(term4200934, term4200934.getClass(), "tiles", null);
        setField(term4200934, term4200934.getClass(), "tileInfo", null);
        setField(term4200934, term4200934.getClass(), "culture", null);
        setIntField(term4200934, term4200934.getClass(), "cursorX", 0);
        setIntField(term4200934, term4200934.getClass(), "cursorY", 0);
        setIntField(term4200934, term4200934.getClass(), "drawX", 0);
        setIntField(term4200934, term4200934.getClass(), "drawY", 0);
        setField(term4200934, term4200934.getClass(), "sunList", null);
        setField(term4200934, term4200934.getClass(), "planetList", null);
        setField(term4200934, term4200934.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4200934, term4200934.getClass(), "players", null);
        setIntField(term4200934, term4200934.getClass(), "turn", 0);
        setField(term4200934, term4200934.getClass(), "fleetTiles", null);
        setIntField(term4200934, term4200934.getClass(), "aiTurnNumber", 0);
        setField(term4200934, term4200934.getClass(), "aiFleet", null);
        setField(term4200934, term4200934.getClass(), "newsCorpData", null);
        setBooleanField(term4200934, term4200934.getClass(), "debug", false);
        setIntField(term4200934, term4200934.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4200934, term4200934.getClass(), "scoreConquer", 0);
        setIntField(term4200934, term4200934.getClass(), "scoreCulture", 0);
        setIntField(term4200934, term4200934.getClass(), "scoreResearch", 0);
        setIntField(term4200934, term4200934.getClass(), "scoreDiplomacy", 0);
        setIntField(term4200934, term4200934.getClass(), "scorePopulation", 0);
        setField(term4200934, term4200934.getClass(), "history", null);
        setField(term4200934, term4200934.getClass(), "votes", null);
        setBooleanField(term4200934, term4200934.getClass(), "gameEnd", false);
        setBooleanField(term4200934, term4200934.getClass(), "humanLost", false);
        setField(term4200934, term4200934.getClass(), "pirateDifficulty", null);
        setField(term4200934, term4200934.getClass(), "karmaEvents", null);
        setField(term4200934, term4200934.getClass(), "ascensionEvents", null);
        setBooleanField(term4200934, term4200934.getClass(), "tutorialEnabled", false);
        setField(term4200934, term4200934.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4200934, term4200934.getClass(), "allNewsEnabled", false);
        setBooleanField(term4200934, term4200934.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4200934, term4200934.getClass(), "forceRedraw", false);
        setIntField(term4200934, term4200934.getClass(), "zoomLevel", 0);
        setBooleanField(term4200934, term4200934.getClass(), "generateFullGame", false);
        term4200958 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term4200958;
        callMethod(klass, "setDebug", argTypes, term4200934, args);
    }

};


