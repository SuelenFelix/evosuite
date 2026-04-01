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

public class StarMap_getAboutNearestSolarSystem_38399270721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3799006;
     Object term3799030;
     Object term3799032;

    public StarMap_getAboutNearestSolarSystem_38399270721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3799006 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term3799006, term3799006.getClass(), "maxX", 0);
        setIntField(term3799006, term3799006.getClass(), "maxY", 0);
        setField(term3799006, term3799006.getClass(), "tiles", null);
        setField(term3799006, term3799006.getClass(), "tileInfo", null);
        setField(term3799006, term3799006.getClass(), "culture", null);
        setIntField(term3799006, term3799006.getClass(), "cursorX", 0);
        setIntField(term3799006, term3799006.getClass(), "cursorY", 0);
        setIntField(term3799006, term3799006.getClass(), "drawX", 0);
        setIntField(term3799006, term3799006.getClass(), "drawY", 0);
        setField(term3799006, term3799006.getClass(), "sunList", null);
        setField(term3799006, term3799006.getClass(), "planetList", null);
        setField(term3799006, term3799006.getClass(), "ascensionPlanetCoordinate", null);
        setField(term3799006, term3799006.getClass(), "players", null);
        setIntField(term3799006, term3799006.getClass(), "turn", 0);
        setField(term3799006, term3799006.getClass(), "fleetTiles", null);
        setIntField(term3799006, term3799006.getClass(), "aiTurnNumber", 0);
        setField(term3799006, term3799006.getClass(), "aiFleet", null);
        setField(term3799006, term3799006.getClass(), "newsCorpData", null);
        setBooleanField(term3799006, term3799006.getClass(), "debug", false);
        setIntField(term3799006, term3799006.getClass(), "scoreVictoryTurn", 0);
        setIntField(term3799006, term3799006.getClass(), "scoreConquer", 0);
        setIntField(term3799006, term3799006.getClass(), "scoreCulture", 0);
        setIntField(term3799006, term3799006.getClass(), "scoreResearch", 0);
        setIntField(term3799006, term3799006.getClass(), "scoreDiplomacy", 0);
        setIntField(term3799006, term3799006.getClass(), "scorePopulation", 0);
        setField(term3799006, term3799006.getClass(), "history", null);
        setField(term3799006, term3799006.getClass(), "votes", null);
        setBooleanField(term3799006, term3799006.getClass(), "gameEnd", false);
        setBooleanField(term3799006, term3799006.getClass(), "humanLost", false);
        setField(term3799006, term3799006.getClass(), "pirateDifficulty", null);
        setField(term3799006, term3799006.getClass(), "karmaEvents", null);
        setField(term3799006, term3799006.getClass(), "ascensionEvents", null);
        setBooleanField(term3799006, term3799006.getClass(), "tutorialEnabled", false);
        setField(term3799006, term3799006.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term3799006, term3799006.getClass(), "allNewsEnabled", false);
        setBooleanField(term3799006, term3799006.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term3799006, term3799006.getClass(), "forceRedraw", false);
        setIntField(term3799006, term3799006.getClass(), "zoomLevel", 0);
        setBooleanField(term3799006, term3799006.getClass(), "generateFullGame", false);
        term3799030 = new Integer(0);
        term3799032 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = term3799030;
        args[1] = term3799032;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "getAboutNearestSolarSystem", argTypes, term3799006, args);
    }

};


