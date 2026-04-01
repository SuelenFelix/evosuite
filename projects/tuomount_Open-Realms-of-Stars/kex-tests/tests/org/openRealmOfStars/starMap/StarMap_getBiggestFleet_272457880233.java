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

public class StarMap_getBiggestFleet_272457880233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4199206;
     Object term4199230;

    public StarMap_getBiggestFleet_272457880233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4199206 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4199206, term4199206.getClass(), "maxX", 0);
        setIntField(term4199206, term4199206.getClass(), "maxY", 0);
        setField(term4199206, term4199206.getClass(), "tiles", null);
        setField(term4199206, term4199206.getClass(), "tileInfo", null);
        setField(term4199206, term4199206.getClass(), "culture", null);
        setIntField(term4199206, term4199206.getClass(), "cursorX", 0);
        setIntField(term4199206, term4199206.getClass(), "cursorY", 0);
        setIntField(term4199206, term4199206.getClass(), "drawX", 0);
        setIntField(term4199206, term4199206.getClass(), "drawY", 0);
        setField(term4199206, term4199206.getClass(), "sunList", null);
        setField(term4199206, term4199206.getClass(), "planetList", null);
        setField(term4199206, term4199206.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4199206, term4199206.getClass(), "players", null);
        setIntField(term4199206, term4199206.getClass(), "turn", 0);
        setField(term4199206, term4199206.getClass(), "fleetTiles", null);
        setIntField(term4199206, term4199206.getClass(), "aiTurnNumber", 0);
        setField(term4199206, term4199206.getClass(), "aiFleet", null);
        setField(term4199206, term4199206.getClass(), "newsCorpData", null);
        setBooleanField(term4199206, term4199206.getClass(), "debug", false);
        setIntField(term4199206, term4199206.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4199206, term4199206.getClass(), "scoreConquer", 0);
        setIntField(term4199206, term4199206.getClass(), "scoreCulture", 0);
        setIntField(term4199206, term4199206.getClass(), "scoreResearch", 0);
        setIntField(term4199206, term4199206.getClass(), "scoreDiplomacy", 0);
        setIntField(term4199206, term4199206.getClass(), "scorePopulation", 0);
        setField(term4199206, term4199206.getClass(), "history", null);
        setField(term4199206, term4199206.getClass(), "votes", null);
        setBooleanField(term4199206, term4199206.getClass(), "gameEnd", false);
        setBooleanField(term4199206, term4199206.getClass(), "humanLost", false);
        setField(term4199206, term4199206.getClass(), "pirateDifficulty", null);
        setField(term4199206, term4199206.getClass(), "karmaEvents", null);
        setField(term4199206, term4199206.getClass(), "ascensionEvents", null);
        setBooleanField(term4199206, term4199206.getClass(), "tutorialEnabled", false);
        setField(term4199206, term4199206.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4199206, term4199206.getClass(), "allNewsEnabled", false);
        setBooleanField(term4199206, term4199206.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4199206, term4199206.getClass(), "forceRedraw", false);
        setIntField(term4199206, term4199206.getClass(), "zoomLevel", 0);
        setBooleanField(term4199206, term4199206.getClass(), "generateFullGame", false);
        term4199230 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.Coordinate");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term4199230;
        callMethod(klass, "getBiggestFleet", argTypes, term4199206, args);
    }

};


