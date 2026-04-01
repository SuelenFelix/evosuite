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

public class StarMap_setCursorPos_957389815237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4199306;
     Object term4199330;
     Object term4199332;

    public StarMap_setCursorPos_957389815237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4199306 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4199306, term4199306.getClass(), "maxX", 0);
        setIntField(term4199306, term4199306.getClass(), "maxY", 0);
        setField(term4199306, term4199306.getClass(), "tiles", null);
        setField(term4199306, term4199306.getClass(), "tileInfo", null);
        setField(term4199306, term4199306.getClass(), "culture", null);
        setIntField(term4199306, term4199306.getClass(), "cursorX", 0);
        setIntField(term4199306, term4199306.getClass(), "cursorY", 0);
        setIntField(term4199306, term4199306.getClass(), "drawX", 0);
        setIntField(term4199306, term4199306.getClass(), "drawY", 0);
        setField(term4199306, term4199306.getClass(), "sunList", null);
        setField(term4199306, term4199306.getClass(), "planetList", null);
        setField(term4199306, term4199306.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4199306, term4199306.getClass(), "players", null);
        setIntField(term4199306, term4199306.getClass(), "turn", 0);
        setField(term4199306, term4199306.getClass(), "fleetTiles", null);
        setIntField(term4199306, term4199306.getClass(), "aiTurnNumber", 0);
        setField(term4199306, term4199306.getClass(), "aiFleet", null);
        setField(term4199306, term4199306.getClass(), "newsCorpData", null);
        setBooleanField(term4199306, term4199306.getClass(), "debug", false);
        setIntField(term4199306, term4199306.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4199306, term4199306.getClass(), "scoreConquer", 0);
        setIntField(term4199306, term4199306.getClass(), "scoreCulture", 0);
        setIntField(term4199306, term4199306.getClass(), "scoreResearch", 0);
        setIntField(term4199306, term4199306.getClass(), "scoreDiplomacy", 0);
        setIntField(term4199306, term4199306.getClass(), "scorePopulation", 0);
        setField(term4199306, term4199306.getClass(), "history", null);
        setField(term4199306, term4199306.getClass(), "votes", null);
        setBooleanField(term4199306, term4199306.getClass(), "gameEnd", false);
        setBooleanField(term4199306, term4199306.getClass(), "humanLost", false);
        setField(term4199306, term4199306.getClass(), "pirateDifficulty", null);
        setField(term4199306, term4199306.getClass(), "karmaEvents", null);
        setField(term4199306, term4199306.getClass(), "ascensionEvents", null);
        setBooleanField(term4199306, term4199306.getClass(), "tutorialEnabled", false);
        setField(term4199306, term4199306.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4199306, term4199306.getClass(), "allNewsEnabled", false);
        setBooleanField(term4199306, term4199306.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4199306, term4199306.getClass(), "forceRedraw", false);
        setIntField(term4199306, term4199306.getClass(), "zoomLevel", 0);
        setBooleanField(term4199306, term4199306.getClass(), "generateFullGame", false);
        term4199330 = new Integer(0);
        term4199332 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term4199330;
        args[1] = term4199332;
        callMethod(klass, "setCursorPos", argTypes, term4199306, args);
    }

};


