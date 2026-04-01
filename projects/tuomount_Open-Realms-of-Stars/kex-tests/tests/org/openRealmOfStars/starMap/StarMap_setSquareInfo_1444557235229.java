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

public class StarMap_setSquareInfo_1444557235229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4199102;
     Object term4199126;
     Object term4199128;

    public StarMap_setSquareInfo_1444557235229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4199102 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4199102, term4199102.getClass(), "maxX", 0);
        setIntField(term4199102, term4199102.getClass(), "maxY", 0);
        setField(term4199102, term4199102.getClass(), "tiles", null);
        setField(term4199102, term4199102.getClass(), "tileInfo", null);
        setField(term4199102, term4199102.getClass(), "culture", null);
        setIntField(term4199102, term4199102.getClass(), "cursorX", 0);
        setIntField(term4199102, term4199102.getClass(), "cursorY", 0);
        setIntField(term4199102, term4199102.getClass(), "drawX", 0);
        setIntField(term4199102, term4199102.getClass(), "drawY", 0);
        setField(term4199102, term4199102.getClass(), "sunList", null);
        setField(term4199102, term4199102.getClass(), "planetList", null);
        setField(term4199102, term4199102.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4199102, term4199102.getClass(), "players", null);
        setIntField(term4199102, term4199102.getClass(), "turn", 0);
        setField(term4199102, term4199102.getClass(), "fleetTiles", null);
        setIntField(term4199102, term4199102.getClass(), "aiTurnNumber", 0);
        setField(term4199102, term4199102.getClass(), "aiFleet", null);
        setField(term4199102, term4199102.getClass(), "newsCorpData", null);
        setBooleanField(term4199102, term4199102.getClass(), "debug", false);
        setIntField(term4199102, term4199102.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4199102, term4199102.getClass(), "scoreConquer", 0);
        setIntField(term4199102, term4199102.getClass(), "scoreCulture", 0);
        setIntField(term4199102, term4199102.getClass(), "scoreResearch", 0);
        setIntField(term4199102, term4199102.getClass(), "scoreDiplomacy", 0);
        setIntField(term4199102, term4199102.getClass(), "scorePopulation", 0);
        setField(term4199102, term4199102.getClass(), "history", null);
        setField(term4199102, term4199102.getClass(), "votes", null);
        setBooleanField(term4199102, term4199102.getClass(), "gameEnd", false);
        setBooleanField(term4199102, term4199102.getClass(), "humanLost", false);
        setField(term4199102, term4199102.getClass(), "pirateDifficulty", null);
        setField(term4199102, term4199102.getClass(), "karmaEvents", null);
        setField(term4199102, term4199102.getClass(), "ascensionEvents", null);
        setBooleanField(term4199102, term4199102.getClass(), "tutorialEnabled", false);
        setField(term4199102, term4199102.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4199102, term4199102.getClass(), "allNewsEnabled", false);
        setBooleanField(term4199102, term4199102.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4199102, term4199102.getClass(), "forceRedraw", false);
        setIntField(term4199102, term4199102.getClass(), "zoomLevel", 0);
        setBooleanField(term4199102, term4199102.getClass(), "generateFullGame", false);
        term4199126 = new Integer(0);
        term4199128 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.openRealmOfStars.starMap.SquareInfo");
        Object[] args = new Object[3];
        args[0] = term4199126;
        args[1] = term4199128;
        args[2] = null;
        callMethod(klass, "setSquareInfo", argTypes, term4199102, args);
    }

};


