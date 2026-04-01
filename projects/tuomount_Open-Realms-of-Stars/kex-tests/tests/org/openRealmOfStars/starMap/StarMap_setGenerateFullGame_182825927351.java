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

public class StarMap_setGenerateFullGame_182825927351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4202194;
     Object term4202218;

    public StarMap_setGenerateFullGame_182825927351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4202194 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4202194, term4202194.getClass(), "maxX", 0);
        setIntField(term4202194, term4202194.getClass(), "maxY", 0);
        setField(term4202194, term4202194.getClass(), "tiles", null);
        setField(term4202194, term4202194.getClass(), "tileInfo", null);
        setField(term4202194, term4202194.getClass(), "culture", null);
        setIntField(term4202194, term4202194.getClass(), "cursorX", 0);
        setIntField(term4202194, term4202194.getClass(), "cursorY", 0);
        setIntField(term4202194, term4202194.getClass(), "drawX", 0);
        setIntField(term4202194, term4202194.getClass(), "drawY", 0);
        setField(term4202194, term4202194.getClass(), "sunList", null);
        setField(term4202194, term4202194.getClass(), "planetList", null);
        setField(term4202194, term4202194.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4202194, term4202194.getClass(), "players", null);
        setIntField(term4202194, term4202194.getClass(), "turn", 0);
        setField(term4202194, term4202194.getClass(), "fleetTiles", null);
        setIntField(term4202194, term4202194.getClass(), "aiTurnNumber", 0);
        setField(term4202194, term4202194.getClass(), "aiFleet", null);
        setField(term4202194, term4202194.getClass(), "newsCorpData", null);
        setBooleanField(term4202194, term4202194.getClass(), "debug", false);
        setIntField(term4202194, term4202194.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4202194, term4202194.getClass(), "scoreConquer", 0);
        setIntField(term4202194, term4202194.getClass(), "scoreCulture", 0);
        setIntField(term4202194, term4202194.getClass(), "scoreResearch", 0);
        setIntField(term4202194, term4202194.getClass(), "scoreDiplomacy", 0);
        setIntField(term4202194, term4202194.getClass(), "scorePopulation", 0);
        setField(term4202194, term4202194.getClass(), "history", null);
        setField(term4202194, term4202194.getClass(), "votes", null);
        setBooleanField(term4202194, term4202194.getClass(), "gameEnd", false);
        setBooleanField(term4202194, term4202194.getClass(), "humanLost", false);
        setField(term4202194, term4202194.getClass(), "pirateDifficulty", null);
        setField(term4202194, term4202194.getClass(), "karmaEvents", null);
        setField(term4202194, term4202194.getClass(), "ascensionEvents", null);
        setBooleanField(term4202194, term4202194.getClass(), "tutorialEnabled", false);
        setField(term4202194, term4202194.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4202194, term4202194.getClass(), "allNewsEnabled", false);
        setBooleanField(term4202194, term4202194.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4202194, term4202194.getClass(), "forceRedraw", false);
        setIntField(term4202194, term4202194.getClass(), "zoomLevel", 0);
        setBooleanField(term4202194, term4202194.getClass(), "generateFullGame", false);
        term4202218 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term4202218;
        callMethod(klass, "setGenerateFullGame", argTypes, term4202194, args);
    }

};


