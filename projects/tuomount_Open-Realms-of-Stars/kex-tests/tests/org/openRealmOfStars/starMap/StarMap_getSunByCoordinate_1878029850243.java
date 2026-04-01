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

public class StarMap_getSunByCoordinate_1878029850243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4199458;
     Object term4199482;
     Object term4199484;

    public StarMap_getSunByCoordinate_1878029850243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4199458 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4199458, term4199458.getClass(), "maxX", 0);
        setIntField(term4199458, term4199458.getClass(), "maxY", 0);
        setField(term4199458, term4199458.getClass(), "tiles", null);
        setField(term4199458, term4199458.getClass(), "tileInfo", null);
        setField(term4199458, term4199458.getClass(), "culture", null);
        setIntField(term4199458, term4199458.getClass(), "cursorX", 0);
        setIntField(term4199458, term4199458.getClass(), "cursorY", 0);
        setIntField(term4199458, term4199458.getClass(), "drawX", 0);
        setIntField(term4199458, term4199458.getClass(), "drawY", 0);
        setField(term4199458, term4199458.getClass(), "sunList", null);
        setField(term4199458, term4199458.getClass(), "planetList", null);
        setField(term4199458, term4199458.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4199458, term4199458.getClass(), "players", null);
        setIntField(term4199458, term4199458.getClass(), "turn", 0);
        setField(term4199458, term4199458.getClass(), "fleetTiles", null);
        setIntField(term4199458, term4199458.getClass(), "aiTurnNumber", 0);
        setField(term4199458, term4199458.getClass(), "aiFleet", null);
        setField(term4199458, term4199458.getClass(), "newsCorpData", null);
        setBooleanField(term4199458, term4199458.getClass(), "debug", false);
        setIntField(term4199458, term4199458.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4199458, term4199458.getClass(), "scoreConquer", 0);
        setIntField(term4199458, term4199458.getClass(), "scoreCulture", 0);
        setIntField(term4199458, term4199458.getClass(), "scoreResearch", 0);
        setIntField(term4199458, term4199458.getClass(), "scoreDiplomacy", 0);
        setIntField(term4199458, term4199458.getClass(), "scorePopulation", 0);
        setField(term4199458, term4199458.getClass(), "history", null);
        setField(term4199458, term4199458.getClass(), "votes", null);
        setBooleanField(term4199458, term4199458.getClass(), "gameEnd", false);
        setBooleanField(term4199458, term4199458.getClass(), "humanLost", false);
        setField(term4199458, term4199458.getClass(), "pirateDifficulty", null);
        setField(term4199458, term4199458.getClass(), "karmaEvents", null);
        setField(term4199458, term4199458.getClass(), "ascensionEvents", null);
        setBooleanField(term4199458, term4199458.getClass(), "tutorialEnabled", false);
        setField(term4199458, term4199458.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4199458, term4199458.getClass(), "allNewsEnabled", false);
        setBooleanField(term4199458, term4199458.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4199458, term4199458.getClass(), "forceRedraw", false);
        setIntField(term4199458, term4199458.getClass(), "zoomLevel", 0);
        setBooleanField(term4199458, term4199458.getClass(), "generateFullGame", false);
        term4199482 = new Integer(0);
        term4199484 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term4199482;
        args[1] = term4199484;
        callMethod(klass, "getSunByCoordinate", argTypes, term4199458, args);
    }

};


