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

public class StarMap_getTileIndex_1740943033225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4198984;
     Object term4199008;
     Object term4199010;

    public StarMap_getTileIndex_1740943033225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4198984 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4198984, term4198984.getClass(), "maxX", 0);
        setIntField(term4198984, term4198984.getClass(), "maxY", 0);
        setField(term4198984, term4198984.getClass(), "tiles", null);
        setField(term4198984, term4198984.getClass(), "tileInfo", null);
        setField(term4198984, term4198984.getClass(), "culture", null);
        setIntField(term4198984, term4198984.getClass(), "cursorX", 0);
        setIntField(term4198984, term4198984.getClass(), "cursorY", 0);
        setIntField(term4198984, term4198984.getClass(), "drawX", 0);
        setIntField(term4198984, term4198984.getClass(), "drawY", 0);
        setField(term4198984, term4198984.getClass(), "sunList", null);
        setField(term4198984, term4198984.getClass(), "planetList", null);
        setField(term4198984, term4198984.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4198984, term4198984.getClass(), "players", null);
        setIntField(term4198984, term4198984.getClass(), "turn", 0);
        setField(term4198984, term4198984.getClass(), "fleetTiles", null);
        setIntField(term4198984, term4198984.getClass(), "aiTurnNumber", 0);
        setField(term4198984, term4198984.getClass(), "aiFleet", null);
        setField(term4198984, term4198984.getClass(), "newsCorpData", null);
        setBooleanField(term4198984, term4198984.getClass(), "debug", false);
        setIntField(term4198984, term4198984.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4198984, term4198984.getClass(), "scoreConquer", 0);
        setIntField(term4198984, term4198984.getClass(), "scoreCulture", 0);
        setIntField(term4198984, term4198984.getClass(), "scoreResearch", 0);
        setIntField(term4198984, term4198984.getClass(), "scoreDiplomacy", 0);
        setIntField(term4198984, term4198984.getClass(), "scorePopulation", 0);
        setField(term4198984, term4198984.getClass(), "history", null);
        setField(term4198984, term4198984.getClass(), "votes", null);
        setBooleanField(term4198984, term4198984.getClass(), "gameEnd", false);
        setBooleanField(term4198984, term4198984.getClass(), "humanLost", false);
        setField(term4198984, term4198984.getClass(), "pirateDifficulty", null);
        setField(term4198984, term4198984.getClass(), "karmaEvents", null);
        setField(term4198984, term4198984.getClass(), "ascensionEvents", null);
        setBooleanField(term4198984, term4198984.getClass(), "tutorialEnabled", false);
        setField(term4198984, term4198984.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4198984, term4198984.getClass(), "allNewsEnabled", false);
        setBooleanField(term4198984, term4198984.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4198984, term4198984.getClass(), "forceRedraw", false);
        setIntField(term4198984, term4198984.getClass(), "zoomLevel", 0);
        setBooleanField(term4198984, term4198984.getClass(), "generateFullGame", false);
        term4199008 = new Integer(0);
        term4199010 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term4199008;
        args[1] = term4199010;
        callMethod(klass, "getTileIndex", argTypes, term4198984, args);
    }

};


